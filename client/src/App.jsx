import './App.css';
import { useEffect, useState } from 'react';
import Pages from './pages/Pages';
import { BrowserRouter } from 'react-router-dom';

function App() {

  const [properties, setProperties] = useState([]);

  useEffect(() => {
    getProperties();
  }, []);

  const getProperties = async () => {

    const api = await fetch('http://localhost:8080/api/properties');
    const data = await api.json();

    setProperties(data);
  }


  return (
    <div className="App">
      <BrowserRouter>
      <Pages properties={properties} />
      </BrowserRouter>
    </div>
  );
}

export default App;
