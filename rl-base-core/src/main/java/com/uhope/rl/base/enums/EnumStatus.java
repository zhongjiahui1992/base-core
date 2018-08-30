package com.uhope.rl.base.enums;

/**
 * 状态
 * @author xiepuyao
 * @date Created on 2017/11/9
 */
public enum EnumStatus {
    NORMAL(1),
    DISABLE(2);

    private Integer status;

    EnumStatus(Integer status){
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public static EnumStatus getEnumStatus(Integer status){
        if(null==status||status<1){
            return null;
        }
        for (EnumStatus enumStatus:EnumStatus.values()) {
            if(enumStatus.getStatus().equals(status)){
                return enumStatus;
            }
        }
        return null;

    }

}
