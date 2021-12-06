package com.LTNC.LTNC_Java.CustomModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.LTNC.LTNC_Java.model.SanPham;


public class GioHang {
	public List<ItemGioHang> DanhSachSanPham=new ArrayList();

	public List<ItemGioHang> GetDanhSachSanPham()
	{
		return this.DanhSachSanPham;
	}
	
	public GioHang(List<ItemGioHang> lstGioHang)
	{
		this.DanhSachSanPham=lstGioHang;
	}
	
	public void ThemSanPham(SanPham sanpham,int SoLuong)
	{
		if(DanhSachSanPham==null)
		{
			DanhSachSanPham=new ArrayList();
			ItemGioHang itemGioHang=new ItemGioHang();
			itemGioHang.Sanpham=sanpham;
			itemGioHang.SoLuong=SoLuong;
			DanhSachSanPham.add(itemGioHang);
		}
		else
		{
			ItemGioHang checkSanPham =DanhSachSanPham.stream().filter(item -> item.Sanpham.getIdsp().equals(sanpham.getIdsp())).findFirst().orElse(null);
			if(checkSanPham==null)
			{
				ItemGioHang itemGioHang=new ItemGioHang();
				itemGioHang.Sanpham=sanpham;
				itemGioHang.SoLuong=SoLuong;
				DanhSachSanPham.add(itemGioHang);
			}
			else {
				checkSanPham.SoLuong += SoLuong;
			}
		}
	}
	
	public List<ItemGioHang> CapNhatSanPham(SanPham sanpham,int SoLuong)
	{
		System.out.println("-------------aaaaaa----------");
		System.out.println(sanpham.getIdsp());
		System.out.println(sanpham.getIdsp());
		System.out.println("-----------------------");
		for (ItemGioHang itemGioHang : DanhSachSanPham) {
			System.out.println(itemGioHang.SoLuong);
		}
		if(DanhSachSanPham!=null) {
			for (ItemGioHang itemGioHang : DanhSachSanPham) {
				if(itemGioHang.Sanpham.getIdsp()==sanpham.getIdsp())
				{
					itemGioHang.SoLuong=SoLuong;
				}
			}
		}
		System.out.println("-----------------------");
		for (ItemGioHang itemGioHang : DanhSachSanPham) {
			System.out.println(itemGioHang.SoLuong);
		}
		return DanhSachSanPham;
	}
	
	public List<ItemGioHang> XoaSanPham(SanPham sanpham)
	{
		int i=0;
		boolean Check=false;
		if(DanhSachSanPham!=null) {
			for (ItemGioHang itemGioHang : DanhSachSanPham) {
				i=i+1;
				if(itemGioHang.Sanpham.getIdsp()==sanpham.getIdsp())
				{
					Check=true;
					break;
				}
			}
		}
		if(Check==true)
		{
			DanhSachSanPham.remove(i-1);
		}
		return DanhSachSanPham;
	}
	
	public Integer TongTien()
	{
		var TongTien=0;
		for (ItemGioHang itemGioHang : DanhSachSanPham) {
			TongTien+=itemGioHang.Sanpham.getGia() * itemGioHang.SoLuong;
		}
		return TongTien;
	}	
}
