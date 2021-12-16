import React, {useContext} from 'react'
import { UserContext } from '../UserContext'



function Homepage() {
   
const {user} = useContext(UserContext)

    return (
        <div>
            home
        </div>
    )
}

export default Homepage
