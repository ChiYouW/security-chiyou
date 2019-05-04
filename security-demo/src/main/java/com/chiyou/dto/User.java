package com.chiyou.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

/**
 * @author wangxiansheng
 * @create 2019-04-05 22:34
 */
public class User {

    public interface UserSimpleView{};
    public interface UserDetailView extends UserSimpleView{};

    private String id;
    private String username;

    @NotBlank
    private String pwssword;
    private Date birthDay;

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

    @JsonView(UserSimpleView.class)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonView(UserSimpleView.class)
    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
