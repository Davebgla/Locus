import { Routes, Route, useLocation } from 'react-router-dom';
import Home from './Home';
import PropertyList from './Properties';
import Property from './Property';

function Pages({properties}) {


    const location = useLocation();



    return(
        <Routes location={location} key={location.pathname}>
            <Route path="/" element={<Home properties={properties} />} />
            <Route path="/properties" element={<PropertyList properties={properties} />} />
            {/* <Route path="/properties/:id" element={<Property />} /> */}
            <Route exact path="/properties/:id" element={ <Property properties={properties}/>
            }/>
        </Routes>
    )
}

export default Pages;