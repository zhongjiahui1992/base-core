package com.uhope.rl.wechat.domain;

import javax.persistence.*;
import java.io.Serializable;


@Table(name = "wx_news_article")
public class WxNewsArticle implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT REPLACE(UUID(),'-','')")
    private String id;

    /**
     * 公众号appid
     */
    @Column(name = "APPID")
    private String appid;

    /**
     * 素材mediaid
     */
    private String mediaid;

    /**
     * 文章封面图片的mediaid
     */
    private String thumbmediaid;

    /**
     * 文章封面图片的链接
     */
    private String thumburl;

    /**
     * 文章的作者
     */
    private String author;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文字源链接地址
     */
    private String contentsourceurl;

    /**
     * 文章是否显示封面大图
     */
    private Integer showcoverpic;

    /**
     * 文章链接地址
     */
    private String url;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章摘要
     */
    private String digest;

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
     * 获取素材mediaid
     *
     * @return mediaid - 素材mediaid
     */
    public String getMediaid() {
        return mediaid;
    }

    /**
     * 设置素材mediaid
     *
     * @param mediaid 素材mediaid
     */
    public void setMediaid(String mediaid) {
        this.mediaid = mediaid;
    }

    /**
     * 获取文章封面图片的mediaid
     *
     * @return thumbmediaid - 文章封面图片的mediaid
     */
    public String getThumbmediaid() {
        return thumbmediaid;
    }

    /**
     * 设置文章封面图片的mediaid
     *
     * @param thumbmediaid 文章封面图片的mediaid
     */
    public void setThumbmediaid(String thumbmediaid) {
        this.thumbmediaid = thumbmediaid;
    }

    /**
     * 获取文章封面图片的链接
     *
     * @return thumburl - 文章封面图片的链接
     */
    public String getThumburl() {
        return thumburl;
    }

    /**
     * 设置文章封面图片的链接
     *
     * @param thumburl 文章封面图片的链接
     */
    public void setThumburl(String thumburl) {
        this.thumburl = thumburl;
    }

    /**
     * 获取文章的作者
     *
     * @return author - 文章的作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置文章的作者
     *
     * @param author 文章的作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取文章标题
     *
     * @return title - 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置文章标题
     *
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取文字源链接地址
     *
     * @return contentsourceurl - 文字源链接地址
     */
    public String getContentsourceurl() {
        return contentsourceurl;
    }

    /**
     * 设置文字源链接地址
     *
     * @param contentsourceurl 文字源链接地址
     */
    public void setContentsourceurl(String contentsourceurl) {
        this.contentsourceurl = contentsourceurl;
    }

    /**
     * 获取文章是否显示封面大图
     *
     * @return showcoverpic - 文章是否显示封面大图
     */
    public Integer getShowcoverpic() {
        return showcoverpic;
    }

    /**
     * 设置文章是否显示封面大图
     *
     * @param showcoverpic 文章是否显示封面大图
     */
    public void setShowcoverpic(Integer showcoverpic) {
        this.showcoverpic = showcoverpic;
    }

    /**
     * 获取文章链接地址
     *
     * @return url - 文章链接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置文章链接地址
     *
     * @param url 文章链接地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取文章内容
     *
     * @return content - 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置文章内容
     *
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取文章摘要
     *
     * @return digest - 文章摘要
     */
    public String getDigest() {
        return digest;
    }

    /**
     * 设置文章摘要
     *
     * @param digest 文章摘要
     */
    public void setDigest(String digest) {
        this.digest = digest;
    }
}
