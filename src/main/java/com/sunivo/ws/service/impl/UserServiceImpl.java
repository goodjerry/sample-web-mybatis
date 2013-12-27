package com.sunivo.ws.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunivo.beans.entity.User;
import com.sunivo.ws.dao.UserMapper;
import com.sunivo.ws.service.UserService;

/**
 * User表操作实现类。<br>
 * 〈功能详细描述〉
 * 
 * @author liwen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public void insertUser(User user) {
        userMapper.insert(user);
    }

}
