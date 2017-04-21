package com.qijun.basicdata.depart.pojo;

import java.util.ArrayList;
import java.util.List;

public class TBdDepartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBdDepartExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andDepartIdIsNull() {
            addCriterion("depart_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(Long value) {
            addCriterion("depart_id =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(Long value) {
            addCriterion("depart_id <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(Long value) {
            addCriterion("depart_id >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(Long value) {
            addCriterion("depart_id >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(Long value) {
            addCriterion("depart_id <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(Long value) {
            addCriterion("depart_id <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<Long> values) {
            addCriterion("depart_id in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<Long> values) {
            addCriterion("depart_id not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(Long value1, Long value2) {
            addCriterion("depart_id between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(Long value1, Long value2) {
            addCriterion("depart_id not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNull() {
            addCriterion("depart_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNotNull() {
            addCriterion("depart_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEqualTo(String value) {
            addCriterion("depart_name =", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotEqualTo(String value) {
            addCriterion("depart_name <>", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThan(String value) {
            addCriterion("depart_name >", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_name >=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThan(String value) {
            addCriterion("depart_name <", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThanOrEqualTo(String value) {
            addCriterion("depart_name <=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLike(String value) {
            addCriterion("depart_name like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotLike(String value) {
            addCriterion("depart_name not like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameIn(List<String> values) {
            addCriterion("depart_name in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotIn(List<String> values) {
            addCriterion("depart_name not in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameBetween(String value1, String value2) {
            addCriterion("depart_name between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotBetween(String value1, String value2) {
            addCriterion("depart_name not between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneIsNull() {
            addCriterion("depart_telephone is null");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneIsNotNull() {
            addCriterion("depart_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneEqualTo(String value) {
            addCriterion("depart_telephone =", value, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneNotEqualTo(String value) {
            addCriterion("depart_telephone <>", value, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneGreaterThan(String value) {
            addCriterion("depart_telephone >", value, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("depart_telephone >=", value, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneLessThan(String value) {
            addCriterion("depart_telephone <", value, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneLessThanOrEqualTo(String value) {
            addCriterion("depart_telephone <=", value, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneLike(String value) {
            addCriterion("depart_telephone like", value, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneNotLike(String value) {
            addCriterion("depart_telephone not like", value, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneIn(List<String> values) {
            addCriterion("depart_telephone in", values, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneNotIn(List<String> values) {
            addCriterion("depart_telephone not in", values, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneBetween(String value1, String value2) {
            addCriterion("depart_telephone between", value1, value2, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephoneNotBetween(String value1, String value2) {
            addCriterion("depart_telephone not between", value1, value2, "departTelephone");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2IsNull() {
            addCriterion("depart_telephone2 is null");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2IsNotNull() {
            addCriterion("depart_telephone2 is not null");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2EqualTo(String value) {
            addCriterion("depart_telephone2 =", value, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2NotEqualTo(String value) {
            addCriterion("depart_telephone2 <>", value, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2GreaterThan(String value) {
            addCriterion("depart_telephone2 >", value, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2GreaterThanOrEqualTo(String value) {
            addCriterion("depart_telephone2 >=", value, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2LessThan(String value) {
            addCriterion("depart_telephone2 <", value, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2LessThanOrEqualTo(String value) {
            addCriterion("depart_telephone2 <=", value, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2Like(String value) {
            addCriterion("depart_telephone2 like", value, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2NotLike(String value) {
            addCriterion("depart_telephone2 not like", value, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2In(List<String> values) {
            addCriterion("depart_telephone2 in", values, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2NotIn(List<String> values) {
            addCriterion("depart_telephone2 not in", values, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2Between(String value1, String value2) {
            addCriterion("depart_telephone2 between", value1, value2, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartTelephone2NotBetween(String value1, String value2) {
            addCriterion("depart_telephone2 not between", value1, value2, "departTelephone2");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionIsNull() {
            addCriterion("depart_function is null");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionIsNotNull() {
            addCriterion("depart_function is not null");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionEqualTo(String value) {
            addCriterion("depart_function =", value, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionNotEqualTo(String value) {
            addCriterion("depart_function <>", value, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionGreaterThan(String value) {
            addCriterion("depart_function >", value, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("depart_function >=", value, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionLessThan(String value) {
            addCriterion("depart_function <", value, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionLessThanOrEqualTo(String value) {
            addCriterion("depart_function <=", value, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionLike(String value) {
            addCriterion("depart_function like", value, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionNotLike(String value) {
            addCriterion("depart_function not like", value, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionIn(List<String> values) {
            addCriterion("depart_function in", values, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionNotIn(List<String> values) {
            addCriterion("depart_function not in", values, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionBetween(String value1, String value2) {
            addCriterion("depart_function between", value1, value2, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartFunctionNotBetween(String value1, String value2) {
            addCriterion("depart_function not between", value1, value2, "departFunction");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathIsNull() {
            addCriterion("depart_intruduction_file_path is null");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathIsNotNull() {
            addCriterion("depart_intruduction_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathEqualTo(String value) {
            addCriterion("depart_intruduction_file_path =", value, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathNotEqualTo(String value) {
            addCriterion("depart_intruduction_file_path <>", value, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathGreaterThan(String value) {
            addCriterion("depart_intruduction_file_path >", value, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("depart_intruduction_file_path >=", value, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathLessThan(String value) {
            addCriterion("depart_intruduction_file_path <", value, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathLessThanOrEqualTo(String value) {
            addCriterion("depart_intruduction_file_path <=", value, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathLike(String value) {
            addCriterion("depart_intruduction_file_path like", value, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathNotLike(String value) {
            addCriterion("depart_intruduction_file_path not like", value, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathIn(List<String> values) {
            addCriterion("depart_intruduction_file_path in", values, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathNotIn(List<String> values) {
            addCriterion("depart_intruduction_file_path not in", values, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathBetween(String value1, String value2) {
            addCriterion("depart_intruduction_file_path between", value1, value2, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartIntruductionFilePathNotBetween(String value1, String value2) {
            addCriterion("depart_intruduction_file_path not between", value1, value2, "departIntruductionFilePath");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdIsNull() {
            addCriterion("depart_node_attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdIsNotNull() {
            addCriterion("depart_node_attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdEqualTo(Long value) {
            addCriterion("depart_node_attribute_id =", value, "departNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdNotEqualTo(Long value) {
            addCriterion("depart_node_attribute_id <>", value, "departNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdGreaterThan(Long value) {
            addCriterion("depart_node_attribute_id >", value, "departNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("depart_node_attribute_id >=", value, "departNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdLessThan(Long value) {
            addCriterion("depart_node_attribute_id <", value, "departNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdLessThanOrEqualTo(Long value) {
            addCriterion("depart_node_attribute_id <=", value, "departNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdIn(List<Long> values) {
            addCriterion("depart_node_attribute_id in", values, "departNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdNotIn(List<Long> values) {
            addCriterion("depart_node_attribute_id not in", values, "departNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdBetween(Long value1, Long value2) {
            addCriterion("depart_node_attribute_id between", value1, value2, "departNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andDepartNodeAttributeIdNotBetween(Long value1, Long value2) {
            addCriterion("depart_node_attribute_id not between", value1, value2, "departNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andDepartNotesIsNull() {
            addCriterion("depart_notes is null");
            return (Criteria) this;
        }

        public Criteria andDepartNotesIsNotNull() {
            addCriterion("depart_notes is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNotesEqualTo(String value) {
            addCriterion("depart_notes =", value, "departNotes");
            return (Criteria) this;
        }

        public Criteria andDepartNotesNotEqualTo(String value) {
            addCriterion("depart_notes <>", value, "departNotes");
            return (Criteria) this;
        }

        public Criteria andDepartNotesGreaterThan(String value) {
            addCriterion("depart_notes >", value, "departNotes");
            return (Criteria) this;
        }

        public Criteria andDepartNotesGreaterThanOrEqualTo(String value) {
            addCriterion("depart_notes >=", value, "departNotes");
            return (Criteria) this;
        }

        public Criteria andDepartNotesLessThan(String value) {
            addCriterion("depart_notes <", value, "departNotes");
            return (Criteria) this;
        }

        public Criteria andDepartNotesLessThanOrEqualTo(String value) {
            addCriterion("depart_notes <=", value, "departNotes");
            return (Criteria) this;
        }

        public Criteria andDepartNotesLike(String value) {
            addCriterion("depart_notes like", value, "departNotes");
            return (Criteria) this;
        }

        public Criteria andDepartNotesNotLike(String value) {
            addCriterion("depart_notes not like", value, "departNotes");
            return (Criteria) this;
        }

        public Criteria andDepartNotesIn(List<String> values) {
            addCriterion("depart_notes in", values, "departNotes");
            return (Criteria) this;
        }

        public Criteria andDepartNotesNotIn(List<String> values) {
            addCriterion("depart_notes not in", values, "departNotes");
            return (Criteria) this;
        }

        public Criteria andDepartNotesBetween(String value1, String value2) {
            addCriterion("depart_notes between", value1, value2, "departNotes");
            return (Criteria) this;
        }

        public Criteria andDepartNotesNotBetween(String value1, String value2) {
            addCriterion("depart_notes not between", value1, value2, "departNotes");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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