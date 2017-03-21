package org.lvy.wwt.service.impl;

import java.util.List;

import org.lvy.wwt.domain.User;
import org.lvy.wwt.mapper.UserMapper;
import org.lvy.wwt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by livvy (livvyguo@gmail.com) on 2017/3/21.
 *
 * @author livvy
 * @date 2017/03/21
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
