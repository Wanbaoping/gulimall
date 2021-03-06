package com.baoge.gulimall.product.service.impl;

import com.baoge.common.utils.PageUtils;
import com.baoge.common.utils.Query;
import com.baoge.gulimall.product.dao.BrandDao;
import com.baoge.gulimall.product.entity.BrandEntity;
import com.baoge.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );
        return new PageUtils(page);
    }

}