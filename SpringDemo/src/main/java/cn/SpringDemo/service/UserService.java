package cn.SpringDemo.service;

import java.util.List;
import cn.SpringDemo.model.User;
import cn.SpringDemo.model.result.ResultDO;

/**
 * 用户服务接口层
 * @author yezi
 *
 */
public interface UserService {
	/**
	 * 添加一个用户
	 * @param user
	 * @return
	 */
	public ResultDO insertUser(User user);

	/**
	 * 获取全部用户列表
	 * @return
	 */
	public ResultDO<List<User>> getAllUsers();
}
