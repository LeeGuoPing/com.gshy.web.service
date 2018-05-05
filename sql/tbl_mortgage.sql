/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : db_gaoshi

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2018-05-05 20:58:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_mortgage
-- ----------------------------
DROP TABLE IF EXISTS `tbl_mortgage`;
CREATE TABLE `tbl_mortgage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `situation` int(2) DEFAULT '0' COMMENT '抵押情况 1,一抵;2 二抵',
  `authority` varchar(255) DEFAULT NULL COMMENT '抵押权',
  `first_balance` double(10,3) DEFAULT NULL,
  `second_balance` double(10,3) DEFAULT NULL,
  `borrow_money` double(10,3) DEFAULT NULL,
  `create_emp` bigint(20) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `audit_emp` bigint(20) DEFAULT NULL,
  `audit_time` date DEFAULT NULL,
  `audit_state` int(2) DEFAULT NULL,
  `valid` int(2) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='房抵资料报送';;
