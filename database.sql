
CREATE DATABASE clientmanagementdb;

--
-- Table structure for table `admin_login`
--

DROP TABLE IF EXISTS `admin_login`;
CREATE TABLE `admin_login` (
  `aid` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`aid`)
)


--
-- Table structure for table `client_info`
--

DROP TABLE IF EXISTS `client_info`;
CREATE TABLE `client_info` (
  `cid` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `country` varchar(50) NOT NULL,
  `address` varchar(300) NOT NULL,
  `language` varchar(100) NOT NULL,
  PRIMARY KEY (`cid`)
)

