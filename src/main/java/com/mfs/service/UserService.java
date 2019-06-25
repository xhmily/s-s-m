package com.mfs.service;

import com.mfs.base.BaseService;
import com.mfs.dao.UserMapper;
import com.mfs.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * By:刘文旭 ~ https://blog.csdn.net/qq_40414738
 * Date：2018/11/8 17:58 .
 */
@Service
public class UserService extends BaseService<User> {

    @Resource
    private UserMapper userMapper;
}
