import React, {Component} from 'react';
import Goods from './Goods'
import tablepic from './bed table.png'

class GoodsList extends Component {
    render() {
	var request = new XMLHttpRequest();
	request.open('GET', 'http://localhost:8080/online_shopper_websever_war_exploded/test/two', false);
	request.send(null);
	var goodsList = [];
	if (request.status === 200) {
  	  console.log(request.responseText);
	  goodsList = JSON.parse( request.responseText );
	  console.log(goodsList[0]);
	}
 	const goods = [];
        var temp = []
	for(var i =0; i < goodsList.length; i++){
	  if(i%4 ==0){
	    temp = []
	    goods.push(temp);
	  }
          temp.push(goodsList[i]) 	  
	}
        
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