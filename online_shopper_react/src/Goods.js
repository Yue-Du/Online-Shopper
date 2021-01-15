import React, { Component } from 'react'
import tablepic from './bed table.png'


class Goods extends Component {
  render () {
    return (
      <div className='goods'>
        <img src={this.props. good.img} className="goodspic" alt = "tablepic" />
        <a
          className="good-link"
          href="https://www.amazon.com/Nearpow-Adjustable-Portable-Standing-Foldable/dp/B07439DYBR/ref=sr_1_14?dchild=1&keywords=bed+table&qid=1610669710&sr=8-14"
          target="_blank"
          rel="noopener noreferrer"
        >
          {this.props. good.goodname}
        </a>
        <span>{this.props. good.price}</span>
      </div>
    )
  }
}

export default Goods
