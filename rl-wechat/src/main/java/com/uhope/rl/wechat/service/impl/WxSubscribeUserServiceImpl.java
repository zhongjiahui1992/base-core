package com.uhope.rl.wechat.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.uhope.rl.base.core.AbstractService;
import com.uhope.rl.wechat.domain.WxSubscribeUser;
import com.uhope.rl.wechat.dto.WxSubscribeUserDTO;
import com.uhope.rl.wechat.mapper.WxSubscribeUserMapper;
import com.uhope.rl.wechat.service.WxSubscribeUserService;
import com.uhope.rl.wechat.util.SQLGenerator;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * 关注用户表-ServiceImpl接口实现类
 * @author jiangjialiang on 2018/02/01
 * @version 3.0.0
 */
@Service
public class WxSubscribeUserServiceImpl extends AbstractService<WxSubscribeUser, WxSubscribeUserDTO, String> implements WxSubscribeUserService {
    @Resource
    private WxSubscribeUserMapper wxSubscribeUserMapper;




    /**
     * description 查询聚合函数
     * @param params
     * @param functions  查询的功能数组
     * @param columns  查询的列数组
     * @return key function_column value 聚合函数的返回值
     */
    @Override
    public Map<String, Object> aggregate(Map params, String[] functions, String[] columns) {
        Map<String, Object> result = wxSubscribeUserMapper.aggregate(params);
        if (result != null) {
            Map<String, Object> processedResult = Maps.newHashMapWithExpectedSize(result.size());
            for (Map.Entry<String, Object> entry : result.entrySet()) {
                processedResult.put(entry.getKey().toLowerCase(), entry.getValue());
            }
            return processedResult;
        } else {
            return result;
        }
    }

    /**
    *  designed by pzw
    *  @Description 得到最近dayNumber天的统计认识
    *  @date 14:18 2018/3/2
     *  params:
     *  param: functions 一些功能
     *  param: colmuns  一些列
     *  param: dayNumber
     *  return 近dayNumber天的人数
    */
    @Override
    public JSONObject GetDayNumberPeopleNumberFromNow(String[] functions, String[] columns, int dayNumber, Date timestamp,String appId) {
         JSONObject jsonObject = new JSONObject();
        // 当前日期
        Calendar instance = Calendar.getInstance();
        instance.setTime(timestamp);
        //将时分秒和毫秒变成0
//        instance.set(Calendar.HOUR_OF_DAY, 0);
//        instance.set(Calendar.MINUTE, 0);
//        instance.set(Calendar.SECOND, 0);
//        instance.set(Calendar.MILLISECOND, 0);
        String[] timestamps = new String[dayNumber];
        Long[] peopleNumber = new Long[dayNumber];
        for (int i = 0; i < dayNumber; i++) {
            try {
                Date date = instance.getTime();
                System.out.println("date=" + date);
                Map<String,Object> params = new HashMap<>();
                params.put("appID",appId);
                params.put("subscribe_time", date);
                params.put("aggregate_sql", SQLGenerator.buildAggregateSql(functions, columns));
                Map<String,Object> map = aggregate(params,functions,columns);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((instance.get(Calendar.MONTH)+1) + "-"+instance.get(Calendar.DAY_OF_MONTH));
                timestamps[i] = stringBuilder.toString();
                peopleNumber[i] = (long) map.get("count_subscribe_time");
            } catch (Exception e) {
                e.printStackTrace();
            }
            instance.add(Calendar.DATE, -1);
        }

        String[] timestampsR = new String[dayNumber];
        Long[] peopleNumberR = new Long[dayNumber];
        for(int j = 0;j < dayNumber;j++){
            timestampsR[j] = timestamps[dayNumber-j-1];
            peopleNumberR[j] = peopleNumber[dayNumber-j-1];
        }
        jsonObject.put("timestamps",timestampsR);
        jsonObject.put("peopleNumber",peopleNumberR);
        return jsonObject;
    }


}
