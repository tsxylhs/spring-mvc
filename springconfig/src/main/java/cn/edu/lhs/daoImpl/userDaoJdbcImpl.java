package cn.edu.lhs.daoImpl;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import cn.edu.lhs.dao.dataDao;
import cn.edu.lhs.entity.user;

public class userDaoJdbcImpl implements dataDao {
	
	 JdbcTemplate jdbcTemplate;
	public userDaoJdbcImpl(DataSource dataSource){
		jdbcTemplate=new JdbcTemplate(dataSource);
	}

	public void insteruser(user user){
		  String sql= "INSERT INTO user (name,password)"
                  + " VALUES (?, ?)";
		  jdbcTemplate.update(sql,user.getUsername(),user.getUserpassword());
		
		
	}

}
