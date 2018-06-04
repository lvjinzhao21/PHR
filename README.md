# PHR

#测试接口
#接口地址：http://localhost:8081/phr/demo/getOne/20

#建表语句
/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50096
 Source Host           : localhost:3306
 Source Schema         : phr

 Target Server Type    : MySQL
 Target Server Version : 50096
 File Encoding         : 65001

 Date: 04/06/2018 23:03:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `age` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('20', 25, 'TOM');
INSERT INTO `person` VALUES ('21', 24, 'Ada');
INSERT INTO `person` VALUES ('22', 8, 'Billon');

SET FOREIGN_KEY_CHECKS = 1;

