import React from 'react'
import { Typography, Rating, Box, CardContent, CardMedia} from "@mui/material"
import {useEffect, useState} from 'react';
import {useParams} from 'react-router-dom';
import styled from 'styled-components';
import { Link } from 'react-router-dom';

function SearchedProperties({properties}) {

    let params = useParams()
    const [filteredProperties, setFilteredProperties] = useState(null)

    useEffect(() => {
        if(params){
        const filtered = filterByLocation(params)
        console.log(filtered);

                    setFilteredProperties(filtered)
        }
        
    }, [properties])

    const filterByLocation = (params) => {
        return(
            properties.filter((property) => {
                 return property.location.toLowerCase() === params.search.toLowerCase();
            })
        )}


    return  <Grid>
        {filteredProperties?.map((property) => {
            return (
                <Card>
                    <CardMedia
                    component="img"
                    sx={{ height: 340, width: 500, margin: 1, borderRadius: 3}}
                    image= {property.images[0].url}
                    alt="house in Oban"
                />
                <Box sx={{ display: 'flex', flexDirection: 'column', width: 500 }}>
                    <CardContent sx={{ flex: '0 1 auto'}}>
                            <h3>City: {property.location}</h3>
                            <h3>Property Description: {property.description}</h3>
                            <h3>Host Name: {property.host["firstName"]}</h3>
                        <Typography component="legend"/>
                        <Typography component="legend">Host Rating</Typography>
                        <Rating name="read-only" value= {property.host["rating"]} readOnly />
                            <p>£ {property.pricePerNight} / per night</p>
                        <Link to={"/properties/" + property.id}>View</Link>
                    </CardContent>
                </Box>
                </Card>
            );
        })}
    </Grid>
}

const Grid = styled.div`
    /* display: grid; */
    grid-template-columns: repeat(auto-fit, minmax(20rem, 1fr));
    grid-gap: 3rem;
    margin: 4rem 0rem;
    display: flex;
    flex-wrap: wrap;
    justify-content: space-around;
`;

// const Card = styled.div`
// img{
//     width: 100%;
//     border-radius: 2rem;
// }
// a{
//     text-decoration: none;
// }
// h4{
//     text-align: center;
//     padding: 1rem;
//     color: black;
// }
// `;

// const Wrapper = styled.div`
//     margin: 4rem 0rem;
//     display: flex;
//     justify-content: space-around;
// `;


const Card = styled.div`
    border-radius: 10px;
    box-shadow: 0px 2px 10px rgb(68, 67, 67);
    padding: 15px;
    display: flex;
`



export default SearchedProperties;