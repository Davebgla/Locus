import Featured from "../components/Featured";
import Events from "../components/Events";
import GuestForm from "../components/GuestForm";


function Home({properties, stateGuest, onCreate}) {

    return(
        <div className="home">
            
            <GuestForm guest={stateGuest} onCreate={onCreate}/>
            <Featured properties={properties} />
            <Events />
        </div>
    )
}

export default Home;