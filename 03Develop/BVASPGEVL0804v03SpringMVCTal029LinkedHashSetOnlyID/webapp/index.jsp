<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>

<html>
<head>
<title>.....[Evaluacion Spring 5].....</title>
</head>
<body>
	<h2>Evaluación de Spring v/5.0.8</h2>
	<hr>
	Configuración:
	<br>
	<ol>
		<li>Listar con la collections : LinkedHashSet</li>
		<li>1. Configurar el nombre logico del jsp en el file index</li>
		<li>2.Crear las carpeta bajo WEB-INF: view</li>
		<li>3.Crear el archivo jsp en la carpeta view:
			jsp0101v01ListarAfiliado.jsp</li>
		<li>Crear el archivo xml en la carperta WEB-INF
			linkedHashSet-servlet.xml</li>
		<li>Modificar el archivo web.xml para agregar el
			DispatcherServlet</li>
		<li>Crear un bean en la clase controler para mapear el objeto con
			el dom de la jsp</li>
	</ol>

	<!-- <co:url value="/view/jsp0101v01ListarAfiliado.jsp" var="messageUrl"></co:url> -->
	<co:url value="/listarAfiliados.ea" var="messageUrl" />
	<a href="${messageUrl}">Clic enter</a>
		<co:url value="/adicionarAfiliado.lhs" var="adicionarUrl"/>
	<a href="${adicionarUrl}">Nuevo de Saldo de Afiliados</a>
	<br>
	<br>
	<co:url value="/visualizarAfiliados.lhs" var="visualizarUrl"/>
	<a href="${visualizarUrl}">Visualizar Saldo de Afiliados</a>	
	<br>
	<br>
	<co:url value="/listadoAfiliados.lhs" var="listadoUrl"/>
	<a href="${listadoUrl}">Lista general de Saldo de Afiliados</a>
	<br>
	<br>
</body>
</html>