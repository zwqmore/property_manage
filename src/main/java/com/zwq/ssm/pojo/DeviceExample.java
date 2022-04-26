package com.zwq.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
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

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(Byte value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(Byte value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(Byte value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(Byte value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(Byte value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<Byte> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<Byte> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(Byte value1, Byte value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLike(String value) {
            addCriterion("village.villageName like", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceDescIsNull() {
            addCriterion("device_desc is null");
            return (Criteria) this;
        }

        public Criteria andDeviceDescIsNotNull() {
            addCriterion("device_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceDescEqualTo(String value) {
            addCriterion("device_desc =", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotEqualTo(String value) {
            addCriterion("device_desc <>", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescGreaterThan(String value) {
            addCriterion("device_desc >", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescGreaterThanOrEqualTo(String value) {
            addCriterion("device_desc >=", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescLessThan(String value) {
            addCriterion("device_desc <", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescLessThanOrEqualTo(String value) {
            addCriterion("device_desc <=", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescLike(String value) {
            addCriterion("device_desc like", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotLike(String value) {
            addCriterion("device_desc not like", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescIn(List<String> values) {
            addCriterion("device_desc in", values, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotIn(List<String> values) {
            addCriterion("device_desc not in", values, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescBetween(String value1, String value2) {
            addCriterion("device_desc between", value1, value2, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotBetween(String value1, String value2) {
            addCriterion("device_desc not between", value1, value2, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNull() {
            addCriterion("device_status is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNotNull() {
            addCriterion("device_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusEqualTo(Byte value) {
            addCriterion("device_status =", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotEqualTo(Byte value) {
            addCriterion("device_status <>", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThan(Byte value) {
            addCriterion("device_status >", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("device_status >=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThan(Byte value) {
            addCriterion("device_status <", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThanOrEqualTo(Byte value) {
            addCriterion("device_status <=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIn(List<Byte> values) {
            addCriterion("device_status in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotIn(List<Byte> values) {
            addCriterion("device_status not in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusBetween(Byte value1, Byte value2) {
            addCriterion("device_status between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("device_status not between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneIsNull() {
            addCriterion("device_phone is null");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneIsNotNull() {
            addCriterion("device_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneEqualTo(String value) {
            addCriterion("device_phone =", value, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneNotEqualTo(String value) {
            addCriterion("device_phone <>", value, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneGreaterThan(String value) {
            addCriterion("device_phone >", value, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("device_phone >=", value, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneLessThan(String value) {
            addCriterion("device_phone <", value, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneLessThanOrEqualTo(String value) {
            addCriterion("device_phone <=", value, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneLike(String value) {
            addCriterion("device_phone like", value, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneNotLike(String value) {
            addCriterion("device_phone not like", value, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneIn(List<String> values) {
            addCriterion("device_phone in", values, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneNotIn(List<String> values) {
            addCriterion("device_phone not in", values, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneBetween(String value1, String value2) {
            addCriterion("device_phone between", value1, value2, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDevicePhoneNotBetween(String value1, String value2) {
            addCriterion("device_phone not between", value1, value2, "devicePhone");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionIsNull() {
            addCriterion("device_version is null");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionIsNotNull() {
            addCriterion("device_version is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionEqualTo(String value) {
            addCriterion("device_version =", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionNotEqualTo(String value) {
            addCriterion("device_version <>", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionGreaterThan(String value) {
            addCriterion("device_version >", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionGreaterThanOrEqualTo(String value) {
            addCriterion("device_version >=", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionLessThan(String value) {
            addCriterion("device_version <", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionLessThanOrEqualTo(String value) {
            addCriterion("device_version <=", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionLike(String value) {
            addCriterion("device_version like", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionNotLike(String value) {
            addCriterion("device_version not like", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionIn(List<String> values) {
            addCriterion("device_version in", values, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionNotIn(List<String> values) {
            addCriterion("device_version not in", values, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionBetween(String value1, String value2) {
            addCriterion("device_version between", value1, value2, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionNotBetween(String value1, String value2) {
            addCriterion("device_version not between", value1, value2, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdIsNull() {
            addCriterion("device_village_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdIsNotNull() {
            addCriterion("device_village_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdEqualTo(Integer value) {
            addCriterion("device_village_id =", value, "deviceVillageId");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdNotEqualTo(Integer value) {
            addCriterion("device_village_id <>", value, "deviceVillageId");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdGreaterThan(Integer value) {
            addCriterion("device_village_id >", value, "deviceVillageId");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_village_id >=", value, "deviceVillageId");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdLessThan(Integer value) {
            addCriterion("device_village_id <", value, "deviceVillageId");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_village_id <=", value, "deviceVillageId");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdIn(List<Integer> values) {
            addCriterion("device_village_id in", values, "deviceVillageId");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdNotIn(List<Integer> values) {
            addCriterion("device_village_id not in", values, "deviceVillageId");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdBetween(Integer value1, Integer value2) {
            addCriterion("device_village_id between", value1, value2, "deviceVillageId");
            return (Criteria) this;
        }

        public Criteria andDeviceVillageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_village_id not between", value1, value2, "deviceVillageId");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdIsNull() {
            addCriterion("device_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdIsNotNull() {
            addCriterion("device_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdEqualTo(Integer value) {
            addCriterion("device_unit_id =", value, "deviceUnitId");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdNotEqualTo(Integer value) {
            addCriterion("device_unit_id <>", value, "deviceUnitId");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdGreaterThan(Integer value) {
            addCriterion("device_unit_id >", value, "deviceUnitId");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_unit_id >=", value, "deviceUnitId");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdLessThan(Integer value) {
            addCriterion("device_unit_id <", value, "deviceUnitId");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_unit_id <=", value, "deviceUnitId");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdIn(List<Integer> values) {
            addCriterion("device_unit_id in", values, "deviceUnitId");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdNotIn(List<Integer> values) {
            addCriterion("device_unit_id not in", values, "deviceUnitId");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("device_unit_id between", value1, value2, "deviceUnitId");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_unit_id not between", value1, value2, "deviceUnitId");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdIsNull() {
            addCriterion("device_building_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdIsNotNull() {
            addCriterion("device_building_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdEqualTo(Integer value) {
            addCriterion("device_building_id =", value, "deviceBuildingId");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdNotEqualTo(Integer value) {
            addCriterion("device_building_id <>", value, "deviceBuildingId");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdGreaterThan(Integer value) {
            addCriterion("device_building_id >", value, "deviceBuildingId");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_building_id >=", value, "deviceBuildingId");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdLessThan(Integer value) {
            addCriterion("device_building_id <", value, "deviceBuildingId");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_building_id <=", value, "deviceBuildingId");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdIn(List<Integer> values) {
            addCriterion("device_building_id in", values, "deviceBuildingId");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdNotIn(List<Integer> values) {
            addCriterion("device_building_id not in", values, "deviceBuildingId");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdBetween(Integer value1, Integer value2) {
            addCriterion("device_building_id between", value1, value2, "deviceBuildingId");
            return (Criteria) this;
        }

        public Criteria andDeviceBuildingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_building_id not between", value1, value2, "deviceBuildingId");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdIsNull() {
            addCriterion("device_floor_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdIsNotNull() {
            addCriterion("device_floor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdEqualTo(Integer value) {
            addCriterion("device_floor_id =", value, "deviceFloorId");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdNotEqualTo(Integer value) {
            addCriterion("device_floor_id <>", value, "deviceFloorId");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdGreaterThan(Integer value) {
            addCriterion("device_floor_id >", value, "deviceFloorId");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_floor_id >=", value, "deviceFloorId");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdLessThan(Integer value) {
            addCriterion("device_floor_id <", value, "deviceFloorId");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_floor_id <=", value, "deviceFloorId");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdIn(List<Integer> values) {
            addCriterion("device_floor_id in", values, "deviceFloorId");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdNotIn(List<Integer> values) {
            addCriterion("device_floor_id not in", values, "deviceFloorId");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdBetween(Integer value1, Integer value2) {
            addCriterion("device_floor_id between", value1, value2, "deviceFloorId");
            return (Criteria) this;
        }

        public Criteria andDeviceFloorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_floor_id not between", value1, value2, "deviceFloorId");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeIsNull() {
            addCriterion("device_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeIsNotNull() {
            addCriterion("device_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeEqualTo(Date value) {
            addCriterion("device_create_time =", value, "deviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeNotEqualTo(Date value) {
            addCriterion("device_create_time <>", value, "deviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeGreaterThan(Date value) {
            addCriterion("device_create_time >", value, "deviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("device_create_time >=", value, "deviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeLessThan(Date value) {
            addCriterion("device_create_time <", value, "deviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("device_create_time <=", value, "deviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeIn(List<Date> values) {
            addCriterion("device_create_time in", values, "deviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeNotIn(List<Date> values) {
            addCriterion("device_create_time not in", values, "deviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeBetween(Date value1, Date value2) {
            addCriterion("device_create_time between", value1, value2, "deviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("device_create_time not between", value1, value2, "deviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeIsNull() {
            addCriterion("device_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeIsNotNull() {
            addCriterion("device_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeEqualTo(Date value) {
            addCriterion("device_update_time =", value, "deviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeNotEqualTo(Date value) {
            addCriterion("device_update_time <>", value, "deviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeGreaterThan(Date value) {
            addCriterion("device_update_time >", value, "deviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("device_update_time >=", value, "deviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeLessThan(Date value) {
            addCriterion("device_update_time <", value, "deviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("device_update_time <=", value, "deviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeIn(List<Date> values) {
            addCriterion("device_update_time in", values, "deviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeNotIn(List<Date> values) {
            addCriterion("device_update_time not in", values, "deviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("device_update_time between", value1, value2, "deviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("device_update_time not between", value1, value2, "deviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeIsNull() {
            addCriterion("device_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeIsNotNull() {
            addCriterion("device_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeEqualTo(Date value) {
            addCriterion("device_start_time =", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeNotEqualTo(Date value) {
            addCriterion("device_start_time <>", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeGreaterThan(Date value) {
            addCriterion("device_start_time >", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("device_start_time >=", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeLessThan(Date value) {
            addCriterion("device_start_time <", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("device_start_time <=", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeIn(List<Date> values) {
            addCriterion("device_start_time in", values, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeNotIn(List<Date> values) {
            addCriterion("device_start_time not in", values, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeBetween(Date value1, Date value2) {
            addCriterion("device_start_time between", value1, value2, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("device_start_time not between", value1, value2, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeIsNull() {
            addCriterion("device_down_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeIsNotNull() {
            addCriterion("device_down_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeEqualTo(Date value) {
            addCriterion("device_down_time =", value, "deviceDownTime");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeNotEqualTo(Date value) {
            addCriterion("device_down_time <>", value, "deviceDownTime");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeGreaterThan(Date value) {
            addCriterion("device_down_time >", value, "deviceDownTime");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("device_down_time >=", value, "deviceDownTime");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeLessThan(Date value) {
            addCriterion("device_down_time <", value, "deviceDownTime");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeLessThanOrEqualTo(Date value) {
            addCriterion("device_down_time <=", value, "deviceDownTime");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeIn(List<Date> values) {
            addCriterion("device_down_time in", values, "deviceDownTime");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeNotIn(List<Date> values) {
            addCriterion("device_down_time not in", values, "deviceDownTime");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeBetween(Date value1, Date value2) {
            addCriterion("device_down_time between", value1, value2, "deviceDownTime");
            return (Criteria) this;
        }

        public Criteria andDeviceDownTimeNotBetween(Date value1, Date value2) {
            addCriterion("device_down_time not between", value1, value2, "deviceDownTime");
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