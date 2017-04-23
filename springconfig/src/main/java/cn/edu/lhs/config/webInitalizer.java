package cn.edu.lhs.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
@ComponentScan("cn.edu.lhs")
public class webInitalizer implements WebApplicationInitializer {
	public void onStartup(ServletContext servletContext)throws ServletException{
		AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
		ctx.register(webConfig.class,webConfig.class);
		ctx.setServletContext(servletContext);
		Dynamic servlet=servletContext.addServlet("dispatcher",  new DispatcherServlet(ctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		
	}

}
