package com.qijun.basicdata.person.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TBdPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBdPersonExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTPersonIdIsNull() {
            addCriterion("t_person_id is null");
            return (Criteria) this;
        }

        public Criteria andTPersonIdIsNotNull() {
            addCriterion("t_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonIdEqualTo(String value) {
            addCriterion("t_person_id =", value, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonIdNotEqualTo(String value) {
            addCriterion("t_person_id <>", value, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonIdGreaterThan(String value) {
            addCriterion("t_person_id >", value, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_id >=", value, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonIdLessThan(String value) {
            addCriterion("t_person_id <", value, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonIdLessThanOrEqualTo(String value) {
            addCriterion("t_person_id <=", value, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonIdLike(String value) {
            addCriterion("t_person_id like", value, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonIdNotLike(String value) {
            addCriterion("t_person_id not like", value, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonIdIn(List<String> values) {
            addCriterion("t_person_id in", values, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonIdNotIn(List<String> values) {
            addCriterion("t_person_id not in", values, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonIdBetween(String value1, String value2) {
            addCriterion("t_person_id between", value1, value2, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonIdNotBetween(String value1, String value2) {
            addCriterion("t_person_id not between", value1, value2, "tPersonId");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeIsNull() {
            addCriterion("t_person_type is null");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeIsNotNull() {
            addCriterion("t_person_type is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeEqualTo(String value) {
            addCriterion("t_person_type =", value, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeNotEqualTo(String value) {
            addCriterion("t_person_type <>", value, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeGreaterThan(String value) {
            addCriterion("t_person_type >", value, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_type >=", value, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeLessThan(String value) {
            addCriterion("t_person_type <", value, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeLessThanOrEqualTo(String value) {
            addCriterion("t_person_type <=", value, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeLike(String value) {
            addCriterion("t_person_type like", value, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeNotLike(String value) {
            addCriterion("t_person_type not like", value, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeIn(List<String> values) {
            addCriterion("t_person_type in", values, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeNotIn(List<String> values) {
            addCriterion("t_person_type not in", values, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeBetween(String value1, String value2) {
            addCriterion("t_person_type between", value1, value2, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonTypeNotBetween(String value1, String value2) {
            addCriterion("t_person_type not between", value1, value2, "tPersonType");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameIsNull() {
            addCriterion("t_person_username is null");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameIsNotNull() {
            addCriterion("t_person_username is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameEqualTo(String value) {
            addCriterion("t_person_username =", value, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameNotEqualTo(String value) {
            addCriterion("t_person_username <>", value, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameGreaterThan(String value) {
            addCriterion("t_person_username >", value, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_username >=", value, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameLessThan(String value) {
            addCriterion("t_person_username <", value, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameLessThanOrEqualTo(String value) {
            addCriterion("t_person_username <=", value, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameLike(String value) {
            addCriterion("t_person_username like", value, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameNotLike(String value) {
            addCriterion("t_person_username not like", value, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameIn(List<String> values) {
            addCriterion("t_person_username in", values, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameNotIn(List<String> values) {
            addCriterion("t_person_username not in", values, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameBetween(String value1, String value2) {
            addCriterion("t_person_username between", value1, value2, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonUsernameNotBetween(String value1, String value2) {
            addCriterion("t_person_username not between", value1, value2, "tPersonUsername");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdIsNull() {
            addCriterion("t_person_pwd is null");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdIsNotNull() {
            addCriterion("t_person_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdEqualTo(String value) {
            addCriterion("t_person_pwd =", value, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdNotEqualTo(String value) {
            addCriterion("t_person_pwd <>", value, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdGreaterThan(String value) {
            addCriterion("t_person_pwd >", value, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_pwd >=", value, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdLessThan(String value) {
            addCriterion("t_person_pwd <", value, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdLessThanOrEqualTo(String value) {
            addCriterion("t_person_pwd <=", value, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdLike(String value) {
            addCriterion("t_person_pwd like", value, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdNotLike(String value) {
            addCriterion("t_person_pwd not like", value, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdIn(List<String> values) {
            addCriterion("t_person_pwd in", values, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdNotIn(List<String> values) {
            addCriterion("t_person_pwd not in", values, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdBetween(String value1, String value2) {
            addCriterion("t_person_pwd between", value1, value2, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonPwdNotBetween(String value1, String value2) {
            addCriterion("t_person_pwd not between", value1, value2, "tPersonPwd");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameIsNull() {
            addCriterion("t_person_truename is null");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameIsNotNull() {
            addCriterion("t_person_truename is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameEqualTo(String value) {
            addCriterion("t_person_truename =", value, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameNotEqualTo(String value) {
            addCriterion("t_person_truename <>", value, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameGreaterThan(String value) {
            addCriterion("t_person_truename >", value, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_truename >=", value, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameLessThan(String value) {
            addCriterion("t_person_truename <", value, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameLessThanOrEqualTo(String value) {
            addCriterion("t_person_truename <=", value, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameLike(String value) {
            addCriterion("t_person_truename like", value, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameNotLike(String value) {
            addCriterion("t_person_truename not like", value, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameIn(List<String> values) {
            addCriterion("t_person_truename in", values, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameNotIn(List<String> values) {
            addCriterion("t_person_truename not in", values, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameBetween(String value1, String value2) {
            addCriterion("t_person_truename between", value1, value2, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonTruenameNotBetween(String value1, String value2) {
            addCriterion("t_person_truename not between", value1, value2, "tPersonTruename");
            return (Criteria) this;
        }

        public Criteria andTPersonSexIsNull() {
            addCriterion("t_person_sex is null");
            return (Criteria) this;
        }

        public Criteria andTPersonSexIsNotNull() {
            addCriterion("t_person_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonSexEqualTo(String value) {
            addCriterion("t_person_sex =", value, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonSexNotEqualTo(String value) {
            addCriterion("t_person_sex <>", value, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonSexGreaterThan(String value) {
            addCriterion("t_person_sex >", value, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonSexGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_sex >=", value, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonSexLessThan(String value) {
            addCriterion("t_person_sex <", value, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonSexLessThanOrEqualTo(String value) {
            addCriterion("t_person_sex <=", value, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonSexLike(String value) {
            addCriterion("t_person_sex like", value, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonSexNotLike(String value) {
            addCriterion("t_person_sex not like", value, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonSexIn(List<String> values) {
            addCriterion("t_person_sex in", values, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonSexNotIn(List<String> values) {
            addCriterion("t_person_sex not in", values, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonSexBetween(String value1, String value2) {
            addCriterion("t_person_sex between", value1, value2, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonSexNotBetween(String value1, String value2) {
            addCriterion("t_person_sex not between", value1, value2, "tPersonSex");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameIsNull() {
            addCriterion("t_person_en_name is null");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameIsNotNull() {
            addCriterion("t_person_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameEqualTo(String value) {
            addCriterion("t_person_en_name =", value, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameNotEqualTo(String value) {
            addCriterion("t_person_en_name <>", value, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameGreaterThan(String value) {
            addCriterion("t_person_en_name >", value, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_en_name >=", value, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameLessThan(String value) {
            addCriterion("t_person_en_name <", value, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameLessThanOrEqualTo(String value) {
            addCriterion("t_person_en_name <=", value, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameLike(String value) {
            addCriterion("t_person_en_name like", value, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameNotLike(String value) {
            addCriterion("t_person_en_name not like", value, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameIn(List<String> values) {
            addCriterion("t_person_en_name in", values, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameNotIn(List<String> values) {
            addCriterion("t_person_en_name not in", values, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameBetween(String value1, String value2) {
            addCriterion("t_person_en_name between", value1, value2, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonEnNameNotBetween(String value1, String value2) {
            addCriterion("t_person_en_name not between", value1, value2, "tPersonEnName");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedIsNull() {
            addCriterion("t_person_name_used is null");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedIsNotNull() {
            addCriterion("t_person_name_used is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedEqualTo(String value) {
            addCriterion("t_person_name_used =", value, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedNotEqualTo(String value) {
            addCriterion("t_person_name_used <>", value, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedGreaterThan(String value) {
            addCriterion("t_person_name_used >", value, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_name_used >=", value, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedLessThan(String value) {
            addCriterion("t_person_name_used <", value, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedLessThanOrEqualTo(String value) {
            addCriterion("t_person_name_used <=", value, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedLike(String value) {
            addCriterion("t_person_name_used like", value, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedNotLike(String value) {
            addCriterion("t_person_name_used not like", value, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedIn(List<String> values) {
            addCriterion("t_person_name_used in", values, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedNotIn(List<String> values) {
            addCriterion("t_person_name_used not in", values, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedBetween(String value1, String value2) {
            addCriterion("t_person_name_used between", value1, value2, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonNameUsedNotBetween(String value1, String value2) {
            addCriterion("t_person_name_used not between", value1, value2, "tPersonNameUsed");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneIsNull() {
            addCriterion("t_person_telephone is null");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneIsNotNull() {
            addCriterion("t_person_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneEqualTo(String value) {
            addCriterion("t_person_telephone =", value, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneNotEqualTo(String value) {
            addCriterion("t_person_telephone <>", value, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneGreaterThan(String value) {
            addCriterion("t_person_telephone >", value, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_telephone >=", value, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneLessThan(String value) {
            addCriterion("t_person_telephone <", value, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneLessThanOrEqualTo(String value) {
            addCriterion("t_person_telephone <=", value, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneLike(String value) {
            addCriterion("t_person_telephone like", value, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneNotLike(String value) {
            addCriterion("t_person_telephone not like", value, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneIn(List<String> values) {
            addCriterion("t_person_telephone in", values, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneNotIn(List<String> values) {
            addCriterion("t_person_telephone not in", values, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneBetween(String value1, String value2) {
            addCriterion("t_person_telephone between", value1, value2, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonTelephoneNotBetween(String value1, String value2) {
            addCriterion("t_person_telephone not between", value1, value2, "tPersonTelephone");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxIsNull() {
            addCriterion("t_person_fax is null");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxIsNotNull() {
            addCriterion("t_person_fax is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxEqualTo(String value) {
            addCriterion("t_person_fax =", value, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxNotEqualTo(String value) {
            addCriterion("t_person_fax <>", value, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxGreaterThan(String value) {
            addCriterion("t_person_fax >", value, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_fax >=", value, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxLessThan(String value) {
            addCriterion("t_person_fax <", value, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxLessThanOrEqualTo(String value) {
            addCriterion("t_person_fax <=", value, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxLike(String value) {
            addCriterion("t_person_fax like", value, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxNotLike(String value) {
            addCriterion("t_person_fax not like", value, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxIn(List<String> values) {
            addCriterion("t_person_fax in", values, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxNotIn(List<String> values) {
            addCriterion("t_person_fax not in", values, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxBetween(String value1, String value2) {
            addCriterion("t_person_fax between", value1, value2, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonFaxNotBetween(String value1, String value2) {
            addCriterion("t_person_fax not between", value1, value2, "tPersonFax");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrIsNull() {
            addCriterion("t_person_addr is null");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrIsNotNull() {
            addCriterion("t_person_addr is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrEqualTo(String value) {
            addCriterion("t_person_addr =", value, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrNotEqualTo(String value) {
            addCriterion("t_person_addr <>", value, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrGreaterThan(String value) {
            addCriterion("t_person_addr >", value, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_addr >=", value, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrLessThan(String value) {
            addCriterion("t_person_addr <", value, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrLessThanOrEqualTo(String value) {
            addCriterion("t_person_addr <=", value, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrLike(String value) {
            addCriterion("t_person_addr like", value, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrNotLike(String value) {
            addCriterion("t_person_addr not like", value, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrIn(List<String> values) {
            addCriterion("t_person_addr in", values, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrNotIn(List<String> values) {
            addCriterion("t_person_addr not in", values, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrBetween(String value1, String value2) {
            addCriterion("t_person_addr between", value1, value2, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonAddrNotBetween(String value1, String value2) {
            addCriterion("t_person_addr not between", value1, value2, "tPersonAddr");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneIsNull() {
            addCriterion("t_person_mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneIsNotNull() {
            addCriterion("t_person_mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneEqualTo(String value) {
            addCriterion("t_person_mobilephone =", value, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneNotEqualTo(String value) {
            addCriterion("t_person_mobilephone <>", value, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneGreaterThan(String value) {
            addCriterion("t_person_mobilephone >", value, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_mobilephone >=", value, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneLessThan(String value) {
            addCriterion("t_person_mobilephone <", value, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("t_person_mobilephone <=", value, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneLike(String value) {
            addCriterion("t_person_mobilephone like", value, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneNotLike(String value) {
            addCriterion("t_person_mobilephone not like", value, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneIn(List<String> values) {
            addCriterion("t_person_mobilephone in", values, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneNotIn(List<String> values) {
            addCriterion("t_person_mobilephone not in", values, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneBetween(String value1, String value2) {
            addCriterion("t_person_mobilephone between", value1, value2, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonMobilephoneNotBetween(String value1, String value2) {
            addCriterion("t_person_mobilephone not between", value1, value2, "tPersonMobilephone");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailIsNull() {
            addCriterion("t_person_email is null");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailIsNotNull() {
            addCriterion("t_person_email is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailEqualTo(String value) {
            addCriterion("t_person_email =", value, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailNotEqualTo(String value) {
            addCriterion("t_person_email <>", value, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailGreaterThan(String value) {
            addCriterion("t_person_email >", value, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_email >=", value, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailLessThan(String value) {
            addCriterion("t_person_email <", value, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailLessThanOrEqualTo(String value) {
            addCriterion("t_person_email <=", value, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailLike(String value) {
            addCriterion("t_person_email like", value, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailNotLike(String value) {
            addCriterion("t_person_email not like", value, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailIn(List<String> values) {
            addCriterion("t_person_email in", values, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailNotIn(List<String> values) {
            addCriterion("t_person_email not in", values, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailBetween(String value1, String value2) {
            addCriterion("t_person_email between", value1, value2, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonEmailNotBetween(String value1, String value2) {
            addCriterion("t_person_email not between", value1, value2, "tPersonEmail");
            return (Criteria) this;
        }

        public Criteria andTPersonQqIsNull() {
            addCriterion("t_person_qq is null");
            return (Criteria) this;
        }

        public Criteria andTPersonQqIsNotNull() {
            addCriterion("t_person_qq is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonQqEqualTo(String value) {
            addCriterion("t_person_qq =", value, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonQqNotEqualTo(String value) {
            addCriterion("t_person_qq <>", value, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonQqGreaterThan(String value) {
            addCriterion("t_person_qq >", value, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonQqGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_qq >=", value, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonQqLessThan(String value) {
            addCriterion("t_person_qq <", value, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonQqLessThanOrEqualTo(String value) {
            addCriterion("t_person_qq <=", value, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonQqLike(String value) {
            addCriterion("t_person_qq like", value, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonQqNotLike(String value) {
            addCriterion("t_person_qq not like", value, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonQqIn(List<String> values) {
            addCriterion("t_person_qq in", values, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonQqNotIn(List<String> values) {
            addCriterion("t_person_qq not in", values, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonQqBetween(String value1, String value2) {
            addCriterion("t_person_qq between", value1, value2, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonQqNotBetween(String value1, String value2) {
            addCriterion("t_person_qq not between", value1, value2, "tPersonQq");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatIsNull() {
            addCriterion("t_person_wetchat is null");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatIsNotNull() {
            addCriterion("t_person_wetchat is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatEqualTo(String value) {
            addCriterion("t_person_wetchat =", value, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatNotEqualTo(String value) {
            addCriterion("t_person_wetchat <>", value, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatGreaterThan(String value) {
            addCriterion("t_person_wetchat >", value, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_wetchat >=", value, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatLessThan(String value) {
            addCriterion("t_person_wetchat <", value, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatLessThanOrEqualTo(String value) {
            addCriterion("t_person_wetchat <=", value, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatLike(String value) {
            addCriterion("t_person_wetchat like", value, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatNotLike(String value) {
            addCriterion("t_person_wetchat not like", value, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatIn(List<String> values) {
            addCriterion("t_person_wetchat in", values, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatNotIn(List<String> values) {
            addCriterion("t_person_wetchat not in", values, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatBetween(String value1, String value2) {
            addCriterion("t_person_wetchat between", value1, value2, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonWetchatNotBetween(String value1, String value2) {
            addCriterion("t_person_wetchat not between", value1, value2, "tPersonWetchat");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyIsNull() {
            addCriterion("t_person_duty is null");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyIsNotNull() {
            addCriterion("t_person_duty is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyEqualTo(String value) {
            addCriterion("t_person_duty =", value, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyNotEqualTo(String value) {
            addCriterion("t_person_duty <>", value, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyGreaterThan(String value) {
            addCriterion("t_person_duty >", value, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_duty >=", value, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyLessThan(String value) {
            addCriterion("t_person_duty <", value, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyLessThanOrEqualTo(String value) {
            addCriterion("t_person_duty <=", value, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyLike(String value) {
            addCriterion("t_person_duty like", value, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyNotLike(String value) {
            addCriterion("t_person_duty not like", value, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyIn(List<String> values) {
            addCriterion("t_person_duty in", values, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyNotIn(List<String> values) {
            addCriterion("t_person_duty not in", values, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyBetween(String value1, String value2) {
            addCriterion("t_person_duty between", value1, value2, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonDutyNotBetween(String value1, String value2) {
            addCriterion("t_person_duty not between", value1, value2, "tPersonDuty");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleIsNull() {
            addCriterion("t_person_title is null");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleIsNotNull() {
            addCriterion("t_person_title is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleEqualTo(String value) {
            addCriterion("t_person_title =", value, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleNotEqualTo(String value) {
            addCriterion("t_person_title <>", value, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleGreaterThan(String value) {
            addCriterion("t_person_title >", value, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_title >=", value, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleLessThan(String value) {
            addCriterion("t_person_title <", value, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleLessThanOrEqualTo(String value) {
            addCriterion("t_person_title <=", value, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleLike(String value) {
            addCriterion("t_person_title like", value, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleNotLike(String value) {
            addCriterion("t_person_title not like", value, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleIn(List<String> values) {
            addCriterion("t_person_title in", values, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleNotIn(List<String> values) {
            addCriterion("t_person_title not in", values, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleBetween(String value1, String value2) {
            addCriterion("t_person_title between", value1, value2, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonTitleNotBetween(String value1, String value2) {
            addCriterion("t_person_title not between", value1, value2, "tPersonTitle");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumIsNull() {
            addCriterion("t_person_identify_num is null");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumIsNotNull() {
            addCriterion("t_person_identify_num is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumEqualTo(String value) {
            addCriterion("t_person_identify_num =", value, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumNotEqualTo(String value) {
            addCriterion("t_person_identify_num <>", value, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumGreaterThan(String value) {
            addCriterion("t_person_identify_num >", value, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_identify_num >=", value, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumLessThan(String value) {
            addCriterion("t_person_identify_num <", value, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumLessThanOrEqualTo(String value) {
            addCriterion("t_person_identify_num <=", value, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumLike(String value) {
            addCriterion("t_person_identify_num like", value, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumNotLike(String value) {
            addCriterion("t_person_identify_num not like", value, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumIn(List<String> values) {
            addCriterion("t_person_identify_num in", values, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumNotIn(List<String> values) {
            addCriterion("t_person_identify_num not in", values, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumBetween(String value1, String value2) {
            addCriterion("t_person_identify_num between", value1, value2, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonIdentifyNumNotBetween(String value1, String value2) {
            addCriterion("t_person_identify_num not between", value1, value2, "tPersonIdentifyNum");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthIsNull() {
            addCriterion("t_person_birth is null");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthIsNotNull() {
            addCriterion("t_person_birth is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_birth =", value, "tPersonBirth");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_birth <>", value, "tPersonBirth");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("t_person_birth >", value, "tPersonBirth");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_birth >=", value, "tPersonBirth");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthLessThan(Date value) {
            addCriterionForJDBCDate("t_person_birth <", value, "tPersonBirth");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_birth <=", value, "tPersonBirth");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthIn(List<Date> values) {
            addCriterionForJDBCDate("t_person_birth in", values, "tPersonBirth");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("t_person_birth not in", values, "tPersonBirth");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_person_birth between", value1, value2, "tPersonBirth");
            return (Criteria) this;
        }

        public Criteria andTPersonBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_person_birth not between", value1, value2, "tPersonBirth");
            return (Criteria) this;
        }

        public Criteria andTPersonNationIsNull() {
            addCriterion("t_person_nation is null");
            return (Criteria) this;
        }

        public Criteria andTPersonNationIsNotNull() {
            addCriterion("t_person_nation is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonNationEqualTo(String value) {
            addCriterion("t_person_nation =", value, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonNationNotEqualTo(String value) {
            addCriterion("t_person_nation <>", value, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonNationGreaterThan(String value) {
            addCriterion("t_person_nation >", value, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonNationGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_nation >=", value, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonNationLessThan(String value) {
            addCriterion("t_person_nation <", value, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonNationLessThanOrEqualTo(String value) {
            addCriterion("t_person_nation <=", value, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonNationLike(String value) {
            addCriterion("t_person_nation like", value, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonNationNotLike(String value) {
            addCriterion("t_person_nation not like", value, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonNationIn(List<String> values) {
            addCriterion("t_person_nation in", values, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonNationNotIn(List<String> values) {
            addCriterion("t_person_nation not in", values, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonNationBetween(String value1, String value2) {
            addCriterion("t_person_nation between", value1, value2, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonNationNotBetween(String value1, String value2) {
            addCriterion("t_person_nation not between", value1, value2, "tPersonNation");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeIsNull() {
            addCriterion("t_person_highest_degree is null");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeIsNotNull() {
            addCriterion("t_person_highest_degree is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeEqualTo(String value) {
            addCriterion("t_person_highest_degree =", value, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeNotEqualTo(String value) {
            addCriterion("t_person_highest_degree <>", value, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeGreaterThan(String value) {
            addCriterion("t_person_highest_degree >", value, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_highest_degree >=", value, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeLessThan(String value) {
            addCriterion("t_person_highest_degree <", value, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeLessThanOrEqualTo(String value) {
            addCriterion("t_person_highest_degree <=", value, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeLike(String value) {
            addCriterion("t_person_highest_degree like", value, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeNotLike(String value) {
            addCriterion("t_person_highest_degree not like", value, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeIn(List<String> values) {
            addCriterion("t_person_highest_degree in", values, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeNotIn(List<String> values) {
            addCriterion("t_person_highest_degree not in", values, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeBetween(String value1, String value2) {
            addCriterion("t_person_highest_degree between", value1, value2, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonHighestDegreeNotBetween(String value1, String value2) {
            addCriterion("t_person_highest_degree not between", value1, value2, "tPersonHighestDegree");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusIsNull() {
            addCriterion("t_person_politics_status is null");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusIsNotNull() {
            addCriterion("t_person_politics_status is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusEqualTo(String value) {
            addCriterion("t_person_politics_status =", value, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusNotEqualTo(String value) {
            addCriterion("t_person_politics_status <>", value, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusGreaterThan(String value) {
            addCriterion("t_person_politics_status >", value, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_politics_status >=", value, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusLessThan(String value) {
            addCriterion("t_person_politics_status <", value, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusLessThanOrEqualTo(String value) {
            addCriterion("t_person_politics_status <=", value, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusLike(String value) {
            addCriterion("t_person_politics_status like", value, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusNotLike(String value) {
            addCriterion("t_person_politics_status not like", value, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusIn(List<String> values) {
            addCriterion("t_person_politics_status in", values, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusNotIn(List<String> values) {
            addCriterion("t_person_politics_status not in", values, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusBetween(String value1, String value2) {
            addCriterion("t_person_politics_status between", value1, value2, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonPoliticsStatusNotBetween(String value1, String value2) {
            addCriterion("t_person_politics_status not between", value1, value2, "tPersonPoliticsStatus");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateIsNull() {
            addCriterion("t_person_take_job_date is null");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateIsNotNull() {
            addCriterion("t_person_take_job_date is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_take_job_date =", value, "tPersonTakeJobDate");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_take_job_date <>", value, "tPersonTakeJobDate");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateGreaterThan(Date value) {
            addCriterionForJDBCDate("t_person_take_job_date >", value, "tPersonTakeJobDate");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_take_job_date >=", value, "tPersonTakeJobDate");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateLessThan(Date value) {
            addCriterionForJDBCDate("t_person_take_job_date <", value, "tPersonTakeJobDate");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_take_job_date <=", value, "tPersonTakeJobDate");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateIn(List<Date> values) {
            addCriterionForJDBCDate("t_person_take_job_date in", values, "tPersonTakeJobDate");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("t_person_take_job_date not in", values, "tPersonTakeJobDate");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_person_take_job_date between", value1, value2, "tPersonTakeJobDate");
            return (Criteria) this;
        }

        public Criteria andTPersonTakeJobDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_person_take_job_date not between", value1, value2, "tPersonTakeJobDate");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateIsNull() {
            addCriterion("t_person_join_work_date is null");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateIsNotNull() {
            addCriterion("t_person_join_work_date is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_join_work_date =", value, "tPersonJoinWorkDate");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_join_work_date <>", value, "tPersonJoinWorkDate");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("t_person_join_work_date >", value, "tPersonJoinWorkDate");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_join_work_date >=", value, "tPersonJoinWorkDate");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateLessThan(Date value) {
            addCriterionForJDBCDate("t_person_join_work_date <", value, "tPersonJoinWorkDate");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_person_join_work_date <=", value, "tPersonJoinWorkDate");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateIn(List<Date> values) {
            addCriterionForJDBCDate("t_person_join_work_date in", values, "tPersonJoinWorkDate");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("t_person_join_work_date not in", values, "tPersonJoinWorkDate");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_person_join_work_date between", value1, value2, "tPersonJoinWorkDate");
            return (Criteria) this;
        }

        public Criteria andTPersonJoinWorkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_person_join_work_date not between", value1, value2, "tPersonJoinWorkDate");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayIsNull() {
            addCriterion("t_person_hobbay is null");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayIsNotNull() {
            addCriterion("t_person_hobbay is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayEqualTo(String value) {
            addCriterion("t_person_hobbay =", value, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayNotEqualTo(String value) {
            addCriterion("t_person_hobbay <>", value, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayGreaterThan(String value) {
            addCriterion("t_person_hobbay >", value, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_hobbay >=", value, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayLessThan(String value) {
            addCriterion("t_person_hobbay <", value, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayLessThanOrEqualTo(String value) {
            addCriterion("t_person_hobbay <=", value, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayLike(String value) {
            addCriterion("t_person_hobbay like", value, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayNotLike(String value) {
            addCriterion("t_person_hobbay not like", value, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayIn(List<String> values) {
            addCriterion("t_person_hobbay in", values, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayNotIn(List<String> values) {
            addCriterion("t_person_hobbay not in", values, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayBetween(String value1, String value2) {
            addCriterion("t_person_hobbay between", value1, value2, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonHobbayNotBetween(String value1, String value2) {
            addCriterion("t_person_hobbay not between", value1, value2, "tPersonHobbay");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdIsNull() {
            addCriterion("t_person_node_attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdIsNotNull() {
            addCriterion("t_person_node_attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdEqualTo(Long value) {
            addCriterion("t_person_node_attribute_id =", value, "tPersonNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdNotEqualTo(Long value) {
            addCriterion("t_person_node_attribute_id <>", value, "tPersonNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdGreaterThan(Long value) {
            addCriterion("t_person_node_attribute_id >", value, "tPersonNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_person_node_attribute_id >=", value, "tPersonNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdLessThan(Long value) {
            addCriterion("t_person_node_attribute_id <", value, "tPersonNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdLessThanOrEqualTo(Long value) {
            addCriterion("t_person_node_attribute_id <=", value, "tPersonNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdIn(List<Long> values) {
            addCriterion("t_person_node_attribute_id in", values, "tPersonNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdNotIn(List<Long> values) {
            addCriterion("t_person_node_attribute_id not in", values, "tPersonNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdBetween(Long value1, Long value2) {
            addCriterion("t_person_node_attribute_id between", value1, value2, "tPersonNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andTPersonNodeAttributeIdNotBetween(Long value1, Long value2) {
            addCriterion("t_person_node_attribute_id not between", value1, value2, "tPersonNodeAttributeId");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesIsNull() {
            addCriterion("t_person_notes is null");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesIsNotNull() {
            addCriterion("t_person_notes is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesEqualTo(String value) {
            addCriterion("t_person_notes =", value, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesNotEqualTo(String value) {
            addCriterion("t_person_notes <>", value, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesGreaterThan(String value) {
            addCriterion("t_person_notes >", value, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesGreaterThanOrEqualTo(String value) {
            addCriterion("t_person_notes >=", value, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesLessThan(String value) {
            addCriterion("t_person_notes <", value, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesLessThanOrEqualTo(String value) {
            addCriterion("t_person_notes <=", value, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesLike(String value) {
            addCriterion("t_person_notes like", value, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesNotLike(String value) {
            addCriterion("t_person_notes not like", value, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesIn(List<String> values) {
            addCriterion("t_person_notes in", values, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesNotIn(List<String> values) {
            addCriterion("t_person_notes not in", values, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesBetween(String value1, String value2) {
            addCriterion("t_person_notes between", value1, value2, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonNotesNotBetween(String value1, String value2) {
            addCriterion("t_person_notes not between", value1, value2, "tPersonNotes");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdIsNull() {
            addCriterion("t_person_depart_id is null");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdIsNotNull() {
            addCriterion("t_person_depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdEqualTo(Long value) {
            addCriterion("t_person_depart_id =", value, "tPersonDepartId");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdNotEqualTo(Long value) {
            addCriterion("t_person_depart_id <>", value, "tPersonDepartId");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdGreaterThan(Long value) {
            addCriterion("t_person_depart_id >", value, "tPersonDepartId");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_person_depart_id >=", value, "tPersonDepartId");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdLessThan(Long value) {
            addCriterion("t_person_depart_id <", value, "tPersonDepartId");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdLessThanOrEqualTo(Long value) {
            addCriterion("t_person_depart_id <=", value, "tPersonDepartId");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdIn(List<Long> values) {
            addCriterion("t_person_depart_id in", values, "tPersonDepartId");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdNotIn(List<Long> values) {
            addCriterion("t_person_depart_id not in", values, "tPersonDepartId");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdBetween(Long value1, Long value2) {
            addCriterion("t_person_depart_id between", value1, value2, "tPersonDepartId");
            return (Criteria) this;
        }

        public Criteria andTPersonDepartIdNotBetween(Long value1, Long value2) {
            addCriterion("t_person_depart_id not between", value1, value2, "tPersonDepartId");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdIsNull() {
            addCriterion("t_person_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdIsNotNull() {
            addCriterion("t_person_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdEqualTo(Long value) {
            addCriterion("t_person_unit_id =", value, "tPersonUnitId");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdNotEqualTo(Long value) {
            addCriterion("t_person_unit_id <>", value, "tPersonUnitId");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdGreaterThan(Long value) {
            addCriterion("t_person_unit_id >", value, "tPersonUnitId");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_person_unit_id >=", value, "tPersonUnitId");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdLessThan(Long value) {
            addCriterion("t_person_unit_id <", value, "tPersonUnitId");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdLessThanOrEqualTo(Long value) {
            addCriterion("t_person_unit_id <=", value, "tPersonUnitId");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdIn(List<Long> values) {
            addCriterion("t_person_unit_id in", values, "tPersonUnitId");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdNotIn(List<Long> values) {
            addCriterion("t_person_unit_id not in", values, "tPersonUnitId");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdBetween(Long value1, Long value2) {
            addCriterion("t_person_unit_id between", value1, value2, "tPersonUnitId");
            return (Criteria) this;
        }

        public Criteria andTPersonUnitIdNotBetween(Long value1, Long value2) {
            addCriterion("t_person_unit_id not between", value1, value2, "tPersonUnitId");
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