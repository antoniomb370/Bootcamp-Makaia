-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Makaia_Jardineria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Makaia_Jardineria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Makaia_Jardineria` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema makaia_jardineria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema makaia_jardineria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `makaia_jardineria` DEFAULT CHARACTER SET utf8mb3 ;
USE `Makaia_Jardineria` ;

-- -----------------------------------------------------
-- Table `Makaia_Jardineria`.`Clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Makaia_Jardineria`.`Clientes` (
  `codigo_cliente` INT NOT NULL AUTO_INCREMENT,
  `nombre_cliente` VARCHAR(45) NOT NULL,
  `nombre_contacto` VARCHAR(45) NOT NULL,
  `apellido_contacto` VARCHAR(45) NOT NULL,
  `teléfono` VARCHAR(45) NOT NULL,
  `fax` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo_cliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Makaia_Jardineria`.`Pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Makaia_Jardineria`.`Pedidos` (
  `codigo_pedido` INT NOT NULL AUTO_INCREMENT,
  `fecha_pedido` DATE NOT NULL,
  `fecha_esperada` DATE NOT NULL,
  `fecha_entrega` DATE NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  `comentarios` TEXT NULL,
  `Clientes_codigo_cliente` INT NOT NULL,
  PRIMARY KEY (`codigo_pedido`, `Clientes_codigo_cliente`),
  CONSTRAINT `fk_Pedidos_Clientes1`
    FOREIGN KEY (`Clientes_codigo_cliente`)
    REFERENCES `Makaia_Jardineria`.`Clientes` (`codigo_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Makaia_Jardineria`.`Direccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Makaia_Jardineria`.`Direccion` (
  `id_direccion` INT NOT NULL AUTO_INCREMENT,
  `direccion1` VARCHAR(45) NOT NULL,
  `direccion2` VARCHAR(45) NOT NULL,
  `ciudad` VARCHAR(45) NOT NULL,
  `region` VARCHAR(45) NOT NULL,
  `pais` VARCHAR(45) NOT NULL,
  `codigo_postal` VARCHAR(45) NOT NULL,
  `Clientes_codigo_cliente` INT NOT NULL,
  PRIMARY KEY (`id_direccion`, `Clientes_codigo_cliente`),
  CONSTRAINT `fk_Direccion_Clientes1`
    FOREIGN KEY (`Clientes_codigo_cliente`)
    REFERENCES `Makaia_Jardineria`.`Clientes` (`codigo_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Makaia_Jardineria`.`Pagos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Makaia_Jardineria`.`Pagos` (
  `codigo_pago` INT NOT NULL AUTO_INCREMENT,
  `forma_pago` VARCHAR(45) NOT NULL,
  `id_transacción` VARCHAR(45) NOT NULL,
  `fecha_pago` DATE NOT NULL,
  `total_pago` DECIMAL NULL,
  `Clientes_codigo_cliente` INT NOT NULL,
  PRIMARY KEY (`codigo_pago`, `Clientes_codigo_cliente`),
  CONSTRAINT `fk_Pagos_Clientes1`
    FOREIGN KEY (`Clientes_codigo_cliente`)
    REFERENCES `Makaia_Jardineria`.`Clientes` (`codigo_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Makaia_Jardineria`.`jefe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Makaia_Jardineria`.`jefe` (
  `codigo_jefe` INT NOT NULL AUTO_INCREMENT,
  `codigo_oficina` INT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido1` VARCHAR(45) NULL,
  `apellido2` VARCHAR(45) NULL,
  PRIMARY KEY (`codigo_jefe`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Makaia_Jardineria`.`Oficinas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Makaia_Jardineria`.`Oficinas` (
  `codigo_oficina` INT NOT NULL AUTO_INCREMENT,
  `ciudad` VARCHAR(45) NOT NULL,
  `pais` VARCHAR(45) NOT NULL,
  `region` VARCHAR(45) NOT NULL,
  `codigo_postal` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `jefe_codigo_jefe` INT NOT NULL,
  PRIMARY KEY (`codigo_oficina`, `jefe_codigo_jefe`),
  CONSTRAINT `fk_Oficinas_jefe1`
    FOREIGN KEY (`jefe_codigo_jefe`)
    REFERENCES `Makaia_Jardineria`.`jefe` (`codigo_jefe`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Makaia_Jardineria`.`Detalle_de_Pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Makaia_Jardineria`.`Detalle_de_Pedidos` (
  `codigo_pedido` INT NOT NULL AUTO_INCREMENT,
  `codigo_producto` INT NOT NULL,
  `cantidad` VARCHAR(45) NOT NULL,
  `precio_por_unidad` DECIMAL NOT NULL,
  `Clientes_codigo_cliente` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo_pedido`, `Clientes_codigo_cliente`),
  CONSTRAINT `fk_Detalle_de_Pedidos_Clientes1`
    FOREIGN KEY (`Clientes_codigo_cliente`)
    REFERENCES `Makaia_Jardineria`.`Clientes` (`codigo_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Makaia_Jardineria`.`Productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Makaia_Jardineria`.`Productos` (
  `codigo_producto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `gama` VARCHAR(45) NOT NULL,
  `dimensiones` VARCHAR(45) NOT NULL,
  `proveedor` VARCHAR(45) NOT NULL,
  `descripcion` TEXT NULL,
  `cantidad_en_stock` INT NOT NULL,
  `precio_venta` DECIMAL NOT NULL,
  `precio_proveedor` DECIMAL NOT NULL,
  `Detalle_de_Pedidos_codigo_pedido` INT NOT NULL,
  `Detalle_de_Pedidos_Clientes_codigo_cliente` INT NOT NULL,
  PRIMARY KEY (`codigo_producto`, `Detalle_de_Pedidos_codigo_pedido`, `Detalle_de_Pedidos_Clientes_codigo_cliente`),
  CONSTRAINT `fk_Productos_Detalle_de_Pedidos1`
    FOREIGN KEY (`Detalle_de_Pedidos_codigo_pedido` , `Detalle_de_Pedidos_Clientes_codigo_cliente`)
    REFERENCES `Makaia_Jardineria`.`Detalle_de_Pedidos` (`codigo_pedido` , `Clientes_codigo_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Makaia_Jardineria`.`Gammas_de_Productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Makaia_Jardineria`.`Gammas_de_Productos` (
  `codigo_gama` INT NOT NULL,
  `descripcion` TEXT NOT NULL,
  `imagen` VARCHAR(45) NOT NULL,
  `Productos_codigo_producto` INT NOT NULL,
  PRIMARY KEY (`codigo_gama`, `Productos_codigo_producto`),
  CONSTRAINT `fk_Gammas_de_Productos_Productos1`
    FOREIGN KEY (`Productos_codigo_producto`)
    REFERENCES `Makaia_Jardineria`.`Productos` (`codigo_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Makaia_Jardineria`.`Empleados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Makaia_Jardineria`.`Empleados` (
  `codigo_empleado` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido1` VARCHAR(45) NOT NULL,
  `apellido2` VARCHAR(45) NOT NULL,
  `extension` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `puesto` VARCHAR(45) NOT NULL,
  `Clientes_codigo_cliente` INT NOT NULL,
  `Oficinas_codigo_oficina` INT NOT NULL,
  PRIMARY KEY (`codigo_empleado`, `Clientes_codigo_cliente`, `Oficinas_codigo_oficina`),
  CONSTRAINT `fk_Empleados_Clientes1`
    FOREIGN KEY (`Clientes_codigo_cliente`)
    REFERENCES `Makaia_Jardineria`.`Clientes` (`codigo_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Empleados_Oficinas1`
    FOREIGN KEY (`Oficinas_codigo_oficina`)
    REFERENCES `Makaia_Jardineria`.`Oficinas` (`codigo_oficina`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `makaia_jardineria` ;

-- -----------------------------------------------------
-- Table `makaia_jardineria`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `makaia_jardineria`.`clientes` (
  `codigo_cliente` INT NOT NULL AUTO_INCREMENT,
  `nombre_cliente` VARCHAR(45) NOT NULL,
  `nombre_contacto` VARCHAR(45) NOT NULL,
  `apellido_contacto` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `fax` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo_cliente`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `makaia_jardineria`.`detalle_de_pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `makaia_jardineria`.`detalle_de_pedidos` (
  `codigo_pedido` INT NOT NULL AUTO_INCREMENT,
  `codigo_producto` INT NOT NULL,
  `cantidad` VARCHAR(45) NOT NULL,
  `precio_por_unidad` DECIMAL(10,2) NOT NULL,
  `Clientes_codigo_cliente` INT NOT NULL,
  PRIMARY KEY (`codigo_pedido`, `Clientes_codigo_cliente`),
  CONSTRAINT `fk_Detalle_de_Pedidos_Clientes1`
    FOREIGN KEY (`Clientes_codigo_cliente`)
    REFERENCES `makaia_jardineria`.`clientes` (`codigo_cliente`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `makaia_jardineria`.`direccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `makaia_jardineria`.`direccion` (
  `id_direccion` INT NOT NULL AUTO_INCREMENT,
  `direccion1` VARCHAR(45) NOT NULL,
  `direccion2` VARCHAR(45) NOT NULL,
  `ciudad` VARCHAR(45) NOT NULL,
  `region` VARCHAR(45) NOT NULL,
  `pais` VARCHAR(45) NOT NULL,
  `codigo_postal` VARCHAR(45) NOT NULL,
  `Clientes_codigo_cliente` INT NOT NULL,
  PRIMARY KEY (`id_direccion`, `Clientes_codigo_cliente`),
  CONSTRAINT `fk_Direccion_Clientes1`
    FOREIGN KEY (`Clientes_codigo_cliente`)
    REFERENCES `makaia_jardineria`.`clientes` (`codigo_cliente`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `makaia_jardineria`.`jefe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `makaia_jardineria`.`jefe` (
  `codigo_jefe` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `apellido1` VARCHAR(45) NULL DEFAULT NULL,
  `apellido2` VARCHAR(45) NULL DEFAULT NULL,
  `codigo_oficina` INT NULL DEFAULT NULL,
  PRIMARY KEY (`codigo_jefe`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `makaia_jardineria`.`oficinas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `makaia_jardineria`.`oficinas` (
  `codigo_oficina` INT NOT NULL AUTO_INCREMENT,
  `ciudad` VARCHAR(45) NOT NULL,
  `pais` VARCHAR(45) NOT NULL,
  `region` VARCHAR(45) NOT NULL,
  `codigo_postal` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `jefe_codigo_jefe` INT NOT NULL,
  PRIMARY KEY (`codigo_oficina`, `jefe_codigo_jefe`),
  CONSTRAINT `fk_Oficinas_jefe1`
    FOREIGN KEY (`jefe_codigo_jefe`)
    REFERENCES `makaia_jardineria`.`jefe` (`codigo_jefe`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `makaia_jardineria`.`empleados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `makaia_jardineria`.`empleados` (
  `codigo_empleado` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido1` VARCHAR(45) NOT NULL,
  `apellido2` VARCHAR(45) NOT NULL,
  `extension` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `puesto` VARCHAR(45) NOT NULL,
  `Clientes_codigo_cliente` INT NOT NULL,
  `Oficinas_codigo_oficina` INT NOT NULL,
  PRIMARY KEY (`codigo_empleado`, `Clientes_codigo_cliente`, `Oficinas_codigo_oficina`),
  CONSTRAINT `fk_Empleados_Clientes1`
    FOREIGN KEY (`Clientes_codigo_cliente`)
    REFERENCES `makaia_jardineria`.`clientes` (`codigo_cliente`),
  CONSTRAINT `fk_Empleados_Oficinas1`
    FOREIGN KEY (`Oficinas_codigo_oficina`)
    REFERENCES `makaia_jardineria`.`oficinas` (`codigo_oficina`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `makaia_jardineria`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `makaia_jardineria`.`productos` (
  `codigo_producto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `gama` VARCHAR(45) NOT NULL,
  `dimensiones` VARCHAR(45) NOT NULL,
  `proveedor` VARCHAR(45) NOT NULL,
  `descripcion` TEXT NULL DEFAULT NULL,
  `cantidad_en_stock` INT NOT NULL,
  `precio_venta` DECIMAL(10,2) NOT NULL,
  `precio_proveedor` DECIMAL(10,2) NOT NULL,
  `Detalle_de_Pedidos_codigo_pedido` INT NOT NULL,
  `Detalle_de_Pedidos_Clientes_codigo_cliente` INT NOT NULL,
  PRIMARY KEY (`codigo_producto`, `Detalle_de_Pedidos_codigo_pedido`, `Detalle_de_Pedidos_Clientes_codigo_cliente`),
  CONSTRAINT `fk_Productos_Detalle_de_Pedidos1`
    FOREIGN KEY (`Detalle_de_Pedidos_codigo_pedido` , `Detalle_de_Pedidos_Clientes_codigo_cliente`)
    REFERENCES `makaia_jardineria`.`detalle_de_pedidos` (`codigo_pedido` , `Clientes_codigo_cliente`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `makaia_jardineria`.`gammas_de_productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `makaia_jardineria`.`gammas_de_productos` (
  `codigo_gama` INT NOT NULL AUTO_INCREMENT,
  `descripcion` TEXT NOT NULL,
  `imagen` VARCHAR(45) NOT NULL,
  `Productos_codigo_producto` INT NOT NULL,
  PRIMARY KEY (`codigo_gama`, `Productos_codigo_producto`),
  CONSTRAINT `fk_Gammas_de_Productos_Productos1`
    FOREIGN KEY (`Productos_codigo_producto`)
    REFERENCES `makaia_jardineria`.`productos` (`codigo_producto`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `makaia_jardineria`.`pagos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `makaia_jardineria`.`pagos` (
  `codigo_pago` INT NOT NULL AUTO_INCREMENT,
  `forma_pago` VARCHAR(45) NOT NULL,
  `id_transaccion` VARCHAR(45) NOT NULL,
  `fecha_pago` DATE NOT NULL,
  `total_pago` DECIMAL(10,2) NULL DEFAULT NULL,
  `Clientes_codigo_cliente` INT NOT NULL,
  PRIMARY KEY (`codigo_pago`, `Clientes_codigo_cliente`),
  CONSTRAINT `fk_Pagos_Clientes1`
    FOREIGN KEY (`Clientes_codigo_cliente`)
    REFERENCES `makaia_jardineria`.`clientes` (`codigo_cliente`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `makaia_jardineria`.`pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `makaia_jardineria`.`pedidos` (
  `codigo_pedido` INT NOT NULL AUTO_INCREMENT,
  `fecha_pedido` DATE NOT NULL,
  `fecha_esperada` DATE NOT NULL,
  `fecha_entrega` DATE NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  `comentarios` TEXT NULL DEFAULT NULL,
  `Clientes_codigo_cliente` INT NOT NULL,
  PRIMARY KEY (`codigo_pedido`, `Clientes_codigo_cliente`),
  CONSTRAINT `fk_Pedidos_Clientes1`
    FOREIGN KEY (`Clientes_codigo_cliente`)
    REFERENCES `makaia_jardineria`.`clientes` (`codigo_cliente`))
ENGINE = InnoDB
AUTO_INCREMENT = 41
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
