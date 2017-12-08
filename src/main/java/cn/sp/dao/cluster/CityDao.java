package cn.sp.dao.cluster;

import cn.sp.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by 2YSP on 2017/12/8.
 */
//@Mapper
@Repository
public interface CityDao {
    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     * @return
     */
    City findByName(@Param("cityName") String cityName);
}