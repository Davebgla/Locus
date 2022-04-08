import styled from "styled-components";
import {Button, Typography, Rating} from "@mui/material"


function PropertyList({properties}){

    const propertyNodes = properties.map((property) => {
        return (
            <Wrapper>
                <Card>
                    <h3>City: {property.city}</h3>
                    <h3>Property Description: {property.description}</h3>
                    <h3>Host Name: {property.host["firstName"]}</h3>
                    <Typography component="legend"/>
                    <img src={property.images[0].url} width="300" height="300"/>
                    <p>£ {property.pricePerNight} / per night</p>
                    <Typography component="legend">Host Rating</Typography>
                    <Rating name="read-only" value={property.host["rating"]}readOnly />
                    <Button a href={"/properties/" + property.id}>Book</Button>
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
    flex-wrap: wrap;
    
`;

const Card = styled.div`
    border-radius: 10px;
    box-shadow: 0px 5px 20px rgb(68, 67, 67);
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