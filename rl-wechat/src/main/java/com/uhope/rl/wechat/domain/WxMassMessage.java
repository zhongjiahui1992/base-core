package com.uhope.rl.wechat.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "wx_mass_message")
public class WxMassMessage implements Serializable {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "APPID")
    private String appid;

    @Column(name = "toUserName")
    private String tousername;

    @Column(name = "fromUserName")
    private String fromusername;

    private String status;

    @Column(name = "totalCount")
    private Integer totalcount;

    @Column(name = "filterCount")
    private Integer filtercount;

    @Column(name = "sentCount")
    private Integer sentcount;

    @Column(name = "errorCount")
    private Integer errorcount;

    private Date createtime;

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
     * @return APPID
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
     * @return toUserName
     */
    public String getTousername() {
        return tousername;
    }

    /**
     * @param tousername
     */
    public void setTousername(String tousername) {
        this.tousername = tousername;
    }

    /**
     * @return fromUserName
     */
    public String getFromusername() {
        return fromusername;
    }

    /**
     * @param fromusername
     */
    public void setFromusername(String fromusername) {
        this.fromusername = fromusername;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalcount() {
        return totalcount;
    }

    /**
     * @param totalcount
     */
    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }

    /**
     * @return filterCount
     */
    public Integer getFiltercount() {
        return filtercount;
    }

    /**
     * @param filtercount
     */
    public void setFiltercount(Integer filtercount) {
        this.filtercount = filtercount;
    }

    /**
     * @return sentCount
     */
    public Integer getSentcount() {
        return sentcount;
    }

    /**
     * @param sentcount
     */
    public void setSentcount(Integer sentcount) {
        this.sentcount = sentcount;
    }

    /**
     * @return errorCount
     */
    public Integer getErrorcount() {
        return errorcount;
    }

    /**
     * @param errorcount
     */
    public void setErrorcount(Integer errorcount) {
        this.errorcount = errorcount;
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
}