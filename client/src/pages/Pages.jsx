import { Routes, Route, useLocation } from 'react-router-dom';
import Home from './Home';
import PropertyList from './PropertyList';
import Property from './Property';
import SearchedProperties from './SearchedProperties';
import Booking from './Booking';


function Pages({guest, properties, handleSubmit, handleBookingSubmit, booking}) {

    const location = useLocation();

    return(
        <Routes location={location} key={location.pathname}>
            <Route path="/" element={<Home properties={properties} onCreate={handleSubmit}/>} />
            <Route path="/properties" element={<PropertyList properties={properties}/>} />
            <Route exact path="/properties/:id" element={ <Property guest={guest} properties={properties} onCreateBooking={handleBookingSubmit}/>
            }/>
            <Route exact path="/bookings/:id" element={ <Booking booking={booking} />
            }/>
            <Route path="/searched/:search" element={<SearchedProperties properties={properties}/>} />
        </Routes>
    )
}

export default Pages;