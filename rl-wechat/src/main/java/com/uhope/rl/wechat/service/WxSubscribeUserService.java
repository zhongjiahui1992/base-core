package com.uhope.rl.wechat.service;

import com.alibaba.fastjson.JSONObject;
import com.uhope.rl.base.core.Service;
import com.uhope.rl.wechat.domain.WxSubscribeUser;
import com.uhope.rl.wechat.dto.WxSubscribeUserDTO;
import tk.mybatis.mapper.entity.Condition;

import java.util.Date;
import java.util.Map;

/**
 * 关注用户表-Service接口类
 * @author jiangjialiang on 2018/02/01
 * @version 3.0.0
 */
public interface WxSubscribeUserService extends Service<WxSubscribeUser, WxSubscribeUserDTO, String> {
   Map<String, Object> aggregate(Map var1, String[] var2, String[] var3);
   JSONObject GetDayNumberPeopleNumberFromNow(String[] function, String[] count, int dayNmuber, Date date,String appid);
}
