import React, { Component } from 'react';
import headerpic from './online_shopping.png'
import ReactDOM from 'react-dom';

class Header extends Component {
  render () {
    return (
      <div className='header'>        
        <img src={headerpic} className="headerpic" alt="headerpic" />
      </div>
    )
  }
}

export default Header