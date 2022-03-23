package com.security.securityClient.service;

import com.security.securityClient.entity.User;
import com.security.securityClient.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
