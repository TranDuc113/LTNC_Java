package com.LTNC.LTNC_Java.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.LTNC.LTNC_Java.mapper.CustomMapper;
import com.LTNC.LTNC_Java.model.TinTuc;

@Controller
public class TinTucController {
	@Autowired
	CustomMapper CusTomMapper;
	
	@RequestMapping("/TinTuc")
	public ModelAndView Index(Model model)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/TinTuc");
		List<Map<String, Object>> DanhSachTinTuc=CusTomMapper.GetDanhSachTinTuc();
		model.addAttribute("DanhSachTinTuc",DanhSachTinTuc);
		
		long SoLuongTinTuc =CusTomMapper.GetSoLuongTinTuc();
		model.addAttribute("SoLuongTinTuc",SoLuongTinTuc);
		return modelAndview;
	}
	
	@RequestMapping("/XemThemTinTuc")
	public ModelAndView XemThemTinTuc(Integer ViTri,Model model)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/XemThemTinTuc");
		List<Map<String, Object>> DanhSachTinTuc=CusTomMapper.GetAllDanhSachTinTuc();
		List<Map<String, Object>> DanhSachTinTucTiepTheo=DanhSachTinTuc.stream().skip(ViTri*4).limit(4).collect(Collectors.toList());
		model.addAttribute("DanhSachTinTucTiepTheo",DanhSachTinTucTiepTheo);
		return modelAndview;
	}
	
	@GetMapping("/TinTucChiTiet/{idTin}")
	public ModelAndView TinTucChiTiet(@PathVariable(value="idTin") String idTin,Model model)
	{
		Map<String, Object> param=new HashMap<String, Object>(); 
		ModelAndView modelAndview=new ModelAndView("ViewUsers/TinTucChiTiet"); 
		List<Map<String,Object>> TinTucLienQuan=CusTomMapper.GetTinTucLienQuan();
		model.addAttribute("TinTucLienQuan",TinTucLienQuan);
		  
		param.put("IdTinTuc", Integer.parseInt(idTin) ); 
		List<Map<String,Object>> ChiTietTinTuc=CusTomMapper.GetChiTietTinTuc(param);

		model.addAttribute("TinTucLienQuan",TinTucLienQuan);
		model.addAttribute("ChiTietTinTuc",ChiTietTinTuc);
		return modelAndview;
	}
}
