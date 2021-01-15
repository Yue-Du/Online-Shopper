package com.yue.shopper.web;

import com.yue.shopper.bean.GoodsBO;
import com.yue.shopper.bean.GoodsDO;
import com.yue.shopper.mapper.GoodsInfoMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController {

    @Resource
    GoodsInfoMapper goodsInfoMapper;

    @RequestMapping("/getGoodsByBatch")
    @ResponseBody
    public List<GoodsBO> getGoodsByBatch(@RequestParam("startId") long startId, @RequestParam("size") long size) {
        return GoodsBO.createGoodsBO(goodsInfoMapper.getGoodsDoByBatch(startId, size));
    }
}
