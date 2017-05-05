package cn.edu.lhs.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
public List<user> select(){
	String sql="select *from user";
    List<user> listuser = jdbcTemplate.query(sql, new RowMapper<user>() {
        
        @Override
        public user mapRow(ResultSet rs, int rowNum) throws SQLException {
           user user = new user();
 
            user.setUsername(rs.getString("name"));
            user.setUserpassword(rs.getString("password"));
 
            return user;
        }
 
    });
    return listuser;
}

}
