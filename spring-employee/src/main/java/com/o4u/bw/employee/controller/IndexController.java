package com.o4u.bw.employee.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping("/index")
	public String index(
			@Value("#{config['project.code']}") String projectCode,
			Locale locale,
			Model model) {
		model.addAttribute("msg", messageSource.getMessage("test.msg", null, locale));
		model.addAttribute("projectCode", projectCode);
		return "index";
	}
	
}
