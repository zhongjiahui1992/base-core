package com.uhope.rl.wechat.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "wx_menu_func")
public class WxMenuFunc implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT REPLACE(UUID(),'-','')")
    private Integer id;

    private String name;

    private String type;

    private String url;

    @Column(name = "click_key")
    private String clickKey;

    private String value;

    @Column(name = "url_type")
    private Integer urlType;

    private Integer status;

    private Date createtime;

    @Column(name = "news_info")
    private String newsInfo;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return click_key
     */
    public String getClickKey() {
        return clickKey;
    }

    /**
     * @param clickKey
     */
    public void setClickKey(String clickKey) {
        this.clickKey = clickKey;
    }

    /**
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return url_type
     */
    public Integer getUrlType() {
        return urlType;
    }

    /**
     * @param urlType
     */
    public void setUrlType(Integer urlType) {
        this.urlType = urlType;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return news_info
     */
    public String getNewsInfo() {
        return newsInfo;
    }

    /**
     * @param newsInfo
     */
    public void setNewsInfo(String newsInfo) {
        this.newsInfo = newsInfo;
    }
}