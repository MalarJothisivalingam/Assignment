package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController
{
	@RequestMapping("register")
	public ModelAndView mymethod(){
		return new ModelAndView("form");
	}
	@RequestMapping("success")
	public ModelAndView mymethod1(@RequestParam("fname") String fname,@RequestParam("lname") String lname,@RequestParam("address") String address,@RequestParam("gender") String gender,@RequestParam("language") String language)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("fname",fname);
		mv.addObject("lname",lname);
		mv.addObject("address",address);
		mv.addObject("gender",gender);
		mv.addObject("language",language);
		mv.setViewName("success");
		return mv;
	}
}
