package com.yue.shopper.web;

import com.yue.shopper.bean.GoodsBO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test")
public class HelloWorldController {

    @RequestMapping("/one")
    @ResponseBody
    public String testOne() {
        return "test one";
    }

    @RequestMapping("/two")
    @ResponseBody
    public List<GoodsBO> testTwo() {
        GoodsBO goodsBO = new GoodsBO();
        goodsBO.setGoodname("egg");
        goodsBO.setImg("http://localhost:3000/static/media/online_shopping.c6a91db1.png");
        goodsBO.setPrice("43");

        GoodsBO goodsBO1 = new GoodsBO();
        goodsBO1.setGoodname("egg");
        goodsBO1.setImg("http://localhost:3000/static/media/online_shopping.c6a91db1.png");
        goodsBO1.setPrice("43");

        GoodsBO goodsBO2 = new GoodsBO();
        goodsBO2.setGoodname("egg");
        goodsBO2.setImg("http://localhost:3000/static/media/online_shopping.c6a91db1.png");
        goodsBO2.setPrice("43");

        GoodsBO goodsBO3 = new GoodsBO();
        goodsBO3.setGoodname("egg");
        goodsBO3.setImg("http://localhost:3000/static/media/online_shopping.c6a91db1.png");
        goodsBO3.setPrice("43");

        GoodsBO goodsBO4 = new GoodsBO();
        goodsBO4.setGoodname("egg");
        goodsBO4.setImg("http://localhost:3000/static/media/online_shopping.c6a91db1.png");
        goodsBO4.setPrice("43");

        List<GoodsBO> ret = new ArrayList<>();
        ret.add(goodsBO);
        ret.add(goodsBO1);
        ret.add(goodsBO2);
        ret.add(goodsBO3);
        ret.add(goodsBO4);
        return ret;
    }
}
