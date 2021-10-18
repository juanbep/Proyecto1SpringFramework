<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Resgistro</title>
</head>
<body>

	<form:form action = "procesarFormulario" modelAttribute = "elAlumno">
	
	Nombre : <form:input path="nombre"/>
	
	<br/><br/><br/>
	
	Apellido : <form:input path="apellido"/>
	
	<br/><br/><br/>
	
	Asignaturas optativas <br>
	
	<form:select path="optativa" multiple = "true">
	
	<form:option value="diseño"   label = "diseño"></form:option>
	<form:option value="karate"   label = "karate"></form:option>
	<form:option value="comercio"   label = "comercio"></form:option>
	<form:option value="danza"   label = "danza"></form:option>
	
	</form:select>
	
	<br/><br/><br/>
	
	Barcelona<form:radiobutton path="ciudadEstudios" value = "Barcelona"/>
	Madrid<form:radiobutton path="ciudadEstudios" value = "Madrid"/>
	Valencia<form:radiobutton path="ciudadEstudios" value = "Valencia"/>
	Bilbao<form:radiobutton path="ciudadEstudios" value = "Bilbao"/>
	
	<br/><br/><br/>
	
	Inglés<form:checkbox path="idiomasAlumno" value = "Ingles"/>
	Francés<form:checkbox path="idiomasAlumno" value = "Frances"/>
	Alemán<form:checkbox path="idiomasAlumno" value = "Aleman"/>
	Chino<form:checkbox path="idiomasAlumno" value = "Chino"/>
	
	<br/><br/><br/>
	
	<input type = "submit" value = "enviar">
	
	
	</form:form>
	
</body>
</html>