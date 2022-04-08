import React from 'react'
import {AppBar, Tab, Tabs, Toolbar, Typography} from "@mui/material";

function Navbar() {
  return (
      <>
        <AppBar>
            <Toolbar sx={{background: "white"}}>
                <img src="https://i.imgur.com/O7vDxyB.png" alt="locus-logo" width={80}/>
                <Tabs sx={{marginLeft: "auto"}}>
                    <Tab href="/" sx={{color: "#f9473a"}} label="Home"/>
                    <Tab href="/properties" sx={{color: "#f9473a"}} label="Properties"/>
                    <Tab sx={{color: "#f9473a"}} label="Bookings"/>
                </Tabs>
            </Toolbar>
        </AppBar>
      </>
  )
}

export default Navbar