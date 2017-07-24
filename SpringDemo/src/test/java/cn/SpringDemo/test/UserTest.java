package cn.SpringDemo.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.SpringDemo.model.User;
import cn.SpringDemo.service.UserService;

public class UserTest {

	
private UserService userService;
	
	@Before
	public void before(){                                                                    
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
				,"classpath:conf/spring-mybatis.xml"});
		userService = (UserService) context.getBean("userServiceImpl");
	}
	
	/**
	 * 添加用户
	 */
	@Test
	public void addUser(){
		User user = new User();
		user.setNickname("yezi");
		System.out.println(userService.insertUser(user).getMessage());
	}
	
	/**
	 * 获取全部用户
	 */
	@Test
	public void getAllUser(){
		List<User> users = userService.getAllUsers().getResult();
		for (User user : users) {
			System.out.println(user.getId()+"----"+user.getNickname());
		}
	}
}
