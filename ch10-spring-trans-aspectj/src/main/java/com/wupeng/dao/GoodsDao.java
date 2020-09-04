package com.wupeng.dao;

import com.wupeng.domain.Goods;

public interface GoodsDao {
    int updateGoods(Goods goods);
    Goods selectGoods(Integer id);
}
