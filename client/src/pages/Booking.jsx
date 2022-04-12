import React, { useEffect, useState } from 'react';
import {Typography, Rating} from "@mui/material"
import { FaTrash } from 'react-icons/fa';
import styled from "styled-components";
import { Splide, SplideSlide } from "@splidejs/react-splide";

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

    const totalCost = stateBooking.numberOfNights * booking.property.pricePerNight;

    const handleDeleteBooking = () => deleteBooking(booking.id);

    return(
        <div className='booking'>
            <Wrapper>
                <h2>Your booking is confirmed!</h2>
                <h2>{booking.guest.firstName} {booking.guest.lastName} booked {booking.numberOfNights} nights for {booking.numberOfGuests} guests in {booking.property.location}</h2>
                <h4>Your host is {booking.property.host["firstName"]} {booking.property.host["lastName"]}. You will pay your host at the property.</h4>
                <h4>Your property: {booking.property.description}</h4>
                    <Typography component="legend"/>
                    <Cost>Total Cost: £{totalCost}</Cost>
                    <form onSubmit={handleSubmit}>
                        <p>Number of nights:</p>
                        <input type="number"
                        name="numberOfNights"
                        onChange={handleChange}
                        value={stateBooking.numberOfNights}/>
                        <p>Number of guests:</p>
                        <input type="number"
                        name="numberOfGuests"
                        onChange={handleChange}
                        value={stateBooking.numberOfGuests}/>
                        <button type="submit">Update Booking</button>
                        <button onClick={handleDeleteBooking}>Cancel Booking</button>
                        </form>
            </Wrapper>
            {/* <SplideWrapper>
            <Splide options = {{
                    perPage: 1,
                    pagination: false,
                    drag: "free",
                    gap: "2rem"
                }}>
                {booking.property.images.map((image, index) => {
                    return(
                        <SplideSlide key={index}>
                            <Card>
                                <img src={image.url} />
                            </Card>
                        </SplideSlide>
                    )
                })}
            </Splide>
            </SplideWrapper> */}
       </div>
    )
}

const Cost = styled.div`
    color: #f9473a;
    font-size: 30px;
    font-weight: bold;
    margin: 2%;
`;

const SplideWrapper = styled.div`
    /* margin: 4rem 0rem; */
    margin: 5% 40%;
`;

const Wrapper = styled.div`
    /* margin: 4rem 0rem; */
    margin: 5% 10%;
    button{
        background-color: #f9473a;
        border: none;
        border-radius: 4px;
        color: white;
        font-size: 14px;
        margin: 10px 0px;
        padding: 10px;
    }

    button:hover {
        box-shadow: 0 5px 9px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}

    form{
        background: white;
        border: 1px solid #dedede;
        border-radius: 4px;
        display: flex;
        flex-direction: column;
        justify-content: space-around;
        margin: 0 auto;
        width: 20%;
        padding: 25px 35px;
        box-shadow: 0px 2px 10px rgb(153, 151, 151);
    }

    input{
        border: 1px solid #d9d9d9;
        border-radius: 4px;
        box-sizing: border-box;
        padding: 10px;
        width: 100%;
        margin-bottom: 20px;
    }

`;

const Card = styled.div`
    min-height: 15rem;
    border-radius: 2rem;
    overflow: hidden;
    position: relative;

    img{
        border-radius: 2rem;
        position: absolute;
        left: 0;
        width: 100%;
        height: 100%;
        object-fit: cover;
    }

    p{
        position: absolute;
        z-index: 10;
        left: 50%;
        bottom: 0%;
        transform: translate(-50%, 0%);
        color: white;
        width: 100%;
        text-align: center;
        font-weight: 600;
        font-size: 1rem;
        height: 40%;
        display: flex;
        justify-content: center;
        align-items: center;
    }

`;

export default Booking;