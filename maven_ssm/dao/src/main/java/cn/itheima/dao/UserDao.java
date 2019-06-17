package cn.itheima.dao;

import cn.itheima.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserDao {
    @Select("select * from items where id=#{id}")
    User findAll(Integer id);
}
