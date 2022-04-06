import { useEffect, useState } from 'react';
import styled from "styled-components";
import { Splide, SplideSlide } from "@splidejs/react-splide";
import '@splidejs/splide/dist/css/splide.min.css';
import { Link } from 'react-router-dom';

function Featured() {

  const [properties, setProperties] = useState([]);

  useEffect(() => {
    getProperties();
  }, []);

  const getProperties = async () => {

    const api = await fetch('http://localhost:8080/api/properties');
    const data = await api.json();

    setProperties(data);
    console.log(data);
  }

  const featured = properties.splice(0, 10);

  return (
    <div className="featured">
        <Wrapper>
            <h3>Featured Properties</h3>
            <Splide options = {{
                perPage: 4,
                pagination: false,
                drag: "free",
                gap: "5rem"
            }}>
                {featured.map((property) => {
                    return(
                        <SplideSlide key={property.id}>
                            <Card>
                                <Link to={"/api/properties/" + property.id}>
                                    <p>{property.city}</p>
                                    <img src={property.images[0].url} width="300" height="200"/>
                                </Link>
                            </Card>
                        </SplideSlide>
                    )
                })}
            </Splide>
        </Wrapper>
    </div>
  );
}

const Wrapper = styled.div`
    
`;

const Card = styled.div`
    
`;

export default Featured;
