package com.springboot.study.dao;

import com.springboot.study.common.DS;
import com.springboot.study.model.User;

import java.util.List;

/**
 * @Author wp
 * @date 2018/11/12 10:23
 */
public interface UserMapper{
    /**
     * 新增用户
     * @param user
     * @return
     */
    @DS
    int save(User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    @DS
    int update(User user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @DS
    int deleteById(Long id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @DS("slave1")
    User selectById(Long id);

    /**
     * 查询所有用户信息
     * @return
     */
    @DS("slave2")
    List<User> selectAll();
}
