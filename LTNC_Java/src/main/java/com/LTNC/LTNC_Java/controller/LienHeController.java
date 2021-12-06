package com.LTNC.LTNC_Java.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.LTNC.LTNC_Java.CustomModel.LoginInfor;
import com.LTNC.LTNC_Java.CustomModel.Message;
import com.LTNC.LTNC_Java.mapper.CustomMapper;
import com.LTNC.LTNC_Java.mapper.LienHeMapper;
import com.LTNC.LTNC_Java.model.LienHe;

@Controller
public class LienHeController {
	@Autowired
	CustomMapper CusTomMapper;
	
	@Autowired
	LienHeMapper lienheMapper;
	
	@RequestMapping("/LienHe")
	public ModelAndView Index(Model model)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/LienHeKhachHang");

		return modelAndview;
	}
	
	@RequestMapping(value ="/GuiFromLienHe", method = RequestMethod.POST)
	public @ResponseBody Message LienHe(String txtHo,String txtTen,String txtEmail,String txtSDT,String txtNoiDung, HttpServletRequest request)
	{
		Message message=new Message();
		try
		{
			LoginInfor userInfor=(LoginInfor)request.getSession().getAttribute("DangNhap");
			LienHe lienhe=new LienHe();
			if(userInfor!=null)
			{
				lienhe.setIdkhach(userInfor.IdKhachHang);
			}
			
			lienhe.setHo(txtHo);
			lienhe.setTen(txtTen);
			lienhe.setEmail(txtEmail);
			lienhe.setSdt(txtSDT);
			lienhe.setNoidung(txtNoiDung);
			lienheMapper.insertSelective(lienhe);
			message.Icon="success";
			message.Title="Đã gửi liên hệ thành công !";
		}
		catch(Exception ex) {
			message.Icon="error";
			message.Title="Có lỗi"+ ex.getMessage();
		}
		return message;
	}
}
