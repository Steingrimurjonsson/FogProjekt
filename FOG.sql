CREATE DATABASE  IF NOT EXISTS `FOG` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `FOG`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: 167.99.209.146    Database: FOG
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Invoice`
--

DROP TABLE IF EXISTS `Invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Invoice` (
  `idInvoice` int(11) NOT NULL AUTO_INCREMENT,
  `idOrder` int(11) NOT NULL,
  `totalPrice` double NOT NULL,
  PRIMARY KEY (`idInvoice`),
  KEY `idOrder_idx` (`idOrder`),
  CONSTRAINT `idOrder` FOREIGN KEY (`idOrder`) REFERENCES `Order` (`idOrder`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Invoice`
--

LOCK TABLES `Invoice` WRITE;
/*!40000 ALTER TABLE `Invoice` DISABLE KEYS */;
INSERT INTO `Invoice` VALUES (34,99,2307),(35,100,591),(36,101,2209),(37,102,2751),(49,114,2610),(50,115,2708),(51,116,2349),(52,117,2209),(53,118,2307),(54,119,2349),(55,120,2265);
/*!40000 ALTER TABLE `Invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Order`
--

DROP TABLE IF EXISTS `Order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Order` (
  `idOrder` int(11) NOT NULL AUTO_INCREMENT,
  `idUser` int(11) NOT NULL,
  `length` int(11) NOT NULL,
  `width` int(11) NOT NULL,
  `roofMat` varchar(50) NOT NULL,
  `shed` tinyint(4) NOT NULL,
  `slope` int(11) NOT NULL,
  `shedLength` int(11) NOT NULL,
  `shedWidth` int(11) NOT NULL,
  PRIMARY KEY (`idOrder`),
  KEY `userID_idx` (`idUser`),
  CONSTRAINT `userID` FOREIGN KEY (`idUser`) REFERENCES `User` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Order`
--

LOCK TABLES `Order` WRITE;
/*!40000 ALTER TABLE `Order` DISABLE KEYS */;
INSERT INTO `Order` VALUES (99,1,330,330,'Plasttrapezplader',1,0,150,300),(100,1,330,330,'Plasttrapezplader',0,0,0,0),(101,1,330,330,'Betontagsten - Brun',1,20,120,300),(102,1,690,690,'Betontagsten - Sort',1,35,300,660),(114,69,540,390,'Eternittag B6 - Mokka (brun)',1,20,270,360),(115,69,570,330,'Plasttrapezplader',1,0,270,300),(116,69,420,360,'Plasttrapezplader',1,0,300,330),(117,69,390,360,'Eternittag B6 - Sort',1,25,150,330),(118,69,420,330,'Plasttrapezplader',1,0,150,300),(119,69,420,300,'Plasttrapezplader',1,0,360,270),(120,69,480,270,'Plasttrapezplader',1,0,210,240);
/*!40000 ALTER TABLE `Order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `OrderDetails`
--

DROP TABLE IF EXISTS `OrderDetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `OrderDetails` (
  `idOrderDetails` int(11) NOT NULL AUTO_INCREMENT,
  `idOrder` int(11) NOT NULL,
  `doorHinge` int(11) NOT NULL,
  `door` int(11) NOT NULL,
  `doorHandle` int(11) NOT NULL,
  `roofScrew` int(11) NOT NULL,
  `screw` int(11) NOT NULL,
  `post` int(11) NOT NULL,
  `woodSide` int(11) NOT NULL,
  `woodRoof` int(11) NOT NULL,
  `roofStone` int(11) NOT NULL,
  `roofPlast` int(11) NOT NULL,
  PRIMARY KEY (`idOrderDetails`),
  KEY `idOrderDetail_idx` (`idOrder`),
  CONSTRAINT `idOrderDetail` FOREIGN KEY (`idOrder`) REFERENCES `Order` (`idOrder`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OrderDetails`
--

LOCK TABLES `OrderDetails` WRITE;
/*!40000 ALTER TABLE `OrderDetails` DISABLE KEYS */;
INSERT INTO `OrderDetails` VALUES (37,99,2,1,1,10,16,6,22,6,0,10),(38,100,0,0,0,10,16,4,0,6,0,7),(39,101,2,1,1,10,16,6,22,6,41,0),(40,102,2,1,1,12,22,8,27,8,19,0),(52,114,2,1,1,11,19,8,24,7,45,0),(53,115,2,1,1,11,19,8,24,7,0,12),(54,116,2,1,1,10,16,6,24,6,0,11),(55,117,2,1,1,10,16,6,22,6,11,0),(56,118,2,1,1,10,16,6,22,6,0,10),(57,119,2,1,1,10,16,6,24,6,0,11),(58,120,2,1,1,10,16,6,20,6,0,9);
/*!40000 ALTER TABLE `OrderDetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Stock`
--

DROP TABLE IF EXISTS `Stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Stock` (
  `idMaterial` int(11) NOT NULL,
  `materialDesc` varchar(45) NOT NULL,
  `stock` int(11) NOT NULL,
  PRIMARY KEY (`idMaterial`),
  UNIQUE KEY `idMaterial_UNIQUE` (`idMaterial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Stock`
--

LOCK TABLES `Stock` WRITE;
/*!40000 ALTER TABLE `Stock` DISABLE KEYS */;
INSERT INTO `Stock` VALUES (1,'doorHinge',99998),(2,'door',99999),(3,'doorHandle',99999),(4,'roofScrew',99990),(5,'screw',99984),(6,'post',99994),(7,'woodSide',99980),(8,'woodRoof',99994),(9,'roofStone',100000),(10,'roofPlast',99991);
/*!40000 ALTER TABLE `Stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `User` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `street` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `zip` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=110 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES (1,'admin','admin','Brian','Wood','admin','admin','admin','admin','admin','admin'),(68,'steinkolbeinn@gmail.com','1234','Stein','Jonsson','12341234','Easystreet','NaMcity','7777','Uganda','customer'),(69,'sfg@live.dk','noell','Noell','Gierringe','12345678','SomeStreet','SomeCity','2800','DK','customer'),(108,'king@fed.com','uhahvorhemmeligt','d','dd','se','dde','sef','ferw','sef','s'),(109,'fhhh@hotmail.com','ff','ff','ff','38833333','fkkf','fjjf','3993',',','customer');
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Users_test`
--

DROP TABLE IF EXISTS `Users_test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Users_test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `street` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `zip` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users_test`
--

LOCK TABLES `Users_test` WRITE;
/*!40000 ALTER TABLE `Users_test` DISABLE KEYS */;
INSERT INTO `Users_test` VALUES (1,'admin','admin','Brian','Wood','admin','admin','admin','admin','admin','admin'),(68,'steinkolbeinn@gmail.com','1234','Stein','Jonsson','12341234','Easystreet','NaMcity','7777','Uganda','customer'),(69,'sfg@live.dk','noell','Noell','Gierringe','12345678','SomeStreet','SomeCity','2800','DK','customer'),(108,'king@fed.com','uhahvorhemmeligt','d','dd','se','dde','sef','ferw','sef','s');
/*!40000 ALTER TABLE `Users_test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'FOG'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-21  0:14:20
