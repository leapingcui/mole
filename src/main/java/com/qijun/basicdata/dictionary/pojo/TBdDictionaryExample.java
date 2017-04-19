package com.qijun.basicdata.dictionary.pojo;

import java.util.ArrayList;
import java.util.List;

public class TBdDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBdDictionaryExample() {
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

        public Criteria andDictionaryIdIsNull() {
            addCriterion("dictionary_id is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdIsNotNull() {
            addCriterion("dictionary_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdEqualTo(Long value) {
            addCriterion("dictionary_id =", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdNotEqualTo(Long value) {
            addCriterion("dictionary_id <>", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdGreaterThan(Long value) {
            addCriterion("dictionary_id >", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dictionary_id >=", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdLessThan(Long value) {
            addCriterion("dictionary_id <", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdLessThanOrEqualTo(Long value) {
            addCriterion("dictionary_id <=", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdIn(List<Long> values) {
            addCriterion("dictionary_id in", values, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdNotIn(List<Long> values) {
            addCriterion("dictionary_id not in", values, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdBetween(Long value1, Long value2) {
            addCriterion("dictionary_id between", value1, value2, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdNotBetween(Long value1, Long value2) {
            addCriterion("dictionary_id not between", value1, value2, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataIsNull() {
            addCriterion("dictionary_common_cata is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataIsNotNull() {
            addCriterion("dictionary_common_cata is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataEqualTo(String value) {
            addCriterion("dictionary_common_cata =", value, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataNotEqualTo(String value) {
            addCriterion("dictionary_common_cata <>", value, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataGreaterThan(String value) {
            addCriterion("dictionary_common_cata >", value, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_common_cata >=", value, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataLessThan(String value) {
            addCriterion("dictionary_common_cata <", value, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataLessThanOrEqualTo(String value) {
            addCriterion("dictionary_common_cata <=", value, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataLike(String value) {
            addCriterion("dictionary_common_cata like", value, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataNotLike(String value) {
            addCriterion("dictionary_common_cata not like", value, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataIn(List<String> values) {
            addCriterion("dictionary_common_cata in", values, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataNotIn(List<String> values) {
            addCriterion("dictionary_common_cata not in", values, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataBetween(String value1, String value2) {
            addCriterion("dictionary_common_cata between", value1, value2, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryCommonCataNotBetween(String value1, String value2) {
            addCriterion("dictionary_common_cata not between", value1, value2, "dictionaryCommonCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataIsNull() {
            addCriterion("dictionary_detail_cata is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataIsNotNull() {
            addCriterion("dictionary_detail_cata is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataEqualTo(String value) {
            addCriterion("dictionary_detail_cata =", value, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataNotEqualTo(String value) {
            addCriterion("dictionary_detail_cata <>", value, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataGreaterThan(String value) {
            addCriterion("dictionary_detail_cata >", value, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_detail_cata >=", value, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataLessThan(String value) {
            addCriterion("dictionary_detail_cata <", value, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataLessThanOrEqualTo(String value) {
            addCriterion("dictionary_detail_cata <=", value, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataLike(String value) {
            addCriterion("dictionary_detail_cata like", value, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataNotLike(String value) {
            addCriterion("dictionary_detail_cata not like", value, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataIn(List<String> values) {
            addCriterion("dictionary_detail_cata in", values, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataNotIn(List<String> values) {
            addCriterion("dictionary_detail_cata not in", values, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataBetween(String value1, String value2) {
            addCriterion("dictionary_detail_cata between", value1, value2, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCataNotBetween(String value1, String value2) {
            addCriterion("dictionary_detail_cata not between", value1, value2, "dictionaryDetailCata");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentIsNull() {
            addCriterion("dictionary_content is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentIsNotNull() {
            addCriterion("dictionary_content is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentEqualTo(String value) {
            addCriterion("dictionary_content =", value, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentNotEqualTo(String value) {
            addCriterion("dictionary_content <>", value, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentGreaterThan(String value) {
            addCriterion("dictionary_content >", value, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_content >=", value, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentLessThan(String value) {
            addCriterion("dictionary_content <", value, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentLessThanOrEqualTo(String value) {
            addCriterion("dictionary_content <=", value, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentLike(String value) {
            addCriterion("dictionary_content like", value, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentNotLike(String value) {
            addCriterion("dictionary_content not like", value, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentIn(List<String> values) {
            addCriterion("dictionary_content in", values, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentNotIn(List<String> values) {
            addCriterion("dictionary_content not in", values, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentBetween(String value1, String value2) {
            addCriterion("dictionary_content between", value1, value2, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryContentNotBetween(String value1, String value2) {
            addCriterion("dictionary_content not between", value1, value2, "dictionaryContent");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderIsNull() {
            addCriterion("dictionary_order is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderIsNotNull() {
            addCriterion("dictionary_order is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderEqualTo(Integer value) {
            addCriterion("dictionary_order =", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderNotEqualTo(Integer value) {
            addCriterion("dictionary_order <>", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderGreaterThan(Integer value) {
            addCriterion("dictionary_order >", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictionary_order >=", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderLessThan(Integer value) {
            addCriterion("dictionary_order <", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderLessThanOrEqualTo(Integer value) {
            addCriterion("dictionary_order <=", value, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderIn(List<Integer> values) {
            addCriterion("dictionary_order in", values, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderNotIn(List<Integer> values) {
            addCriterion("dictionary_order not in", values, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_order between", value1, value2, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_order not between", value1, value2, "dictionaryOrder");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesIsNull() {
            addCriterion("dictionary_notes is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesIsNotNull() {
            addCriterion("dictionary_notes is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesEqualTo(String value) {
            addCriterion("dictionary_notes =", value, "dictionaryNotes");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesNotEqualTo(String value) {
            addCriterion("dictionary_notes <>", value, "dictionaryNotes");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesGreaterThan(String value) {
            addCriterion("dictionary_notes >", value, "dictionaryNotes");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_notes >=", value, "dictionaryNotes");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesLessThan(String value) {
            addCriterion("dictionary_notes <", value, "dictionaryNotes");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesLessThanOrEqualTo(String value) {
            addCriterion("dictionary_notes <=", value, "dictionaryNotes");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesLike(String value) {
            addCriterion("dictionary_notes like", value, "dictionaryNotes");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesNotLike(String value) {
            addCriterion("dictionary_notes not like", value, "dictionaryNotes");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesIn(List<String> values) {
            addCriterion("dictionary_notes in", values, "dictionaryNotes");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesNotIn(List<String> values) {
            addCriterion("dictionary_notes not in", values, "dictionaryNotes");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesBetween(String value1, String value2) {
            addCriterion("dictionary_notes between", value1, value2, "dictionaryNotes");
            return (Criteria) this;
        }

        public Criteria andDictionaryNotesNotBetween(String value1, String value2) {
            addCriterion("dictionary_notes not between", value1, value2, "dictionaryNotes");
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