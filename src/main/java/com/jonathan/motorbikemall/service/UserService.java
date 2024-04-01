package com.jonathan.motorbikemall.service;

import com.jonathan.motorbikemall.dto.UserRegisterRequest;
import com.jonathan.motorbikemall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
