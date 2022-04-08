import React, { useEffect, useState } from 'react'
import {useParams} from 'react-router-dom'
import styled from "styled-components";
import {Button, Typography, Rating} from "@mui/material"

function Property({properties}){

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
        <div className='property'>
       {property &&
            <Wrapper>
                    <h3>City: {property.city}</h3>
                    <h3>Property Description: {property.description}</h3>
                    <h3>Host Name: {property.host["firstName"]}</h3>
                    <Typography component="legend"/>
                    <img src={property.images[0].url} width="300" height="300"/>
                    <img src={property.images[1].url} width="300" height="300"/>
                    <img src={property.images[2].url} width="300" height="300"/>
                    <p>£ {property.pricePerNight} / per night</p>
                    <Typography component="legend">Host Rating</Typography>
                    <Rating name="read-only" value={property.host["rating"]}readOnly />
                    <br/>
                    <Button a href={"/properties/" + property.id}>Book</Button>
            </Wrapper>
        }
        </div>
    )
}

const Wrapper = styled.div`
    margin: 4rem 0rem;
    justify-content: space-around;
    flex-wrap: wrap;
    
`;

export default Property;