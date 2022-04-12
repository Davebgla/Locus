import styled from "styled-components";
import { Typography, Rating, Box, CardContent, CardMedia} from "@mui/material"
import { Link } from "react-router-dom";


function PropertyList({properties}){

    const propertyNodes = properties.map((property) => {
        return (
            <Wrapper>
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
            </Wrapper>
          );
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
    /* flex-direction: column;
    justify-content: space-around; */
    /* align-items: center;
    width: 35%; */

    /* img{
        border-radius: 2rem;
        width: 80%;
        height: 70%;
    } */
`
