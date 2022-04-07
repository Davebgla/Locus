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
  
      const api = await fetch('https://www.skiddle.com/api/v1/events/search/?api_key=7f5155bb08a9593213df1dc5ec1fde22&latitude=55.8597&longitude=-4.2550&radius=200&eventcode=LIVE&order=trending&description=1');
      const data = await api.json();
  
      setEvents(data.results);
    }

    return(
        <div className="events">
        <Wrapper>
            <h3>Events</h3>
            <Splide options = {{
                perPage: 1,
                pagination: false,
                drag: "free"
            }}>
                {events.map((event) => {
                    return(
                        <SplideSlide key={event.id}>
                            <Card>
                                <Link to={event.link}>
                                    <p>{event.eventname}</p>
                                    <img src={event.xlargeimageurl} width="300" height="300" />
                                </Link>
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
    
`;

const Card = styled.div`
    
`;

export default Events;