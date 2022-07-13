-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 23, 2021 at 05:55 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sale_app`
--

-- --------------------------------------------------------

--
-- Table structure for table `records`
--

CREATE TABLE `records` (
  `rec_id` int(11) NOT NULL,
  `subject` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `odo` varchar(255) NOT NULL,
  `cost` double NOT NULL,
  `disc` varchar(255) NOT NULL,
  `chas_no` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `records`
--

INSERT INTO `records` (`rec_id`, `subject`, `date`, `odo`, `cost`, `disc`, `chas_no`) VALUES
(2, 'Maintaince', '2021/08/21', '65566', 12500, 'Lower arm replace', 'CE25-88888999'),
(3, 'Service', '2021/08/11', '89651', 8500, 'Oil change & full Service', '2FED-5666995SDF'),
(4, 'Cleaning', '2021/08/22', '65600', 2500, 'Glass cleaning', 'CE25-88888999');

-- --------------------------------------------------------

--
-- Table structure for table `sold_vehicle`
--

CREATE TABLE `sold_vehicle` (
  `inv_id` int(11) NOT NULL,
  `make` varchar(80) DEFAULT NULL,
  `model` varchar(80) DEFAULT NULL,
  `color` varchar(25) DEFAULT NULL,
  `reg_no` varchar(80) DEFAULT NULL,
  `chasis_no` varchar(255) DEFAULT NULL,
  `purc_price` varchar(80) DEFAULT NULL,
  `sold_price` varchar(80) DEFAULT NULL,
  `cus_name` varchar(80) DEFAULT NULL,
  `cus_nic` varchar(80) DEFAULT NULL,
  `cus_cn` varchar(80) DEFAULT NULL,
  `sold_date` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sold_vehicle`
--

INSERT INTO `sold_vehicle` (`inv_id`, `make`, `model`, `color`, `reg_no`, `chasis_no`, `purc_price`, `sold_price`, `cus_name`, `cus_nic`, `cus_cn`, `sold_date`) VALUES
(1, 'Daihatsu', 'Charade', 'Blue', '64-4105', 'VC/45A555552222', '650000', '785000', 'Chirantha Jayakodi', '95895985v', '0712258484', '2021-08-20'),
(2, 'Land Rover', 'Range Rover', 'Gold', 'KW-9265', 'RVV-859975A88966', '10200000', '11000000', 'Ravindra Senadeera', '65254562v', '07112112211', '2021-08-23');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(80) NOT NULL,
  `sec_ques` varchar(80) DEFAULT NULL,
  `sec_ans` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `username`, `password`, `sec_ques`, `sec_ans`) VALUES
(1, 'gayana', '0000', 'Who`s your best friend?', 'jaka'),
(2, 'thejan', '111111111', 'What is your fathers name?', 'priyantha'),
(3, 'imanka', '123456789', 'Who`s your best friend?', 'gayana');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `vehicle_id` int(11) NOT NULL,
  `type` varchar(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `condition` varchar(20) DEFAULT NULL,
  `make` varchar(20) DEFAULT NULL,
  `model` varchar(50) DEFAULT NULL,
  `grade` varchar(20) DEFAULT NULL,
  `color` varchar(20) DEFAULT NULL,
  `fuel` varchar(20) DEFAULT NULL,
  `eng_cap` varchar(15) DEFAULT NULL,
  `manu_year` varchar(10) DEFAULT NULL,
  `eng_no` varchar(80) DEFAULT NULL,
  `chas_no` varchar(80) DEFAULT NULL,
  `reg_no` varchar(50) DEFAULT NULL,
  `reg_year` varchar(20) DEFAULT NULL,
  `prev_own` int(11) DEFAULT NULL,
  `img_path` varchar(255) DEFAULT NULL,
  `pur_price` varchar(255) DEFAULT NULL,
  `rec_date` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`vehicle_id`, `type`, `status`, `condition`, `make`, `model`, `grade`, `color`, `fuel`, `eng_cap`, `manu_year`, `eng_no`, `chas_no`, `reg_no`, `reg_year`, `prev_own`, `img_path`, `pur_price`, `rec_date`) VALUES
(2, 'Car', 'Registerd', 'Brand-new', 'Toyota', 'Yaris', 'F', 'Blue', 'Petrol', '1300', '2008', '1NZT-122225555', '2FED-5666995SDF', 'KH-1913', '2008', 0, 'N/A', '2500000', '2021-08-21'),
(3, 'Car', 'Registerd', 'Recondition', 'Toyota', 'Premio', 'G', 'Wine Red', 'Petrol', '1500', '2013', '2NZ-488888885', 'CE25-88888999', 'CAB-1201', '2013', 0, 'D:ImagesPremio.jpg', '5850000', '2021-08-21'),
(5, 'Car', 'Registerd', 'Recondition', 'Daihatsu', 'Charade', 'G100S', 'Blue', 'Desel', '1000', '1987', 'SD-789512158552', 'VC/45A555552222', '64-4105', '1990', 2, 'N/A', '650000', '2021-08-21'),
(6, 'SUV / Jeep', 'Registerd', 'Brand-new', 'Land Rover', 'Range Rover', 'Velar', 'Gold', 'Desel', '3200', '2011', 'FEE-2589966222S', 'RVV-859975A88966', 'KW-9265', '2012', 1, 'N/A', '10200000', '2021-08-20');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `records`
--
ALTER TABLE `records`
  ADD PRIMARY KEY (`rec_id`);

--
-- Indexes for table `sold_vehicle`
--
ALTER TABLE `sold_vehicle`
  ADD PRIMARY KEY (`inv_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`vehicle_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `records`
--
ALTER TABLE `records`
  MODIFY `rec_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `sold_vehicle`
--
ALTER TABLE `sold_vehicle`
  MODIFY `inv_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `vehicle`
--
ALTER TABLE `vehicle`
  MODIFY `vehicle_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
