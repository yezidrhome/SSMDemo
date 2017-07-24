package cn.SpringDemo.model;

import org.springframework.stereotype.Component;

/**
 * 用户  
 * @author yezi 
 */
@Component
public class User {
	private int id;
	private String nickname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nickname=" + nickname + "]";
	}
}
