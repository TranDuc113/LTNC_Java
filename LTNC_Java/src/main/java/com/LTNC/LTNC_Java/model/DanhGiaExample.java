package com.LTNC.LTNC_Java.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DanhGiaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public DanhGiaExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
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
     * This method corresponds to the database table DanhGia
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
     * This method corresponds to the database table DanhGia
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DanhGia
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
     * This class corresponds to the database table DanhGia
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

        public Criteria andIdkhachIsNull() {
            addCriterion("idKhach is null");
            return (Criteria) this;
        }

        public Criteria andIdkhachIsNotNull() {
            addCriterion("idKhach is not null");
            return (Criteria) this;
        }

        public Criteria andIdkhachEqualTo(Integer value) {
            addCriterion("idKhach =", value, "idkhach");
            return (Criteria) this;
        }

        public Criteria andIdkhachNotEqualTo(Integer value) {
            addCriterion("idKhach <>", value, "idkhach");
            return (Criteria) this;
        }

        public Criteria andIdkhachGreaterThan(Integer value) {
            addCriterion("idKhach >", value, "idkhach");
            return (Criteria) this;
        }

        public Criteria andIdkhachGreaterThanOrEqualTo(Integer value) {
            addCriterion("idKhach >=", value, "idkhach");
            return (Criteria) this;
        }

        public Criteria andIdkhachLessThan(Integer value) {
            addCriterion("idKhach <", value, "idkhach");
            return (Criteria) this;
        }

        public Criteria andIdkhachLessThanOrEqualTo(Integer value) {
            addCriterion("idKhach <=", value, "idkhach");
            return (Criteria) this;
        }

        public Criteria andIdkhachIn(List<Integer> values) {
            addCriterion("idKhach in", values, "idkhach");
            return (Criteria) this;
        }

        public Criteria andIdkhachNotIn(List<Integer> values) {
            addCriterion("idKhach not in", values, "idkhach");
            return (Criteria) this;
        }

        public Criteria andIdkhachBetween(Integer value1, Integer value2) {
            addCriterion("idKhach between", value1, value2, "idkhach");
            return (Criteria) this;
        }

        public Criteria andIdkhachNotBetween(Integer value1, Integer value2) {
            addCriterion("idKhach not between", value1, value2, "idkhach");
            return (Criteria) this;
        }

        public Criteria andNgaytaoIsNull() {
            addCriterion("ngayTao is null");
            return (Criteria) this;
        }

        public Criteria andNgaytaoIsNotNull() {
            addCriterion("ngayTao is not null");
            return (Criteria) this;
        }

        public Criteria andNgaytaoEqualTo(Date value) {
            addCriterion("ngayTao =", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotEqualTo(Date value) {
            addCriterion("ngayTao <>", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoGreaterThan(Date value) {
            addCriterion("ngayTao >", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoGreaterThanOrEqualTo(Date value) {
            addCriterion("ngayTao >=", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoLessThan(Date value) {
            addCriterion("ngayTao <", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoLessThanOrEqualTo(Date value) {
            addCriterion("ngayTao <=", value, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoIn(List<Date> values) {
            addCriterion("ngayTao in", values, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotIn(List<Date> values) {
            addCriterion("ngayTao not in", values, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoBetween(Date value1, Date value2) {
            addCriterion("ngayTao between", value1, value2, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNgaytaoNotBetween(Date value1, Date value2) {
            addCriterion("ngayTao not between", value1, value2, "ngaytao");
            return (Criteria) this;
        }

        public Criteria andNoidungIsNull() {
            addCriterion("noiDung is null");
            return (Criteria) this;
        }

        public Criteria andNoidungIsNotNull() {
            addCriterion("noiDung is not null");
            return (Criteria) this;
        }

        public Criteria andNoidungEqualTo(String value) {
            addCriterion("noiDung =", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotEqualTo(String value) {
            addCriterion("noiDung <>", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungGreaterThan(String value) {
            addCriterion("noiDung >", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungGreaterThanOrEqualTo(String value) {
            addCriterion("noiDung >=", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungLessThan(String value) {
            addCriterion("noiDung <", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungLessThanOrEqualTo(String value) {
            addCriterion("noiDung <=", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungLike(String value) {
            addCriterion("noiDung like", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotLike(String value) {
            addCriterion("noiDung not like", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungIn(List<String> values) {
            addCriterion("noiDung in", values, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotIn(List<String> values) {
            addCriterion("noiDung not in", values, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungBetween(String value1, String value2) {
            addCriterion("noiDung between", value1, value2, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotBetween(String value1, String value2) {
            addCriterion("noiDung not between", value1, value2, "noidung");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DanhGia
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
     * This class corresponds to the database table DanhGia
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