import { BrowserRouter as Router } from 'react-router-dom';
import { useState, useEffect } from 'react';
import Request from './helpers/Request';
import Pages from './pages/Pages';
import Navbar from './components/Navbar';
import Footer from './components/Footer';


function App() {

  const [properties, setProperties] = useState([]);
  const [guest, setGuest] = useState({
      "firstName": "",
      "lastName": "",
      "email": "",
      "contactNumber": "",
      "rating": 0
  });

  const [booking, setBooking] = useState({
      guest: {id: null},
      property: {id: null},
      host: {id: null},
      numberOfNights: 0,
      numberOfGuests: 0
  });

  useEffect(()=>{
      getBookings();
  },[]);

  useEffect(() => {
    getProperties();
  }, []);

  const getProperties = async () => {
    const api = await fetch('/api/properties');
    const data = await api.json();
    setProperties(data);
  }

  const getBookings = async () => {
    const api = await fetch('/api/bookings');
    const data = await api.json();
    setBooking(data[data.length -1]);
  }

  const handleSubmit = (guest) => {
      const request = new Request();
      const url = "/api/guests";
      request.post(url, guest)
      .then(response => response.json())
      .then(data => setGuest(data))
    }

  const handleBookingSubmit = (booking) => {
      console.log(booking)
      const request = new Request();
      const url = "/api/bookings";
      request.postBooking(url, booking)
      .then(window.location = "/");
  }

  const updateBooking = (booking) => {
    console.log(booking)
    const request = new Request();
    const url = "/api/bookings/" + booking.id;
    request.patch(url, booking)
    .then(window.location = "/");
  }

  const deleteBooking = (id) => {
      const request = new Request();
      const url = "/api/bookings/";
      request.delete(url, id)
      .then(window.location = "/");
  }

  return (
    <div className="App">
      <Router>
        <Navbar booking={booking} />
        <Pages guest={guest} properties={properties} handleSubmit={handleSubmit} handleBookingSubmit={handleBookingSubmit} booking={booking} deleteBooking={deleteBooking} updateBooking={updateBooking} />
        <Footer/>
      </Router>
    </div>
  );
}

export default App;
