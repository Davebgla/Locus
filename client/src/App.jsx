import './App.css';
import Featured from './components/Featured';
import Events from './components/Events';
import { BrowserRouter } from 'react-router-dom';

function App() {

  return (
    <div className="App">
      <BrowserRouter>
      <Featured />
      <Events />
      </BrowserRouter>
    </div>
  );
}

export default App;
