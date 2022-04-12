import React from 'react'
import { Link } from 'react-router-dom';
import {AppBar, Tab, Tabs, Toolbar, Typography} from "@mui/material";
import styled from 'styled-components';
import {useState} from 'react';
import {FaSearch} from 'react-icons/fa';
import {useNavigate} from 'react-router-dom';


function Navbar({booking}) {

  const [input, setInput] = useState("");
  const navigate = useNavigate();

  const submitHandler = (e) => {
      e.preventDefault();
      navigate('/searched/' + input)
  };

  return (
      <>
        <AppBar>
            <Toolbar sx={{background: "white"}}>
                <img src="https://i.imgur.com/O7vDxyB.png" alt="locus-logo" width={80}/>
                <Tabs sx={{marginLeft: "auto"}}>
                  <FormStyle onSubmit={submitHandler}>
                    <div>
                      <FaSearch> </FaSearch>
                      <input onChange={(e) => setInput(e.target.value)} 
                      type="text" 
                      value={input} />
                    </div>
                  </FormStyle>
                    <Tab href="/" sx={{color: "#f9473a"}} label="Home"/>
                    <Link to="/properties">Properties</Link>
                    <Link to={"/bookings/" + booking.id}>Manage Booking</Link>
                </Tabs>
            </Toolbar>
        </AppBar>
      </>
  )
}

export default Navbar

const FormStyle = styled.form`

    margin: 0rem 20rem;

    div{
        width: 100%;
        position: relative;
        top: 22px;
        /* margin-left: 17%; */
    }
    input{
        border: none;
        background: #f9473a;
        font-size: 1.5rem;
        color: white;
        padding: 0.5rem 2rem;
        border-radius: 1rem;
        border: none;
        outline: none;
        width: 100%;
        margin-bottom: 3rem;
    }
    svg{
        position: absolute;
        top: 25%;
        left: -2%;
        transform: translate(100%, -50%);
        color: white;
    }
`