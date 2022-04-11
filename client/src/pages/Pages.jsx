import { useState, useEffect } from 'react';
import { Routes, Route, useLocation } from 'react-router-dom';
import Home from './Home';
import PropertyList from './PropertyList';
import Property from './Property';
import Request from '../helpers/Request';
import { getOptionGroupUnstyledUtilityClass } from '@mui/base';

function Pages() {

    const [properties, setProperties] = useState([]);
    const [guest, setGuest] = useState({
        "firstName": "",
        "lastName": "",
        "email": "",
        "contactNumber": "",
        "rating": 0
    });
  
    useEffect(() => {
      getProperties();
    }, []);
  
    const getProperties = async () => {
      const api = await fetch('/api/properties');
      const data = await api.json();
      setProperties(data);
    }

    const location = useLocation();

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
        .then(response => response.json())
        .then(data => console.log(data))
    }
    
    //   const handleUpdate = (guest) => {
    //     const request = new Request();
    //     request.patch("/api/guests/" + guest.id, guest)
    //     .then(() => {
    //       window.location = "/guests/" + guest.id
    //     })
    //   }



    return(
        <Routes location={location} key={location.pathname}>
            <Route path="/" element={<Home properties={properties} onCreate={handleSubmit}/>} />
            <Route path="/properties" element={<PropertyList properties={properties}/>} />
            <Route exact path="/properties/:id" element={ <Property guest={guest} properties={properties} onCreateBooking={handleBookingSubmit}/>
            }/>
        </Routes>
    )
}

export default Pages;