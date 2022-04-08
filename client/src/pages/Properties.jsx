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
                    <img src={property.images[0].url} width="300" height="200"/>
                    <p>£ {property.pricePerNight} / per night</p>
                    <Rating name="read-only" value={property.host["rating"]}readOnly />
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
    display: flex;
    justify-content: space-around;
`;


const Card = styled.div`
    border-radius: 10px;
    box-shadow: 0px 2px 10px rgb(68, 67, 67);
    padding: 15px;
    display: flex;
    flex-direction: column;
    justify-content: space-around;
    align-items: center;
    width: 35%;

    img{
        border-radius: 1rem;
    }
`
