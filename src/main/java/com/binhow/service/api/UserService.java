package com.binhow.service.api;

import com.binhow.entity.User;

public interface UserService {
    User getUserById(int userId);
    User getUserByName(String userName);
}
