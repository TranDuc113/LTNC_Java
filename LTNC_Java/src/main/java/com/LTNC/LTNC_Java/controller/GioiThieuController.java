package com.LTNC.LTNC_Java.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.LTNC.LTNC_Java.mapper.CustomMapper;

@Controller
public class GioiThieuController {
	@Autowired
	CustomMapper CusTomMapper;
	
	@RequestMapping("/GioiThieu")
	public ModelAndView Index(Model model)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/GioiThieu");

		return modelAndview;
	}
}
