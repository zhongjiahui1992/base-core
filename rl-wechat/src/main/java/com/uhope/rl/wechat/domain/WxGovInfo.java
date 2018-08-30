package com.uhope.rl.wechat.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "wx_gov_info")
public class WxGovInfo implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT REPLACE(UUID(),'-','')")
    private String id;

    private String appid;

    private String address;

    private String phone;

    private String fax;

    private String email;

    private String worktime;

    private String jdphone;

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
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return worktime
     */
    public String getWorktime() {
        return worktime;
    }

    /**
     * @param worktime
     */
    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    /**
     * @return jdphone
     */
    public String getJdphone() {
        return jdphone;
    }

    /**
     * @param jdphone
     */
    public void setJdphone(String jdphone) {
        this.jdphone = jdphone;
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