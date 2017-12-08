package cn.sp.controller;

import cn.sp.entity.User;
import cn.sp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 2YSP on 2017/12/8.
 */
@RestController
@RequestMapping("user")
public class UserRestController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "find",method = RequestMethod.GET)
    public User findByName(String userName){
        return userService.findByName(userName);
    }
}
