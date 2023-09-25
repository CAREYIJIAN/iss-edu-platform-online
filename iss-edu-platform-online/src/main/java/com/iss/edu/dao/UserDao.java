package com.iss.edu.dao;

import com.iss.edu.model.Class;
import com.iss.edu.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    /**
     * 登录
     *
     * @return user 对象
     */
    User login(@Param("username") String username, @Param("password") String password);

    /**
     * 根据教师的分页查询
     *
     * @param start      起始量
     * @param pageSize   偏移量
     * @param queryValue 查询条件
     * @return
     */
    List<User> getPage(@Param("start") Integer start, @Param("pageSize") Integer pageSize, @Param("queryValue") String queryValue);

    /**
     * 根据ID查询
     *
     * @param id 主键
     * @return User 用户对象
     */
    User getUser(int id);

    /**
     * 获得所有的教师数据集
     *
     * @return list 教师数据集
     */
    List<Map<String, Object>> getTeachers();

    /**
     * 分页统计记录数
     *
     * @param queryValue 查询条件
     * @return int 记录数
     */
    int getCount(String queryValue);

    /**
     * 新增用户数据
     *
     * @param user 用户对象
     * @return int 数据库受影响条数
     */
    int insertUser(User user);

    /**
     * 修改用户数据
     *
     * @param user 用户对象
     * @return int 数据库受影响条数
     */
    int updateUser(User user);

    /**
     * 删除用户数据，逻辑删除
     *
     * @param id 主键
     * @return int 数据库受影响条数
     */
    int delete(int id);

    /**
     * 批量删除用户数据，逻辑删除
     *
     * @param ids 主键数组
     * @return int 数据库受影响条数
     */
    int deletes(@Param("ids")int[] ids);

    /**
     * 前端教师数据穿梭框查询
     *
     * @return
     */
    List<Map<String, Object>> getTransfer();
}
