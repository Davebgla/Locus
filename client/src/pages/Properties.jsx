import styled from "styled-components";
import {Button, Typography, Rating} from "@mui/material"
import { Link } from 'react-router-dom';


function PropertyList({properties}){

    const propertyNodes = properties.map((property) => {
        return (
            <Wrapper>
                <Card>
                
                    <h3>{property.city}</h3>
                    <h3>{property.description}</h3>
                    <h3>{property.host["firstName"]}</h3>
                    <Typography component="legend"/>
                    <Rating name="read-only" value={property.host["rating"]}readOnly />
                    <img src={property.images[0].url} width="300" height="200"/>
                    <p>£ {property.pricePerNight} / per night</p>
                    <Link to={"/properties/" + property.id}>View</Link>
                </Card>
            </Wrapper>
        )
    });

    return(
        <div className="property-list">
            {propertyNodes}
        </div>
    )
}



export default PropertyList;

const Wrapper = styled.div`
    margin: 4rem 0rem;
`;

const Card = styled.div`
    
`