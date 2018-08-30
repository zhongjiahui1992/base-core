package com.uhope.rl.wechat.service.impl;

import com.uhope.rl.base.core.AbstractService;
import com.uhope.rl.wechat.domain.WxGovInfo;
import com.uhope.rl.wechat.dto.WxGovInfoDTO;
import com.uhope.rl.wechat.mapper.WxGovInfoMapper;
import com.uhope.rl.wechat.service.WxGovInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 政务信息-ServiceImpl接口实现类
 * @author jiangjialiang on 2018/02/01
 * @version 3.0.0
 */
@Service
public class WxGovInfoServiceImpl extends AbstractService<WxGovInfo, WxGovInfoDTO, String> implements WxGovInfoService {
    @Resource
    private WxGovInfoMapper wxGovInfoMapper;

}
