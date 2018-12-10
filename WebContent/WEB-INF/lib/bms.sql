/*
Navicat MySQL Data Transfer

Source Server         : cuiwei
Source Server Version : 50532
Source Host           : localhost:3306
Source Database       : bms

Target Server Type    : MYSQL
Target Server Version : 50532
File Encoding         : 65001

Date: 2018-09-28 11:19:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginName` varchar(255) DEFAULT NULL,
  `loginPwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', 'admin');
INSERT INTO `admin` VALUES ('2', 'vvv', 'vvv');

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `categoryId` int(11) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `publisher` varchar(255) DEFAULT NULL,
  `contents` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `categoryId` (`categoryId`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`categoryId`) REFERENCES `category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '计算机类', '计算机，编程，硬件');
INSERT INTO `category` VALUES ('2', '文学类', '小说，名著，传记');
INSERT INTO `category` VALUES ('3', '小学教材', '六年制小学教材');
