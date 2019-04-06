package com.chiyou.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wangxiansheng
 * @create 2019-04-05 22:34
 */
public class User {

    public interface UserSimpleView{};
    public interface UserDetailView extends UserSimpleView{};

    private String username;
    private String pwssword;

    @JsonView(UserSimpleView.class)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonView(UserDetailView.class)
    public String getPwssword() {
        return pwssword;
    }

    public void setPwssword(String pwssword) {
        this.pwssword = pwssword;
    }
}
