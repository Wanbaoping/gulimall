package com.baoge.gulimall.order.dao;

import com.baoge.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author baoge
 * @email 757010691@qq.com
 * @date 2021-02-02 20:40:08
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
