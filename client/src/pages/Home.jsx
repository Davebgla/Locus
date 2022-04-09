import Featured from "../components/Featured";
import Events from "../components/Events";
import GuestForm from "../components/GuestForm";
import { Card, CardMedia } from "@mui/material";


function Home({properties, stateGuest, onCreate}) {

    return(
        <div className="home">
            <Card sx={{maxWidth: 1300, maxHeight: 700, margin: 0}}>
                <CardMedia
                component="img"
                src="https://i.imgur.com/YtOrFVb.png"
                alt="home-page-banner"
                />
            <GuestForm guest={stateGuest} onCreate={onCreate}/>
            </Card>
            <Featured properties={properties} />
            <Events />
        </div>
    )
}

export default Home;