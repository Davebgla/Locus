import React, { useEffect, useState } from 'react'
import {useParams} from 'react-router-dom'

function Booking({properties}){

    let params = useParams()
    const [property, setProperty] = useState(null)

    useEffect(() => {
        if(params && properties){
        const foundProperty = findPropertyById(params)
                    setProperty(foundProperty)

        }
        
    }, [properties])

    const findPropertyById = (params) => {
        return(
            properties.find((property) => {
                 return property.id === parseInt(params.id);
            })
        )}
    return(
        <>
       {property && <div className="booking">{property.city}
       
       
       </div>}
       </>
    )
}

export default Booking;