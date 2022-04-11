import { useState } from 'react';
import { Routes, Route, useLocation } from 'react-router-dom';
import GuestForm from '../components/GuestForm';
import Home from './Home';
import PropertyList from './Properties';
import Property from './Property';
import Request from '../helpers/Request';
import SearchedProperties from './SearchedProperties';

function Pages({properties}) {

    const [guest, setGuest] = useState(	{
		"id": 3,
		"firstName": "Stan",
		"lastName": "Tarnev",
		"email": "stan@codeclan.com",
		"contactNumber": "(987)-639-2345",
		"rating": 1
	});

    const location = useLocation();

    const handleSubmit = (guest) => {
        const request = new Request();
        const url = "/api/guests";
        request.post(url, guest)
        .then(res => res.json())
        .then((data) => {
            setGuest(data)
            // window.location = "/guests"
        })
      }

    const handleBookingSubmit = (booking) => {
        console.log(booking)
        const request = new Request();
        const url = "/api/bookings";
        request.postBooking(url, booking)
        .then((res) => res.json())
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
            {/* <Route path="/properties/:id" element={<Property />} /> */}
            <Route exact path="/properties/:id" element={ <Property guest={guest} properties={properties} onCreateBooking={handleBookingSubmit}/>
            }/>
            <Route path="/searched/:search" element={<SearchedProperties properties={properties}/>} />
        </Routes>
    )
}

export default Pages;