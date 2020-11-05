-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-11-2020 a las 20:11:07
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `aivon`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `campaña`
--

CREATE TABLE `campaña` (
  `ID_CAMPAÑA` int(11) NOT NULL,
  `NRO_CAMPAÑA` int(11) NOT NULL,
  `FECHA_INICIO` date NOT NULL,
  `FECHA_FIN` date NOT NULL,
  `MONTO_MINIMO` float NOT NULL,
  `MONTO_MAXIMO` int(11) NOT NULL,
  `ANULADO` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `ID_PEDIDO` int(11) NOT NULL,
  `FECHA_INGRESO` date DEFAULT NULL,
  `FECHA_PAGO` date DEFAULT NULL,
  `FECHA_ENTREGA` date DEFAULT NULL,
  `ID_REVENDEDORA` int(11) NOT NULL,
  `ID_CAMPAÑA` int(11) NOT NULL,
  `CANT_CAJAS` int(11) DEFAULT 1,
  `TOTAL_COSTO` float NOT NULL,
  `ANULADO` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `ID_PRODUCTO` int(11) NOT NULL,
  `CODIGO` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `NOMBRE` varchar(25) COLLATE utf8_spanish_ci DEFAULT NULL,
  `USO` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `TAMAÑO_CM3` int(11) DEFAULT 1,
  `PRECIO_COSTO` float DEFAULT 0,
  `PRECIO_PUBLICO` float DEFAULT 0,
  `CANT_ESTRELLAS` int(11) DEFAULT 0,
  `ANULADO` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`ID_PRODUCTO`, `CODIGO`, `NOMBRE`, `USO`, `TAMAÑO_CM3`, `PRECIO_COSTO`, `PRECIO_PUBLICO`, `CANT_ESTRELLAS`, `ANULADO`) VALUES
(1, 'CR-1001', 'Crema Extra Hidratante', 'Crema', 120, 250.5, 400, 155, 0),
(5, 'CR-1002', 'Crema Garmin', 'Crema', 120, 250.5, 400, 10, 0),
(7, 'CR-1003', 'Crema Garmin', 'Crema', 125, 250.5, 400, 10, 0),
(11, 'CR-1004', 'Crema Garmin', 'Crema', 125, 350.5, 400, 10, 0),
(18, 'CR-1005', 'Crema Garmin', 'Crema', 125, 350.5, 400, 10, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `renglon_pedido`
--

CREATE TABLE `renglon_pedido` (
  `ID_RENGLON` int(11) NOT NULL,
  `ID_PRODUCTO` int(11) NOT NULL,
  `ID_PEDIDO` int(11) NOT NULL,
  `CANTIDAD` int(11) NOT NULL DEFAULT 1,
  `NRO_CAJA` int(11) DEFAULT 1,
  `PRECIO_COSTO` float NOT NULL DEFAULT 0,
  `PRECIO_PUBLICO` float NOT NULL DEFAULT 0,
  `CANT_ESTRELLAS` int(11) DEFAULT 0,
  `ANULADO` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `revendedora`
--

CREATE TABLE `revendedora` (
  `ID_REV` int(11) NOT NULL,
  `NOMBRE` varchar(15) COLLATE utf8_spanish_ci DEFAULT NULL,
  `APELLIDO` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `DNI` int(11) DEFAULT NULL,
  `TEL` int(11) DEFAULT NULL,
  `MAIL` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `ACTIVA` tinyint(1) DEFAULT 1,
  `NIVEL` int(11) DEFAULT 1,
  `ANULADO` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `campaña`
--
ALTER TABLE `campaña`
  ADD PRIMARY KEY (`ID_CAMPAÑA`),
  ADD UNIQUE KEY `NRO_CAMPAÑA` (`NRO_CAMPAÑA`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`ID_PEDIDO`),
  ADD KEY `FK_ID_REVENDEDORA` (`ID_REVENDEDORA`) USING BTREE,
  ADD KEY `FK_ID_CAMPAÑA` (`ID_CAMPAÑA`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`ID_PRODUCTO`),
  ADD UNIQUE KEY `CODIGO` (`CODIGO`);

--
-- Indices de la tabla `renglon_pedido`
--
ALTER TABLE `renglon_pedido`
  ADD PRIMARY KEY (`ID_RENGLON`),
  ADD KEY `FK_ID_PEDIDO` (`ID_PEDIDO`),
  ADD KEY `FK_ID_PRODUCTO` (`ID_PRODUCTO`);

--
-- Indices de la tabla `revendedora`
--
ALTER TABLE `revendedora`
  ADD PRIMARY KEY (`ID_REV`),
  ADD UNIQUE KEY `DNI` (`DNI`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `campaña`
--
ALTER TABLE `campaña`
  MODIFY `ID_CAMPAÑA` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `ID_PEDIDO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `ID_PRODUCTO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `renglon_pedido`
--
ALTER TABLE `renglon_pedido`
  MODIFY `ID_RENGLON` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `revendedora`
--
ALTER TABLE `revendedora`
  MODIFY `ID_REV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `FK_ID_CAMPAÑA` FOREIGN KEY (`ID_CAMPAÑA`) REFERENCES `campaña` (`ID_CAMPAÑA`),
  ADD CONSTRAINT `FK_ID_REVENDEDOR` FOREIGN KEY (`ID_REVENDEDORA`) REFERENCES `revendedora` (`ID_REV`);

--
-- Filtros para la tabla `renglon_pedido`
--
ALTER TABLE `renglon_pedido`
  ADD CONSTRAINT `FK_ID_PEDIDO` FOREIGN KEY (`ID_PEDIDO`) REFERENCES `pedido` (`ID_PEDIDO`),
  ADD CONSTRAINT `FK_ID_PRODUCTO` FOREIGN KEY (`ID_PRODUCTO`) REFERENCES `producto` (`ID_PRODUCTO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
