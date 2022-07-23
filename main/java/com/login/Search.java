package com.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.gettersetter;

@Controller
public class Search {
	
	@RequestMapping("/Search")
	public ModelAndView search(@RequestParam("title") String title, @RequestParam("size") String size,
			@RequestParam("gender") String gender, @RequestParam("outputPreference") String pref ) {
		SearchCheck search = new SearchCheck();
		System.out.println(title);
		List<gettersetter> user = search.validate(title, size, gender);
		
		/*
		 * if (search.validate(title, size, gender)) { return "data";
		 * 
		 * } else { return "NewFile"; }
		 */
		ModelAndView model = new ModelAndView();
		model.addObject("user",user);
		model.setViewName("data");
		
		
	return model;

}
}