/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : db_gaoshi

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2018-05-05 20:59:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_advance_money
-- ----------------------------
DROP TABLE IF EXISTS `tbl_advance_money`;
CREATE TABLE `tbl_advance_money` (
  `id` bigint(20) DEFAULT NULL,
  `pre_home` varchar(255) DEFAULT '' COMMENT '上家',
  `next_home` varchar(255) DEFAULT NULL COMMENT '下家',
  `situation` varchar(255) DEFAULT NULL COMMENT '垫资情况',
  `first_balance` double(10,3) DEFAULT NULL COMMENT '一抵余额',
  `second_balance` double(10,3) DEFAULT NULL COMMENT '二抵余额',
  `borrow_money` double(10,3) DEFAULT NULL COMMENT '本次借款金额',
  `create_emp` bigint(20) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `audit_emp` bigint(20) DEFAULT NULL,
  `audit_time` date DEFAULT NULL,
  `audit_state` int(2) DEFAULT NULL,
  `valid` int(2) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
