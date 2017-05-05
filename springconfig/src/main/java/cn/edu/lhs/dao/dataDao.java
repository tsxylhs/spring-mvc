package cn.edu.lhs.dao;

import java.util.List;

import cn.edu.lhs.entity.user;

public interface dataDao {

	public void insteruser(user user);
	public List<user> select();
}
