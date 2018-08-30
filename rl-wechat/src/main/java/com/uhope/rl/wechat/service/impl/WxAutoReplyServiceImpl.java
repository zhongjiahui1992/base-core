package com.uhope.rl.wechat.service.impl;

import com.uhope.rl.base.core.AbstractService;
import com.uhope.rl.wechat.domain.WxAutoReply;
import com.uhope.rl.wechat.dto.WxAutoReplyDTO;
import com.uhope.rl.wechat.mapper.WxAutoReplyMapper;
import com.uhope.rl.wechat.service.WxAutoReplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 自动回复-ServiceImpl接口实现类
 * @author jiangjialiang on 2018/02/01
 * @version 3.0.0
 */
@Service
public class WxAutoReplyServiceImpl extends AbstractService<WxAutoReply, WxAutoReplyDTO, String> implements WxAutoReplyService {
    @Resource
    private WxAutoReplyMapper wxAutoReplyMapper;

}
