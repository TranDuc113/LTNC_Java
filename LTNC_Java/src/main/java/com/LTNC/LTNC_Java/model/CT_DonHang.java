package com.LTNC.LTNC_Java.model;

public class CT_DonHang extends CT_DonHangKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CT_DonHang.giaBan
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    private Double giaban;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CT_DonHang.soLuong
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    private Integer soluong;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CT_DonHang.thanhTien
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    private Double thanhtien;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CT_DonHang.giaBan
     *
     * @return the value of CT_DonHang.giaBan
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public Double getGiaban() {
        return giaban;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CT_DonHang.giaBan
     *
     * @param giaban the value for CT_DonHang.giaBan
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setGiaban(Double giaban) {
        this.giaban = giaban;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CT_DonHang.soLuong
     *
     * @return the value of CT_DonHang.soLuong
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public Integer getSoluong() {
        return soluong;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CT_DonHang.soLuong
     *
     * @param soluong the value for CT_DonHang.soLuong
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CT_DonHang.thanhTien
     *
     * @return the value of CT_DonHang.thanhTien
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public Double getThanhtien() {
        return thanhtien;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CT_DonHang.thanhTien
     *
     * @param thanhtien the value for CT_DonHang.thanhTien
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setThanhtien(Double thanhtien) {
        this.thanhtien = thanhtien;
    }
}