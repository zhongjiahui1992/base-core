package com.uhope.rl.wechat.service.impl;

import com.uhope.rl.base.core.AbstractService;
import com.uhope.rl.wechat.domain.WxMenuFunc;
import com.uhope.rl.wechat.dto.WxMenuFuncDTO;
import com.uhope.rl.wechat.mapper.WxMenuFuncMapper;
import com.uhope.rl.wechat.service.WxMenuFuncService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 微信功能菜单-ServiceImpl接口实现类
 * @author jiangjialiang on 2018/02/01
 * @version 3.0.0
 */
@Service
public class WxMenuFuncServiceImpl extends AbstractService<WxMenuFunc, WxMenuFuncDTO, Integer> implements WxMenuFuncService {
    @Resource
    private WxMenuFuncMapper wxMenuFuncMapper;

}
