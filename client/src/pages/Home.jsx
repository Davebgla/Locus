import Featured from "../components/Featured";
import Events from "../components/Events";
import GuestForm from "../components/GuestForm";
import { Card, CardMedia } from "@mui/material";


function Home({properties, stateGuest, onCreate}) {

    return(
        <div className="home">
            <GuestForm guest={stateGuest} onCreate={onCreate}/>
            <Card sx={{maxWidth: 1500, maxHeight: 700, margin: 0}}>
                <CardMedia
                component="img"
                src="https://i.imgur.com/t0azK89.png"
                alt="home-page-banner"
                />
            </Card>
            <Featured properties={properties} />
            <Events />
        </div>
    )
}

export default Home;