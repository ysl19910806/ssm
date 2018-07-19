package com.bigspring.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bigspring.model.User;
import com.bigspring.service.UserService;

@Controller
@RequestMapping("/login.do")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView("/index");
		User user = userService.selectUserById(1);
		mav.addObject("user", user);
		return mav;
	}
}