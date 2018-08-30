package com.uhope.rl.wechat.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zhongjiahui on 2018/2/1.
 */
@Table(name = "wx_group")
public class WxGroup implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT REPLACE(UUID(),'-','')")
    private String id;
    /**
     *微信公众号开发者ID
     */
    @Column(name = "APPID")
    private String appid;

    /**
     *分组id
     */
    @Column(name = "groupid")
    private Integer groupid;

    /**
     *分组名称
     */
    @Column(name = "name")
    private String name;

    /**
     *分组下的人数
     */
    @Column(name = "count")
    private Integer count;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
