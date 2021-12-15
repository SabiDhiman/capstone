import React from 'react'
import * as MdIcons from "react-icons/md";
import * as AiIcons from "react-icons/ai";
import * as BiIcons from "react-icons/bi";

export const SidebarData = [
    {
        title: "Home",
        path: "/",
        icon: <AiIcons.AiFillHome /> ,
        cName: "side-text"
    },

    {
        title: "My Donations",
        path: "/mydonations",
        icon: <BiIcons.BiDonateHeart /> ,
        cName: "side-text"
    },

    {
        title: "Posts",
        path: "/posts",
        icon: <MdIcons.MdOutlineLocalPostOffice /> ,
        cName: "side-text"
    }

]