package com.uhope.rl.wechat.service.impl;

import com.uhope.rl.base.core.AbstractService;
import com.uhope.rl.wechat.domain.WxTemplateMsg;
import com.uhope.rl.wechat.dto.WxTemplateMsgDTO;
import com.uhope.rl.wechat.mapper.WxTemplateMsgMapper;
import com.uhope.rl.wechat.service.WxTemplateMsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 模板消息表-ServiceImpl接口实现类
 * @author zdp on 2018/02/07
 * @version 3.0.0
 */
@Service("wxTemplateMsgService")
public class WxTemplateMsgServiceImpl extends AbstractService<WxTemplateMsg, WxTemplateMsgDTO, String> implements WxTemplateMsgService {
    @Resource
    private WxTemplateMsgMapper wxTemplateMsgMapper;


}
