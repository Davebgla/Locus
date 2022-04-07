function PropertyList({properties}){

    const propertyNodes = properties.map((property) => {
        return <p>{property.city}</p>
    });

    return(
        <div className="property-list">
            {propertyNodes}
        </div>
    )
}

export default PropertyList;