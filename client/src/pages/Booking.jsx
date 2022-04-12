import React, { useEffect, useState } from 'react';
import {Typography, Rating} from "@mui/material"
import { FaTrash } from 'react-icons/fa';
import styled from "styled-components";

function Booking({booking, deleteBooking, updateBooking}){

    const [stateBooking, setStateBooking] = useState({
        guest: {id: null},
        property: {id: null},
        host: {id: null},
        numberOfNights: 0,
        numberOfGuests: 0
    });

    useEffect(()=>{
        if(booking){
          let copiedBooking = {...booking}
          setStateBooking(copiedBooking)
        }
      }, [booking])

    const handleChange = (event) => {
        let propertyName = event.target.name;
        let copiedBooking = {...stateBooking};
        copiedBooking[propertyName] = event.target.value;
        setStateBooking(copiedBooking);
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        console.log(stateBooking)
        updateBooking(stateBooking);
    }

    const handleDeleteBooking = () => deleteBooking(booking.id);

    return(
        <div className='booking'>
            <Wrapper>
                <h2>{booking.guest.firstName} booked {booking.numberOfNights} nights for {booking.numberOfGuests} guests</h2>
                <h3>City: {booking.property.location}</h3>
                <h3>Property Description: {booking.property.description}</h3>
                <h3>Host Name: {booking.property.host["firstName"]}</h3>
                    <Typography component="legend"/>
                    <img src={booking.property.images[0].url} width="300" height="300"/>
                    <img src={booking.property.images[1].url} width="300" height="300"/>
                    <img src={booking.property.images[2].url} width="300" height="300"/>
                    <p>£ {booking.property.pricePerNight} / per night</p>
                    <Typography component="legend">Host Rating</Typography>
                    <Rating name="read-only" value={booking.property.host["rating"]}readOnly />
                    <button className="btn-trash" onClick={handleDeleteBooking}> <FaTrash/> </button>
                    <form onSubmit={handleSubmit}>
                        <input type="text"
                        placeholder="Number of nights"
                        name="numberOfNights"
                        onChange={handleChange}
                        value={stateBooking.numberOfNights}/>
                        <input type="text"
                        placeholder="Number of guests"
                        name="numberOfGuests"
                        onChange={handleChange}
                        value={stateBooking.numberOfGuests}/>
                        <button type="submit">Update Booking</button>
                        </form>
            </Wrapper>
       </div>
    )
}

const Wrapper = styled.div`
    margin: 4rem 0rem;
    justify-content: space-around;
    flex-wrap: wrap;
    
`;

export default Booking;