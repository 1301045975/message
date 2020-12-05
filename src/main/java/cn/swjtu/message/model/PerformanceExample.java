package cn.swjtu.message.model;

import java.util.ArrayList;
import java.util.List;

public class PerformanceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    public PerformanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
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
     * This method corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andPerIdIsNull() {
            addCriterion("per_id is null");
            return (Criteria) this;
        }

        public Criteria andPerIdIsNotNull() {
            addCriterion("per_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerIdEqualTo(Integer value) {
            addCriterion("per_id =", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotEqualTo(Integer value) {
            addCriterion("per_id <>", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThan(Integer value) {
            addCriterion("per_id >", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_id >=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThan(Integer value) {
            addCriterion("per_id <", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThanOrEqualTo(Integer value) {
            addCriterion("per_id <=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdIn(List<Integer> values) {
            addCriterion("per_id in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotIn(List<Integer> values) {
            addCriterion("per_id not in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdBetween(Integer value1, Integer value2) {
            addCriterion("per_id between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("per_id not between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNull() {
            addCriterion("per_name is null");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNotNull() {
            addCriterion("per_name is not null");
            return (Criteria) this;
        }

        public Criteria andPerNameEqualTo(String value) {
            addCriterion("per_name =", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotEqualTo(String value) {
            addCriterion("per_name <>", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThan(String value) {
            addCriterion("per_name >", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThanOrEqualTo(String value) {
            addCriterion("per_name >=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThan(String value) {
            addCriterion("per_name <", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThanOrEqualTo(String value) {
            addCriterion("per_name <=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLike(String value) {
            addCriterion("per_name like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotLike(String value) {
            addCriterion("per_name not like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameIn(List<String> values) {
            addCriterion("per_name in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotIn(List<String> values) {
            addCriterion("per_name not in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameBetween(String value1, String value2) {
            addCriterion("per_name between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotBetween(String value1, String value2) {
            addCriterion("per_name not between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageIsNull() {
            addCriterion("per_grade_message is null");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageIsNotNull() {
            addCriterion("per_grade_message is not null");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageEqualTo(Integer value) {
            addCriterion("per_grade_message =", value, "perGradeMessage");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageNotEqualTo(Integer value) {
            addCriterion("per_grade_message <>", value, "perGradeMessage");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageGreaterThan(Integer value) {
            addCriterion("per_grade_message >", value, "perGradeMessage");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_grade_message >=", value, "perGradeMessage");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageLessThan(Integer value) {
            addCriterion("per_grade_message <", value, "perGradeMessage");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageLessThanOrEqualTo(Integer value) {
            addCriterion("per_grade_message <=", value, "perGradeMessage");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageIn(List<Integer> values) {
            addCriterion("per_grade_message in", values, "perGradeMessage");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageNotIn(List<Integer> values) {
            addCriterion("per_grade_message not in", values, "perGradeMessage");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageBetween(Integer value1, Integer value2) {
            addCriterion("per_grade_message between", value1, value2, "perGradeMessage");
            return (Criteria) this;
        }

        public Criteria andPerGradeMessageNotBetween(Integer value1, Integer value2) {
            addCriterion("per_grade_message not between", value1, value2, "perGradeMessage");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelIsNull() {
            addCriterion("per_group_tel is null");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelIsNotNull() {
            addCriterion("per_group_tel is not null");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelEqualTo(Integer value) {
            addCriterion("per_group_tel =", value, "perGroupTel");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelNotEqualTo(Integer value) {
            addCriterion("per_group_tel <>", value, "perGroupTel");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelGreaterThan(Integer value) {
            addCriterion("per_group_tel >", value, "perGroupTel");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_group_tel >=", value, "perGroupTel");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelLessThan(Integer value) {
            addCriterion("per_group_tel <", value, "perGroupTel");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelLessThanOrEqualTo(Integer value) {
            addCriterion("per_group_tel <=", value, "perGroupTel");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelIn(List<Integer> values) {
            addCriterion("per_group_tel in", values, "perGroupTel");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelNotIn(List<Integer> values) {
            addCriterion("per_group_tel not in", values, "perGroupTel");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelBetween(Integer value1, Integer value2) {
            addCriterion("per_group_tel between", value1, value2, "perGroupTel");
            return (Criteria) this;
        }

        public Criteria andPerGroupTelNotBetween(Integer value1, Integer value2) {
            addCriterion("per_group_tel not between", value1, value2, "perGroupTel");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeIsNull() {
            addCriterion("per_group_agree is null");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeIsNotNull() {
            addCriterion("per_group_agree is not null");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeEqualTo(Integer value) {
            addCriterion("per_group_agree =", value, "perGroupAgree");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeNotEqualTo(Integer value) {
            addCriterion("per_group_agree <>", value, "perGroupAgree");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeGreaterThan(Integer value) {
            addCriterion("per_group_agree >", value, "perGroupAgree");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_group_agree >=", value, "perGroupAgree");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeLessThan(Integer value) {
            addCriterion("per_group_agree <", value, "perGroupAgree");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeLessThanOrEqualTo(Integer value) {
            addCriterion("per_group_agree <=", value, "perGroupAgree");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeIn(List<Integer> values) {
            addCriterion("per_group_agree in", values, "perGroupAgree");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeNotIn(List<Integer> values) {
            addCriterion("per_group_agree not in", values, "perGroupAgree");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeBetween(Integer value1, Integer value2) {
            addCriterion("per_group_agree between", value1, value2, "perGroupAgree");
            return (Criteria) this;
        }

        public Criteria andPerGroupAgreeNotBetween(Integer value1, Integer value2) {
            addCriterion("per_group_agree not between", value1, value2, "perGroupAgree");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonIsNull() {
            addCriterion("per_group_logon is null");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonIsNotNull() {
            addCriterion("per_group_logon is not null");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonEqualTo(Integer value) {
            addCriterion("per_group_logon =", value, "perGroupLogon");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonNotEqualTo(Integer value) {
            addCriterion("per_group_logon <>", value, "perGroupLogon");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonGreaterThan(Integer value) {
            addCriterion("per_group_logon >", value, "perGroupLogon");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_group_logon >=", value, "perGroupLogon");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonLessThan(Integer value) {
            addCriterion("per_group_logon <", value, "perGroupLogon");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonLessThanOrEqualTo(Integer value) {
            addCriterion("per_group_logon <=", value, "perGroupLogon");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonIn(List<Integer> values) {
            addCriterion("per_group_logon in", values, "perGroupLogon");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonNotIn(List<Integer> values) {
            addCriterion("per_group_logon not in", values, "perGroupLogon");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonBetween(Integer value1, Integer value2) {
            addCriterion("per_group_logon between", value1, value2, "perGroupLogon");
            return (Criteria) this;
        }

        public Criteria andPerGroupLogonNotBetween(Integer value1, Integer value2) {
            addCriterion("per_group_logon not between", value1, value2, "perGroupLogon");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table performance
     *
     * @mbg.generated do_not_delete_during_merge Mon Nov 30 09:48:03 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table performance
     *
     * @mbg.generated Mon Nov 30 09:48:03 CST 2020
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