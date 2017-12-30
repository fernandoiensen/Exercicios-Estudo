CREATE SCHEMA `db_teste` ;

CREATE TABLE `db_teste`.`PESSOAS` (
  `cpf` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `data_nascimento` DATE NULL,
  PRIMARY KEY (`cpf`));
