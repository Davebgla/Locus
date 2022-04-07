import React, { useEffect, useState } from 'react'
import {useParams} from 'react-router-dom'

function Property({properties}){

    let params = useParams()
    const [property, setProperty] = useState(null)

    useEffect(() => {
        if(params){
        const foundProperty = findPropertyById(params)
                console.log(foundProperty)
                    setProperty(foundProperty)

        }
        
    }, [properties])

    const findPropertyById = (params) => {
        return(
            properties.find((property) => {
                console.log(property.id, parseInt(params.id))
                 return property.id === parseInt(params.id);
            })
        )}
    return(
        <>
       {property && <p>{property.city}</p>}
        </>
    )
}

export default Property;