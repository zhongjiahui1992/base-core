package com.uhope.rl.wechat.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "wx_subscribe_user")
public class WxSubscribeUser implements Serializable {
    /**
     * 公众号appid
     */
    @Column(name = "APPID")
    private String appid;

    /**
     * 关注用户openid
     */
    @Id
    private String openid;

    /**
     * 关注用户的昵称
     */
    private String nickname;

    /**
     * 关注状态
     */
    private Integer subscribe;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 语言
     */
    private String language;

    /**
     * 城市
     */
    private String city;

    /**
     * 省份
     */
    private String province;

    /**
     * 国家
     */
    private String country;

    /**
     * 头像图片链接地址
     */
    private String headimgurl;

    /**
     * 关注时间
     */
    @Column(name = "subscribe_time")
    private Date subscribeTime;

    /**
     * 关注用户的备注
     */
    private String remark;

    /**
     * 关注用户的分组
     */
    private Integer groupid;

    /**
     * 是否是黑名单用户
     */
    private Integer isblack;

    /**
     * 用户的标签id，可多个标签
     */
    private String tagids;

    private static final long serialVersionUID = 1L;

    /**
     * 获取公众号appid
     *
     * @return APPID - 公众号appid
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置公众号appid
     *
     * @param appid 公众号appid
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取关注用户openid
     *
     * @return openid - 关注用户openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置关注用户openid
     *
     * @param openid 关注用户openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取关注用户的昵称
     *
     * @return nickname - 关注用户的昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置关注用户的昵称
     *
     * @param nickname 关注用户的昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取关注状态
     *
     * @return subscribe - 关注状态
     */
    public Integer getSubscribe() {
        return subscribe;
    }

    /**
     * 设置关注状态
     *
     * @param subscribe 关注状态
     */
    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取语言
     *
     * @return language - 语言
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置语言
     *
     * @param language 语言
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取头像图片链接地址
     *
     * @return headimgurl - 头像图片链接地址
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * 设置头像图片链接地址
     *
     * @param headimgurl 头像图片链接地址
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    /**
     * 获取关注时间
     *
     * @return subscribe_time - 关注时间
     */
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * 设置关注时间
     *
     * @param subscribeTime 关注时间
     */
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    /**
     * 获取关注用户的备注
     *
     * @return remark - 关注用户的备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置关注用户的备注
     *
     * @param remark 关注用户的备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取关注用户的分组
     *
     * @return groupid - 关注用户的分组
     */
    public Integer getGroupid() {
        return groupid;
    }

    /**
     * 设置关注用户的分组
     *
     * @param groupid 关注用户的分组
     */
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    /**
     * 获取是否是黑名单用户
     *
     * @return isblack - 是否是黑名单用户
     */
    public Integer getIsblack() {
        return isblack;
    }

    /**
     * 设置是否是黑名单用户
     *
     * @param isblack 是否是黑名单用户
     */
    public void setIsblack(Integer isblack) {
        this.isblack = isblack;
    }

    /**
     * 获取用户的标签id，可多个标签
     *
     * @return tagids - 用户的标签id，可多个标签
     */
    public String getTagids() {
        return tagids;
    }

    /**
     * 设置用户的标签id，可多个标签
     *
     * @param tagids 用户的标签id，可多个标签
     */
    public void setTagids(String tagids) {
        this.tagids = tagids;
    }
}