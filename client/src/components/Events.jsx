import { useEffect, useState } from 'react';
import styled from "styled-components";
import { Splide, SplideSlide } from "@splidejs/react-splide";
import '@splidejs/splide/dist/css/splide.min.css';
import { Link } from 'react-router-dom';

function Events(){

    const [events, setEvents] = useState([]);

    useEffect(() => {
      getEvents();
    }, []);
  
    const getEvents = async () => {
  
      const api = await fetch('https://www.skiddle.com/api/v1/events/search/?api_key=7f5155bb08a9593213df1dc5ec1fde22&latitude=55.9533&longitude=-3.1883&radius=5&eventcode=LIVE&order=trending&description=1');
      const data = await api.json();
  
      setEvents(data.results);
    }

    return(
        <div className="events">
        <Wrapper>
            <h3>Events Nearby</h3>
            <Splide options = {{
                perPage: 4,
                pagination: false,
                drag: "free",
                gap: "2rem"
            }}>
                {events.map((event) => {
                    return(
                        <SplideSlide key={event.id}>
                            <Card>
                                <a href={event.link}>
                                    <p>{event.eventname}</p>
                                    <img src={event.xlargeimageurl} />
                                <Gradient/>
                                </a>
                            </Card>
                        </SplideSlide>
                    )
                })}
            </Splide>
        </Wrapper>
    </div>
    )

}

const Wrapper = styled.div`
    margin: 4rem 0rem;
    margin: 5% 10%;
`;

const Card = styled.div`
    min-height: 15rem;
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

    p{
        position: absolute;
        z-index: 10;
        left: 50%;
        bottom: 0%;
        transform: translate(-50%, 0%);
        color: white;
        width: 100%;
        text-align: center;
        font-weight: 600;
        font-size: 1rem;
        height: 40%;
        display: flex;
        justify-content: center;
        align-items: center;
        text-shadow: 2px black;
    }
`;

const Gradient = styled.div`
        z-index: 3;
        position: absolute;
        width: 100%;
        height: 100%;
        background: linear-gradient(rgba(0,0,0,0), rgba(0,0,0,0.5));
`;



export default Events;