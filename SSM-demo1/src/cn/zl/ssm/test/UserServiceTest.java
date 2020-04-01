package cn.zl.ssm.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zl.ssm.pojo.User;
import cn.zl.ssm.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testSqlSessionFactory() {
		System.out.println(sqlSessionFactory);
	}

	@Test
	public void testInsertUserInfo() {
		User user = new User(null,"赵大钱","zq","11112222", 16, 10015, "18322345675", "", new Date());
		int row = userService.insertUserInfo(user);
		System.out.println("row :"+row);
	}

	@Test
	public void testDeleteByUserId() {
		int row = userService.deleteByUserId(94);
		System.out.println(row);
	}

	@Test
	public void testUpdateByUserId() {
		User user = new User(96,"赵小钱","zxq","22221111", 15, 10014, "18322345675", "", new Date());
		int row = userService.updateByUserId(user);
		System.out.println(row);
	}

	@Test
	public void testSelectByUserId() {
		User user = userService.selectByUserId(1);
		System.out.println(user);
	}

	@Test
	public void testSelectAllUser() {
		List<User> users = userService.selectAllUser();
		for (User user : users) {
			System.out.println(user);
		}
	}

}
