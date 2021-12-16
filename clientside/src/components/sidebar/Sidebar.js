import React, { useState } from 'react';
import * as FaIcons from 'react-icons/fa';
import * as AiIcons from 'react-icons/ai';
import { Link } from 'react-router-dom';
import { SidebarData } from './SidebarData';
import './Sidebar.css';
import { IconContext } from 'react-icons';
import { Nav, NavLink, Bars, NavMenu,} from './Navbar';
import bell from './sidebar-images/bell.png';
import message from './sidebar-images/message.png';
import home from './sidebar-images/home.png';
import logo from './sidebar-images/logo.png';
import profile from './sidebar-images/profile-icon.png';
// import '../navbar/nav.css'

function Sidebar() {
  const [sidebar, setSidebar] = useState(false);

  const showSidebar = () => setSidebar(!sidebar);

  return (
    <>
      <IconContext.Provider value={{ color: '#fff' }}>
        <div className='sidebar'>


          <Link to='#' className='menu-bars'>
            <FaIcons.FaBars onClick={showSidebar} />


            <Nav>
            <NavLink to="/homePage">
            <img src={logo} className="logo" alt="homepage-icon"/>
            <p className="website-name">&ensp;Some1InNeed</p>
            </NavLink>
            <Bars/>
            <NavMenu>
                <NavLink to='/homePage' activeStyle>
                <img src={home} className="belll" alt="homepage-icon"/>
                </NavLink>

                <NavLink to='/homePage' activeStyle>
                <img src={message} className="messages" alt="messages-icon"/>
                </NavLink>

                <NavLink to='/homePage' activeStyle>
                <img src={bell} className="notifications" alt="notification-icon"/>
                </NavLink>

            </NavMenu>
            <NavLink to='/DonationPage' activeStyle>
                <img src={profile} className="profile-icon" alt="notification-icon"/>
                </NavLink>
        </Nav>
          </Link>


        </div>
        
        <nav className={sidebar ? 'side-menu active' : 'side-menu'}>
          <ul className='side-menu-items' onClick={showSidebar}>
            <li className='sidebar-toggle'>
              <Link to='#' className='menu-bars'>
                <AiIcons.AiOutlineClose />
              </Link>
            </li>
            {SidebarData.map((item, index) => {
              return (
                <li key={index} className={item.cName}>
                  <Link to={item.path}>
                    {item.icon}
                    <span>{item.title}</span>
                  </Link>
                </li>
              );
            })}
          </ul>
        </nav>
      </IconContext.Provider>
    </>
  );
}

export default Sidebar;