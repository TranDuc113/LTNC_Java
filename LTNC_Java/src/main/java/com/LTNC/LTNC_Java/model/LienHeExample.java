package com.LTNC.LTNC_Java.model;

import java.util.ArrayList;
import java.util.List;

public class LienHeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public LienHeExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
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
     * This method corresponds to the database table LienHe
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
     * This method corresponds to the database table LienHe
     *
     * @mbg.generated Sat Dec 04 22:35:50 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LienHe
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
     * This class corresponds to the database table LienHe
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

        public Criteria andIdlienheIsNull() {
            addCriterion("IdLienHe is null");
            return (Criteria) this;
        }

        public Criteria andIdlienheIsNotNull() {
            addCriterion("IdLienHe is not null");
            return (Criteria) this;
        }

        public Criteria andIdlienheEqualTo(Integer value) {
            addCriterion("IdLienHe =", value, "idlienhe");
            return (Criteria) this;
        }

        public Criteria andIdlienheNotEqualTo(Integer value) {
            addCriterion("IdLienHe <>", value, "idlienhe");
            return (Criteria) this;
        }

        public Criteria andIdlienheGreaterThan(Integer value) {
            addCriterion("IdLienHe >", value, "idlienhe");
            return (Criteria) this;
        }

        public Criteria andIdlienheGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdLienHe >=", value, "idlienhe");
            return (Criteria) this;
        }

        public Criteria andIdlienheLessThan(Integer value) {
            addCriterion("IdLienHe <", value, "idlienhe");
            return (Criteria) this;
        }

        public Criteria andIdlienheLessThanOrEqualTo(Integer value) {
            addCriterion("IdLienHe <=", value, "idlienhe");
            return (Criteria) this;
        }

        public Criteria andIdlienheIn(List<Integer> values) {
            addCriterion("IdLienHe in", values, "idlienhe");
            return (Criteria) this;
        }

        public Criteria andIdlienheNotIn(List<Integer> values) {
            addCriterion("IdLienHe not in", values, "idlienhe");
            return (Criteria) this;
        }

        public Criteria andIdlienheBetween(Integer value1, Integer value2) {
            addCriterion("IdLienHe between", value1, value2, "idlienhe");
            return (Criteria) this;
        }

        public Criteria andIdlienheNotBetween(Integer value1, Integer value2) {
            addCriterion("IdLienHe not between", value1, value2, "idlienhe");
            return (Criteria) this;
        }

        public Criteria andHoIsNull() {
            addCriterion("Ho is null");
            return (Criteria) this;
        }

        public Criteria andHoIsNotNull() {
            addCriterion("Ho is not null");
            return (Criteria) this;
        }

        public Criteria andHoEqualTo(String value) {
            addCriterion("Ho =", value, "ho");
            return (Criteria) this;
        }

        public Criteria andHoNotEqualTo(String value) {
            addCriterion("Ho <>", value, "ho");
            return (Criteria) this;
        }

        public Criteria andHoGreaterThan(String value) {
            addCriterion("Ho >", value, "ho");
            return (Criteria) this;
        }

        public Criteria andHoGreaterThanOrEqualTo(String value) {
            addCriterion("Ho >=", value, "ho");
            return (Criteria) this;
        }

        public Criteria andHoLessThan(String value) {
            addCriterion("Ho <", value, "ho");
            return (Criteria) this;
        }

        public Criteria andHoLessThanOrEqualTo(String value) {
            addCriterion("Ho <=", value, "ho");
            return (Criteria) this;
        }

        public Criteria andHoLike(String value) {
            addCriterion("Ho like", value, "ho");
            return (Criteria) this;
        }

        public Criteria andHoNotLike(String value) {
            addCriterion("Ho not like", value, "ho");
            return (Criteria) this;
        }

        public Criteria andHoIn(List<String> values) {
            addCriterion("Ho in", values, "ho");
            return (Criteria) this;
        }

        public Criteria andHoNotIn(List<String> values) {
            addCriterion("Ho not in", values, "ho");
            return (Criteria) this;
        }

        public Criteria andHoBetween(String value1, String value2) {
            addCriterion("Ho between", value1, value2, "ho");
            return (Criteria) this;
        }

        public Criteria andHoNotBetween(String value1, String value2) {
            addCriterion("Ho not between", value1, value2, "ho");
            return (Criteria) this;
        }

        public Criteria andTenIsNull() {
            addCriterion("Ten is null");
            return (Criteria) this;
        }

        public Criteria andTenIsNotNull() {
            addCriterion("Ten is not null");
            return (Criteria) this;
        }

        public Criteria andTenEqualTo(String value) {
            addCriterion("Ten =", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotEqualTo(String value) {
            addCriterion("Ten <>", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenGreaterThan(String value) {
            addCriterion("Ten >", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenGreaterThanOrEqualTo(String value) {
            addCriterion("Ten >=", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLessThan(String value) {
            addCriterion("Ten <", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLessThanOrEqualTo(String value) {
            addCriterion("Ten <=", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLike(String value) {
            addCriterion("Ten like", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotLike(String value) {
            addCriterion("Ten not like", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenIn(List<String> values) {
            addCriterion("Ten in", values, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotIn(List<String> values) {
            addCriterion("Ten not in", values, "ten");
            return (Criteria) this;
        }

        public Criteria andTenBetween(String value1, String value2) {
            addCriterion("Ten between", value1, value2, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotBetween(String value1, String value2) {
            addCriterion("Ten not between", value1, value2, "ten");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSdtIsNull() {
            addCriterion("SDT is null");
            return (Criteria) this;
        }

        public Criteria andSdtIsNotNull() {
            addCriterion("SDT is not null");
            return (Criteria) this;
        }

        public Criteria andSdtEqualTo(String value) {
            addCriterion("SDT =", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotEqualTo(String value) {
            addCriterion("SDT <>", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtGreaterThan(String value) {
            addCriterion("SDT >", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtGreaterThanOrEqualTo(String value) {
            addCriterion("SDT >=", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtLessThan(String value) {
            addCriterion("SDT <", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtLessThanOrEqualTo(String value) {
            addCriterion("SDT <=", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtLike(String value) {
            addCriterion("SDT like", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotLike(String value) {
            addCriterion("SDT not like", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtIn(List<String> values) {
            addCriterion("SDT in", values, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotIn(List<String> values) {
            addCriterion("SDT not in", values, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtBetween(String value1, String value2) {
            addCriterion("SDT between", value1, value2, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotBetween(String value1, String value2) {
            addCriterion("SDT not between", value1, value2, "sdt");
            return (Criteria) this;
        }

        public Criteria andNoidungIsNull() {
            addCriterion("NoiDung is null");
            return (Criteria) this;
        }

        public Criteria andNoidungIsNotNull() {
            addCriterion("NoiDung is not null");
            return (Criteria) this;
        }

        public Criteria andNoidungEqualTo(String value) {
            addCriterion("NoiDung =", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotEqualTo(String value) {
            addCriterion("NoiDung <>", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungGreaterThan(String value) {
            addCriterion("NoiDung >", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungGreaterThanOrEqualTo(String value) {
            addCriterion("NoiDung >=", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungLessThan(String value) {
            addCriterion("NoiDung <", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungLessThanOrEqualTo(String value) {
            addCriterion("NoiDung <=", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungLike(String value) {
            addCriterion("NoiDung like", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotLike(String value) {
            addCriterion("NoiDung not like", value, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungIn(List<String> values) {
            addCriterion("NoiDung in", values, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotIn(List<String> values) {
            addCriterion("NoiDung not in", values, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungBetween(String value1, String value2) {
            addCriterion("NoiDung between", value1, value2, "noidung");
            return (Criteria) this;
        }

        public Criteria andNoidungNotBetween(String value1, String value2) {
            addCriterion("NoiDung not between", value1, value2, "noidung");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table LienHe
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
     * This class corresponds to the database table LienHe
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