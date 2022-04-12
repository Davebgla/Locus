import React from 'react';
import {Typography, Rating} from "@mui/material"
import styled from "styled-components";

function Booking({booking}){

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