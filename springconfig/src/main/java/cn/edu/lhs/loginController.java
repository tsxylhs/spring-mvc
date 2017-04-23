package cn.edu.lhs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.lhs.dao.dataDao;

import cn.edu.lhs.entity.user;




@Controller

public class loginController {
	
	@Autowired
	private dataDao dataDao;
	@RequestMapping(value="login")
	public ModelAndView loign(HttpServletRequest request ,HttpServletResponse response, user command){
		
		String username=command.getUsername();
		String userpassword=command.getUserpassword();
		System.out.println(username+userpassword);
         dataDao.insteruser(command);
		ModelAndView MV=new ModelAndView();
		MV.setViewName("/index/index");
		
	  MV.addObject("command","hello name");
		List<String> list=new ArrayList<String>();
		list.add("java");
		list.add("c++");
		list.add("oracle");
	     MV.addObject("booklist",list);
	     Map<String,String> map=new HashMap<String,String>();	
	     map.put("username",username);
	     map.put("userpassword", userpassword);
	     MV.addObject("MAP",map);
	     
		
		return MV;
	}

}
