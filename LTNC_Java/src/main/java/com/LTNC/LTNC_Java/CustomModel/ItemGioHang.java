package com.LTNC.LTNC_Java.CustomModel;

import com.LTNC.LTNC_Java.model.SanPham;

public class ItemGioHang {
	public SanPham Sanpham;
	public int SoLuong;
	
	public void SetSanpham(SanPham Sanpham)
	{
		this.Sanpham=Sanpham;
	}
	
	public void SetSoLuong(Integer SoLuong)
	{
		this.SoLuong=SoLuong;
	}

	public SanPham GetIdSanPham()
	{
		return this.Sanpham;
	}
	
	public int GetMauSac()
	{
		return this.SoLuong;
	}
}
