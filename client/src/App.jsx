import { BrowserRouter as Router } from 'react-router-dom';
import Pages from './pages/Pages';
import Navbar from './components/Navbar';
import Search from './components/Search';

function App() {

  return (
    <div className="App">
      <Router>
        <Navbar />
        <Search/>
        <Pages />
      </Router>
    </div>
  );
}

export default App;
