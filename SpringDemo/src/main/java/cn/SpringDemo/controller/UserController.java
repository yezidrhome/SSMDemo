package cn.SpringDemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.SpringDemo.model.User;
import cn.SpringDemo.model.result.ResultDO;
import cn.SpringDemo.service.UserService;

/**
 * 用户Controller
 * @author yezi
 *
 */
@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;

	/**
	 * 测试
	 * @return
	 */
	@RequestMapping("index")
	public String index() {
		return "index";
	}

	@RequestMapping("showAllUsers")
	public String showAllUsers(Model model) {
		ResultDO<List<User>> resultDO = userService.getAllUsers();
		model.addAttribute("users", resultDO.getResult());
		return "allusers";
	}
}
