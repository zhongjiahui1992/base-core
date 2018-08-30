package com.uhope.rl.wechat.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Table(name = "wx_auto_reply")
public class WxAutoReply implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT REPLACE(UUID(),'-','')")
    private String id;

    private String appid;

    private Integer type;

    private String name;

    private String keyword;

    private String content;

    private Date createtime;

    private Integer mode;

    private String replytype;

    @Transient
    private List<WxNewsArticle> newsArticleList;

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
     * @return appid
     */
    public String getAppid() {
        return appid;
    }

    /**
     * @param appid
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
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
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * @param keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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
     * @return mode
     */
    public Integer getMode() {
        return mode;
    }

    /**
     * @param mode
     */
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    /**
     * @return replytype
     */
    public String getReplytype() {
        return replytype;
    }

    /**
     * @param replytype
     */
    public void setReplytype(String replytype) {
        this.replytype = replytype;
    }

    public List<WxNewsArticle> getNewsArticleList() {
        return newsArticleList;
    }

    public void setNewsArticleList(List<WxNewsArticle> newsArticleList) {
        this.newsArticleList = newsArticleList;
    }
}