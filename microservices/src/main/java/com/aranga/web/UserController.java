package com.aranga.web;

import com.aranga.domain.User;
import com.aranga.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nanara0 on 3/02/2016.
 */
@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService service;
    @RequestMapping(produces = {"application/json"},method = RequestMethod.GET)
    public User get()
    {
        return service.selectById(217);
    }
}
