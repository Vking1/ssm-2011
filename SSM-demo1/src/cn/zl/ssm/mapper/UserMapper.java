package cn.zl.ssm.mapper;

import java.util.List;

import cn.zl.ssm.pojo.User;

public interface UserMapper {
	
	//增删改用方法
	int insertUserInfo(User user);
	
	int deleteByUserId(Integer id);
	
	int updateByUserId(User user);
	
	
	//查询用方法
	User selectByUserId(Integer id);
	
	List<User> selectAllUser();
}
