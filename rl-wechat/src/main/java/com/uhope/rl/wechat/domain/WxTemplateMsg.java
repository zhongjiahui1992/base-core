package com.uhope.rl.wechat.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "wx_template_msg")
public class WxTemplateMsg implements Serializable {
    /**
     * 序号
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 模板消息ID
     */
    @Column(name = "TEMPLATEID")
    private String templateid;

    /**
     * 跳转链接
     */
    @Column(name = "URL")
    private String url;

    /**
     * 跳转小程序
     */
    @Column(name = "MINIPROGRAM")
    private String miniprogram;

    /**
     * 小程序ID 优先跳转小程序
     */
    @Column(name = "APPID")
    private String appid;

    /**
     * 小程序的具体跳转路径
     */
    @Column(name = "PAGEPATH")
    private String pagepath;

    /**
     * 模板数据
     */
    @Column(name = "DATA")
    private String data;

    /**
     * 模板字体颜色 默认为黑色
     */
    @Column(name = "COLOR")
    private String color;

    /**
     * 状态 默认为0 0 插入 1 已发送
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * 发送时间
     */
    @Column(name = "SENDTIME")
    private Date sendtime;

    /**
     * 创建时间
     */
    @Column(name = "CREATETIME")
    private Date createtime;

    /**
     * 创建人
     */
    @Column(name = "CREATEUSER")
    private String createuser;

    private static final long serialVersionUID = 1L;

    /**
     * 获取序号
     *
     * @return ID - 序号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取模板消息ID
     *
     * @return TEMPLATEID - 模板消息ID
     */
    public String getTemplateid() {
        return templateid;
    }

    /**
     * 设置模板消息ID
     *
     * @param templateid 模板消息ID
     */
    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    /**
     * 获取跳转链接
     *
     * @return URL - 跳转链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置跳转链接
     *
     * @param url 跳转链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取跳转小程序
     *
     * @return MINIPROGRAM - 跳转小程序
     */
    public String getMiniprogram() {
        return miniprogram;
    }

    /**
     * 设置跳转小程序
     *
     * @param miniprogram 跳转小程序
     */
    public void setMiniprogram(String miniprogram) {
        this.miniprogram = miniprogram;
    }

    /**
     * 获取小程序ID 优先跳转小程序
     *
     * @return APPID - 小程序ID 优先跳转小程序
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置小程序ID 优先跳转小程序
     *
     * @param appid 小程序ID 优先跳转小程序
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取小程序的具体跳转路径
     *
     * @return PAGEPATH - 小程序的具体跳转路径
     */
    public String getPagepath() {
        return pagepath;
    }

    /**
     * 设置小程序的具体跳转路径
     *
     * @param pagepath 小程序的具体跳转路径
     */
    public void setPagepath(String pagepath) {
        this.pagepath = pagepath;
    }

    /**
     * 获取模板数据
     *
     * @return DATA - 模板数据
     */
    public String getData() {
        return data;
    }

    /**
     * 设置模板数据
     *
     * @param data 模板数据
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * 获取模板字体颜色 默认为黑色
     *
     * @return COLOR - 模板字体颜色 默认为黑色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置模板字体颜色 默认为黑色
     *
     * @param color 模板字体颜色 默认为黑色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取状态 默认为0 0 插入 1 已发送
     *
     * @return STATUS - 状态 默认为0 0 插入 1 已发送
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态 默认为0 0 插入 1 已发送
     *
     * @param status 状态 默认为0 0 插入 1 已发送
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取发送时间
     *
     * @return SENDTIME - 发送时间
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * 设置发送时间
     *
     * @param sendtime 发送时间
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * 获取创建时间
     *
     * @return CREATETIME - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取创建人
     *
     * @return CREATEUSER - 创建人
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * 设置创建人
     *
     * @param createuser 创建人
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }
}