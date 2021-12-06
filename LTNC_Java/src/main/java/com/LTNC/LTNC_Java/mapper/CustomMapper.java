package com.LTNC.LTNC_Java.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.LTNC.LTNC_Java.model.DonHang;
import com.LTNC.LTNC_Java.model.KhachHang;
import com.LTNC.LTNC_Java.model.SanPham;
import com.LTNC.LTNC_Java.model.TinTuc;
@Mapper
public interface CustomMapper {
	List<Map<String, Object>>GetDataSP(Map<String, Object> param);
	List<Map<String, Object>>GetSanPhamNoiBat(Map<String, Object> param);
	SanPham LayThongTinChiTietSanPham(Map<String, Object> param);
	List<Map<String, Object>>GetThongTinXemNhanhSanPham(Map<String, Object> param);
	List<Map<String, Object>>GetAnhXemNhanhSanPham(Map<String, Object> param);
	List<Map<String, Object>>GetDanhSanPham();
	long GetSoLuongSanPham();
	List<Map<String, Object>>GetAllDanhSanPham();
	List<Map<String, Object>>GetDanhSachTinTuc();
	long GetSoLuongTinTuc();
	List<Map<String, Object>>GetAllDanhSachTinTuc();
	List<Map<String, Object>>GetTinTucLienQuan();
	List<Map<String, Object>> GetChiTietTinTuc(Map<String, Object> param);
	List<Map<String, Object>> GetDanhGiaSanPham(Map<String, Object> param);
	List<Map<String, Object>> GetAnhSanPham(Map<String, Object> param);
	List<Map<String, Object>> GetThongTinChiTietSanPham(Map<String, Object> param);
	KhachHang GetThongTinChiTietKhachHang(Map<String, Object> param);
	List<Map<String, Object>> GetDanhSachThuongHieu();
	KhachHang LayThongTinKhachHang(Map<String, Object> param);
	DonHang LayThongDonHang(Map<String, Object> param);
	List<Map<String, Object>> DanhSachSanPhamTheoThuongHieu(Map<String, Object> param);
	List<Map<String, Object>> DanhSachSanPhamTimKiem(Map<String, Object> param);
	List<Map<String, Object>> GetSanPhamLienQuan();
}
