-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2020 a las 00:32:33
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
  `NRO_CAMPAÑA` int(11) DEFAULT NULL,
  `FECHA_INICIO` date DEFAULT NULL,
  `FECHA_FIN` date DEFAULT NULL,
  `MONTO_MINIMO` float DEFAULT NULL,
  `MONTO_MAXIMO` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `ID_PEDIDO` int(11) NOT NULL,
  `FECHA_INGRESO` date DEFAULT NULL,
  `FECHA_PAGO` date NOT NULL,
  `FECHA_ENVIO` int(11) NOT NULL,
  `FECHA_ENTREGA` int(11) NOT NULL,
  `VENCIDO` tinyint(1) DEFAULT 0,
  `ID_REVENDEDORA` int(11) NOT NULL,
  `ID_CAMPAÑA` int(11) NOT NULL,
  `CANT_CAJAS` tinyint(4) DEFAULT 1,
  `COSTO` float DEFAULT 0,
  `CANT_ESTRELLAS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_campaña`
--

CREATE TABLE `pedido_campaña` (
  `ID_CAMPAÑA` int(11) NOT NULL,
  `ID_PEDIDO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_revendedor`
--

CREATE TABLE `pedido_revendedor` (
  `ID_REV` int(11) DEFAULT NULL,
  `ID_PEDIDO` int(11) DEFAULT NULL
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
  `TAMAÑO_CM3` smallint(6) DEFAULT 1,
  `PRECIO_COSTO` float DEFAULT 0,
  `PRECIO_PUBLICO` float DEFAULT 0,
  `CANT_ESTRELLAS` tinyint(4) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `renglon_pedido`
--

CREATE TABLE `renglon_pedido` (
  `ID_PRODUCTO` int(11) DEFAULT NULL,
  `ID_PEDIDO` int(11) DEFAULT NULL,
  `CANTIDAD` int(11) NOT NULL DEFAULT 1,
  `NRO_CAJA` int(11) DEFAULT 1
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
  `CAMPAÑA` int(11) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `campaña`
--
ALTER TABLE `campaña`
  ADD PRIMARY KEY (`ID_CAMPAÑA`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`ID_PEDIDO`);

--
-- Indices de la tabla `pedido_campaña`
--
ALTER TABLE `pedido_campaña`
  ADD KEY `FK_ID_CAMPAÑA` (`ID_CAMPAÑA`);

--
-- Indices de la tabla `pedido_revendedor`
--
ALTER TABLE `pedido_revendedor`
  ADD KEY `FK_ID_REVENDEDORA` (`ID_REV`),
  ADD KEY `FK_ID_` (`ID_PEDIDO`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`ID_PRODUCTO`);

--
-- Indices de la tabla `renglon_pedido`
--
ALTER TABLE `renglon_pedido`
  ADD KEY `FK_ID_PEDIDO` (`ID_PEDIDO`),
  ADD KEY `FK_ID_PRODUCTO` (`ID_PRODUCTO`);

--
-- Indices de la tabla `revendedora`
--
ALTER TABLE `revendedora`
  ADD PRIMARY KEY (`ID_REV`);

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
  MODIFY `ID_PRODUCTO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `revendedora`
--
ALTER TABLE `revendedora`
  MODIFY `ID_REV` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedido_campaña`
--
ALTER TABLE `pedido_campaña`
  ADD CONSTRAINT `FK_ID_CAMPAÑA` FOREIGN KEY (`ID_CAMPAÑA`) REFERENCES `campaña` (`ID_CAMPAÑA`);

--
-- Filtros para la tabla `pedido_revendedor`
--
ALTER TABLE `pedido_revendedor`
  ADD CONSTRAINT `FK_ID_` FOREIGN KEY (`ID_PEDIDO`) REFERENCES `pedido` (`ID_PEDIDO`),
  ADD CONSTRAINT `FK_ID_REVENDEDORA` FOREIGN KEY (`ID_REV`) REFERENCES `revendedora` (`ID_REV`);

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
