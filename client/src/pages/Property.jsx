import React, { useEffect, useState } from 'react'
import {useParams} from 'react-router-dom'
import styled from "styled-components";
import {Typography, Rating, } from "@mui/material"
import BookingForm from '../components/BookingForm';
import { Splide, SplideSlide } from "@splidejs/react-splide";


function Property({guest, properties, onCreateBooking}){

    let params = useParams()
    const [property, setProperty] = useState(null)

    useEffect(() => {
        if(params){
        const foundProperty = findPropertyById(params)
                console.log(properties)
                    setProperty(foundProperty)

        }
        
    }, [properties])

    const findPropertyById = (params) => {
        return(
            properties.find((property) => {
                console.log(property.id, parseInt(params.id))
                 return property.id === parseInt(params.id);
            })
        )}
    return(
        <Wrapper>
       {property &&
            <Card>
                                    <Splide options = {{
                            perPage: 1,
                            pagination: false,
                            drag: "free",
                            gap: "2rem"
                        }}>
                            {property.images.map((image, index) => {
                                return(
                                    <SplideSlide key={index}>
                                        <Card>
                                                <img src={image.url} />
                                        </Card>
                                    </SplideSlide>
                                )
                            })}
                        </Splide>
                        
                    <h3>Location: {property.location}</h3>

                    <p>{property.description}</p>

                    <h4>Your host is:</h4>
                    <p>{property.host["firstName"]}</p>
                    <Rating name="read-only" value={property.host["rating"]}readOnly />

                    <p>£ {property.pricePerNight} / per night</p>
                    <Typography component="legend">Host Rating</Typography>
                    <br/>
                    <BookingForm guest={guest} property={property} onCreateBooking={onCreateBooking} />
            </Card>
        }
        </Wrapper>
    )
}


export default Property;

const Wrapper = styled.div`
    /* margin: 4rem 0rem; */
    margin: 5% 10%;
`;

const Card = styled.div`
    min-height: 30rem;
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
`;

const Gradient = styled.div`
        z-index: 3;
        position: absolute;
        width: 100%;
        height: 100%;
        background: linear-gradient(rgba(0,0,0,0), rgba(0,0,0,0.5));
        &:hover {
            opacity: 0;
    }
`;

