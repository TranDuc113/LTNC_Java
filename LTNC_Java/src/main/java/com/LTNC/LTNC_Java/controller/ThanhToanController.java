package com.LTNC.LTNC_Java.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.LTNC.LTNC_Java.CustomModel.GioHang;
import com.LTNC.LTNC_Java.CustomModel.ItemGioHang;
import com.LTNC.LTNC_Java.CustomModel.LoginInfor;
import com.LTNC.LTNC_Java.CustomModel.Message;
import com.LTNC.LTNC_Java.CustomModel.ThongTinDonDatHang;
import com.LTNC.LTNC_Java.mapper.CT_DonHangMapper;
import com.LTNC.LTNC_Java.mapper.CustomMapper;
import com.LTNC.LTNC_Java.mapper.DonHangMapper;
import com.LTNC.LTNC_Java.mapper.KhachHangMapper;
import com.LTNC.LTNC_Java.model.CT_DonHang;
import com.LTNC.LTNC_Java.model.DonHang;
import com.LTNC.LTNC_Java.model.KhachHang;
import com.LTNC.LTNC_Java.model.SanPham;

@Controller
public class ThanhToanController {
	@Autowired
	CustomMapper CusTomMapper;
	
	@Autowired
	DonHangMapper donhangMapper;
	
	@Autowired
	CT_DonHangMapper ctdonhangMapper;
	
	@RequestMapping(value ="/KiemTraDangNhap")
	public @ResponseBody Message KiemTraDangNhap(Model model, HttpServletRequest request)
	{
		Message message=new Message();
		LoginInfor userInfor=(LoginInfor)request.getSession().getAttribute("DangNhap");
		if(userInfor!=null)
		{
			message.Icon="success";
			message.Title="";
		}
		else {
			message.Icon="error";
			message.Title="Bạn cần đăng nhập mới thực hiện được chức năng này";
		}
		return message;
	}
	
	@RequestMapping("/TienHanhThanhToan")
	public ModelAndView TienHanhThanhToan(Model model, HttpServletRequest request)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/TienHanhThanhToan");
		LoginInfor userInfor=(LoginInfor)request.getSession().getAttribute("DangNhap");
		Map<String, Object> param=new HashMap<String, Object>(); 
		param.put("IdKhachHang",userInfor.IdKhachHang); 
		KhachHang khachhang=CusTomMapper.LayThongTinKhachHang(param);
		model.addAttribute("khachhang",khachhang); 

