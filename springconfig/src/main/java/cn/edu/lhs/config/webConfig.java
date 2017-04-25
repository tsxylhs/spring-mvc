package cn.edu.lhs.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;






@Configuration
@ComponentScan("cn.edu.lhs")
@EnableWebMvc
public class webConfig  extends WebMvcConfigurerAdapter  {
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

	   public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    	registry.addResourceHandler("WEB-INF/css/**").addResourceLocations("/css/");
	        registry.addResourceHandler("WEB-INF/img/**").addResourceLocations("/img/");
	        registry.addResourceHandler("WEB-INF/js/**").addResourceLocations("/js/");
	        registry.addResourceHandler("WEB-INF/upload/**").addResourceLocations("/upload/");
	    }

	
}
