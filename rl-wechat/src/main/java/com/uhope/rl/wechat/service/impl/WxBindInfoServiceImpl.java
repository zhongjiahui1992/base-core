package com.uhope.rl.wechat.service.impl;

import com.uhope.rl.base.core.AbstractService;
import com.uhope.rl.wechat.domain.WxBindInfo;
import com.uhope.rl.wechat.dto.WxBindInfoDTO;
import com.uhope.rl.wechat.mapper.WxBindInfoMapper;
import com.uhope.rl.wechat.service.WxBindInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户绑定信息-ServiceImpl接口实现类
 * @author jiangjialiang on 2018/02/01
 * @version 3.0.0
 */
@Service
public class WxBindInfoServiceImpl extends AbstractService<WxBindInfo, WxBindInfoDTO, String> implements WxBindInfoService {
    @Resource
    private WxBindInfoMapper wxBindInfoMapper;

}
