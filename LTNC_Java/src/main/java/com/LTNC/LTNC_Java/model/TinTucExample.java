package com.LTNC.LTNC_Java.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TinTucExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public TinTucExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
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
     * This method corresponds to the database table TinTuc
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
     * This method corresponds to the database table TinTuc
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TinTuc
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
     * This class corresponds to the database table TinTuc
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

        public Criteria andIdtinIsNull() {
            addCriterion("idTin is null");
            return (Criteria) this;
        }

        public Criteria andIdtinIsNotNull() {
            addCriterion("idTin is not null");
            return (Criteria) this;
        }

        public Criteria andIdtinEqualTo(Integer value) {
            addCriterion("idTin =", value, "idtin");
            return (Criteria) this;
        }

        public Criteria andIdtinNotEqualTo(Integer value) {
            addCriterion("idTin <>", value, "idtin");
            return (Criteria) this;
        }

        public Criteria andIdtinGreaterThan(Integer value) {
            addCriterion("idTin >", value, "idtin");
            return (Criteria) this;
        }

        public Criteria andIdtinGreaterThanOrEqualTo(Integer value) {
            addCriterion("idTin >=", value, "idtin");
            return (Criteria) this;
        }

        public Criteria andIdtinLessThan(Integer value) {
            addCriterion("idTin <", value, "idtin");
            return (Criteria) this;
        }

        public Criteria andIdtinLessThanOrEqualTo(Integer value) {
            addCriterion("idTin <=", value, "idtin");
            return (Criteria) this;
        }

        public Criteria andIdtinIn(List<Integer> values) {
            addCriterion("idTin in", values, "idtin");
            return (Criteria) this;
        }

        public Criteria andIdtinNotIn(List<Integer> values) {
            addCriterion("idTin not in", values, "idtin");
            return (Criteria) this;
        }

        public Criteria andIdtinBetween(Integer value1, Integer value2) {
            addCriterion("idTin between", value1, value2, "idtin");
            return (Criteria) this;
        }

        public Criteria andIdtinNotBetween(Integer value1, Integer value2) {
            addCriterion("idTin not between", value1, value2, "idtin");
            return (Criteria) this;
        }

        public Criteria andTieudeIsNull() {
            addCriterion("tieuDe is null");
            return (Criteria) this;
        }

        public Criteria andTieudeIsNotNull() {
            addCriterion("tieuDe is not null");
            return (Criteria) this;
        }

        public Criteria andTieudeEqualTo(String value) {
            addCriterion("tieuDe =", value, "tieude");
            return (Criteria) this;
        }

        public Criteria andTieudeNotEqualTo(String value) {
            addCriterion("tieuDe <>", value, "tieude");
            return (Criteria) this;
        }

        public Criteria andTieudeGreaterThan(String value) {
            addCriterion("tieuDe >", value, "tieude");
            return (Criteria) this;
        }

        public Criteria andTieudeGreaterThanOrEqualTo(String value) {
            addCriterion("tieuDe >=", value, "tieude");
            return (Criteria) this;
        }

        public Criteria andTieudeLessThan(String value) {
            addCriterion("tieuDe <", value, "tieude");
            return (Criteria) this;
        }

        public Criteria andTieudeLessThanOrEqualTo(String value) {
            addCriterion("tieuDe <=", value, "tieude");
            return (Criteria) this;
        }

        public Criteria andTieudeLike(String value) {
            addCriterion("tieuDe like", value, "tieude");
            return (Criteria) this;
        }

        public Criteria andTieudeNotLike(String value) {
            addCriterion("tieuDe not like", value, "tieude");
            return (Criteria) this;
        }

        public Criteria andTieudeIn(List<String> values) {
            addCriterion("tieuDe in", values, "tieude");
            return (Criteria) this;
        }

        public Criteria andTieudeNotIn(List<String> values) {
            addCriterion("tieuDe not in", values, "tieude");
            return (Criteria) this;
        }

        public Criteria andTieudeBetween(String value1, String value2) {
            addCriterion("tieuDe between", value1, value2, "tieude");
            return (Criteria) this;
        }

        public Criteria andTieudeNotBetween(String value1, String value2) {
            addCriterion("tieuDe not between", value1, value2, "tieude");
            return (Criteria) this;
        }

        public Criteria andAnhIsNull() {
            addCriterion("anh is null");
            return (Criteria) this;
        }

        public Criteria andAnhIsNotNull() {
            addCriterion("anh is not null");
            return (Criteria) this;
        }

        public Criteria andAnhEqualTo(String value) {
            addCriterion("anh =", value, "anh");
            return (Criteria) this;
        }

        public Criteria andAnhNotEqualTo(String value) {
            addCriterion("anh <>", value, "anh");
            return (Criteria) this;
        }

        public Criteria andAnhGreaterThan(String value) {
            addCriterion("anh >", value, "anh");
            return (Criteria) this;
        }

        public Criteria andAnhGreaterThanOrEqualTo(String value) {
            addCriterion("anh >=", value, "anh");
            return (Criteria) this;
        }

        public Criteria andAnhLessThan(String value) {
            addCriterion("anh <", value, "anh");
            return (Criteria) this;
        }

        public Criteria andAnhLessThanOrEqualTo(String value) {
            addCriterion("anh <=", value, "anh");
            return (Criteria) this;
        }

        public Criteria andAnhLike(String value) {
            addCriterion("anh like", value, "anh");
            return (Criteria) this;
        }

        public Criteria andAnhNotLike(String value) {
            addCriterion("anh not like", value, "anh");
            return (Criteria) this;
        }

        public Criteria andAnhIn(List<String> values) {
            addCriterion("anh in", values, "anh");
            return (Criteria) this;
        }

        public Criteria andAnhNotIn(List<String> values) {
            addCriterion("anh not in", values, "anh");
            return (Criteria) this;
        }

        public Criteria andAnhBetween(String value1, String value2) {
            addCriterion("anh between", value1, value2, "anh");
            return (Criteria) this;
        }

        public Criteria andAnhNotBetween(String value1, String value2) {
            addCriterion("anh not between", value1, value2, "anh");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TinTuc
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
     * This class corresponds to the database table TinTuc
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