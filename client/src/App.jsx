import { BrowserRouter as Router } from 'react-router-dom';
import Pages from './pages/Pages';
import Navbar from './components/Navbar';

function App() {

  return (
    <div className="App">
      <Router>
        <Navbar />
        <Pages />
      </Router>
    </div>
  );
}

export default App;
