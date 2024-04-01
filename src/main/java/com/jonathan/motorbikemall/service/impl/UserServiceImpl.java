package com.jonathan.motorbikemall.service.impl;

import com.jonathan.motorbikemall.dao.UserDao;
import com.jonathan.motorbikemall.dto.UserRegisterRequest;
import com.jonathan.motorbikemall.model.User;
import com.jonathan.motorbikemall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
