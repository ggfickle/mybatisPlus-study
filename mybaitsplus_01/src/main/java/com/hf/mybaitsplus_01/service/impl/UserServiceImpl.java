package com.hf.mybaitsplus_01.service.impl;

import com.hf.mybaitsplus_01.entity.User;
import com.hf.mybaitsplus_01.mapper.UserMapper;
import com.hf.mybaitsplus_01.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiehongfei
 * @since 2021-05-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
