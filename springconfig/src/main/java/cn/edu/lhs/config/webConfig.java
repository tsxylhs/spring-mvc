package cn.edu.lhs.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import cn.edu.lhs.dao.dataDao;
import cn.edu.lhs.daoImpl.userDaoJdbcImpl;

@Configuration
@ComponentScan("cn.edu.lhs")
@EnableWebMvc
public class webConfig {
	/**
	 * jsp视图解析器
	*/
	@Bean
	public UrlBasedViewResolver setupviewResolver(){
		UrlBasedViewResolver resilver=new UrlBasedViewResolver();
	     resilver.setPrefix("WEB-INF/views/");
	     resilver.setSuffix(".jsp");
	     resilver.setViewClass(JstlView.class);
	     return resilver;
		
		
	}
	
}
