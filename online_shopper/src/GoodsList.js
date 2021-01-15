import React, {Component} from 'react';
import Goods from './Goods'
import tablepic from './bed table.png'

class GoodsList extends Component {
    render() {
        const goods = [
            [{img: tablepic, goodname: 'Laptop bed tray table', price: '50$'},
                {img: tablepic, goodname: 'desk table', price: '50$'},
                {img: tablepic, goodname: 'desk table', price: '50$'},
                {img: tablepic, goodname: 'desk table', price: '50$'}],
            [{img: tablepic, goodname: 'desk table', price: '50$'}]
        ]
        return (<div>
            <table>
                {goods.map((raw, i) => <tr>{raw.map((column, j) => <td>
                    <Goods good={column} key={j}/>
                </td>)}</tr>)}
            </table>
        </div>)
    }
}

export default GoodsList