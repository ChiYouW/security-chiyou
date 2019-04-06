package com.chiyou.web.controller;

import com.chiyou.dto.User;
import com.chiyou.dto.UserQueryCondition;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangxiansheng
 * @create 2019-04-05 22:31
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> query(UserQueryCondition condition,
                            @PageableDefault(page = 2, size = 15, sort = "username,asc") Pageable pageable) {

        System.out.println(ReflectionToStringBuilder.toString(condition, ToStringStyle.MULTI_LINE_STYLE));

        System.out.println(ReflectionToStringBuilder.toString(pageable, ToStringStyle.MULTI_LINE_STYLE));

        List<User> user = new ArrayList<User>();
        user.add(new User());
        user.add(new User());
        user.add(new User());
        return user;
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User getInfo(@PathVariable("id") String id) {
        User user = new User();
        user.setUsername("tom");
        return user;
    }

}
