package com.uhope.rl.wechat.service.impl;

import com.uhope.rl.base.core.AbstractService;
import com.uhope.rl.wechat.domain.WxMassMessage;
import com.uhope.rl.wechat.dto.WxMassMessageDTO;
import com.uhope.rl.wechat.mapper.WxMassMessageMapper;
import com.uhope.rl.wechat.service.WxMassMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 群发消息记录-ServiceImpl接口实现类
 * @author zhongjiahui on 2018/02/05
 * @version 3.0.0
 */
@Service
public class WxMassMessageServiceImpl extends AbstractService<WxMassMessage, WxMassMessageDTO, String> implements WxMassMessageService {
    @Resource
    private WxMassMessageMapper wxMassMessageMapper;

}
