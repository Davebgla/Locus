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
                <CardContent sx={{ flex: '0 1 auto', margin: -2}}>
                  <h3>City: {property.location}</h3>
                  <h3>Property Description: {property.description}</h3>
                  <h3>Host Name: {property.host["firstName"]}</h3>
                  <Typography component="legend"/>
                  <Typography component="legend">Host Rating</Typography>
                  <Rating name="read-only" value= {property.host["rating"]} readOnly />
                  <p>£ {property.pricePerNight} / per night</p>
                  <StyledLink to={"/properties/" + property.id}>View</StyledLink>
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

const StyledLink = styled(Link)`
  display: inline-block;
  font-size: 1em;
  background: #f9473a;
  padding: 10px 30px;
  text-transform: uppercase;
  text-decoration: none;
  font-weight: 500;
  color: #fff;
  letter-spacing: 2px;
  transition: 0.2s;
  border-radius: 20px;
  :hover{
    letter-spacing: 5px;
  }
`


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
    text-decoration: none;
`
