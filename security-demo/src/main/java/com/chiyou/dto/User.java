package com.chiyou.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wangxiansheng
 * @create 2019-04-05 22:34
 */
public class User {

    private String username;

    private String pwssword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwssword() {
        return pwssword;
    }

    public void setPwssword(String pwssword) {
        this.pwssword = pwssword;
    }
}
