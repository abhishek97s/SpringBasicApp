package com.cg.ctrl;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("myCtrlr")
public class HelloController {
	@RequestMapping(value="/hello")
	public ModelAndView showMsg() {
		LocalDate today= LocalDate.now();
		ModelAndView mdv= new ModelAndView("Login", "tdObj", today);
		return mdv;
	}
	
	public ModelAndView getLoginSuccess() {
		return null;
	}
}
