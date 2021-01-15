package com.yue.shopper.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsBO {
    String img;
    String goodname;
    String price;

    public static GoodsBO createGoodsBO(GoodsDO goodsDO) {
        assert (goodsDO == null);
        GoodsBO goodsInfoBO = new GoodsBO();
        goodsInfoBO.setGoodname(goodsDO.getName());
        goodsInfoBO.setImg(goodsDO.getPicture());
        goodsInfoBO.setPrice(Float.toString(goodsDO.getPrice()));
        return goodsInfoBO;
    }

    public static List<GoodsBO> createGoodsBO(List<GoodsDO> goodsDO) {
        if (null == goodsDO || goodsDO.isEmpty()) {
            return new ArrayList<>();
        }
        List<GoodsBO> ret = new ArrayList<>();
        for (GoodsDO aDo : goodsDO) {
            ret.add(createGoodsBO(aDo));
        }
        return ret;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
