package cn.sp.service;

import cn.sp.dao.cluster.CityDao;
import cn.sp.dao.master.UserDao;
import cn.sp.entity.City;
import cn.sp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 2YSP on 2017/12/8.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private CityDao cityDao;

    public User findByName(String userName){
        User user = userDao.findByName(userName);
        City city = cityDao.findByName("温岭市");
        user.setCity(city);
        return user;
    }
}
