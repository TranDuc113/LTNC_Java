package com.LTNC.LTNC_Java.model;

import java.util.ArrayList;
import java.util.List;

public class ThuongHieuExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public ThuongHieuExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
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
     * This method corresponds to the database table ThuongHieu
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
     * This method corresponds to the database table ThuongHieu
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ThuongHieu
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
     * This class corresponds to the database table ThuongHieu
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

        public Criteria andTenthuonghieuIsNull() {
            addCriterion("tenThuongHieu is null");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuIsNotNull() {
            addCriterion("tenThuongHieu is not null");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuEqualTo(String value) {
            addCriterion("tenThuongHieu =", value, "tenthuonghieu");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuNotEqualTo(String value) {
            addCriterion("tenThuongHieu <>", value, "tenthuonghieu");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuGreaterThan(String value) {
            addCriterion("tenThuongHieu >", value, "tenthuonghieu");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuGreaterThanOrEqualTo(String value) {
            addCriterion("tenThuongHieu >=", value, "tenthuonghieu");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuLessThan(String value) {
            addCriterion("tenThuongHieu <", value, "tenthuonghieu");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuLessThanOrEqualTo(String value) {
            addCriterion("tenThuongHieu <=", value, "tenthuonghieu");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuLike(String value) {
            addCriterion("tenThuongHieu like", value, "tenthuonghieu");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuNotLike(String value) {
            addCriterion("tenThuongHieu not like", value, "tenthuonghieu");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuIn(List<String> values) {
            addCriterion("tenThuongHieu in", values, "tenthuonghieu");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuNotIn(List<String> values) {
            addCriterion("tenThuongHieu not in", values, "tenthuonghieu");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuBetween(String value1, String value2) {
            addCriterion("tenThuongHieu between", value1, value2, "tenthuonghieu");
            return (Criteria) this;
        }

        public Criteria andTenthuonghieuNotBetween(String value1, String value2) {
            addCriterion("tenThuongHieu not between", value1, value2, "tenthuonghieu");
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
     * This class corresponds to the database table ThuongHieu
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
     * This class corresponds to the database table ThuongHieu
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