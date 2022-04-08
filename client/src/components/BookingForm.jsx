import React from 'react';
import { useState, useEffect} from 'react';

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
    }

    const handleChange = (event) => {
        let propertyName = event.target.name;
        let copiedBooking = {...stateBooking}
        copiedBooking[propertyName] = event.target.value;
        setBooking(copiedBooking);
      };


    return (
        <>
        <h3>Book Your Stay</h3>
        <form onSubmit={handleSubmit}>
            <input type="number" name="numberOfNights" placeholder="Number of nights" onChange={handleChange} value={stateBooking.numberOfNights}/>
            <input type="number" name="numberOfGuests" placeholder="Number of guests" onChange={handleChange} value={stateBooking.numberOfGuests}/>
            <button type="submit">Book</button>
        </form>
        </>
    )
}

export default BookingForm;