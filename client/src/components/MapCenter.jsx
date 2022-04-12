import { useMap } from 'react-leaflet'
export const MapCenter = ({center, zoom}) => {
    const map = useMap()
    map.flyTo([center[0], center[1]],zoom)
    return null
}