package com.qihang.tao.service;

import com.qihang.tao.common.PageQuery;
import com.qihang.tao.common.PageResult;
import com.qihang.tao.domain.TaoGoods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qihang.tao.domain.bo.TaoGoodsBo;

/**
* @author TW
* @description 针对表【tao_goods】的数据库操作Service
* @createDate 2024-02-29 09:28:38
*/
public interface TaoGoodsService extends IService<TaoGoods> {
    PageResult<TaoGoods> queryPageList(TaoGoodsBo bo, PageQuery pageQuery);
}
