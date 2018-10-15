package com.aitongyi.web.service;

import com.aitongyi.web.bean.User;
import com.aitongyi.web.dao.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public User loadUserByUserName(String username){
        return userMapper.loadUserByUserName(username);
    }

    @Transactional
    public void saveUser(User user){
        userMapper.saveUser(user);
    }

    private void getError(){
        int i = 1 / 0;
        logger.info("i:{}", i);
    }
}
