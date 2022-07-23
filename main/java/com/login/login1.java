package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class login1{
	
	@Autowired
	LoginCheck login;
	@RequestMapping("/NewFile")
	public String home()
	{
		return "NewFile";
		
	}
	@RequestMapping("/Login")
	public String home1(@RequestParam("uname") String username , @RequestParam("password") String password)
	{
//		System.out.println("l1"+username);
		if(login.validate(username, password))
		{
			return "data";
			
		}
		else {
			return "NewFile";
		}
		
		
		
	}
	
	
	
	
}