package cn.zl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zl.ssm.mapper.UserMapper;
import cn.zl.ssm.pojo.User;
import cn.zl.ssm.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int insertUserInfo(User user) {
		return userMapper.insertUserInfo(user);
	}

	@Override
	public int deleteByUserId(Integer id) {
		return userMapper.deleteByUserId(id);
	}

	@Override
	public int updateByUserId(User user) {
		return userMapper.updateByUserId(user);
	}

	@Override
	public User selectByUserId(Integer id) {
		return userMapper.selectByUserId(id);
	}

	@Override
	public List<User> selectAllUser() {
		return userMapper.selectAllUser();
	}

}
