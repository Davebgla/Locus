import { useState } from 'react';
import { Routes, Route, useLocation } from 'react-router-dom';
import GuestForm from '../components/GuestForm';
import Home from './Home';
import PropertyList from './Properties';
import Property from './Property';
import Request from '../helpers/Request';

function Pages({properties}) {

    const [guest, setGuest] = useState([]);

    const location = useLocation();

    const handleSubmit = (guest) => {
        const request = new Request();
        const url = "/api/guests";
        request.post(url, guest)
        .then(() => {window.location = "/guests"})
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
            <Route exact path="/properties/:id" element={ <Property properties={properties}/>
            }/>
        </Routes>
    )
}

export default Pages;