package com.uhope.rl.wechat.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by zhongjiahui on 2018/2/1.
 */
@Table(name = "wx_material_file")
public class WxMaterialFile implements Serializable {
    /**
     * 素材mediaid
     */
    @Id
    private String mediaid;

    /**
     * 公众号appid
     */
    @Column(name = "APPID")
    private String appid;

    /**
     * 素材类型:image,voice,video,news
     */
    private String type;

    /**
     * 素材名称
     */
    private String name;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * video类型素材的标题
     */
    private String videotitle;

    /**
     * video素材的简介
     */
    private String videointroduction;

    /**
     * 素材链接(只有image类型才有)
     */
    private String url;

    @Transient
    private List<WxNewsArticle> newsArticleList;

    private String dfsUrl;

    private static final long serialVersionUID = 1L;

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
     * 获取素材类型:image,voice,video,news
     *
     * @return type - 素材类型:image,voice,video,news
     */
    public String getType() {
        return type;
    }

    /**
     * 设置素材类型:image,voice,video,news
     *
     * @param type 素材类型:image,voice,video,news
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取素材名称
     *
     * @return name - 素材名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置素材名称
     *
     * @param name 素材名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取更新时间
     *
     * @return updatetime - 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取video类型素材的标题
     *
     * @return videotitle - video类型素材的标题
     */
    public String getVideotitle() {
        return videotitle;
    }

    /**
     * 设置video类型素材的标题
     *
     * @param videotitle video类型素材的标题
     */
    public void setVideotitle(String videotitle) {
        this.videotitle = videotitle;
    }

    /**
     * 获取video素材的简介
     *
     * @return videointroduction - video素材的简介
     */
    public String getVideointroduction() {
        return videointroduction;
    }

    /**
     * 设置video素材的简介
     *
     * @param videointroduction video素材的简介
     */
    public void setVideointroduction(String videointroduction) {
        this.videointroduction = videointroduction;
    }

    /**
     * 获取素材链接(只有image类型才有)
     *
     * @return url - 素材链接(只有image类型才有)
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置素材链接(只有image类型才有)
     *
     * @param url 素材链接(只有image类型才有)
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public List<WxNewsArticle> getNewsArticleList() {
        return newsArticleList;
    }

    public void setNewsArticleList(List<WxNewsArticle> newsArticleList) {
        this.newsArticleList = newsArticleList;
    }

    public String getDfsUrl() {
        return dfsUrl;
    }

    public void setDfsUrl(String dfsUrl) {
        this.dfsUrl = dfsUrl;
    }
}
