package cn.edu.lhs;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.lhs.entity.user;


@Controller
public class registController {
	@RequestMapping(value="regist")
	public ModelAndView regist(HttpRequest request,HttpServletResponse response, user user){
		System.out.println(user.getUsername());
		System.out.println(user.getUserpassword());
		 ModelAndView mv=new ModelAndView();
		 mv.setViewName("/index/index");
		 Map<String,String> map=new HashMap<String,String>();
		 map.put("use", user.getUsername());
		 mv.addAllObjects(map);
		 
		 
		 
		
		return mv;
		
	}

	
	
}
