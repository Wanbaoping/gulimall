package com.baoge.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baoge.common.utils.PageUtils;
import com.baoge.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author baoge
 * @email 757010691@qq.com
 * @date 2021-02-02 20:13:36
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

