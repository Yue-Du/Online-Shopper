package com.yue.shopper.mapper;

import com.yue.shopper.bean.GoodsDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsInfoMapper {
    List<GoodsDO> getGoodsDoByBatch(@Param("id") long startId, @Param("size") long size);
}
