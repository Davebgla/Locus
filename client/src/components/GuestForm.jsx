import React from "react"
import { useState, useEffect } from "react"
import styled from "styled-components";

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
                heading = "Create Account"
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
        <Wrapper>
        <form onSubmit={handleSubmit}>
            <h3>Create Account</h3>
            <input type="text" placeholder="First Name" name="firstName" onChange={handleChange} value={stateGuest.firstName}/>
            <input type="text" placeholder="Last Name" name="lastName" onChange={handleChange} value={stateGuest.lastName}/>
            <input type="text" placeholder="Email" name="email" onChange={handleChange} value={stateGuest.email}/>
            <input type="text" placeholder="Contact Number" name="contactNumber" onChange={handleChange} value={stateGuest.contactNumber}/>
            <button type="submit">Create</button>

        </form>
        </Wrapper>
    )
}

const Wrapper = styled.div`
    
    form{
        background: white;
        border: 1px solid #dedede;
        border-radius: 4px;
        display: flex;
        flex-direction: column;
        justify-content: space-around;
        margin: 0 auto;
        width: 20%;
        padding: 20px 40px;
        
    }

    h3{
        margin-bottom: 40px;
    }

    input{
        border: 1px solid #d9d9d9;
        border-radius: 4px;
        box-sizing: border-box;
        padding: 10px;
        width: 100%;
        margin-bottom: 20px;
    }


    button{
        background-color: #f9473a;
        border: none;
        border-radius: 4px;
        color: white;
        font-family: sans-serif;
        font-size: 14px;
        margin: 20px 0px;
        padding: 10px;
    }

    button:hover {
        box-shadow: 0 5px 9px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}
`

export default GuestForm