

import { createContext, useState } from "react";

const UserContext = createContext({username: "", email: ""});

const UserProvider= ({children}) => {
    const [user, setUser] = useState({username: "", email: ""})
    
    const login = (newUser) => {
        setUser(newUser)
    }

 return (
     <UserContext.Provider value = {{user, login}}>

            {children}

     </UserContext.Provider>
 )
}
export {UserContext, UserProvider}

//initialise user details
//set up provider