package com.LTNC.LTNC_Java.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.LTNC.LTNC_Java.CustomModel.GioHang;
import com.LTNC.LTNC_Java.CustomModel.ItemGioHang;
import com.LTNC.LTNC_Java.CustomModel.LoginInfor;
import com.LTNC.LTNC_Java.CustomModel.Message;
import com.LTNC.LTNC_Java.mapper.CustomMapper;
import com.LTNC.LTNC_Java.mapper.DanhGiaMapper;
import com.LTNC.LTNC_Java.mapper.KhachHangMapper;
import com.LTNC.LTNC_Java.model.DanhGia;
import com.LTNC.LTNC_Java.model.KhachHang;
import com.LTNC.LTNC_Java.model.SanPham;

@Controller
public class IndexController {
	@Autowired
	CustomMapper CusTomMapper;
	
	@Autowired
	DanhGiaMapper danhgiaMapper;
	
	@RequestMapping("/")
	public ModelAndView Index(Model model)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/HomeIndex");

		//Get ra nhung san phan noi bat
		Map<String, Object> param=new HashMap<String, Object>(); 
		param.put("TrangThai", "1");
		List<Map<String, Object>> SanPhamNoiBatValue=CusTomMapper.GetSanPhamNoiBat(param);
		model.addAttribute("lstSanPhamNoiBat",SanPhamNoiBatValue); 

		//Get danh sach san pham 
		List<Map<String, Object>> DanhSachSanPham=CusTomMapper.GetDanhSanPham();
		model.addAttribute("DanhSachSanPham",DanhSachSanPham);
		
