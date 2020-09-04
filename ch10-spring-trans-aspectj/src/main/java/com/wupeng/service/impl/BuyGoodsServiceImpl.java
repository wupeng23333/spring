package com.wupeng.service.impl;

import com.wupeng.dao.GoodsDao;
import com.wupeng.dao.SaleDao;
import com.wupeng.domain.Goods;
import com.wupeng.domain.Sale;
import com.wupeng.execp.NotEnoughExecption;
import com.wupeng.service.BuyGoodsService;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("buy方法开始");
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods==null){
            throw new NullPointerException("编号是："+goodsId+"的商品不存在");
        }else if(goods.getAmount()<nums){
            throw new NotEnoughExecption("编号是："+goodsId+"的商品库存不足");
        }
        Goods buyGoods=new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("buy方法结束");
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
