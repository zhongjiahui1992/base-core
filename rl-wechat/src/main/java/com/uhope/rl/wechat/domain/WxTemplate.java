package com.uhope.rl.wechat.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "wx_template")
public class WxTemplate implements Serializable {
    /**
     * 消息模板的id
     */
    @Id
    @Column(name = "TEMPLATEID")
    private String templateid;

    /**
     * 消息模板的标题
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * 模板所属行业的一级行业
     */
    @Column(name = "PRIMARYINDUSTRY")
    private String primaryindustry;

    /**
     * 模板所属行业的二级行业
     */
    @Column(name = "DEPUTYINDUSTRY")
    private String deputyindustry;

    /**
     * 模板内容
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * 样例
     */
    @Column(name = "EXAMPLE")
    private String example;

    /**
     * 公众号appid
     */
    @Column(name = "APPID")
    private String appid;

    private static final long serialVersionUID = 1L;

    /**
     * 获取消息模板的id
     *
     * @return TEMPLATEID - 消息模板的id
     */
    public String getTemplateid() {
        return templateid;
    }

    /**
     * 设置消息模板的id
     *
     * @param templateid 消息模板的id
     */
    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    /**
     * 获取消息模板的标题
     *
     * @return TITLE - 消息模板的标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置消息模板的标题
     *
     * @param title 消息模板的标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取模板所属行业的一级行业
     *
     * @return PRIMARYINDUSTRY - 模板所属行业的一级行业
     */
    public String getPrimaryindustry() {
        return primaryindustry;
    }

    /**
     * 设置模板所属行业的一级行业
     *
     * @param primaryindustry 模板所属行业的一级行业
     */
    public void setPrimaryindustry(String primaryindustry) {
        this.primaryindustry = primaryindustry;
    }

    /**
     * 获取模板所属行业的二级行业
     *
     * @return DEPUTYINDUSTRY - 模板所属行业的二级行业
     */
    public String getDeputyindustry() {
        return deputyindustry;
    }

    /**
     * 设置模板所属行业的二级行业
     *
     * @param deputyindustry 模板所属行业的二级行业
     */
    public void setDeputyindustry(String deputyindustry) {
        this.deputyindustry = deputyindustry;
    }

    /**
     * 获取模板内容
     *
     * @return CONTENT - 模板内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置模板内容
     *
     * @param content 模板内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取样例
     *
     * @return EXAMPLE - 样例
     */
    public String getExample() {
        return example;
    }

    /**
     * 设置样例
     *
     * @param example 样例
     */
    public void setExample(String example) {
        this.example = example;
    }

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
}