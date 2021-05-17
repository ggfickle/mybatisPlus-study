package com.hf.mybaitsplus_01;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hf.mybaitsplus_01.bean.User;
import com.hf.mybaitsplus_01.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class Mybaitsplus01ApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
//        userList.stream().map(user->user.toString()).collect(Collectors.toList());
        userList.forEach(System.out::println);
    }

    @Test
    void contextLoads() {
    }

    @Test
    public void testPage() {
        Page<User> page = new Page<>(1, 2);
        Page<User> userPage = userMapper.selectPage(page, null);
        userPage.getRecords().forEach(System.out::println);
        System.out.println(userPage.getTotal());
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("lisi");
        user.setAge(1);
        user.setEmail("h.com");
        user.setVersion(0);
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(1L);
        user.setAge(11);
        int i = userMapper.updateById(user);
        System.out.println(i);
    }

    @Test
    public void testDeleted() {
        int i = userMapper.deleteById(2L);
        System.out.println(i);

    }

}
