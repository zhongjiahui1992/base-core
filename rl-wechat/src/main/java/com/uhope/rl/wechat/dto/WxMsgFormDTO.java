package com.uhope.rl.wechat.dto;

import com.uhope.rl.wechat.domain.WxTemplateMsg;

import java.util.Date;

/**
 * Created by zhengdepiao on 2018/2/8.
 */
public class WxMsgFormDTO extends WxTemplateMsg{
    private static final long serialVersionUID = 1L;
    private String toUser;//接收者openID
    private java.lang.String first;
    private java.lang.String keyword1;
    private java.lang.String keyword2;
    private java.lang.String keyword3;
    private java.lang.String keyword4;
    private java.lang.String keyword5;
    private java.lang.String remark;

    public String getKeyword1() {
        return keyword1;
    }

    public void setKeyword1(String keyword1) {
        this.keyword1 = keyword1;
    }

    public String getKeyword2() {
        return keyword2;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2;
    }

    public String getKeyword3() {
        return keyword3;
    }

    public void setKeyword3(String keyword3) {
        this.keyword3 = keyword3;
    }

    public String getKeyword4() {
        return keyword4;
    }

    public void setKeyword4(String keyword4) {
        this.keyword4 = keyword4;
    }

    public String getKeyword5() {
        return keyword5;
    }

    public void setKeyword5(String keyword5) {
        this.keyword5 = keyword5;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


}
