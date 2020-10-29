-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2020 a las 08:20:57
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
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
  `id_campaña` int(11) NOT NULL,
  `nro_campaña` int(11) DEFAULT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `monto_minimo` float DEFAULT NULL,
  `monto_maximo` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historico_campaña`
--

CREATE TABLE `historico_campaña` (
  `id_campaña` int(11) NOT NULL,
  `id_rev` int(11) NOT NULL,
  `total_estrellas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(11) NOT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `fecha_pago` date DEFAULT NULL,
  `fecha_envio` date DEFAULT NULL,
  `fecha_entrega` date DEFAULT NULL,
  `vencido` tinyint(1) DEFAULT NULL,
  `cant_cajas` int(11) DEFAULT NULL,
  `costo` float DEFAULT NULL,
  `cant_estrellas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_campaña`
--

CREATE TABLE `pedido_campaña` (
  `id_campaña` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_revendedor`
--

CREATE TABLE `pedido_revendedor` (
  `id_rev` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `codigo` varchar(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `uso` varchar(20) DEFAULT NULL,
  `tamaño` int(11) DEFAULT NULL,
  `precio_costo` float DEFAULT NULL,
  `precio_venta` float DEFAULT NULL,
  `cant_estrellas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `renglon_pedido`
--

CREATE TABLE `renglon_pedido` (
  `id_producto` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `nro_caja` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `revendedora`
--

CREATE TABLE `revendedora` (
  `id_rev` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `dni` int(11) NOT NULL,
  `telefono` int(11) DEFAULT NULL,
  `activa` tinyint(1) DEFAULT NULL,
  `campaña` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `campaña`
--
ALTER TABLE `campaña`
  ADD PRIMARY KEY (`id_campaña`);

--
-- Indices de la tabla `historico_campaña`
--
ALTER TABLE `historico_campaña`
  ADD PRIMARY KEY (`id_campaña`,`id_rev`),
  ADD KEY `id_rev` (`id_rev`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`);

--
-- Indices de la tabla `pedido_campaña`
--
ALTER TABLE `pedido_campaña`
  ADD PRIMARY KEY (`id_campaña`,`id_pedido`),
  ADD KEY `id_pedido` (`id_pedido`);

--
-- Indices de la tabla `pedido_revendedor`
--
ALTER TABLE `pedido_revendedor`
  ADD PRIMARY KEY (`id_rev`,`id_pedido`),
  ADD KEY `id_pedido` (`id_pedido`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `renglon_pedido`
--
ALTER TABLE `renglon_pedido`
  ADD PRIMARY KEY (`id_producto`,`id_pedido`),
  ADD KEY `id_pedido` (`id_pedido`);

--
-- Indices de la tabla `revendedora`
--
ALTER TABLE `revendedora`
  ADD PRIMARY KEY (`id_rev`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `historico_campaña`
--
ALTER TABLE `historico_campaña`
  ADD CONSTRAINT `historico_campaña_ibfk_1` FOREIGN KEY (`id_campaña`) REFERENCES `campaña` (`id_campaña`),
  ADD CONSTRAINT `historico_campaña_ibfk_2` FOREIGN KEY (`id_rev`) REFERENCES `revendedora` (`id_rev`);

--
-- Filtros para la tabla `pedido_campaña`
--
ALTER TABLE `pedido_campaña`
  ADD CONSTRAINT `pedido_campaña_ibfk_1` FOREIGN KEY (`id_campaña`) REFERENCES `campaña` (`id_campaña`),
  ADD CONSTRAINT `pedido_campaña_ibfk_2` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`);

--
-- Filtros para la tabla `pedido_revendedor`
--
ALTER TABLE `pedido_revendedor`
  ADD CONSTRAINT `pedido_revendedor_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`),
  ADD CONSTRAINT `pedido_revendedor_ibfk_2` FOREIGN KEY (`id_rev`) REFERENCES `revendedora` (`id_rev`);

--
-- Filtros para la tabla `renglon_pedido`
--
ALTER TABLE `renglon_pedido`
  ADD CONSTRAINT `renglon_pedido_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`),
  ADD CONSTRAINT `renglon_pedido_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
