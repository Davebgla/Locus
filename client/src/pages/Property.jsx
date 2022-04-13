import React, { useEffect, useState } from 'react'
import {useParams} from 'react-router-dom'
import styled from "styled-components";
import {Typography, Rating, Tooltip, } from "@mui/material"
import BookingForm from '../components/BookingForm';
import { Splide, SplideSlide } from "@splidejs/react-splide";
import { GiShower, GiWifiRouter, GiKnifeFork, GiBed, GiWaterDrop, GiThermometerHot } from "react-icons/gi";
import MapBox from '../components/MapBox';

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
        <div className='property'>
        {property &&
        <Wrapper>
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
                    <TextContainer>

                    <h3>Location: {property.location}</h3>

                    <p>{property.description}</p>

                    <h4>Your host is:</h4>
                    <p>{property.host["firstName"]}</p>
                    <Rating name="read-only" value={property.host["rating"]}readOnly />

                    <p>£ {property.pricePerNight} / per night</p>
                    <IconContainer>
                    <h5>Available at this property:</h5>
                    {/* <Tooltip title="Steamy Shower" arrow>
                        <GiShower size={30}/>
                     </Tooltip> */}
                    <ul>
                        <Tooltip title="Steamy Shower" arrow>
                        <li><GiShower  size={30}/></li>
                        </Tooltip>

                        <Tooltip title="Free Wifi" arrow>
                        <li><GiWifiRouter size={30}/></li>
                        </Tooltip>

                        <Tooltip title="Free Food" arrow>
                        <li><GiKnifeFork size={30}/></li>
                        </Tooltip>

                        <Tooltip title="Comfy Beds" arrow>
                        <li><GiBed size={30}/></li>
                        </Tooltip>
                        <Tooltip title="Hot Shit Water" arrow>
                        <li><GiWaterDrop size={30}/></li>
                        </Tooltip>
                        <Tooltip title="Proper Heating" arrow>
                        <li><GiThermometerHot size={30}/></li>
                        </Tooltip>

                    </ul>
                    </IconContainer>
                    </TextContainer>


                    <FormWrapper>
                    <BookingForm guest={guest} property={property} onCreateBooking={onCreateBooking} />
                    </FormWrapper>
            </Card>
            <MapBox property={property} />
        </Wrapper>
        }
        </div>
    )
}

export default Property;

const FormWrapper = styled.div`
    
    form{
        background: white;
        border: 1px solid #dedede;
        border-radius: 4px;
        display: flex;
        flex-direction: column;
        justify-content: space-around;
        margin: 0 auto;
        margin-top: 1rem;
        margin-bottom: 1rem;
        left: 65%;
        top: 20%;
        width: 20%;
        padding: 25px 35px;  
        box-shadow: 0px 2px 10px rgb(153, 151, 151);
        
    }

    input{
        border: 1px solid #d9d9d9;
        border-radius: 4px;
        box-sizing: border-box;
        padding: 10px;
        width: 100%;
        margin-bottom: 20px;
    }


    button{
        background-color: #f9473a;
        border: none;
        border-radius: 4px;
        color: white;
        font-family: sans-serif;
        font-size: 14px;
        margin: 10px 0px;
        padding: 10px;
    }

    button:hover {
        box-shadow: 0 5px 9px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}
`

const IconContainer = styled.div`
    display: inline;
    justify-content: left;
    margin: 0;

    ul{
        margin: 0;
    }
`;

const TextContainer = styled.div`
    float: left;
    text-align: left;
    max-width: 70%;
`;

const Wrapper = styled.div`
    margin: 10% 10%;
`;

const Card = styled.div`
    
    min-height: 30rem;
    border-radius: 2rem;
    overflow: hidden;
    position: relative;
    margin-bottom: 1rem;    
    

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

