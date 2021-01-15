import React, { Component } from 'react';
import Goods from './Goods'
import tablepic from './bed table.png'

class GoodsList extends Component {
  render() {
    const goods = [
      {img: tablepic, goodname: 'Laptop bed tray table', price: '50$'},
      {img: tablepic, goodname: 'desk table', price: '50$'},
    ]

    return (
      <div >
        <table>
          <tr>
            {goods.map((good, i) => <Goods good={good} key={i} />)}
          </tr>
        </table>
      </div>
    )
  }
}

export default GoodsList