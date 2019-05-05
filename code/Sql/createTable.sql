-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema cvTool
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cvTool
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cvTool` DEFAULT CHARACTER SET utf8 ;
USE `cvTool` ;

-- -----------------------------------------------------
-- Table `cvTool`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cvTool`.`User` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `phone` VARCHAR(45) NULL,
  `email` VARCHAR(255) NULL,
  `user_name` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `address` VARCHAR(255) NULL,
  `proffesion` VARCHAR(255) NULL,
  `birth_date` DATETIME NULL,
  `premium` TINYINT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cvTool`.`CV`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cvTool`.`CV` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `path` VARCHAR(255) NULL,
  `other_qualifications` VARCHAR(255) NULL,
  `personal_description` VARCHAR(255) NULL,
  `user` INT NOT NULL,
  PRIMARY KEY (`id`, `user`),
  INDEX `fk_CV_User1_idx` (`user` ASC),
  CONSTRAINT `fk_CV_User1`
    FOREIGN KEY (`user`)
    REFERENCES `cvTool`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cvTool`.`Language`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cvTool`.`Language` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `qualifier` INT NULL,
  `CV` INT NOT NULL,
  PRIMARY KEY (`id`, `CV`),
  INDEX `fk_Language_CV1_idx` (`CV` ASC),
  CONSTRAINT `fk_Language_CV1`
    FOREIGN KEY (`CV`)
    REFERENCES `cvTool`.`CV` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cvTool`.`Skill`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cvTool`.`Skill` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `qualifier` INT NULL,
  `CV` INT NOT NULL,
  PRIMARY KEY (`id`, `CV`),
  INDEX `fk_Skill_CV1_idx` (`CV` ASC),
  CONSTRAINT `fk_Skill_CV1`
    FOREIGN KEY (`CV`)
    REFERENCES `cvTool`.`CV` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cvTool`.`Education`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cvTool`.`Education` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `start_date` DATETIME NULL,
  `end_date` DATETIME NULL,
  `CV` INT NOT NULL,
  PRIMARY KEY (`id`, `CV`),
  INDEX `fk_Education_CV1_idx` (`CV` ASC),
  CONSTRAINT `fk_Education_CV1`
    FOREIGN KEY (`CV`)
    REFERENCES `cvTool`.`CV` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cvTool`.`Experience`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cvTool`.`Experience` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `end_date` DATETIME NULL,
  `start_date` DATETIME NULL,
  `CV` INT NOT NULL,
  PRIMARY KEY (`id`, `CV`),
  INDEX `fk_Experience_CV1_idx` (`CV` ASC),
  CONSTRAINT `fk_Experience_CV1`
    FOREIGN KEY (`CV`)
    REFERENCES `cvTool`.`CV` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
