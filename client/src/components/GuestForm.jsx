import React from "react"
import { useState, useEffect } from "react"

const GuestForm = ({guest, bookings, onCreate, onUpdate}) => {

    const [stateGuest, setGuest] = useState ({
        
        firstName: "",
        lastName: "",
        email: "",
        contactNumber: ""
    })
    

    useEffect(() => {
         if(guest){
                let copiedGuest = {...guest};
                setGuest(copiedGuest);
            }
    }, [guest])

    const findBookingIndex = () => {
            if(guest){
                return bookings.findIndex((booking) => {
                    return guest.booking.id === booking.id;
                })
            }else{
                return null}
            }

            let heading = "";
            if(!guest){
                heading = "Create user"
            } else{
                heading = "Edit" + guest.email;
    }

    const handleSubmit = (event) => {
                event.preventDefault();
                onCreate(stateGuest);
                
    }

    const handleChange = (event) => {
                let propertyName = event.target.name;
                let copiedGuest = {...stateGuest};
                copiedGuest[propertyName] = event.target.value;
                setGuest(copiedGuest)
    }

    const handleBooking = (event) => {
                const index = parseInt(event.target.value);
                const selectedBooking = bookings[index];
                let copiedGuest = {...stateGuest};
                copiedGuest["booking"] = selectedBooking;
                setGuest(copiedGuest);
    }

    return (
        <>
        <h3>{heading}</h3>
        <form onSubmit={handleSubmit}>
            <input type="text" placeholder="First Name" name="firstName" onChange={handleChange} value={stateGuest.firstName}/>
            <input type="text" placeholder="Last Name" name="lastName" onChange={handleChange} value={stateGuest.lastName}/>
            <input type="text" placeholder="Email" name="email" onChange={handleChange} value={stateGuest.email}/>
            <input type="text" placeholder="Contact Number" name="contactNumber" onChange={handleChange} value={stateGuest.contactNumber}/>
            <button type="submit">Create</button>

        </form>
        </>
    )


}

export default GuestForm