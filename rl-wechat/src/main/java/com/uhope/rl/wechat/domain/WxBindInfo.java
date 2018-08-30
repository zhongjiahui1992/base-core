package com.uhope.rl.wechat.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "wx_bind_info")
public class WxBindInfo implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT REPLACE(UUID(),'-','')")
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 公众号名称
     */
    private String wxname;

    /**
     * 公众号原始id
     */
    private String wxoriginalid;

    /**
     * 公众号appid
     */
    private String wxappid;

    /**
     * 公众号app secret
     */
    private String wxappsecret;

    private String wxtoken;

    private String wxaeskey;

    /**
     * 是否是当前绑定的公众号(0否，1是)
     */
    private Integer iscurrent;

    /**
     * 绑定时间
     */
    private Date bindtime;

    /**
     * 是否推送模板开关
     */
    private String wxkey;

    private String basedomain;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取公众号名称
     *
     * @return wxname - 公众号名称
     */
    public String getWxname() {
        return wxname;
    }

    /**
     * 设置公众号名称
     *
     * @param wxname 公众号名称
     */
    public void setWxname(String wxname) {
        this.wxname = wxname;
    }

    /**
     * 获取公众号原始id
     *
     * @return wxoriginalid - 公众号原始id
     */
    public String getWxoriginalid() {
        return wxoriginalid;
    }

    /**
     * 设置公众号原始id
     *
     * @param wxoriginalid 公众号原始id
     */
    public void setWxoriginalid(String wxoriginalid) {
        this.wxoriginalid = wxoriginalid;
    }

    /**
     * 获取公众号appid
     *
     * @return wxappid - 公众号appid
     */
    public String getWxappid() {
        return wxappid;
    }

    /**
     * 设置公众号appid
     *
     * @param wxappid 公众号appid
     */
    public void setWxappid(String wxappid) {
        this.wxappid = wxappid;
    }

    /**
     * 获取公众号app secret
     *
     * @return wxappsecret - 公众号app secret
     */
    public String getWxappsecret() {
        return wxappsecret;
    }

    /**
     * 设置公众号app secret
     *
     * @param wxappsecret 公众号app secret
     */
    public void setWxappsecret(String wxappsecret) {
        this.wxappsecret = wxappsecret;
    }

    /**
     * @return wxtoken
     */
    public String getWxtoken() {
        return wxtoken;
    }

    /**
     * @param wxtoken
     */
    public void setWxtoken(String wxtoken) {
        this.wxtoken = wxtoken;
    }

    /**
     * @return wxaeskey
     */
    public String getWxaeskey() {
        return wxaeskey;
    }

    /**
     * @param wxaeskey
     */
    public void setWxaeskey(String wxaeskey) {
        this.wxaeskey = wxaeskey;
    }

    /**
     * 获取是否是当前绑定的公众号(0否，1是)
     *
     * @return iscurrent - 是否是当前绑定的公众号(0否，1是)
     */
    public Integer getIscurrent() {
        return iscurrent;
    }

    /**
     * 设置是否是当前绑定的公众号(0否，1是)
     *
     * @param iscurrent 是否是当前绑定的公众号(0否，1是)
     */
    public void setIscurrent(Integer iscurrent) {
        this.iscurrent = iscurrent;
    }

    /**
     * 获取绑定时间
     *
     * @return bindtime - 绑定时间
     */
    public Date getBindtime() {
        return bindtime;
    }

    /**
     * 设置绑定时间
     *
     * @param bindtime 绑定时间
     */
    public void setBindtime(Date bindtime) {
        this.bindtime = bindtime;
    }

    /**
     * 获取是否推送模板开关
     *
     * @return wxkey - 是否推送模板开关
     */
    public String getWxkey() {
        return wxkey;
    }

    /**
     * 设置是否推送模板开关
     *
     * @param wxkey 是否推送模板开关
     */
    public void setWxkey(String wxkey) {
        this.wxkey = wxkey;
    }

    public String getBasedomain() {
        return basedomain;
    }

    public void setBasedomain(String basedomain) {
        this.basedomain = basedomain;
    }
}