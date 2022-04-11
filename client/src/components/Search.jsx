import React from 'react'
import styled from 'styled-components';
import {useState} from 'react';
import {FaSearch} from 'react-icons/fa';
import {useNavigate} from 'react-router-dom';

function Search() {

    const [input, setInput] = useState("");
    const navigate = useNavigate();

    const submitHandler = (e) => {
        e.preventDefault();
        navigate('/searched/' + input)
    };


  return (
    <FormStyle onSubmit={submitHandler}>
        <div>
            <FaSearch> </FaSearch>
        <input onChange={(e) => setInput(e.target.value)} 
        type="text" 
        value={input} />
        </div>
    </FormStyle>
  )
}

const FormStyle = styled.form`
    margin: 0rem 20rem;
        div{
            width: 50%;
            position: relative;
            margin-left: 17%;
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

export default Search