package com.qihang.jd.service;

import com.qihang.common.common.PageQuery;
import com.qihang.common.common.PageResult;
import com.qihang.common.common.ResultVo;
import com.qihang.jd.domain.JdOrderAfter;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qihang.jd.domain.bo.JdAfterBo;

/**
* @author qilip
* @description 针对表【jd_order_after(京东售后)】的数据库操作Service
* @createDate 2024-03-10 18:37:36
*/
public interface JdOrderAfterService extends IService<JdOrderAfter> {
    PageResult<JdOrderAfter> queryPageList(JdAfterBo bo, PageQuery pageQuery);
    ResultVo<Integer> saveAfter(Integer shopId,JdOrderAfter after);
    ResultVo<Long> updateAfterStatusByServiceId(JdOrderAfter after);
}
