package cn.SpringDemo.dao;

import java.util.List;

import cn.SpringDemo.model.User;
/**
 * 用户Dao层
 * @author yezi
 *
 */
public interface UserDAO {

	/**
	 * 添加一个用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	/**
	 * 获取全部用户
	 * @return
	 */
	public List<User> getAllUsers();
}
