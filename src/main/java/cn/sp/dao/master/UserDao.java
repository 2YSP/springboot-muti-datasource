package cn.sp.dao.master;

import cn.sp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by 2YSP on 2017/12/8.
 */
//@Mapper
@Repository
public interface UserDao {

    User findByName(@Param("userName")String userName);
}
