package com.jonathan.motorbikemall.dao;

import com.jonathan.motorbikemall.dto.UserRegisterRequest;
import com.jonathan.motorbikemall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
