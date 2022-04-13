import React, { useEffect, useState } from "react";
import { MapContainer, TileLayer, Marker, Popup } from "react-leaflet";
import { MapCenter } from "./MapCenter";
// import styled from 'styled-components';

const MapBox = ({property}) => {

    const [latitude, setLatitude] = useState(0);
    const [longitude, setLongitude] = useState(0);

    const [center, setCenter] = useState({
        coordinates: [56.8169, -4.1826],
        zoom: 7
         }   
        )
    
    const handleMarkerClick = () => {
        setCenter({
            coordinates: [latitude, longitude],
            zoom: 13
            })
    }

    const getLatLong = async () => {
        const api = await fetch(`https://api.postcodes.io/postcodes/${property.postcode}`)
        const data = await api.json()
            setLatitude(data.result.latitude)
            setLongitude(data.result.longitude)
    }

    useEffect(() => {
        getLatLong();
    }, []);

    return(
        <MapContainer center={center.coordinates} zoom={center.zoom} scrollWheelZoom={true}>
          <TileLayer
              attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
              url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
          />
          <MapCenter center={center.coordinates} zoom={center.zoom} />
            <Marker key={property.id} position={[latitude, longitude]} eventHandlers={{
                click: () => handleMarkerClick(),
            }}>
                <Popup>
                    <h3>{property.location}</h3>
                </Popup>
                <img href = "https://i.imgur.com/O7vDxyB.png"/>
            </Marker>
        </MapContainer>
      )

}

export default MapBox;

// const Marker =  styled.marker`
//     img
// `