		long SoLuongSanPham =CusTomMapper.GetSoLuongSanPham();
		model.addAttribute("SoLuongSanPham",SoLuongSanPham);
		return modelAndview;
	}
	
	@RequestMapping(value ="/ThemSanPhamVaoGioHang", method = RequestMethod.POST)
	public @ResponseBody Message ThemSanPhamVaoGioHang(String IdSanPham,Integer SoLuong, HttpServletRequest request)
	{
		List<ItemGioHang> ValuesGioHang = (List<ItemGioHang>) request.getSession().getAttribute("GioHang");
		if(SoLuong==null)
		{
			SoLuong=1;
		}
		Map<String, Object> param=new HashMap<String, Object>(); 
		param.put("IdSanPham", IdSanPham);
		SanPham sanpham=CusTomMapper.LayThongTinChiTietSanPham(param);
		
		GioHang giohang = new GioHang(ValuesGioHang);
		if(sanpham!=null)
		{
			giohang.ThemSanPham(sanpham, SoLuong);
		}
		request.getSession().setAttribute("GioHang",giohang.GetDanhSachSanPham());
		
		Message message=new Message();
		message.Icon="success";
		message.Title="Mua sản phẩm thành công";
		return message;
	}
	
	@RequestMapping(value ="/XemNhanhSanPham", method = RequestMethod.POST)
	public ModelAndView XemNhanhSanPham(String IdSanPham,Model model)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/XemNhanhSanPham");
		//Lay ra thong tin xem nhanh san pham
		Map<String, Object> param=new HashMap<String, Object>(); 
		param.put("IdSanPham", IdSanPham);
		List<Map<String, Object>> XemNhanhSanPhamNoiBat=CusTomMapper.GetThongTinXemNhanhSanPham(param);
		model.addAttribute("XemNhanhSanPhamNoiBat",XemNhanhSanPhamNoiBat);
		
		//Lay ra danh sach anh san pham
		List<Map<String, Object>> AnhXemNhanhSanPhamNoiBat=CusTomMapper.GetAnhXemNhanhSanPham(param);
		model.addAttribute("AnhXemNhanhSanPhamNoiBat",AnhXemNhanhSanPhamNoiBat);
		
		return modelAndview;
	}
	
	@RequestMapping(value ="/XemThemSanPham", method = RequestMethod.GET)
	public ModelAndView XemThemSanPham(Integer ViTri,Model model)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/XemThemSanPham");
		List<Map<String, Object>> DanhSachSanPham=CusTomMapper.GetAllDanhSanPham();
		List<Map<String, Object>> DanhSachSanPhamTiepTheo=DanhSachSanPham.stream().skip(ViTri*8).limit(8).collect(Collectors.toList());
		model.addAttribute("DanhSachSanPhamTiepTheo",DanhSachSanPhamTiepTheo);
		return modelAndview;
	}
	
	@GetMapping("/SanPhamChiTiet/{IdSanPham}")
	public ModelAndView SanPhamChiTiet(@PathVariable(value="IdSanPham") String IdSanPham,Model model)
	{
		Map<String, Object> param=new HashMap<String, Object>(); 
		param.put("IdSanPham", Integer.parseInt(IdSanPham) ); 
		ModelAndView modelAndview=new ModelAndView("ViewUsers/ChiTietSanPham"); 
		List<Map<String, Object>> GetDanhGiaSanPham=CusTomMapper.GetDanhGiaSanPham(param);
		List<Map<String, Object>> GetAnhSanPham=CusTomMapper.GetAnhSanPham(param);
		List<Map<String, Object>> GetThongTinChiTietSanPham=CusTomMapper.GetThongTinChiTietSanPham(param);
		List<Map<String, Object>> lstSanPhamLienQuan=CusTomMapper.GetSanPhamLienQuan();
		
		SanPham sanpham=new SanPham();
		sanpham.setIdsp(Integer.parseInt(IdSanPham));
		
		model.addAttribute("GetDanhGiaSanPham",GetDanhGiaSanPham);
		model.addAttribute("GetAnhSanPham",GetAnhSanPham);
		model.addAttribute("GetThongTinChiTietSanPham",GetThongTinChiTietSanPham);
		model.addAttribute("sanpham",sanpham);
		model.addAttribute("lstSanPhamLienQuan",lstSanPhamLienQuan);
		
		return modelAndview;
	}
	
	@RequestMapping(value ="/GuiNoiDungPhanHoi", method = RequestMethod.POST)
	public @ResponseBody Message GuiNoiDungPhanHoi(String NoiDungPhanHoi, HttpServletRequest request, String IdSanPham)
	{
		Message message=new Message();
		LoginInfor userInfor=(LoginInfor)request.getSession().getAttribute("DangNhap");
		try {
			
			if(userInfor==null)
			{
				message.Icon="error";
				message.Title="Cần phải dăng nhập mới thực hiện được chức năng này";
				message.Data="error";
			}
			else {
				SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
				Date date = new Date(System.currentTimeMillis());

				DanhGia danhgia=new DanhGia();
				danhgia.setIdkhach(1);
				danhgia.setIdsp(Integer.parseInt(IdSanPham));
				danhgia.setNoidung(NoiDungPhanHoi);
				danhgia.setNgaytao(date);
				danhgiaMapper.insertSelective(danhgia);
				message.Icon="success";
				message.Title="Đánh giá thành công";
				message.Data="<div class='DanhGia'>\r\n"
						+ "	  <p style='margin: 0;'><span>"+ userInfor.tenDangNhap + "</span></p>\r\n"
						+ "		  <div class='news__date'>\r\n"
						+ "			<span class='-ap icon icon-access_time' style='font-size: 12px;'></span>\r\n"
						+ "			<span style='font-size: 12px;'>"+ date + "</span>\r\n"
						+ "		  </div>\r\n"
						+ "	  <p style='margin: 0;'>" + NoiDungPhanHoi +"</p>\r\n"
						+ " </div>";
				
			}
		}
		catch(Exception e)
		{
			message.Icon="error";
			message.Title="Có lỗi"+ e.getMessage();
		}
		
		return message;
	}
	
	@RequestMapping(value ="/DangNhapKhachHang", method = RequestMethod.POST)
	public @ResponseBody Message DangNhapKhachHang(String txtTenDangNhap, HttpServletRequest request, String txtMatKhau)
	{
		Message message=new Message();
		LoginInfor Login_Infor=new LoginInfor();
		try {
			Map<String, Object> param=new HashMap<String, Object>();
			param.put("txtTenDangNhap", txtTenDangNhap);
			param.put("txtMatKhau", txtMatKhau);
			KhachHang khachHang= CusTomMapper.GetThongTinChiTietKhachHang(param);
			if(khachHang==null)
			{
				message.Title="Thông tin tài khoản hoặc mật khẩu không chính xác";
				message.Icon="error";
			}
			else
			{
				Login_Infor.IdKhachHang=khachHang.getIdkhach();
				Login_Infor.hoTen=khachHang.getHoten();
				Login_Infor.tenDangNhap=khachHang.getTendangnhap();
				request.getSession().setAttribute("DangNhap",Login_Infor);
				
				message.Title="Đăng nhập thành công";
				message.Icon="success";
				message.Data= khachHang.getTendangnhap();
			}
		}
		catch(Exception e)
		{
			message.Title="Đăng nhập thất bại. Có lỗi : "+e.getMessage();
			message.Icon="error";
		}
		
		return message;
	}
	
	@RequestMapping(value ="/KiemTraDangNhap", method = RequestMethod.POST)
	public @ResponseBody Message KiemTraDangNhap(HttpServletRequest request)
	{
		Message message=new Message();
		LoginInfor userInfor=(LoginInfor)request.getSession().getAttribute("DangNhap");
		if(userInfor!=null)
		{
			message.Icon="success";
			message.Data=userInfor.tenDangNhap;
		}
		else
		{
			message.Icon="error";
			message.Data="";
		}
		return message;
	}
	
	@RequestMapping(value ="/DanhSachThuongHieu", method = RequestMethod.POST)
	public ModelAndView DanhSachThuongHieu(HttpServletRequest request,Model model)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/DanhSachThuongHieu");
		List<Map<String, Object>> DanhSachThuongHieu=CusTomMapper.GetDanhSachThuongHieu();
		model.addAttribute("DanhSachThuongHieu",DanhSachThuongHieu);
		return modelAndview;
	}
	
	@RequestMapping(value ="/ChiTietGioHang", method = RequestMethod.POST)
	public @ResponseBody Message ChiTietGioHang(HttpServletRequest request,Model model)
	{
		Message message=new Message();
		List<ItemGioHang> ValuesGioHang = (List<ItemGioHang>) request.getSession().getAttribute("GioHang");
		if(ValuesGioHang!=null)
		{
			float TongTien=0;
			float TongSanPham=ValuesGioHang.size();
			String DataChiTietGioHang="";
			for (ItemGioHang itemGioHang : ValuesGioHang) {
				TongTien+=itemGioHang.Sanpham.getGia()*itemGioHang.SoLuong;
			}
			
			for (ItemGioHang itemGioHang : ValuesGioHang) {
				DataChiTietGioHang+="<div class=\"product__list\">\r\n"
						+ "	<div class=\"product__list__item\">\r\n"
						+ "		<div class=\"product__img\">\r\n"
						+ "			<img src=\"/Image/"+ itemGioHang.Sanpham.getAnhdaidien() + "\" alt=\"Name your Product \">\r\n"
						+ "		</div>\r\n"
						+ "		<div class=\"product__name\">\r\n"
						+ "			"+ itemGioHang.Sanpham.getTen() +"\r\n"
						+ "			<a class=\"product__delete\" onclick=\"XoaSanPhamChiTietGioHang("+itemGioHang.Sanpham.getIdsp()+")\">\r\n"
						+ "				<span class=\"icon -ap icon-trash2\"></span>\r\n"
						+ "			</a>\r\n"
						+ "		</div>\r\n"
						+ "		\r\n"
						+ "		<div class=\"product__price\">\r\n"
						+ "			<div class=\"product__price__old\">"+itemGioHang.Sanpham.getGiakm()+" <span class=\"unit\">đ</span></div>\r\n"
						+ "			<div class=\"product__price__regular\">"+itemGioHang.Sanpham.getGia()+" <span class=\"unit\">đ</span></div>\r\n"
						+ "			<div class=\"product__quantity\">\r\n"
						+ "				<button class=\"btn-minus btn\" onclick=\"GiamSanPhamGioHang("+itemGioHang.Sanpham.getIdsp()+")\">\r\n"
						+ "					-\r\n"
						+ "				</button>\r\n"
						+ "				<input id=\"SanPhamGioHang"+itemGioHang.Sanpham.getIdsp()+"\" onkeypress=\"return (event.charCode !=8 && event.charCode ==0 || ( event.charCode == 46 || (event.charCode >= 48 && event.charCode <= 57)))\" type=\"text\" class=\"input-number\" value=\""+itemGioHang.SoLuong+"\" style=\"padding: 0;\">\r\n"
						+ "				<button class=\"btn-plus btn\"onclick=\"TangSanPhamGioHang("+itemGioHang.Sanpham.getIdsp()+")\">\r\n"
						+ "					+\r\n"
						+ "				</button>\r\n"
						+ "				<div class=\"clearfix\"></div>\r\n"
						+ "			</div>\r\n"
						+ "			\r\n"
						+ "		</div>\r\n"
						+ "\r\n"
						+ "		<div class=\"clearfix\"></div>\r\n"
						+ "	</div>\r\n"
						+ "</div>";
			}
			message.Icon="success";
			message.TongTien=TongTien;
			message.TongSanPham=TongSanPham;
			message.DataChiTietGioHang=DataChiTietGioHang;
		}
		return message;
	}
	
	@GetMapping("/DanhSachSanPhamThuongHieu/{idthuonghieu}")
	public ModelAndView DanhSachSanPhamThuongHieu(@PathVariable(value="idthuonghieu") String idthuonghieu,Model model)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/DanhSachSanPhamThuongHieu"); 
		Map<String, Object> param=new HashMap<String, Object>(); 
		param.put("idthuonghieu", Integer.parseInt(idthuonghieu) );
		List<Map<String, Object>> DanhSachSanPham=CusTomMapper.DanhSachSanPhamTheoThuongHieu(param);
		model.addAttribute("DanhSachSanPham",DanhSachSanPham);
		return modelAndview;
	}
	
	@RequestMapping(value ="/TimKiemSanham", method = RequestMethod.POST)
	public ModelAndView TimKiemSanham(String TuKhoa,Model model)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/TimKiemSanham");  
		Map<String, Object> param=new HashMap<String, Object>(); 
		param.put("TuKhoa", TuKhoa);
		List<Map<String, Object>> DanhSachSanPham=CusTomMapper.DanhSachSanPhamTimKiem(param);
		model.addAttribute("DanhSachSanPham",DanhSachSanPham);

		return modelAndview;
	}
}
