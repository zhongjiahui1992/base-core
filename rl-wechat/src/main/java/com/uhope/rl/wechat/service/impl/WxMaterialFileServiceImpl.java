package com.uhope.rl.wechat.service.impl;

import com.uhope.rl.base.core.AbstractService;
import com.uhope.rl.wechat.domain.WxMaterialFile;
import com.uhope.rl.wechat.dto.WxMaterialFileDTO;
import com.uhope.rl.wechat.mapper.WxMaterialFileMapper;
import com.uhope.rl.wechat.service.WxMaterialFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 公众号素材-ServiceImpl接口实现类
 * @author jiangjialiang on 2018/02/01
 * @version 3.0.0
 */
@Service
public class WxMaterialFileServiceImpl extends AbstractService<WxMaterialFile, WxMaterialFileDTO, String> implements WxMaterialFileService {
    @Resource
    private WxMaterialFileMapper wxMaterialFileMapper;

}
