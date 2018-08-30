package com.uhope.rl.wechat.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "wx_template_user")
public class WxTemplateUser implements Serializable {
    /**
     * 序号
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 消息ID
     */
    @Column(name = "MSGID")
    private String msgid;

    /**
     * 接收者 接收者的openid
     */
    @Column(name = "TOUSER")
    private String touser;

    /**
     * 返回的消息ID
     */
    @Column(name = "BACKID")
    private String backid;

    /**
     * 状态 消息发送状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 更新时间
     */
    @Column(name = "UPDATETIME")
    private Date updatetime;

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
     * 获取消息ID
     *
     * @return MSGID - 消息ID
     */
    public String getMsgid() {
        return msgid;
    }

    /**
     * 设置消息ID
     *
     * @param msgid 消息ID
     */
    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    /**
     * 获取接收者 接收者的openid
     *
     * @return TOUSER - 接收者 接收者的openid
     */
    public String getTouser() {
        return touser;
    }

    /**
     * 设置接收者 接收者的openid
     *
     * @param touser 接收者 接收者的openid
     */
    public void setTouser(String touser) {
        this.touser = touser;
    }

    /**
     * 获取返回的消息ID
     *
     * @return BACKID - 返回的消息ID
     */
    public String getBackid() {
        return backid;
    }

    /**
     * 设置返回的消息ID
     *
     * @param backid 返回的消息ID
     */
    public void setBackid(String backid) {
        this.backid = backid;
    }

    /**
     * 获取状态 消息发送状态
     *
     * @return STATUS - 状态 消息发送状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 消息发送状态
     *
     * @param status 状态 消息发送状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATETIME - 更新时间
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
}