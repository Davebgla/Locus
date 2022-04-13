import React from 'react';
import { useState, useEffect} from 'react';
import swal from 'sweetalert';
import { Link } from 'react-router-dom';
import { FaWindowRestore } from 'react-icons/fa';

const BookingForm = ({guest, property, onCreateBooking}) => {

    const [stateBooking, setBooking] = useState ({
        guest: {id: null},
        property: {id: null},
        host: {id: null},
        numberOfNights: 0,
        numberOfGuests: 0
    })

    useEffect(() => {
        if(guest && property){
            const copyState = {...stateBooking}
            copyState.guest.id = guest.id
            copyState.property.id = property.id
            copyState.host.id = property.host.id
            setBooking(copyState)
        }
    }, [guest, property])

    // useEffect(() => {
    //     if(booking){
    //         let copiedBooking = {...booking};
    //         setBooking(copiedBooking);
    //     }
    // }, [booking])

    const handleSubmit = (event) => {
        event.preventDefault();
        onCreateBooking(stateBooking);
        swal({
            title: `Pack your bags ${guest.firstName}!`,
            text: `You're staying in ${property.location} for ${stateBooking.numberOfNights} nights.`,
            icon: "success",
            button: "Confirm"
          })
        .then(() => {window.location='/'})
    }

    const handleChange = (event) => {
        let propertyName = event.target.name;
        let copiedBooking = {...stateBooking}
        copiedBooking[propertyName] = event.target.value;
        setBooking(copiedBooking);
      };


    return (
        <>
        <form onSubmit={handleSubmit}>
        <h3>Book Your Stay</h3>
            <p>Number of nights:</p>
            <input type="number" name="numberOfNights" placeholder="Number of nights" onChange={handleChange} value={stateBooking.numberOfNights}/>
            <br/>
            <p>Number of guests:</p>
            <input type="number" name="numberOfGuests" placeholder="Number of guests" onChange={handleChange} value={stateBooking.numberOfGuests}/>
            <br/>
            <button type="submit">Book</button>
        </form>
        </>
    )
}

export default BookingForm;