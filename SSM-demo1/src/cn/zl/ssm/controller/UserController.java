package cn.zl.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zl.ssm.pojo.User;
import cn.zl.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String userList(Model model) {
		List<User> users = userService.selectAllUser();
		model.addAttribute("users",users);
		return "userlist";	
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id) {
		userService.deleteByUserId(id);
		return "redirect:/user/list.do";
	}
}
