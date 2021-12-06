package com.LTNC.LTNC_Java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LTNC.LTNC_Java.mapper.ThuongHieuMapper;
import com.LTNC.LTNC_Java.model.ThuongHieu;
import com.LTNC.LTNC_Java.model.ThuongHieuExample;

@Controller
public class MenuLayoutController {
	@Autowired
	ThuongHieuMapper thuonghieuMapper;
	
	@ModelAttribute("GetDataThuongHieu")
	public List<ThuongHieu> GetDataThuongHieu()
	{
		ThuongHieuExample thuonghieuExample=new ThuongHieuExample();
		List<ThuongHieu> lstthuonghieu = thuonghieuMapper.selectByExample(thuonghieuExample);
		return lstthuonghieu;
	}
}
