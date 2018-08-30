package com.uhope.rl.wechat.mapper;


import com.uhope.rl.base.core.Mapper;
import com.uhope.rl.wechat.domain.WxSubscribeUser;

import java.util.Map;

public interface WxSubscribeUserMapper extends Mapper<WxSubscribeUser> {
    Map<String, Object> aggregate(Map<String,Object> params);
}