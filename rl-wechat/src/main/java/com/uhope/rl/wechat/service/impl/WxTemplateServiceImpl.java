package com.uhope.rl.wechat.service.impl;

import com.uhope.rl.base.core.AbstractService;
import com.uhope.rl.wechat.domain.WxTemplate;
import com.uhope.rl.wechat.dto.WxTemplateDTO;
import com.uhope.rl.wechat.mapper.WxTemplateMapper;
import com.uhope.rl.wechat.service.WxTemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 公众模板表-ServiceImpl接口实现类
 * @author zdp on 2018/02/07
 * @version 3.0.0
 */
@Service
public class WxTemplateServiceImpl extends AbstractService<WxTemplate, WxTemplateDTO, String> implements WxTemplateService {
    @Resource
    private WxTemplateMapper wxTemplateMapper;

}
