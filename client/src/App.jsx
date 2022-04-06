import './App.css';
import Featured from './components/Featured';
import { BrowserRouter } from 'react-router-dom';

function App() {

  return (
    <div className="App">
      <BrowserRouter>
      <Featured />
      </BrowserRouter>
    </div>
  );
}

export default App;
