package com.baoge.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baoge.common.utils.PageUtils;
import com.baoge.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author baoge
 * @email 757010691@qq.com
 * @date 2021-02-02 20:21:39
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

