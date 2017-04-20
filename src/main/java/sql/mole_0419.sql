/*
SQLyog Ultimate v12.09 (32 bit)
MySQL - 5.7.13-log : Database - mole
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mole` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mole`;

/*Table structure for table `emp` */

DROP TABLE IF EXISTS `emp`;

CREATE TABLE `emp` (
  `emp_id` varchar(32) NOT NULL,
  `emp_pwd` varchar(32) NOT NULL,
  `emp_name` varchar(16) DEFAULT NULL,
  `emp_sex` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `emp` */

insert  into `emp`(`emp_id`,`emp_pwd`,`emp_name`,`emp_sex`) values ('101','101','崔一','男'),('102','102','崔二','女'),('103','103','崔三','女');

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `gs_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物品编号，流水号',
  `gs_type_id` bigint(20) DEFAULT NULL COMMENT '物品种类编号，指向goods_common的gc_type_id',
  `gs_true_id` varchar(50) DEFAULT NULL COMMENT '物品id',
  `gs_speci` varchar(50) DEFAULT NULL COMMENT '物品规格specification',
  `gs_total_quantity` float DEFAULT '0' COMMENT '总数量',
  `gs_left_quantity` float DEFAULT '0' COMMENT '剩余数量',
  `gs_batch_num` varchar(50) DEFAULT NULL COMMENT '批次号',
  `gs_produce_date` date DEFAULT NULL COMMENT '生产日期',
  `gs_buy_date` date DEFAULT NULL COMMENT '购买日期',
  `gs_check_date` date DEFAULT NULL COMMENT '验收日期',
  `gs_purchase_price` float DEFAULT '0' COMMENT '购买价',
  `gs_depreciation_price` float DEFAULT '0' COMMENT '折旧价',
  `gs_manufacturer` varchar(50) DEFAULT NULL COMMENT '制造商',
  `gs_supplier` varchar(50) DEFAULT NULL COMMENT '供应商',
  `gs_department` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `gs_receive_person_id` varchar(32) DEFAULT NULL COMMENT '领用人编号',
  `gs_receive_date` date DEFAULT NULL COMMENT '领用日期',
  `gs_admin_id` varchar(32) DEFAULT NULL COMMENT '管理人编号',
  `gs_calibration_cycle` int(11) DEFAULT NULL COMMENT '校准周期',
  `gs_warranty_period` varchar(16) DEFAULT NULL COMMENT '保修期，比如一年',
  `gs_store_position` varchar(100) DEFAULT NULL COMMENT '保存位置',
  PRIMARY KEY (`gs_id`),
  UNIQUE KEY `type_id_unique` (`gs_type_id`),
  CONSTRAINT `type_id_fk` FOREIGN KEY (`gs_type_id`) REFERENCES `goods_common` (`gc_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

insert  into `goods`(`gs_id`,`gs_type_id`,`gs_true_id`,`gs_speci`,`gs_total_quantity`,`gs_left_quantity`,`gs_batch_num`,`gs_produce_date`,`gs_buy_date`,`gs_check_date`,`gs_purchase_price`,`gs_depreciation_price`,`gs_manufacturer`,`gs_supplier`,`gs_department`,`gs_receive_person_id`,`gs_receive_date`,`gs_admin_id`,`gs_calibration_cycle`,`gs_warranty_period`,`gs_store_position`) values (4,1,'GT7777',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,2,'HHH333','',0,0,'',NULL,NULL,NULL,0,0,'','','','','2015-11-11','',0,'',''),(11,3,'GHFGH',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,5,'fdsfed','tretet',NULL,NULL,'',NULL,NULL,NULL,NULL,NULL,'','','','',NULL,'',NULL,'','共同热共同'),(14,6,'C6140A','600*700*50',100,50,'000001','2010-10-12','2013-10-12','2013-10-17',50000,40000,'阿豹','阿狗a','测试部','103','2015-11-13','101',12,'两年','大仓库'),(17,9,'','',NULL,NULL,'',NULL,NULL,NULL,NULL,NULL,'','','','',NULL,'',NULL,'',''),(18,10,'','GFGHGH',NULL,NULL,'',NULL,NULL,NULL,NULL,NULL,'','','','',NULL,'',NULL,'','');

/*Table structure for table `goods_common` */

DROP TABLE IF EXISTS `goods_common`;

CREATE TABLE `goods_common` (
  `gc_type_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物品种类编号',
  `gc_name` varchar(50) DEFAULT NULL COMMENT '物品名称',
  `gc_head_type` varchar(50) DEFAULT NULL COMMENT '物品大类，如设备、试剂、耗材、标准件',
  `gc_type` varchar(50) DEFAULT NULL COMMENT '物品类型，以前是物品种类',
  `gc_counting_unit` varchar(50) DEFAULT NULL COMMENT '物品计数单位',
  `gc_is_int_counting` varchar(2) DEFAULT NULL COMMENT '物品是否是整数计数',
  `gc_stock_quantity` float DEFAULT NULL COMMENT '物品库存数量',
  `gc_warn_stock_quantity` float DEFAULT NULL COMMENT '物品警戒库存数量',
  `gc_history_receive_num` float DEFAULT NULL COMMENT '物品历史领用数量',
  PRIMARY KEY (`gc_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `goods_common` */

insert  into `goods_common`(`gc_type_id`,`gc_name`,`gc_head_type`,`gc_type`,`gc_counting_unit`,`gc_is_int_counting`,`gc_stock_quantity`,`gc_warn_stock_quantity`,`gc_history_receive_num`) values (1,'压力机','设备','试验','台','是',1000,800,700),(2,'冲压机','设备','试验','台','是',500,300,100),(3,'插排','耗材','办公','个','是',100,80,70),(5,'大机器','设备','试验','台','是',NULL,NULL,NULL),(6,'车床ccc','设备','试验','个','是',520,100,80),(9,'大机','设备','试验','','',NULL,NULL,NULL),(10,'哈哈哈','设备','试验','台啊','',NULL,NULL,NULL);

/*Table structure for table `t_bd_authority` */

DROP TABLE IF EXISTS `t_bd_authority`;

CREATE TABLE `t_bd_authority` (
  `authority_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '权限编号，流水号',
  `authority_name` varchar(64) DEFAULT NULL COMMENT '权限名称',
  `authority_instruction` varchar(512) DEFAULT NULL COMMENT '权限描述',
  `authority_notes` varchar(512) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`authority_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_bd_authority` */

insert  into `t_bd_authority`(`authority_id`,`authority_name`,`authority_instruction`,`authority_notes`) values (1,'查看所有人员信息',NULL,NULL),(2,'查看并能修改所有人信息',NULL,NULL),(3,'只能查看自己的信息',NULL,NULL);

/*Table structure for table `t_bd_depart` */

DROP TABLE IF EXISTS `t_bd_depart`;

CREATE TABLE `t_bd_depart` (
  `depart_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门编号，流水号',
  `depart_name` varchar(64) DEFAULT NULL COMMENT '部门名称',
  `depart_telephone` varchar(64) DEFAULT NULL COMMENT '电话',
  `depart_telephone2` varchar(64) DEFAULT NULL COMMENT '电话2',
  `depart_function` varchar(512) DEFAULT NULL COMMENT '部门职能',
  `depart_intruduction_file_path` varchar(512) DEFAULT NULL COMMENT '部门简介文件路径',
  `depart_node_attribute_id` bigint(20) DEFAULT NULL COMMENT '部门节点属性编号',
  `depart_notes` varchar(512) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`depart_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `t_bd_depart` */

insert  into `t_bd_depart`(`depart_id`,`depart_name`,`depart_telephone`,`depart_telephone2`,`depart_function`,`depart_intruduction_file_path`,`depart_node_attribute_id`,`depart_notes`) values (1,'人事部','029-1234567',NULL,NULL,NULL,NULL,NULL),(2,'质检部','029-7654321',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `t_bd_dictionary` */

DROP TABLE IF EXISTS `t_bd_dictionary`;

CREATE TABLE `t_bd_dictionary` (
  `dictionary_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '流水号id',
  `dictionary_common_cata` varchar(64) NOT NULL COMMENT '大类',
  `dictionary_detail_cata` varchar(64) NOT NULL COMMENT '小类',
  `dictionary_content` varchar(64) NOT NULL COMMENT '内容',
  `dictionary_order` int(4) NOT NULL COMMENT '序号，按这个排序',
  `dictionary_notes` varchar(512) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`dictionary_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `t_bd_dictionary` */

insert  into `t_bd_dictionary`(`dictionary_id`,`dictionary_common_cata`,`dictionary_detail_cata`,`dictionary_content`,`dictionary_order`,`dictionary_notes`) values (1,'基础资料管理','人员类型','部门人员',1,NULL),(2,'基础资料管理','人员类型','工作人员',2,NULL),(3,'基础资料管理','最高学位','高中及以下',1,NULL),(4,'基础资料管理','最高学位','本科',2,NULL),(5,'基础资料管理','最高学位','研究生',3,NULL),(6,'基础资料管理','最高学位','博士',4,NULL),(7,'基础资料管理','政治面貌','群众',1,NULL),(8,'基础资料管理','政治面貌','中共预备党员',2,NULL),(9,'基础资料管理','政治面貌','中共党员',3,NULL),(10,'基础资料管理','政治面貌','无党派人士',4,NULL),(11,'基础资料管理','政治面貌','民革党员',5,NULL);

/*Table structure for table `t_bd_person` */

DROP TABLE IF EXISTS `t_bd_person`;

CREATE TABLE `t_bd_person` (
  `t_person_id` varchar(64) NOT NULL COMMENT '人员编号',
  `t_person_type` varchar(64) DEFAULT NULL COMMENT '人员类型',
  `t_person_username` varchar(64) DEFAULT NULL COMMENT '用户名',
  `t_person_pwd` varchar(64) DEFAULT NULL COMMENT '密码',
  `t_person_truename` varchar(64) DEFAULT NULL COMMENT '真实姓名',
  `t_person_sex` varchar(4) DEFAULT NULL COMMENT '性别',
  `t_person_en_name` varchar(64) DEFAULT NULL COMMENT '英文名',
  `t_person_name_used` varchar(64) DEFAULT NULL COMMENT '曾用名',
  `t_person_telephone` varchar(64) DEFAULT NULL COMMENT '电话号码',
  `t_person_fax` varchar(64) DEFAULT NULL COMMENT '传真',
  `t_person_addr` varchar(512) DEFAULT NULL COMMENT '地址',
  `t_person_mobilephone` varchar(64) DEFAULT NULL COMMENT '手机号',
  `t_person_email` varchar(64) DEFAULT NULL COMMENT 'email',
  `t_person_qq` varchar(64) DEFAULT NULL COMMENT 'qq',
  `t_person_wetchat` varchar(64) DEFAULT NULL COMMENT '微信',
  `t_person_duty` varchar(64) DEFAULT NULL COMMENT '职务',
  `t_person_title` varchar(64) DEFAULT NULL COMMENT '职称',
  `t_person_identify_num` varchar(64) DEFAULT NULL COMMENT '身份证号',
  `t_person_birth` date DEFAULT NULL COMMENT '出生日期',
  `t_person_nation` varchar(4) DEFAULT '汉族' COMMENT '民族',
  `t_person_highest_degree` varchar(64) DEFAULT NULL COMMENT '最高学位',
  `t_person_politics_status` varchar(64) DEFAULT NULL COMMENT '政治面貌',
  `t_person_take_job_date` date DEFAULT NULL COMMENT '参加工作时间',
  `t_person_join_work_date` date DEFAULT NULL COMMENT '调入时间',
  `t_person_hobbay` varchar(512) DEFAULT NULL COMMENT '爱好',
  `t_person_node_attribute_id` bigint(20) DEFAULT NULL COMMENT '人员节点属性编号',
  `t_person_notes` varchar(512) DEFAULT NULL COMMENT '备注',
  `t_person_depart_id` bigint(20) DEFAULT NULL COMMENT '部门编号，部门表的外键',
  `t_person_unit_id` bigint(20) DEFAULT NULL COMMENT '单位编号，单位表的外键',
  PRIMARY KEY (`t_person_id`),
  KEY `fk_person_depart` (`t_person_depart_id`),
  KEY `fk_person_unit` (`t_person_unit_id`),
  CONSTRAINT `fk_person_depart` FOREIGN KEY (`t_person_depart_id`) REFERENCES `t_bd_depart` (`depart_id`),
  CONSTRAINT `fk_person_unit` FOREIGN KEY (`t_person_unit_id`) REFERENCES `t_bd_unit` (`unit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_bd_person` */

insert  into `t_bd_person`(`t_person_id`,`t_person_type`,`t_person_username`,`t_person_pwd`,`t_person_truename`,`t_person_sex`,`t_person_en_name`,`t_person_name_used`,`t_person_telephone`,`t_person_fax`,`t_person_addr`,`t_person_mobilephone`,`t_person_email`,`t_person_qq`,`t_person_wetchat`,`t_person_duty`,`t_person_title`,`t_person_identify_num`,`t_person_birth`,`t_person_nation`,`t_person_highest_degree`,`t_person_politics_status`,`t_person_take_job_date`,`t_person_join_work_date`,`t_person_hobbay`,`t_person_node_attribute_id`,`t_person_notes`,`t_person_depart_id`,`t_person_unit_id`) values ('0001','部门人员','刘一','0001','刘一','女',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'汉族',NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),('0002','单位人员','刘二','0002','刘二','女',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'汉族',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2);

/*Table structure for table `t_bd_person_role` */

DROP TABLE IF EXISTS `t_bd_person_role`;

CREATE TABLE `t_bd_person_role` (
  `person_role_person_id` varchar(64) NOT NULL COMMENT '人员编号，人员表中的外键',
  `person_role_role_id` bigint(20) NOT NULL COMMENT '角色编号，角色表中的外键',
  PRIMARY KEY (`person_role_person_id`,`person_role_role_id`),
  KEY `fk_personrole_role` (`person_role_role_id`),
  CONSTRAINT `fk_personrole_person` FOREIGN KEY (`person_role_person_id`) REFERENCES `t_bd_person` (`t_person_id`),
  CONSTRAINT `fk_personrole_role` FOREIGN KEY (`person_role_role_id`) REFERENCES `t_bd_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_bd_person_role` */

insert  into `t_bd_person_role`(`person_role_person_id`,`person_role_role_id`) values ('0001',1),('0002',2);

/*Table structure for table `t_bd_role` */

DROP TABLE IF EXISTS `t_bd_role`;

CREATE TABLE `t_bd_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色编号，流水号',
  `role_name` varchar(64) DEFAULT NULL COMMENT '角色名称',
  `role_instruction` varchar(512) DEFAULT NULL COMMENT '角色描述',
  `role_notes` varchar(512) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `t_bd_role` */

insert  into `t_bd_role`(`role_id`,`role_name`,`role_instruction`,`role_notes`) values (1,'人事部负责人',NULL,NULL),(2,'质检部负责人',NULL,NULL);

/*Table structure for table `t_bd_role_authority` */

DROP TABLE IF EXISTS `t_bd_role_authority`;

CREATE TABLE `t_bd_role_authority` (
  `role_authority_role_id` bigint(20) NOT NULL COMMENT '角色编号，角色表中的外键',
  `role_authority_authority_id` bigint(20) NOT NULL COMMENT '权限编号，权限表中的外键',
  `role_authority_instruction` varchar(512) DEFAULT NULL COMMENT '角色权限描述',
  PRIMARY KEY (`role_authority_role_id`,`role_authority_authority_id`),
  KEY `fk_roleauthority_authority` (`role_authority_authority_id`),
  CONSTRAINT `fk_roleauthority_authority` FOREIGN KEY (`role_authority_authority_id`) REFERENCES `t_bd_authority` (`authority_id`),
  CONSTRAINT `fk_roleauthority_role` FOREIGN KEY (`role_authority_role_id`) REFERENCES `t_bd_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_bd_role_authority` */

insert  into `t_bd_role_authority`(`role_authority_role_id`,`role_authority_authority_id`,`role_authority_instruction`) values (1,1,NULL),(2,3,NULL);

/*Table structure for table `t_bd_unit` */

DROP TABLE IF EXISTS `t_bd_unit`;

CREATE TABLE `t_bd_unit` (
  `unit_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '单位编号，流水号',
  `unit_name` varchar(512) DEFAULT NULL COMMENT '单位名称',
  `unit_head_catagory` varchar(64) DEFAULT NULL COMMENT '单位大类',
  `unit_detail_catagory` varchar(64) DEFAULT NULL COMMENT '单位小类',
  `unit_addr` varchar(512) DEFAULT NULL COMMENT '单位地址',
  `unit_business_license_path` varchar(512) DEFAULT NULL COMMENT '营业执照文件路径',
  `unit_taxpayer_registration_num` varchar(64) DEFAULT NULL COMMENT '纳税人识别号',
  `unit_telephone` varchar(64) DEFAULT NULL COMMENT '电话',
  `unit_telephone2` varchar(64) DEFAULT NULL COMMENT '电话2',
  `unit_telephone3` varchar(64) DEFAULT NULL COMMENT '电话3',
  `unit_fax` varchar(64) DEFAULT NULL COMMENT '传真',
  `unit_web_site` varchar(64) DEFAULT NULL COMMENT '网址',
  `unit_email` varchar(64) DEFAULT NULL COMMENT 'email',
  `unit_email2` varchar(64) DEFAULT NULL COMMENT 'email2',
  `unit_legal_person` varchar(50) DEFAULT NULL COMMENT '法人',
  `unit_node_attribute_id` bigint(20) DEFAULT NULL COMMENT '单位节点属性编号',
  `unit_notes` varchar(512) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`unit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `t_bd_unit` */

insert  into `t_bd_unit`(`unit_id`,`unit_name`,`unit_head_catagory`,`unit_detail_catagory`,`unit_addr`,`unit_business_license_path`,`unit_taxpayer_registration_num`,`unit_telephone`,`unit_telephone2`,`unit_telephone3`,`unit_fax`,`unit_web_site`,`unit_email`,`unit_email2`,`unit_legal_person`,`unit_node_attribute_id`,`unit_notes`) values (1,'二十所',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'徐工集团',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `v_bd_person_depart_unit` */

DROP TABLE IF EXISTS `v_bd_person_depart_unit`;

/*!50001 DROP VIEW IF EXISTS `v_bd_person_depart_unit` */;
/*!50001 DROP TABLE IF EXISTS `v_bd_person_depart_unit` */;

/*!50001 CREATE TABLE  `v_bd_person_depart_unit`(
 `t_person_id` varchar(64) ,
 `t_person_type` varchar(64) ,
 `t_person_username` varchar(64) ,
 `t_person_pwd` varchar(64) ,
 `t_person_truename` varchar(64) ,
 `t_person_sex` varchar(4) ,
 `t_person_en_name` varchar(64) ,
 `t_person_name_used` varchar(64) ,
 `t_person_telephone` varchar(64) ,
 `t_person_fax` varchar(64) ,
 `t_person_addr` varchar(512) ,
 `t_person_mobilephone` varchar(64) ,
 `t_person_email` varchar(64) ,
 `t_person_qq` varchar(64) ,
 `t_person_wetchat` varchar(64) ,
 `t_person_duty` varchar(64) ,
 `t_person_title` varchar(64) ,
 `t_person_identify_num` varchar(64) ,
 `t_person_birth` date ,
 `t_person_nation` varchar(4) ,
 `t_person_highest_degree` varchar(64) ,
 `t_person_politics_status` varchar(64) ,
 `t_person_take_job_date` date ,
 `t_person_join_work_date` date ,
 `t_person_hobbay` varchar(512) ,
 `t_person_node_attribute_id` bigint(20) ,
 `t_person_notes` varchar(512) ,
 `t_person_depart_id` bigint(20) ,
 `t_person_unit_id` bigint(20) ,
 `depart_name` varchar(64) ,
 `unit_name` varchar(512) 
)*/;

/*View structure for view v_bd_person_depart_unit */

/*!50001 DROP TABLE IF EXISTS `v_bd_person_depart_unit` */;
/*!50001 DROP VIEW IF EXISTS `v_bd_person_depart_unit` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_bd_person_depart_unit` AS select `t_bd_person`.`t_person_id` AS `t_person_id`,`t_bd_person`.`t_person_type` AS `t_person_type`,`t_bd_person`.`t_person_username` AS `t_person_username`,`t_bd_person`.`t_person_pwd` AS `t_person_pwd`,`t_bd_person`.`t_person_truename` AS `t_person_truename`,`t_bd_person`.`t_person_sex` AS `t_person_sex`,`t_bd_person`.`t_person_en_name` AS `t_person_en_name`,`t_bd_person`.`t_person_name_used` AS `t_person_name_used`,`t_bd_person`.`t_person_telephone` AS `t_person_telephone`,`t_bd_person`.`t_person_fax` AS `t_person_fax`,`t_bd_person`.`t_person_addr` AS `t_person_addr`,`t_bd_person`.`t_person_mobilephone` AS `t_person_mobilephone`,`t_bd_person`.`t_person_email` AS `t_person_email`,`t_bd_person`.`t_person_qq` AS `t_person_qq`,`t_bd_person`.`t_person_wetchat` AS `t_person_wetchat`,`t_bd_person`.`t_person_duty` AS `t_person_duty`,`t_bd_person`.`t_person_title` AS `t_person_title`,`t_bd_person`.`t_person_identify_num` AS `t_person_identify_num`,`t_bd_person`.`t_person_birth` AS `t_person_birth`,`t_bd_person`.`t_person_nation` AS `t_person_nation`,`t_bd_person`.`t_person_highest_degree` AS `t_person_highest_degree`,`t_bd_person`.`t_person_politics_status` AS `t_person_politics_status`,`t_bd_person`.`t_person_take_job_date` AS `t_person_take_job_date`,`t_bd_person`.`t_person_join_work_date` AS `t_person_join_work_date`,`t_bd_person`.`t_person_hobbay` AS `t_person_hobbay`,`t_bd_person`.`t_person_node_attribute_id` AS `t_person_node_attribute_id`,`t_bd_person`.`t_person_notes` AS `t_person_notes`,`t_bd_person`.`t_person_depart_id` AS `t_person_depart_id`,`t_bd_person`.`t_person_unit_id` AS `t_person_unit_id`,`t_bd_depart`.`depart_name` AS `depart_name`,`t_bd_unit`.`unit_name` AS `unit_name` from ((`t_bd_person` left join `t_bd_depart` on((`t_bd_person`.`t_person_depart_id` = `t_bd_depart`.`depart_id`))) left join `t_bd_unit` on((`t_bd_person`.`t_person_unit_id` = `t_bd_unit`.`unit_id`))) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
