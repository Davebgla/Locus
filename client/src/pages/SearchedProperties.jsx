import React from 'react'
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
                <Card key={property.location}>
                <Link to={"/properties/" + property.id}>
                <img src={property.images[0].url} width="300" height="200"/>
                <h4>{property.location}</h4>
                </Link>
                </Card>
            );
        })}
    </Grid>
}

const Grid = styled.div`
display: grid;
grid-template-columns: repeat(auto-fit, minmax(20rem, 1fr));
grid-gap: 3rem;
`;

const Card = styled.div`
img{
    width: 100%;
    border-radius: 2rem;
}
a{
    text-decoration: none;
}
h4{
    text-align: center;
    padding: 1rem;
    color: black;
}
`;



export default SearchedProperties;