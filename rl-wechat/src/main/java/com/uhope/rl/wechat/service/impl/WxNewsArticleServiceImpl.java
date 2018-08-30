package com.uhope.rl.wechat.service.impl;

import com.uhope.rl.base.core.AbstractService;
import com.uhope.rl.wechat.domain.WxNewsArticle;
import com.uhope.rl.wechat.dto.WxNewsArticleDTO;
import com.uhope.rl.wechat.mapper.WxNewsArticleMapper;
import com.uhope.rl.wechat.service.WxNewsArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * -ServiceImpl接口实现类
 * @author jiangjialiang on 2018/02/01
 * @version 3.0.0
 */
@Service
public class WxNewsArticleServiceImpl extends AbstractService<WxNewsArticle, WxNewsArticleDTO, String> implements WxNewsArticleService {
    @Resource
    private WxNewsArticleMapper wxNewsArticleMapper;

}