		return modelAndview;
	}
	
	@RequestMapping("/ChiTietGioHang")
	public @ResponseBody Message ChiTietGioHang(Model model, HttpServletRequest request)
	{
		Message message=new Message();
		List<ItemGioHang> ValuesGioHang = (List<ItemGioHang>) request.getSession().getAttribute("GioHang");
		String DataChiTietGioHang="";
		for (ItemGioHang itemGioHang : ValuesGioHang) {
			DataChiTietGioHang+=" <div class=\"product__list__item\">\r\n"
					+ "     <div class=\"product__img\">\r\n"
					+ "         <img src=\"/Image/"+itemGioHang.Sanpham.getAnhdaidien()+"\" alt=\"Name your Product \">\r\n"
					+ "     </div>\r\n"
					+ "     <div class=\"product__name\" style=\"text-align: left;\">\r\n"
					+ "         <a href=\"#\" >"+itemGioHang.Sanpham.getTen()+"</a>\r\n"
					+ "         <a class=\"product__delete\"  href=\"#\" onclick=\"XoaSanPham("+itemGioHang.Sanpham.getIdsp()+")\">\r\n"
					+ "             <span class=\"icon -ap icon-trash2\"></span>\r\n"
					+ "         </a>\r\n"
					+ "     </div>\r\n"
					+ "     \r\n"
					+ "     <div class=\"product__price\">\r\n"
					+ "         <div class=\"product__price__old\">"+itemGioHang.Sanpham.getGiakm()+" <span class=\"unit\">đ</span></div>\r\n"
					+ "         <div class=\"product__price__regular\">"+itemGioHang.Sanpham.getGia()+" <span class=\"unit\">đ</span></div>\r\n"
					+ "         <div class=\"product__quantity\">\r\n"
					+ "             <button class=\"btn-minus btn\" id=\"GiamSoLuong"+itemGioHang.Sanpham.getIdsp()+"\" onclick=\"GiamSoLuong("+itemGioHang.Sanpham.getIdsp()+")\">\r\n"
					+ "                 -\r\n"
					+ "             </button>\r\n"
					+ "             <input type=\"text\"  onkeypress=\"return (event.charCode !=8 && event.charCode ==0 || ( event.charCode == 46 || (event.charCode >= 48 && event.charCode <= 57)))\" style=\"padding: 0;\" class=\"input-number\" value=\""+itemGioHang.SoLuong+"\" id=\"SoLuong"+itemGioHang.Sanpham.getIdsp()+"\">\r\n"
					+ "             <button class=\"btn-plus btn\" id=\"TangSoLuong"+itemGioHang.Sanpham.getIdsp()+"\" onclick=\"TangSoLuong("+itemGioHang.Sanpham.getIdsp()+")\">\r\n"
					+ "                 +\r\n"
					+ "             </button>\r\n"
					+ "             <div class=\"clearfix\"></div>\r\n"
					+ "         </div>\r\n"
					+ "         \r\n"
					+ "     </div>\r\n"
					+ "\r\n"
					+ "     <div class=\"clearfix\"></div>\r\n"
					+ " </div>";
		}
		message.Icon="success";
		message.Data=DataChiTietGioHang;
		return message;
	}
	
	@RequestMapping(value ="/XoaSanPhamTrongGioHang", method = RequestMethod.POST)
	public @ResponseBody Message XoaSanPhamTrongGioHang(HttpServletRequest request,Model model,String IdSanPham)
	{
		Message message=new Message();
		try {
			List<ItemGioHang> ValuesGioHang = (List<ItemGioHang>) request.getSession().getAttribute("GioHang");
			GioHang giohang = new GioHang(ValuesGioHang);
			Map<String, Object> param=new HashMap<String, Object>(); 
			param.put("IdSanPham", IdSanPham);
			SanPham sanpham=CusTomMapper.LayThongTinChiTietSanPham(param);
			List<ItemGioHang> DSHangHoa=new ArrayList();
			if(sanpham!=null)
			{
				DSHangHoa=giohang.XoaSanPham(sanpham);
			}
			request.getSession().setAttribute("GioHang",DSHangHoa);
			message.Title="Xóa sản phẩm thành công";
			message.Icon="success";
		}
		catch (Exception e) {
			message.Title="Có lỗi:"+e.getMessage();
			message.Icon="error";
		}

		return message;
	}
	
	@RequestMapping(value ="/CapNhatSanPhamTrongGioHang", method = RequestMethod.POST)
	public @ResponseBody Message CapNhatSanPhamTrongGioHang(HttpServletRequest request,Model model,String IdSanPham,String soLuongSanPham)
	{
		Message message=new Message();
		try {
			List<ItemGioHang> ValuesGioHang = (List<ItemGioHang>) request.getSession().getAttribute("GioHang");
			GioHang giohang = new GioHang(ValuesGioHang);
			Map<String, Object> param=new HashMap<String, Object>(); 
			param.put("IdSanPham", IdSanPham);
			SanPham sanpham=CusTomMapper.LayThongTinChiTietSanPham(param);
			List<ItemGioHang> DSHangHoa=new ArrayList();
			if(sanpham!=null)
			{
				DSHangHoa=giohang.CapNhatSanPham(sanpham,Integer.parseInt(soLuongSanPham));
			}
			request.getSession().setAttribute("GioHang",DSHangHoa);
			message.Title="";
			message.Icon="success";
		}
		catch (Exception e) {
			message.Title="Có lỗi:"+e.getMessage();
			message.Icon="error";
		}

		return message;
	}
	
	@RequestMapping(value ="/ThucHienThanhToan", method = RequestMethod.POST)
	public @ResponseBody Message ThucHienThanhToan(HttpServletRequest request,Model model,String txtSDT,String txtTen,String txtEmail,String txtDiaChi,String txtTinhThanh,String txtQuanHuyen,String txtNoiDung,String HinhThucThanhToan)
	{
		Message message=new Message();
		try {
			ThongTinDonDatHang thongtindondathang=new ThongTinDonDatHang();
			thongtindondathang.settxtSDT(txtSDT);
			thongtindondathang.settxtTen(txtTen);
			thongtindondathang.settxtEmail(txtEmail);
			thongtindondathang.settxtDiaChi(txtDiaChi);
			thongtindondathang.settxtTinhThanh(txtTinhThanh);
			thongtindondathang.settxtQuanHuyen(txtQuanHuyen);
			thongtindondathang.settxtNoiDung(txtNoiDung);
			thongtindondathang.setHinhThucThanhToan(HinhThucThanhToan);
			request.getSession().setAttribute("ThongTinThanhToan",thongtindondathang);
			message.Title="";
			message.Icon="success";
		}
		catch (Exception e) {
			message.Title="Có lỗi:"+e.getMessage();
			message.Icon="error";
		}

		return message;
	}
	
	@RequestMapping(value ="/XacNhanThanhToan", method = RequestMethod.GET)
	public ModelAndView XacNhanThanhToan(HttpServletRequest request,Model model,String txtSDT,String txtTen,String txtEmail,String txtDiaChi,String txtTinhThanh,String txtQuanHuyen,String txtNoiDung,String HinhThucThanhToan)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/XacNhanThanhToan");
		ThongTinDonDatHang thongtindondathang = (ThongTinDonDatHang) request.getSession().getAttribute("ThongTinThanhToan");
		model.addAttribute("thongtindondathang",thongtindondathang);
		
		System.out.println(thongtindondathang.txtEmail);
		
		LoginInfor userInfor=(LoginInfor)request.getSession().getAttribute("DangNhap");
		Map<String, Object> param=new HashMap<String, Object>(); 
		param.put("IdKhachHang",userInfor.IdKhachHang); 
		KhachHang khachhang=CusTomMapper.LayThongTinKhachHang(param);
		model.addAttribute("khachhang",khachhang);
		
		return modelAndview;
	}
	
	@RequestMapping("/ChiTietGioHangRutGon")
	public @ResponseBody Message ChiTietGioHangRutGon(Model model, HttpServletRequest request)
	{
		Message message=new Message();
		List<ItemGioHang> ValuesGioHang = (List<ItemGioHang>) request.getSession().getAttribute("GioHang");
		String DataChiTietGioHang="";
		for (ItemGioHang itemGioHang : ValuesGioHang) {
			if(itemGioHang.SoLuong>0)
			{
				DataChiTietGioHang+="<div class=\"product__list__item\">\r\n"
						+ "                                    <div class=\"product__img\">\r\n"
						+ "                                        <img src=\"/Image/"+itemGioHang.Sanpham.getAnhdaidien()+"\" alt=\"Name your Product \">\r\n"
						+ "                                    </div>\r\n"
						+ "                                    <div class=\"product__name\" style=\"text-align: left;\">\r\n"
						+ "                                        "+itemGioHang.Sanpham.getTen()+"\r\n"
						+ "                                    </div>\r\n"
						+ "                                    \r\n"
						+ "                                    <div class=\"product__price\">\r\n"
						+ "                                        <div class=\"product__price__old\">"+itemGioHang.Sanpham.getGiakm()+" <span class=\"unit\">đ</span></div>\r\n"
						+ "                                        <div class=\"product__price__regular\">"+itemGioHang.Sanpham.getGia()+" <span class=\"unit\">đ</span></div>\r\n"
						+ "                                    </div>\r\n"
						+ "                                    <div class=\"clearfix\"></div>\r\n"
						+ "                                </div>";
			}
		}
		message.Icon="success";
		message.Data=DataChiTietGioHang;
		return message;
	}
	
	
	@RequestMapping(value ="/ThanhThoanThanhCong", method = RequestMethod.GET)
	public ModelAndView ThanhThoanThanhCong(HttpServletRequest request,Model model)
	{
		ModelAndView modelAndview=new ModelAndView("ViewUsers/ThanhThoanThanhCong");
		ThongTinDonDatHang thongtindondathang = (ThongTinDonDatHang) request.getSession().getAttribute("ThongTinThanhToan");
		List<ItemGioHang> ValuesGioHang = (List<ItemGioHang>) request.getSession().getAttribute("GioHang");
		LoginInfor userInfor=(LoginInfor)request.getSession().getAttribute("DangNhap");
		
		double TongTien=0;
		for (ItemGioHang itemGioHang : ValuesGioHang) {
			if(itemGioHang.SoLuong>0)
			{
				TongTien+=itemGioHang.Sanpham.getGia()*itemGioHang.SoLuong;
			}
		}
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		DonHang donhang=new DonHang();
		donhang.setNgaydat(date);
		donhang.setDiachigiao(thongtindondathang.txtDiaChi+" -Huyện "+thongtindondathang.txtQuanHuyen+" -Tỉnh "+thongtindondathang.txtTinhThanh);
		donhang.setIdkhach(userInfor.IdKhachHang);
		donhang.setMota(thongtindondathang.txtNoiDung);
		donhang.setTrangthai(false);
		donhang.setTongtien(TongTien);
		donhangMapper.insertSelective(donhang);
		
		Map<String, Object> param=new HashMap<String, Object>(); 
		param.put("ngayDat",date); 
		System.out.println(date);
		/*
		 * DonHang donHang=CusTomMapper.LayThongDonHang(param);
		 * 
		 * CT_DonHang dongdonhang=new CT_DonHang(); for (ItemGioHang itemGioHang :
		 * ValuesGioHang) { if(itemGioHang.SoLuong>0) {
		 * dongdonhang.setGiaban(itemGioHang.Sanpham.getGia());
		 * dongdonhang.setSoluong(itemGioHang.SoLuong);
		 * dongdonhang.setThanhtien(itemGioHang.Sanpham.getGia()*itemGioHang.SoLuong);
		 * dongdonhang.setIddon(donHang.getIddon());
		 * dongdonhang.setIddon(itemGioHang.Sanpham.getIdsp());
		 * ctdonhangMapper.insert(dongdonhang); } }
		 */
		
		return modelAndview;
	}
	
}
