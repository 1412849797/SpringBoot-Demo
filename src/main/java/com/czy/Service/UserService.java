package com.czy.Service;

import com.czy.Bean.User;

import java.util.List;

/**
 * @Author 蔡梓阳
 * @Date 2022/1/20 15:07
 */
public interface UserService {
    int create(String name,Integer age);

    List<User> getByName(String name);

    int deleteByName(String name);

    int getAllUsers();

    int deleteAllUsers();

}
