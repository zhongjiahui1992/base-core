package com.uhope.rl.wechat.service.impl;

import com.uhope.rl.base.core.AbstractService;
import com.uhope.rl.wechat.domain.WxTemplateUser;
import com.uhope.rl.wechat.dto.WxTemplateUserDTO;
import com.uhope.rl.wechat.mapper.WxTemplateUserMapper;
import com.uhope.rl.wechat.service.WxTemplateUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 模板发送用户表-ServiceImpl接口实现类
 * @author zdp on 2018/02/07
 * @version 3.0.0
 */
@Service("wxTemplateUserService")
public class WxTemplateUserServiceImpl extends AbstractService<WxTemplateUser, WxTemplateUserDTO, String> implements WxTemplateUserService {
    @Resource
    private WxTemplateUserMapper wxTemplateUserMapper;

}
