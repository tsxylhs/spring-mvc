package cn.edu.lhs.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import cn.edu.lhs.dao.dataDao;
import cn.edu.lhs.daoImpl.userDaoJdbcImpl;
@Configuration
@ComponentScan("cn.edu.lhs")
@EnableWebMvc

public class DataConfig extends WebMvcConfigurerAdapter {
	


	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
	
	@Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/Student");
        dataSource.setUsername("root");
        dataSource.setPassword("123123");
         
        return dataSource;
    }
	@Bean
    public dataDao getDataDao(){
			return new userDaoJdbcImpl(getDataSource());
			
		}
	 
}
