package com.baoge.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baoge.common.utils.PageUtils;
import com.baoge.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author baoge
 * @email 757010691@qq.com
 * @date 2021-02-01 19:41:21
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

