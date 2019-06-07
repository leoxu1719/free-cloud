package com.free.user.vo;

import lombok.Data;

@Data
//@ApiModel("用户信息")

public class UserInfoVO {

    //@ApiModelProperty("用户ID")
    private Long userId;

    //@ApiModelProperty("用户名")
    private String userName;

    //@ApiModelProperty("手机")
    private String mobile;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
