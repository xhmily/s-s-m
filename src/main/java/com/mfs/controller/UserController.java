package com.mfs.controller;

import com.mfs.po.User;
import com.mfs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * By:刘文旭 ~ https://blog.csdn.net/qq_40414738
 * Date：2018/11/8 17:58 .
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("getUser")
    @ResponseBody
    public User getUser(Integer id) throws Exception {
        return userService.queryById(id);
    }

    @RequestMapping("delUser")
    @ResponseBody
    public Integer delUser(Integer id) throws Exception {
        return userService.delete(id);
    }
}
