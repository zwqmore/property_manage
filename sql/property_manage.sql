/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50736
 Source Host           : localhost:3306
 Source Schema         : property_manage

 Target Server Type    : MySQL
 Target Server Version : 50736
 File Encoding         : 65001

 Date: 26/04/2022 16:35:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bs_area
-- ----------------------------
DROP TABLE IF EXISTS `bs_area`;
CREATE TABLE `bs_area`  (
  `AREA_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `AREA_CODE` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '区代码',
  `CITY_CODE` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父级市代码',
  `AREA_NAME` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '市名称',
  `SHORT_NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简称',
  `LNG` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经度',
  `LAT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纬度',
  `SORT` int(6) NULL DEFAULT NULL COMMENT '排序',
  `GMT_CREATE` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `GMT_MODIFIED` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `MEMO` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `DATA_STATE` int(11) NULL DEFAULT NULL COMMENT '状态',
  `TENANT_CODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户ID',
  PRIMARY KEY (`AREA_ID`) USING BTREE,
  INDEX `Index_1`(`AREA_CODE`, `TENANT_CODE`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3679 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '地区设置' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bs_city
-- ----------------------------
DROP TABLE IF EXISTS `bs_city`;
CREATE TABLE `bs_city`  (
  `CITY_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `CITY_CODE` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '市代码',
  `CITY_NAME` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '市名称',
  `SHORT_NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简称',
  `PROVINCE_CODE` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省代码',
  `LNG` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经度',
  `LAT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纬度',
  `SORT` int(6) NULL DEFAULT NULL COMMENT '排序',
  `GMT_CREATE` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `GMT_MODIFIED` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `MEMO` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `DATA_STATE` int(11) NULL DEFAULT NULL COMMENT '状态',
  `TENANT_CODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户ID',
  PRIMARY KEY (`CITY_ID`) USING BTREE,
  INDEX `Index_1`(`CITY_CODE`, `TENANT_CODE`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 391 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '城市设置' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bs_province
-- ----------------------------
DROP TABLE IF EXISTS `bs_province`;
CREATE TABLE `bs_province`  (
  `PROVINCE_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `PROVINCE_CODE` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '省份代码',
  `PROVINCE_NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '省份名称',
  `SHORT_NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简称',
  `LNG` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经度',
  `LAT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纬度',
  `SORT` int(6) NULL DEFAULT NULL COMMENT '排序',
  `GMT_CREATE` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `GMT_MODIFIED` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `MEMO` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `DATA_STATE` int(11) NULL DEFAULT NULL COMMENT '状态',
  `TENANT_CODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户ID',
  PRIMARY KEY (`PROVINCE_ID`) USING BTREE,
  INDEX `Index_1`(`PROVINCE_CODE`, `TENANT_CODE`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '省份设置' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bs_street
-- ----------------------------
DROP TABLE IF EXISTS `bs_street`;
CREATE TABLE `bs_street`  (
  `STREET_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `STREET_CODE` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '街道代码',
  `AREA_CODE` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父级区代码',
  `STREET_NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '街道名称',
  `SHORT_NAME` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简称',
  `LNG` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经度',
  `LAT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纬度',
  `SORT` int(6) NULL DEFAULT NULL COMMENT '排序',
  `GMT_CREATE` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `GMT_MODIFIED` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `MEMO` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `DATA_STATE` int(11) NULL DEFAULT NULL COMMENT '状态',
  `TENANT_CODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户ID',
  PRIMARY KEY (`STREET_ID`) USING BTREE,
  INDEX `Index_1`(`STREET_CODE`, `TENANT_CODE`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 42361 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '街道设置' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for building
-- ----------------------------
DROP TABLE IF EXISTS `building`;
CREATE TABLE `building`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `buildingName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '楼栋名称',
  `villageId` int(8) NOT NULL COMMENT '小区ID（关联village表）',
  `versionId` int(8) NULL DEFAULT NULL COMMENT '期数ID（关联ver表）',
  `mark` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '楼栋标识（两位）',
  `det` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` datetime(0) NOT NULL COMMENT '操作时间',
  `userId` int(8) NOT NULL COMMENT '操作员',
  `status` tinyint(4) NOT NULL COMMENT '是否被删除（1-是，0-否）',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `villageId_det_unique`(`villageId`, `det`) USING BTREE,
  INDEX `building_ibfk_1`(`villageId`) USING BTREE,
  CONSTRAINT `building_ibfk_1` FOREIGN KEY (`villageId`) REFERENCES `village` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 7431 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for device
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device`  (
  `device_id` int(8) NOT NULL AUTO_INCREMENT,
  `device_type` tinyint(4) NOT NULL,
  `device_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `device_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `device_status` tinyint(4) NOT NULL DEFAULT 0,
  `device_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `device_version` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `device_village_id` int(8) NOT NULL,
  `device_unit_id` int(8) NULL DEFAULT NULL,
  `device_building_id` int(8) NULL DEFAULT NULL,
  `device_floor_id` int(8) NULL DEFAULT NULL,
  `device_create_time` datetime(0) NOT NULL,
  `device_update_time` datetime(0) NOT NULL,
  `device_start_time` datetime(0) NULL DEFAULT NULL,
  `device_down_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`device_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for floor
-- ----------------------------
DROP TABLE IF EXISTS `floor`;
CREATE TABLE `floor`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `floorName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '楼层名称',
  `villageId` int(11) NULL DEFAULT NULL,
  `versionId` int(11) NULL DEFAULT NULL,
  `buildingId` int(11) NULL DEFAULT NULL,
  `unitId` int(8) NOT NULL COMMENT '单元ID（关联unit表）',
  `mark` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '楼层标识（两位）',
  `det` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` datetime(0) NOT NULL COMMENT '操作时间',
  `userId` int(8) NOT NULL COMMENT '操作员',
  `status` tinyint(4) NOT NULL COMMENT '是否被删除（1-是，0-否）',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `villageId_det_unique`(`villageId`, `det`) USING BTREE,
  INDEX `unitId`(`unitId`) USING BTREE,
  CONSTRAINT `floor_ibfk_1` FOREIGN KEY (`unitId`) REFERENCES `unit` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1003694 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `des` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '描述',
  `alias` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '代码',
  `type` tinyint(2) NOT NULL DEFAULT 0 COMMENT '类型（0:物业,1:后台）',
  `available` tinyint(2) NOT NULL DEFAULT 0 COMMENT '是否有效',
  `module` int(11) NOT NULL COMMENT '模块ID（参照module表）',
  `createTime` datetime(0) NOT NULL COMMENT '创建时间',
  `modifyTime` datetime(0) NOT NULL COMMENT '修改时间',
  `enableSystem` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '适用的系统key集合',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 185 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `des` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色描述',
  `alias` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `type` tinyint(2) NOT NULL DEFAULT 0 COMMENT '角色类型（0：物业，1：后台普通，2：后台管理）',
  `available` tinyint(2) NOT NULL DEFAULT 0 COMMENT '是否有效',
  `createTime` datetime(0) NOT NULL COMMENT '创建时间',
  `modifyTime` datetime(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 188 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleId` int(11) NOT NULL COMMENT '角色ID',
  `permId` int(11) NOT NULL COMMENT '权限ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5704 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for unit
-- ----------------------------
DROP TABLE IF EXISTS `unit`;
CREATE TABLE `unit`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `unitName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '单元名称',
  `villageId` int(11) NULL DEFAULT NULL,
  `versionId` int(11) NULL DEFAULT NULL,
  `buildingId` int(8) NOT NULL COMMENT '楼栋ID（关联building表）',
  `mark` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '单元标识（两位）',
  `det` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` datetime(0) NOT NULL COMMENT '操作时间',
  `userId` int(8) NOT NULL COMMENT '操作员',
  `status` tinyint(4) NOT NULL COMMENT '是否被删除（1-是，0-否）',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `villageId_det_unique`(`villageId`, `det`) USING BTREE,
  INDEX `unit_ibfk_1`(`buildingId`) USING BTREE,
  CONSTRAINT `unit_ibfk_1` FOREIGN KEY (`buildingId`) REFERENCES `building` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 61893 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `realname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `type` tinyint(2) NOT NULL DEFAULT 0 COMMENT '用户类型（0:物业,1:后台）',
  `villageId` int(11) NOT NULL DEFAULT 0 COMMENT '小区ID号（关联village表）',
  `roleId` int(11) NOT NULL COMMENT '角色ID',
  `createTime` datetime(0) NOT NULL COMMENT '创建时间',
  `modifyTime` datetime(0) NOT NULL COMMENT '修改时间',
  `available` tinyint(2) NOT NULL DEFAULT 0 COMMENT '是否有效（0：有效，1：无效）',
  `tuserId` int(8) NOT NULL DEFAULT 0 COMMENT '第三方账户ID号（第三方物业用户可选）',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 771 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for village
-- ----------------------------
DROP TABLE IF EXISTS `village`;
CREATE TABLE `village`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `villageName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '小区名称',
  `cityId` int(8) NOT NULL COMMENT '城市ID（关联address表）',
  `cityName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '城市名称',
  `countyId` int(8) NOT NULL COMMENT '区县ID（关联address表）',
  `countyName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '区县名称',
  `streetId` int(8) NOT NULL COMMENT '街道ID（关联address表）',
  `streetName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '街道名称',
  `updateTime` datetime(0) NOT NULL COMMENT '操作时间',
  `userId` int(8) NOT NULL COMMENT '操作员',
  `status` tinyint(4) NOT NULL COMMENT '是否被删除（1-是，0-否）',
  `vs` tinyint(4) NOT NULL DEFAULT 0 COMMENT '期数状态，0:没有期数,1:有期数',
  `longitude` decimal(10, 7) NULL DEFAULT NULL COMMENT '经度',
  `latitude` decimal(10, 7) NULL DEFAULT NULL COMMENT '纬度',
  `contacts` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理电话号码,逗号分割',
  `tuserId` int(8) NULL DEFAULT 0 COMMENT '第三方账户ID',
  `stateId` int(11) NOT NULL COMMENT '省份ID',
  `stateName` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '省份ID',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `village_ibfk_3`(`streetId`) USING BTREE,
  INDEX `village_ibfk_1`(`cityId`) USING BTREE,
  INDEX `village_ibfk_2`(`countyId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 673 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Triggers structure for table building
-- ----------------------------
DROP TRIGGER IF EXISTS `building_delete_trigger`;
delimiter ;;
CREATE TRIGGER `building_delete_trigger` BEFORE DELETE ON `building` FOR EACH ROW BEGIN
	DELETE FROM jf_order_tnt WHERE hid IN (SELECT id FROM house WHERE buildingId=old.id);
	DELETE FROM jf_order_park WHERE hid IN (SELECT id FROM house WHERE buildingId=old.id);
	DELETE FROM jf_order_share WHERE hid IN (SELECT id FROM house WHERE buildingId=old.id);
	DELETE FROM jf_house_area WHERE bldId = old.id;
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table floor
-- ----------------------------
DROP TRIGGER IF EXISTS `floor_delete_trigger`;
delimiter ;;
CREATE TRIGGER `floor_delete_trigger` BEFORE DELETE ON `floor` FOR EACH ROW BEGIN
	DELETE FROM jf_order_tnt WHERE hid IN (SELECT id FROM house WHERE floorId=old.id);
	DELETE FROM jf_order_park WHERE hid IN (SELECT id FROM house WHERE floorId=old.id);
	DELETE FROM jf_order_share WHERE hid IN (SELECT id FROM house WHERE floorId=old.id);
	DELETE FROM jf_house_area WHERE floorId = old.id;
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table unit
-- ----------------------------
DROP TRIGGER IF EXISTS `unit_update_trigger`;
delimiter ;;
CREATE TRIGGER `unit_update_trigger` AFTER UPDATE ON `unit` FOR EACH ROW BEGIN
	UPDATE jf_tnt_sta SET des=new.unitName WHERE unitId=new.id;
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table unit
-- ----------------------------
DROP TRIGGER IF EXISTS `unit_delete_trigger`;
delimiter ;;
CREATE TRIGGER `unit_delete_trigger` BEFORE DELETE ON `unit` FOR EACH ROW BEGIN
	DELETE FROM jf_order_tnt WHERE hid IN (SELECT id FROM house WHERE unitId=old.id);
	DELETE FROM jf_order_park WHERE hid IN (SELECT id FROM house WHERE unitId=old.id);
	DELETE FROM jf_order_share WHERE hid IN (SELECT id FROM house WHERE unitId=old.id);
	DELETE FROM jf_tnt_sta WHERE unitId=old.id;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
