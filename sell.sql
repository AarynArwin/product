/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : sell

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-11-25 22:41:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `detail_id` varchar(255) NOT NULL,
  `order_id` varchar(255) NOT NULL,
  `product_id` bigint(20) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `product_price` decimal(10,2) NOT NULL,
  `product_quantity` int(10) NOT NULL,
  `product_icon` varchar(255) NOT NULL,
  PRIMARY KEY (`detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES ('123456', '123456', '1', '皮蛋粥', '8.00', '2', '');

-- ----------------------------
-- Table structure for order_master
-- ----------------------------
DROP TABLE IF EXISTS `order_master`;
CREATE TABLE `order_master` (
  `order_id` varchar(255) NOT NULL,
  `buyer_name` varchar(30) NOT NULL,
  `buyer_phone` varchar(30) NOT NULL,
  `buyer_address` varchar(255) NOT NULL,
  `buyer_openid` varchar(255) NOT NULL,
  `order_amount` decimal(10,2) NOT NULL,
  `order_status` int(10) NOT NULL DEFAULT '0',
  `pay_status` int(10) NOT NULL COMMENT '0',
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_master
-- ----------------------------
INSERT INTO `order_master` VALUES ('123456', 'Aaryn', '17788999988', '浙江省金华市', 'adsd15453db11', '10.00', '0', '0', '2018-11-25 16:46:07', '2018-11-25 16:46:07');

-- ----------------------------
-- Table structure for product_category
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(255) NOT NULL,
  `category_type` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_category
-- ----------------------------
INSERT INTO `product_category` VALUES ('1', '饮品', '1', '2018-11-23 15:09:29', '2018-11-23 15:09:33');
INSERT INTO `product_category` VALUES ('2', '主食', '2', '2018-11-23 15:09:48', '2018-11-23 15:09:51');

-- ----------------------------
-- Table structure for product_info
-- ----------------------------
DROP TABLE IF EXISTS `product_info`;
CREATE TABLE `product_info` (
  `product_id` bigint(20) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `product_price` decimal(10,2) NOT NULL,
  `product_stock` int(11) NOT NULL,
  `product_description` varchar(255) NOT NULL,
  `product_icon` varchar(255) NOT NULL,
  `product_status` int(11) NOT NULL,
  `category_type` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_info
-- ----------------------------
INSERT INTO `product_info` VALUES ('1', '皮蛋粥', '8.00', '10', '美味，不腻', '', '0', '1', '2018-11-23 14:24:37', '2018-11-23 14:24:45');
INSERT INTO `product_info` VALUES ('2', '南瓜粥', '8.00', '10', '瘦身必备，好喝', '', '1', '1', '2018-11-23 14:25:37', '2018-11-23 14:25:45');
INSERT INTO `product_info` VALUES ('3', '肉夹馍', '12.00', '23', '炒鸡好吃，店家推荐', '', '0', '2', '2018-11-23 14:25:37', '2018-11-23 14:25:45');
