package org.lvy.wwt.controller;

import java.util.List;

import org.lvy.wwt.domain.User;
import org.lvy.wwt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by livvy (livvyguo@gmail.com) on 2017/3/21.
 *
 * @author livvy
 * @date 2017/03/21
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IUserService userService;

    @RequestMapping("users")
    public List<User> users() {
        return userService.getUsers();
    }
}
