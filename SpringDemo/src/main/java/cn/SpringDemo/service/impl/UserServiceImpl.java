package cn.SpringDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.SpringDemo.dao.UserDAO;
import cn.SpringDemo.model.User;
import cn.SpringDemo.model.result.ResultDO;
import cn.SpringDemo.service.UserService;

/**
 * 用户服务实现层
 * @author yezi
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	

	/**
	 * 添加一个用户
	 */
	@Override
	public ResultDO insertUser(User user) {
		// TODO Auto-generated method stub
		boolean success = false;
		ResultDO resultDO = new ResultDO();
		if(user!=null){
			if(userDAO.insertUser(user)==1){
				success=true;
				resultDO.setMessage("插入成功！！");
			}else{
				resultDO.setMessage("插入失败！！");
			}
		}else{
			resultDO.setMessage("传入空值！！");
		}
		resultDO.setSuccess(success);
		return resultDO;
	}

	/**
	 * 获取全部用户
	 */
	@Override
	public ResultDO<List<User>> getAllUsers() {
		// TODO Auto-generated method stub
		ResultDO<List<User>> resultDO = new ResultDO<List<User>>();
		boolean success = false;
		List<User> users = userDAO.getAllUsers();
		if(!users.isEmpty()){
			resultDO.setResult(users);
			resultDO.setMessage("获取用户列表成功！！");
			success=true;
		}else{
			resultDO.setMessage("获取用户列表为空！！");
		}
		resultDO.setSuccess(success);
		return resultDO;
	}

	
}
