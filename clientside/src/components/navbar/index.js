import React from 'react';
import { Nav, NavLink, Bars, NavMenu, NavBtn, NavBtnLink } from './Navbar';
import bell from './navImage/bell.png';
import message from './navImage/message.png';
import home from './navImage/home.png';
import logo from './navImage/logo.png';
import profile from './navImage/profile-icon.png';
import './nav.css'


const Navbar = () => {
    return (
        <div className='main-navbar-container'>
        <Nav>
            <NavLink to="/">
            <img src={logo} className="logo" alt="homepage-icon"/>
            <h2 className="website-name">&ensp;Some1InNeed</h2>
            </NavLink>
            <Bars/>
            <NavMenu>
                <NavLink to='/' activeStyle>
                <img src={home} className="belll" alt="homepage-icon"/>
                </NavLink>

                <NavLink to='/about' activeStyle>
                <img src={message} className="messages" alt="messages-icon"/>
                </NavLink>

                <NavLink to='/about' activeStyle>
                <img src={bell} className="notifications" alt="notification-icon"/>
                </NavLink>

            </NavMenu>
            <NavLink to='/Donation' activeStyle>
                <img src={profile} className="profile-icon" alt="notification-icon"/>
                </NavLink>
        </Nav>
    </div>

    );
}

export default Navbar
