package com.baoge.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baoge.common.utils.PageUtils;
import com.baoge.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author baoge
 * @email 757010691@qq.com
 * @date 2021-02-02 20:21:39
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

