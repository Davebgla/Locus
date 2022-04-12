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

    p{
        text-align: center;
        font-weight: 600;
    }
`;


export default Footer