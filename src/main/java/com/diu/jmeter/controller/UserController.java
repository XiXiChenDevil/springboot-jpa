package com.diu.jmeter.controller;

import com.diu.jmeter.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: DIU
 * @Date: 2021/8/13 14:44
 */
@RestController
@RequestMapping("/school")
public class UserController {

    private Map<Integer, Object> userMap = new HashMap<>();

    private Integer index = 1;

    {
        userMap.put(1, new User("Gianna Jun", 18));
        userMap.put(2, new User("甜心奶猫酱", 19));
        userMap.put(3, new User("我是一只啾", 20));
        userMap.put(4, new User("尤物少女", 21));
    }

    @RequestMapping(value = "/getUser", method = {RequestMethod.GET})
    public String getUser() {
        if (index >= 5) {
            return "404";
        }
        synchronized (this) {
            index++;
            System.out.println(new User("Gianna Jun", 18).toString() + " " + index);
        }
        return "200";
    }

}
