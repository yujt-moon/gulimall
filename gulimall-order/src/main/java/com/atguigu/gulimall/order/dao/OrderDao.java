package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yujiangtao
 * @email 1291932524@qq.com
 * @date 2021-12-02 23:32:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
