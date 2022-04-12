import React from "react"
import { useState } from "react"
import styled from "styled-components";

const GuestForm = ({onCreate}) => {

    const [guest, setGuest] = useState ({
        firstName: "",
        lastName: "",
        email: "",
        contactNumber: ""
    })

    const handleSubmit = (event) => {
        event.preventDefault();
        onCreate(guest);    
        setGuest({
            firstName: "",
            lastName: "",
            email: "",
            contactNumber: ""
        })    
    }

    const handleChange = (event) => {
        let propertyName = event.target.name;
        let copiedGuest = {...guest};
        copiedGuest[propertyName] = event.target.value;
        setGuest(copiedGuest);
    }

    return (
        <Wrapper>
        <form onSubmit={handleSubmit}>
            <h3>Create Account</h3>
            <input type="text" placeholder="First Name" name="firstName" onChange={handleChange} value={guest.firstName}/>
            <input type="text" placeholder="Last Name" name="lastName" onChange={handleChange} value={guest.lastName}/>
            <input type="text" placeholder="Email" name="email" onChange={handleChange} value={guest.email}/>
            <input type="text" placeholder="Contact Number" name="contactNumber" onChange={handleChange} value={guest.contactNumber}/>
            <button type="submit">Create</button>
        </form>
        </Wrapper>
    )
}

const Wrapper = styled.div`
    
    form{
        position: absolute;
        z-index: 10;
        background: white;
        border: 1px solid #dedede;
        border-radius: 4px;
        display: flex;
        flex-direction: column;
        justify-content: space-around;
        margin: 0 auto;
        left: 65%;
        top: 20%;
        width: 20%;
        padding: 25px 35px;
        box-shadow: 0px 2px 10px rgb(153, 151, 151);
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
        margin: 10px 0px;
        padding: 10px;
    }

    button:hover {
        box-shadow: 0 5px 9px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}
`

export default GuestForm