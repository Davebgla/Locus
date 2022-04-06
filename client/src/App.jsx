import { useEffect, useState } from 'react';
import './App.css';

function App() {

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

  const propertyNodes = properties.map((property) => {
    return (
    <>
    <img src={property.images[0].url} width="200" height="200"/>
    <img src={property.images[1].url} width="200" height="200"/>
    <img src={property.images[2].url} width="200" height="200"/>
    <h1>{property.city}</h1>
    <h2>{property.description}</h2>
    <p>{property.pricePerNight} per night</p>
    </>
    )
  })

  return (
    <div className="App">
    {propertyNodes}
    </div>
  );
}

export default App;
