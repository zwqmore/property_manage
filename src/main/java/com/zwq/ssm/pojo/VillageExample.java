package com.zwq.ssm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VillageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VillageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVillagenameIsNull() {
            addCriterion("villageName is null");
            return (Criteria) this;
        }

        public Criteria andVillagenameIsNotNull() {
            addCriterion("villageName is not null");
            return (Criteria) this;
        }

        public Criteria andVillagenameEqualTo(String value) {
            addCriterion("villageName =", value, "villagename");
            return (Criteria) this;
        }

        public Criteria andVillagenameNotEqualTo(String value) {
            addCriterion("villageName <>", value, "villagename");
            return (Criteria) this;
        }

        public Criteria andVillagenameGreaterThan(String value) {
            addCriterion("villageName >", value, "villagename");
            return (Criteria) this;
        }

        public Criteria andVillagenameGreaterThanOrEqualTo(String value) {
            addCriterion("villageName >=", value, "villagename");
            return (Criteria) this;
        }

        public Criteria andVillagenameLessThan(String value) {
            addCriterion("villageName <", value, "villagename");
            return (Criteria) this;
        }

        public Criteria andVillagenameLessThanOrEqualTo(String value) {
            addCriterion("villageName <=", value, "villagename");
            return (Criteria) this;
        }

        public Criteria andVillagenameLike(String value) {
            addCriterion("villageName like", value, "villagename");
            return (Criteria) this;
        }

        public Criteria andVillagenameNotLike(String value) {
            addCriterion("villageName not like", value, "villagename");
            return (Criteria) this;
        }

        public Criteria andVillagenameIn(List<String> values) {
            addCriterion("villageName in", values, "villagename");
            return (Criteria) this;
        }

        public Criteria andVillagenameNotIn(List<String> values) {
            addCriterion("villageName not in", values, "villagename");
            return (Criteria) this;
        }

        public Criteria andVillagenameBetween(String value1, String value2) {
            addCriterion("villageName between", value1, value2, "villagename");
            return (Criteria) this;
        }

        public Criteria andVillagenameNotBetween(String value1, String value2) {
            addCriterion("villageName not between", value1, value2, "villagename");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityId is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityId is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Integer value) {
            addCriterion("cityId =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Integer value) {
            addCriterion("cityId <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Integer value) {
            addCriterion("cityId >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cityId >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Integer value) {
            addCriterion("cityId <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Integer value) {
            addCriterion("cityId <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Integer> values) {
            addCriterion("cityId in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Integer> values) {
            addCriterion("cityId not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Integer value1, Integer value2) {
            addCriterion("cityId between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Integer value1, Integer value2) {
            addCriterion("cityId not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("cityName is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("cityName is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("cityName =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("cityName <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("cityName >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("cityName >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("cityName <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("cityName <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("cityName like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("cityName not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("cityName in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("cityName not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("cityName between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("cityName not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCountyidIsNull() {
            addCriterion("countyId is null");
            return (Criteria) this;
        }

        public Criteria andCountyidIsNotNull() {
            addCriterion("countyId is not null");
            return (Criteria) this;
        }

        public Criteria andCountyidEqualTo(Integer value) {
            addCriterion("countyId =", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotEqualTo(Integer value) {
            addCriterion("countyId <>", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThan(Integer value) {
            addCriterion("countyId >", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("countyId >=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThan(Integer value) {
            addCriterion("countyId <", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThanOrEqualTo(Integer value) {
            addCriterion("countyId <=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidIn(List<Integer> values) {
            addCriterion("countyId in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotIn(List<Integer> values) {
            addCriterion("countyId not in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidBetween(Integer value1, Integer value2) {
            addCriterion("countyId between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotBetween(Integer value1, Integer value2) {
            addCriterion("countyId not between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountynameIsNull() {
            addCriterion("countyName is null");
            return (Criteria) this;
        }

        public Criteria andCountynameIsNotNull() {
            addCriterion("countyName is not null");
            return (Criteria) this;
        }

        public Criteria andCountynameEqualTo(String value) {
            addCriterion("countyName =", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotEqualTo(String value) {
            addCriterion("countyName <>", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameGreaterThan(String value) {
            addCriterion("countyName >", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameGreaterThanOrEqualTo(String value) {
            addCriterion("countyName >=", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameLessThan(String value) {
            addCriterion("countyName <", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameLessThanOrEqualTo(String value) {
            addCriterion("countyName <=", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameLike(String value) {
            addCriterion("countyName like", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotLike(String value) {
            addCriterion("countyName not like", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameIn(List<String> values) {
            addCriterion("countyName in", values, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotIn(List<String> values) {
            addCriterion("countyName not in", values, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameBetween(String value1, String value2) {
            addCriterion("countyName between", value1, value2, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotBetween(String value1, String value2) {
            addCriterion("countyName not between", value1, value2, "countyname");
            return (Criteria) this;
        }

        public Criteria andStreetidIsNull() {
            addCriterion("streetId is null");
            return (Criteria) this;
        }

        public Criteria andStreetidIsNotNull() {
            addCriterion("streetId is not null");
            return (Criteria) this;
        }

        public Criteria andStreetidEqualTo(Integer value) {
            addCriterion("streetId =", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidNotEqualTo(Integer value) {
            addCriterion("streetId <>", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidGreaterThan(Integer value) {
            addCriterion("streetId >", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("streetId >=", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidLessThan(Integer value) {
            addCriterion("streetId <", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidLessThanOrEqualTo(Integer value) {
            addCriterion("streetId <=", value, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidIn(List<Integer> values) {
            addCriterion("streetId in", values, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidNotIn(List<Integer> values) {
            addCriterion("streetId not in", values, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidBetween(Integer value1, Integer value2) {
            addCriterion("streetId between", value1, value2, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetidNotBetween(Integer value1, Integer value2) {
            addCriterion("streetId not between", value1, value2, "streetid");
            return (Criteria) this;
        }

        public Criteria andStreetnameIsNull() {
            addCriterion("streetName is null");
            return (Criteria) this;
        }

        public Criteria andStreetnameIsNotNull() {
            addCriterion("streetName is not null");
            return (Criteria) this;
        }

        public Criteria andStreetnameEqualTo(String value) {
            addCriterion("streetName =", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameNotEqualTo(String value) {
            addCriterion("streetName <>", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameGreaterThan(String value) {
            addCriterion("streetName >", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameGreaterThanOrEqualTo(String value) {
            addCriterion("streetName >=", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameLessThan(String value) {
            addCriterion("streetName <", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameLessThanOrEqualTo(String value) {
            addCriterion("streetName <=", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameLike(String value) {
            addCriterion("streetName like", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameNotLike(String value) {
            addCriterion("streetName not like", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameIn(List<String> values) {
            addCriterion("streetName in", values, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameNotIn(List<String> values) {
            addCriterion("streetName not in", values, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameBetween(String value1, String value2) {
            addCriterion("streetName between", value1, value2, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameNotBetween(String value1, String value2) {
            addCriterion("streetName not between", value1, value2, "streetname");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andVsIsNull() {
            addCriterion("vs is null");
            return (Criteria) this;
        }

        public Criteria andVsIsNotNull() {
            addCriterion("vs is not null");
            return (Criteria) this;
        }

        public Criteria andVsEqualTo(Byte value) {
            addCriterion("vs =", value, "vs");
            return (Criteria) this;
        }

        public Criteria andVsNotEqualTo(Byte value) {
            addCriterion("vs <>", value, "vs");
            return (Criteria) this;
        }

        public Criteria andVsGreaterThan(Byte value) {
            addCriterion("vs >", value, "vs");
            return (Criteria) this;
        }

        public Criteria andVsGreaterThanOrEqualTo(Byte value) {
            addCriterion("vs >=", value, "vs");
            return (Criteria) this;
        }

        public Criteria andVsLessThan(Byte value) {
            addCriterion("vs <", value, "vs");
            return (Criteria) this;
        }

        public Criteria andVsLessThanOrEqualTo(Byte value) {
            addCriterion("vs <=", value, "vs");
            return (Criteria) this;
        }

        public Criteria andVsIn(List<Byte> values) {
            addCriterion("vs in", values, "vs");
            return (Criteria) this;
        }

        public Criteria andVsNotIn(List<Byte> values) {
            addCriterion("vs not in", values, "vs");
            return (Criteria) this;
        }

        public Criteria andVsBetween(Byte value1, Byte value2) {
            addCriterion("vs between", value1, value2, "vs");
            return (Criteria) this;
        }

        public Criteria andVsNotBetween(Byte value1, Byte value2) {
            addCriterion("vs not between", value1, value2, "vs");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andTuseridIsNull() {
            addCriterion("tuserId is null");
            return (Criteria) this;
        }

        public Criteria andTuseridIsNotNull() {
            addCriterion("tuserId is not null");
            return (Criteria) this;
        }

        public Criteria andTuseridEqualTo(Integer value) {
            addCriterion("tuserId =", value, "tuserid");
            return (Criteria) this;
        }

        public Criteria andTuseridNotEqualTo(Integer value) {
            addCriterion("tuserId <>", value, "tuserid");
            return (Criteria) this;
        }

        public Criteria andTuseridGreaterThan(Integer value) {
            addCriterion("tuserId >", value, "tuserid");
            return (Criteria) this;
        }

        public Criteria andTuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuserId >=", value, "tuserid");
            return (Criteria) this;
        }

        public Criteria andTuseridLessThan(Integer value) {
            addCriterion("tuserId <", value, "tuserid");
            return (Criteria) this;
        }

        public Criteria andTuseridLessThanOrEqualTo(Integer value) {
            addCriterion("tuserId <=", value, "tuserid");
            return (Criteria) this;
        }

        public Criteria andTuseridIn(List<Integer> values) {
            addCriterion("tuserId in", values, "tuserid");
            return (Criteria) this;
        }

        public Criteria andTuseridNotIn(List<Integer> values) {
            addCriterion("tuserId not in", values, "tuserid");
            return (Criteria) this;
        }

        public Criteria andTuseridBetween(Integer value1, Integer value2) {
            addCriterion("tuserId between", value1, value2, "tuserid");
            return (Criteria) this;
        }

        public Criteria andTuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("tuserId not between", value1, value2, "tuserid");
            return (Criteria) this;
        }

        public Criteria andStateidIsNull() {
            addCriterion("stateId is null");
            return (Criteria) this;
        }

        public Criteria andStateidIsNotNull() {
            addCriterion("stateId is not null");
            return (Criteria) this;
        }

        public Criteria andStateidEqualTo(Integer value) {
            addCriterion("stateId =", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotEqualTo(Integer value) {
            addCriterion("stateId <>", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThan(Integer value) {
            addCriterion("stateId >", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stateId >=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThan(Integer value) {
            addCriterion("stateId <", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThanOrEqualTo(Integer value) {
            addCriterion("stateId <=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidIn(List<Integer> values) {
            addCriterion("stateId in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotIn(List<Integer> values) {
            addCriterion("stateId not in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidBetween(Integer value1, Integer value2) {
            addCriterion("stateId between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotBetween(Integer value1, Integer value2) {
            addCriterion("stateId not between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStatenameIsNull() {
            addCriterion("stateName is null");
            return (Criteria) this;
        }

        public Criteria andStatenameIsNotNull() {
            addCriterion("stateName is not null");
            return (Criteria) this;
        }

        public Criteria andStatenameEqualTo(String value) {
            addCriterion("stateName =", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotEqualTo(String value) {
            addCriterion("stateName <>", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameGreaterThan(String value) {
            addCriterion("stateName >", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameGreaterThanOrEqualTo(String value) {
            addCriterion("stateName >=", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLessThan(String value) {
            addCriterion("stateName <", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLessThanOrEqualTo(String value) {
            addCriterion("stateName <=", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLike(String value) {
            addCriterion("stateName like", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotLike(String value) {
            addCriterion("stateName not like", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameIn(List<String> values) {
            addCriterion("stateName in", values, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotIn(List<String> values) {
            addCriterion("stateName not in", values, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameBetween(String value1, String value2) {
            addCriterion("stateName between", value1, value2, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotBetween(String value1, String value2) {
            addCriterion("stateName not between", value1, value2, "statename");
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