import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import Header from './Header'
import GoodsList from './GoodsList'

class GoodsPage extends Component {
  render() {
    return (
      <div className='wrapper'>
        <Header />
        <GoodsList />
      </div>
    )
  }
}

export default GoodsPage