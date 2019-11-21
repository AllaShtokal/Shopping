CREATE DATABASE  Shopping;

CREATE TABLE Shops (
id_shop CHAR(10) NOT NULL AUTO_INCREMENT Primary key,
name_shop CHAR(25) NOT NULL,
num_products INT )

CREATE TABLE Products (
id_shop CHAR(10) NOT NULL,
id_product CHAR(10) NOT NULL AUTO_INCREMENT Primary key,
name_product CHAR(25) NOT NULL,
price_product MONEY NOT NULL)

CREATE TABLE WifeOrder (
id_order CHAR(10) NOT NULL AUTO_INCREMENT Primary key,
name_product CHAR(25) NOT NULL,
price_product MONEY NOT NULL)