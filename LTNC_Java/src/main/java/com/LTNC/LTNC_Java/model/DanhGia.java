package com.LTNC.LTNC_Java.model;

import java.util.Date;

public class DanhGia {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DanhGia.idSp
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    private Integer idsp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DanhGia.idKhach
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    private Integer idkhach;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DanhGia.ngayTao
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    private Date ngaytao;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DanhGia.noiDung
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    private String noidung;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DanhGia.idSp
     *
     * @return the value of DanhGia.idSp
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public Integer getIdsp() {
        return idsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DanhGia.idSp
     *
     * @param idsp the value for DanhGia.idSp
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setIdsp(Integer idsp) {
        this.idsp = idsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DanhGia.idKhach
     *
     * @return the value of DanhGia.idKhach
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public Integer getIdkhach() {
        return idkhach;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DanhGia.idKhach
     *
     * @param idkhach the value for DanhGia.idKhach
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setIdkhach(Integer idkhach) {
        this.idkhach = idkhach;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DanhGia.ngayTao
     *
     * @return the value of DanhGia.ngayTao
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public Date getNgaytao() {
        return ngaytao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DanhGia.ngayTao
     *
     * @param ngaytao the value for DanhGia.ngayTao
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DanhGia.noiDung
     *
     * @return the value of DanhGia.noiDung
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public String getNoidung() {
        return noidung;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DanhGia.noiDung
     *
     * @param noidung the value for DanhGia.noiDung
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}