CREATE DATABASE  IF NOT EXISTS `hills` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hills`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: hills
-- ------------------------------------------------------
-- Server version	5.6.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `zip` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,1101,'John','Smith','88 Jefferson','Madison','WI','85484','987-565-9845'),(2,1102,'Jerry','Lewis','1234 West Main St','Madison','WI','85484','654-987-5264'),(3,1103,'Jimmy','Carter','665 Madison Ave','Milwaukee','WI','66515','454-484-6598'),(4,1104,'Sherry','Cleveland','1205 Porter Lane','Waukesha','WI','56584','486-486-8978'),(5,1105,'James','Esco','12555 WEst Chester','Pewaukee','WI','53072','656-584-8494'),(6,1106,'Steve ','Yanko','363 Road House Lane','Brookfield','WI','53074','325-789-9889'),(7,1107,'Charlie','Rymer','122 Bolton Ave','Brookfield','WI','53074','354-489-7898'),(8,1108,'Jackie','Miles','686 Ridgewood','Pewaukee','WI','53072','456-987-9987'),(9,1109,'Trever','Hoffman','187 Golf Lane','Pewaukee','WI','53072','478-889-9754'),(10,1110,'Connor','Taylor','622 Jimmy Lane','Waukesha','WI','56584','325-484-4964'),(11,1111,'Amber','Marinetti','744 Cherry Tree Lane','Pewaukee','WI','53072','348-887-4618'),(12,1112,'Aaron','Cross','232 Sickamore Lane','Milwaukee','WI','66515','425-947-1156'),(13,1113,'Brooke','Finley','640 JSF Lane','Milwaukee','WI','66525','321-987-4156'),(14,0,'','','','','',NULL,NULL);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-11-18 17:24:43
