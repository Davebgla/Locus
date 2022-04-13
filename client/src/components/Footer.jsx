import React from 'react'
import styled from 'styled-components';
import { TiSocialInstagram, TiSocialFacebook, TiSocialTwitter} from 'react-icons/ti'

function Footer() {
  return (
    <div className='footer'>
        <Wrapper>
            <p>Locus Inc 2022 </p>
            <TiSocialInstagram size={30}/>
            <TiSocialFacebook size={30}/>
            <TiSocialTwitter size={30}/>
        </Wrapper>

    </div>
  )
}

const Wrapper = styled.div`
    background: #f9473a;
    padding: 0.5%;
   

    p{
        font-weight: 600;
        color: white;
           
    }
    svg{
      color: white;
      
    }
`;


export default Footer