package com.LTNC.LTNC_Java.model;

import java.util.ArrayList;
import java.util.List;

public class SanPhamExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public SanPhamExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdspIsNull() {
            addCriterion("idSp is null");
            return (Criteria) this;
        }

        public Criteria andIdspIsNotNull() {
            addCriterion("idSp is not null");
            return (Criteria) this;
        }

        public Criteria andIdspEqualTo(Integer value) {
            addCriterion("idSp =", value, "idsp");
            return (Criteria) this;
        }

        public Criteria andIdspNotEqualTo(Integer value) {
            addCriterion("idSp <>", value, "idsp");
            return (Criteria) this;
        }

        public Criteria andIdspGreaterThan(Integer value) {
            addCriterion("idSp >", value, "idsp");
            return (Criteria) this;
        }

        public Criteria andIdspGreaterThanOrEqualTo(Integer value) {
            addCriterion("idSp >=", value, "idsp");
            return (Criteria) this;
        }

        public Criteria andIdspLessThan(Integer value) {
            addCriterion("idSp <", value, "idsp");
            return (Criteria) this;
        }

        public Criteria andIdspLessThanOrEqualTo(Integer value) {
            addCriterion("idSp <=", value, "idsp");
            return (Criteria) this;
        }

        public Criteria andIdspIn(List<Integer> values) {
            addCriterion("idSp in", values, "idsp");
            return (Criteria) this;
        }

        public Criteria andIdspNotIn(List<Integer> values) {
            addCriterion("idSp not in", values, "idsp");
            return (Criteria) this;
        }

        public Criteria andIdspBetween(Integer value1, Integer value2) {
            addCriterion("idSp between", value1, value2, "idsp");
            return (Criteria) this;
        }

        public Criteria andIdspNotBetween(Integer value1, Integer value2) {
            addCriterion("idSp not between", value1, value2, "idsp");
            return (Criteria) this;
        }

        public Criteria andTenIsNull() {
            addCriterion("ten is null");
            return (Criteria) this;
        }

        public Criteria andTenIsNotNull() {
            addCriterion("ten is not null");
            return (Criteria) this;
        }

        public Criteria andTenEqualTo(String value) {
            addCriterion("ten =", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotEqualTo(String value) {
            addCriterion("ten <>", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenGreaterThan(String value) {
            addCriterion("ten >", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenGreaterThanOrEqualTo(String value) {
            addCriterion("ten >=", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLessThan(String value) {
            addCriterion("ten <", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLessThanOrEqualTo(String value) {
            addCriterion("ten <=", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLike(String value) {
            addCriterion("ten like", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotLike(String value) {
            addCriterion("ten not like", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenIn(List<String> values) {
            addCriterion("ten in", values, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotIn(List<String> values) {
            addCriterion("ten not in", values, "ten");
            return (Criteria) this;
        }

        public Criteria andTenBetween(String value1, String value2) {
            addCriterion("ten between", value1, value2, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotBetween(String value1, String value2) {
            addCriterion("ten not between", value1, value2, "ten");
            return (Criteria) this;
        }

        public Criteria andGiaIsNull() {
            addCriterion("gia is null");
            return (Criteria) this;
        }

        public Criteria andGiaIsNotNull() {
            addCriterion("gia is not null");
            return (Criteria) this;
        }

        public Criteria andGiaEqualTo(Double value) {
            addCriterion("gia =", value, "gia");
            return (Criteria) this;
        }

        public Criteria andGiaNotEqualTo(Double value) {
            addCriterion("gia <>", value, "gia");
            return (Criteria) this;
        }

        public Criteria andGiaGreaterThan(Double value) {
            addCriterion("gia >", value, "gia");
            return (Criteria) this;
        }

        public Criteria andGiaGreaterThanOrEqualTo(Double value) {
            addCriterion("gia >=", value, "gia");
            return (Criteria) this;
        }

        public Criteria andGiaLessThan(Double value) {
            addCriterion("gia <", value, "gia");
            return (Criteria) this;
        }

        public Criteria andGiaLessThanOrEqualTo(Double value) {
            addCriterion("gia <=", value, "gia");
            return (Criteria) this;
        }

        public Criteria andGiaIn(List<Double> values) {
            addCriterion("gia in", values, "gia");
            return (Criteria) this;
        }

        public Criteria andGiaNotIn(List<Double> values) {
            addCriterion("gia not in", values, "gia");
            return (Criteria) this;
        }

        public Criteria andGiaBetween(Double value1, Double value2) {
            addCriterion("gia between", value1, value2, "gia");
            return (Criteria) this;
        }

        public Criteria andGiaNotBetween(Double value1, Double value2) {
            addCriterion("gia not between", value1, value2, "gia");
            return (Criteria) this;
        }

        public Criteria andGiakmIsNull() {
            addCriterion("giaKm is null");
            return (Criteria) this;
        }

        public Criteria andGiakmIsNotNull() {
            addCriterion("giaKm is not null");
            return (Criteria) this;
        }

        public Criteria andGiakmEqualTo(Double value) {
            addCriterion("giaKm =", value, "giakm");
            return (Criteria) this;
        }

        public Criteria andGiakmNotEqualTo(Double value) {
            addCriterion("giaKm <>", value, "giakm");
            return (Criteria) this;
        }

        public Criteria andGiakmGreaterThan(Double value) {
            addCriterion("giaKm >", value, "giakm");
            return (Criteria) this;
        }

        public Criteria andGiakmGreaterThanOrEqualTo(Double value) {
            addCriterion("giaKm >=", value, "giakm");
            return (Criteria) this;
        }

        public Criteria andGiakmLessThan(Double value) {
            addCriterion("giaKm <", value, "giakm");
            return (Criteria) this;
        }

        public Criteria andGiakmLessThanOrEqualTo(Double value) {
            addCriterion("giaKm <=", value, "giakm");
            return (Criteria) this;
        }

        public Criteria andGiakmIn(List<Double> values) {
            addCriterion("giaKm in", values, "giakm");
            return (Criteria) this;
        }

        public Criteria andGiakmNotIn(List<Double> values) {
            addCriterion("giaKm not in", values, "giakm");
            return (Criteria) this;
        }

        public Criteria andGiakmBetween(Double value1, Double value2) {
            addCriterion("giaKm between", value1, value2, "giakm");
            return (Criteria) this;
        }

        public Criteria andGiakmNotBetween(Double value1, Double value2) {
            addCriterion("giaKm not between", value1, value2, "giakm");
            return (Criteria) this;
        }

        public Criteria andTrangthaiIsNull() {
            addCriterion("trangThai is null");
            return (Criteria) this;
        }

        public Criteria andTrangthaiIsNotNull() {
            addCriterion("trangThai is not null");
            return (Criteria) this;
        }

        public Criteria andTrangthaiEqualTo(Integer value) {
            addCriterion("trangThai =", value, "trangthai");
            return (Criteria) this;
        }

        public Criteria andTrangthaiNotEqualTo(Integer value) {
            addCriterion("trangThai <>", value, "trangthai");
            return (Criteria) this;
        }

        public Criteria andTrangthaiGreaterThan(Integer value) {
            addCriterion("trangThai >", value, "trangthai");
            return (Criteria) this;
        }

        public Criteria andTrangthaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("trangThai >=", value, "trangthai");
            return (Criteria) this;
        }

        public Criteria andTrangthaiLessThan(Integer value) {
            addCriterion("trangThai <", value, "trangthai");
            return (Criteria) this;
        }

        public Criteria andTrangthaiLessThanOrEqualTo(Integer value) {
            addCriterion("trangThai <=", value, "trangthai");
            return (Criteria) this;
        }

        public Criteria andTrangthaiIn(List<Integer> values) {
            addCriterion("trangThai in", values, "trangthai");
            return (Criteria) this;
        }

        public Criteria andTrangthaiNotIn(List<Integer> values) {
            addCriterion("trangThai not in", values, "trangthai");
            return (Criteria) this;
        }

        public Criteria andTrangthaiBetween(Integer value1, Integer value2) {
            addCriterion("trangThai between", value1, value2, "trangthai");
            return (Criteria) this;
        }

        public Criteria andTrangthaiNotBetween(Integer value1, Integer value2) {
            addCriterion("trangThai not between", value1, value2, "trangthai");
            return (Criteria) this;
        }

        public Criteria andIdloaiIsNull() {
            addCriterion("idLoai is null");
            return (Criteria) this;
        }

        public Criteria andIdloaiIsNotNull() {
            addCriterion("idLoai is not null");
            return (Criteria) this;
        }

        public Criteria andIdloaiEqualTo(Integer value) {
            addCriterion("idLoai =", value, "idloai");
            return (Criteria) this;
        }

        public Criteria andIdloaiNotEqualTo(Integer value) {
            addCriterion("idLoai <>", value, "idloai");
            return (Criteria) this;
        }

        public Criteria andIdloaiGreaterThan(Integer value) {
            addCriterion("idLoai >", value, "idloai");
            return (Criteria) this;
        }

        public Criteria andIdloaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("idLoai >=", value, "idloai");
            return (Criteria) this;
        }

        public Criteria andIdloaiLessThan(Integer value) {
            addCriterion("idLoai <", value, "idloai");
            return (Criteria) this;
        }

        public Criteria andIdloaiLessThanOrEqualTo(Integer value) {
            addCriterion("idLoai <=", value, "idloai");
            return (Criteria) this;
        }

        public Criteria andIdloaiIn(List<Integer> values) {
            addCriterion("idLoai in", values, "idloai");
            return (Criteria) this;
        }

        public Criteria andIdloaiNotIn(List<Integer> values) {
            addCriterion("idLoai not in", values, "idloai");
            return (Criteria) this;
        }

        public Criteria andIdloaiBetween(Integer value1, Integer value2) {
            addCriterion("idLoai between", value1, value2, "idloai");
            return (Criteria) this;
        }

        public Criteria andIdloaiNotBetween(Integer value1, Integer value2) {
            addCriterion("idLoai not between", value1, value2, "idloai");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuIsNull() {
            addCriterion("idThuongHieu is null");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuIsNotNull() {
            addCriterion("idThuongHieu is not null");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuEqualTo(Integer value) {
            addCriterion("idThuongHieu =", value, "idthuonghieu");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuNotEqualTo(Integer value) {
            addCriterion("idThuongHieu <>", value, "idthuonghieu");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuGreaterThan(Integer value) {
            addCriterion("idThuongHieu >", value, "idthuonghieu");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuGreaterThanOrEqualTo(Integer value) {
            addCriterion("idThuongHieu >=", value, "idthuonghieu");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuLessThan(Integer value) {
            addCriterion("idThuongHieu <", value, "idthuonghieu");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuLessThanOrEqualTo(Integer value) {
            addCriterion("idThuongHieu <=", value, "idthuonghieu");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuIn(List<Integer> values) {
            addCriterion("idThuongHieu in", values, "idthuonghieu");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuNotIn(List<Integer> values) {
            addCriterion("idThuongHieu not in", values, "idthuonghieu");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuBetween(Integer value1, Integer value2) {
            addCriterion("idThuongHieu between", value1, value2, "idthuonghieu");
            return (Criteria) this;
        }

        public Criteria andIdthuonghieuNotBetween(Integer value1, Integer value2) {
            addCriterion("idThuongHieu not between", value1, value2, "idthuonghieu");
            return (Criteria) this;
        }

        public Criteria andIduserIsNull() {
            addCriterion("idUser is null");
            return (Criteria) this;
        }

        public Criteria andIduserIsNotNull() {
            addCriterion("idUser is not null");
            return (Criteria) this;
        }

        public Criteria andIduserEqualTo(Integer value) {
            addCriterion("idUser =", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotEqualTo(Integer value) {
            addCriterion("idUser <>", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserGreaterThan(Integer value) {
            addCriterion("idUser >", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserGreaterThanOrEqualTo(Integer value) {
            addCriterion("idUser >=", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserLessThan(Integer value) {
            addCriterion("idUser <", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserLessThanOrEqualTo(Integer value) {
            addCriterion("idUser <=", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserIn(List<Integer> values) {
            addCriterion("idUser in", values, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotIn(List<Integer> values) {
            addCriterion("idUser not in", values, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserBetween(Integer value1, Integer value2) {
            addCriterion("idUser between", value1, value2, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotBetween(Integer value1, Integer value2) {
            addCriterion("idUser not between", value1, value2, "iduser");
            return (Criteria) this;
        }

        public Criteria andSoluongIsNull() {
            addCriterion("soLuong is null");
            return (Criteria) this;
        }

        public Criteria andSoluongIsNotNull() {
            addCriterion("soLuong is not null");
            return (Criteria) this;
        }

        public Criteria andSoluongEqualTo(Integer value) {
            addCriterion("soLuong =", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongNotEqualTo(Integer value) {
            addCriterion("soLuong <>", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongGreaterThan(Integer value) {
            addCriterion("soLuong >", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongGreaterThanOrEqualTo(Integer value) {
            addCriterion("soLuong >=", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongLessThan(Integer value) {
            addCriterion("soLuong <", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongLessThanOrEqualTo(Integer value) {
            addCriterion("soLuong <=", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongIn(List<Integer> values) {
            addCriterion("soLuong in", values, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongNotIn(List<Integer> values) {
            addCriterion("soLuong not in", values, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongBetween(Integer value1, Integer value2) {
            addCriterion("soLuong between", value1, value2, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongNotBetween(Integer value1, Integer value2) {
            addCriterion("soLuong not between", value1, value2, "soluong");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaIsNull() {
            addCriterion("trangThaiMieuTa is null");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaIsNotNull() {
            addCriterion("trangThaiMieuTa is not null");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaEqualTo(String value) {
            addCriterion("trangThaiMieuTa =", value, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaNotEqualTo(String value) {
            addCriterion("trangThaiMieuTa <>", value, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaGreaterThan(String value) {
            addCriterion("trangThaiMieuTa >", value, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaGreaterThanOrEqualTo(String value) {
            addCriterion("trangThaiMieuTa >=", value, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaLessThan(String value) {
            addCriterion("trangThaiMieuTa <", value, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaLessThanOrEqualTo(String value) {
            addCriterion("trangThaiMieuTa <=", value, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaLike(String value) {
            addCriterion("trangThaiMieuTa like", value, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaNotLike(String value) {
            addCriterion("trangThaiMieuTa not like", value, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaIn(List<String> values) {
            addCriterion("trangThaiMieuTa in", values, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaNotIn(List<String> values) {
            addCriterion("trangThaiMieuTa not in", values, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaBetween(String value1, String value2) {
            addCriterion("trangThaiMieuTa between", value1, value2, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andTrangthaimieutaNotBetween(String value1, String value2) {
            addCriterion("trangThaiMieuTa not between", value1, value2, "trangthaimieuta");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienIsNull() {
            addCriterion("anhDaiDien is null");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienIsNotNull() {
            addCriterion("anhDaiDien is not null");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienEqualTo(String value) {
            addCriterion("anhDaiDien =", value, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienNotEqualTo(String value) {
            addCriterion("anhDaiDien <>", value, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienGreaterThan(String value) {
            addCriterion("anhDaiDien >", value, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienGreaterThanOrEqualTo(String value) {
            addCriterion("anhDaiDien >=", value, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienLessThan(String value) {
            addCriterion("anhDaiDien <", value, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienLessThanOrEqualTo(String value) {
            addCriterion("anhDaiDien <=", value, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienLike(String value) {
            addCriterion("anhDaiDien like", value, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienNotLike(String value) {
            addCriterion("anhDaiDien not like", value, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienIn(List<String> values) {
            addCriterion("anhDaiDien in", values, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienNotIn(List<String> values) {
            addCriterion("anhDaiDien not in", values, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienBetween(String value1, String value2) {
            addCriterion("anhDaiDien between", value1, value2, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andAnhdaidienNotBetween(String value1, String value2) {
            addCriterion("anhDaiDien not between", value1, value2, "anhdaidien");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatIsNull() {
            addCriterion("MieuTaSanPhamNoiBat is null");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatIsNotNull() {
            addCriterion("MieuTaSanPhamNoiBat is not null");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatEqualTo(String value) {
            addCriterion("MieuTaSanPhamNoiBat =", value, "mieutasanphamnoibat");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatNotEqualTo(String value) {
            addCriterion("MieuTaSanPhamNoiBat <>", value, "mieutasanphamnoibat");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatGreaterThan(String value) {
            addCriterion("MieuTaSanPhamNoiBat >", value, "mieutasanphamnoibat");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatGreaterThanOrEqualTo(String value) {
            addCriterion("MieuTaSanPhamNoiBat >=", value, "mieutasanphamnoibat");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatLessThan(String value) {
            addCriterion("MieuTaSanPhamNoiBat <", value, "mieutasanphamnoibat");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatLessThanOrEqualTo(String value) {
            addCriterion("MieuTaSanPhamNoiBat <=", value, "mieutasanphamnoibat");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatLike(String value) {
            addCriterion("MieuTaSanPhamNoiBat like", value, "mieutasanphamnoibat");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatNotLike(String value) {
            addCriterion("MieuTaSanPhamNoiBat not like", value, "mieutasanphamnoibat");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatIn(List<String> values) {
            addCriterion("MieuTaSanPhamNoiBat in", values, "mieutasanphamnoibat");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatNotIn(List<String> values) {
            addCriterion("MieuTaSanPhamNoiBat not in", values, "mieutasanphamnoibat");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatBetween(String value1, String value2) {
            addCriterion("MieuTaSanPhamNoiBat between", value1, value2, "mieutasanphamnoibat");
            return (Criteria) this;
        }

        public Criteria andMieutasanphamnoibatNotBetween(String value1, String value2) {
            addCriterion("MieuTaSanPhamNoiBat not between", value1, value2, "mieutasanphamnoibat");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SanPham
     *
     * @mbg.generated do_not_delete_during_merge Sat Dec 04 22:35:50 ICT 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SanPham
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}