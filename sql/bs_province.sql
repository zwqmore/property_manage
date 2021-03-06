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

 Date: 26/04/2022 16:35:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
-- Records of bs_province
-- ----------------------------
INSERT INTO `bs_province` VALUES (1, '110000', '北京', '北京', '116.405289', '39.904987', 1, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (2, '120000', '天津', '天津', '117.190186', '39.125595', 2, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (3, '130000', '河北省', '河北', '114.502464', '38.045475', 3, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (4, '140000', '山西省', '山西', '112.549248', '37.857014', 4, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (5, '150000', '内蒙古自治区', '内蒙古', '111.670799', '40.81831', 5, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (6, '210000', '辽宁省', '辽宁', '123.429092', '41.796768', 6, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (7, '220000', '吉林省', '吉林', '125.324501', '43.886841', 7, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (8, '230000', '黑龙江省', '黑龙江', '126.642464', '45.756966', 8, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (9, '310000', '上海', '上海', '121.472641', '31.231707', 9, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (10, '320000', '江苏省', '江苏', '118.76741', '32.041546', 10, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (11, '330000', '浙江省', '浙江', '120.15358', '30.287458', 11, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (12, '340000', '安徽省', '安徽', '117.283043', '31.861191', 12, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (13, '350000', '福建省', '福建', '119.306236', '26.075302', 13, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (14, '360000', '江西省', '江西', '115.892151', '28.676493', 14, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (15, '370000', '山东省', '山东', '117.000923', '36.675808', 15, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (16, '410000', '河南省', '河南', '113.665413', '34.757977', 16, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (17, '420000', '湖北省', '湖北', '114.298569', '30.584354', 17, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (18, '430000', '湖南省', '湖南', '112.982277', '28.19409', 18, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (19, '440000', '广东省', '广东', '113.28064', '23.125177', 19, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (20, '450000', '广西壮族自治区', '广西', '108.320007', '22.82402', 20, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (21, '460000', '海南省', '海南', '110.331192', '20.031971', 21, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (22, '500000', '重庆', '重庆', '106.504959', '29.533155', 22, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (23, '510000', '四川省', '四川', '104.065735', '30.659462', 23, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (24, '520000', '贵州省', '贵州', '106.713478', '26.578342', 24, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (25, '530000', '云南省', '云南', '102.71225', '25.040609', 25, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (26, '540000', '西藏自治区', '西藏', '91.13221', '29.66036', 26, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (27, '610000', '陕西省', '陕西', '108.948021', '34.263161', 27, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (28, '620000', '甘肃省', '甘肃', '103.823555', '36.058041', 28, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (29, '630000', '青海省', '青海', '101.778915', '36.623177', 29, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (30, '640000', '宁夏回族自治区', '宁夏', '106.278175', '38.46637', 30, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (31, '650000', '新疆维吾尔自治区', '新疆', '87.617729', '43.792816', 31, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (32, '710000', '台湾', '台湾', '121.509064', '25.044333', 34, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (33, '810000', '香港特别行政区', '香港', '114.173355', '22.320047', 32, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');
INSERT INTO `bs_province` VALUES (34, '820000', '澳门特别行政区', '澳门', '113.549088', '22.198952', 33, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0, '00000000');

SET FOREIGN_KEY_CHECKS = 1;
