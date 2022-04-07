import Featured from "../components/Featured";
import Events from "../components/Events";
import PropertyList from "./Properties";

function Home({properties}) {

    return(
        <div className="home">
            <Featured properties={properties} />
            <Events />
        </div>
    )
}

export default Home;