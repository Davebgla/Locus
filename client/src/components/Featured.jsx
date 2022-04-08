import styled from "styled-components";
import { Splide, SplideSlide } from "@splidejs/react-splide";
import '@splidejs/splide/dist/css/splide.min.css';
import { Link } from 'react-router-dom';

function Featured({properties}) {

    const copyProperties = [...properties]
    const featured = copyProperties.splice(0, 10);

  return (
    <div className="featured">
        <Wrapper>
            <h3>Featured Properties</h3>
            <Splide options = {{
                perPage: 4,
                pagination: false,
                drag: "free",
                gap: "3rem"
            }}>
                {featured.map((property) => {
                    return(
                        <SplideSlide key={property.id}>
                            <Card>
                                <Link to={"/properties/" + property.id}>
                                    <p>{property.city}</p>
                                    <img src={property.images[0].url} width="300" height="200"/>
                                    <Gradient />
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
    margin: 4rem 0rem;
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
    }
`;

const Gradient = styled.div`
        z-index: 3;
        position: absolute;
        width: 100%;
        height: 100%;
        background: linear-gradient(rgba(0,0,0,0), rgba(0,0,0,0.5));

`;

export default Featured;
