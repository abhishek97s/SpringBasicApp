package com.cg.ctrl;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.dto.Login;
import com.cg.dto.RegisterDto;
import com.cg.services.ILoginService;
import com.sun.org.apache.regexp.internal.recompile;

@Controller
public class LoginController {

	@Autowired
	ILoginService logService= null;

	public ILoginService getLogService() {
		return logService;
	}

	public void setLogService(ILoginService logService) {
		this.logService = logService;
	}

	/***********Show Login Page************/
	@RequestMapping(value="/ShowLoginPage", method= RequestMethod.GET)
	public String displayLoginPage(Model model) {
		model.addAttribute("login", new Login());
		model.addAttribute("compNameObj", "Capgemini");
		return "Login";
	}

	/***********Validate user credentials************/
	@RequestMapping(value="/ValidateUser", method= RequestMethod.POST)
	public String validateUserDetails(@ModelAttribute(value="login") @Valid Login lg, BindingResult result, Model model) {
		if(result.hasErrors()) return "Login";
		else {
			if(logService.validateUser(lg)!= null) {
				model.addAttribute("usernameObj", lg.getUsername());
				return "LoginSuccess";
			}
			return "LoginFailure";
		}
	}	

	/***********Show Registration Page************/
	@RequestMapping(value="/ShowRegisterPage",  method= RequestMethod.GET)
	public String disRegPage(Model model) {
		ArrayList<String> cityList= new ArrayList<>();
		cityList.add("Pune");
		cityList.add("Nagpur");
		cityList.add("Mumbai");
		cityList.add("Noida");

		ArrayList<String> skillSet= new ArrayList<>();
		skillSet.add("Java");
		skillSet.add("PHP");
		skillSet.add("DotNet");
		skillSet.add("Oracle");
		skillSet.add("HTML");

		model.addAttribute("reg", new RegisterDto());
		model.addAttribute("cityList", cityList);
		model.addAttribute("skillSet", skillSet);
		return "Register";
	}

	/************************InsertUser.obj*******************/
	@RequestMapping(value="/RegisterSuccess", method=RequestMethod.POST)
	public String addUserDeatils(@ModelAttribute(value="reg")
	@Valid RegisterDto rd, BindingResult result, Model model) {
		model.addAttribute("RegObj", rd);
		return "RegisterSuccess";
	}
}