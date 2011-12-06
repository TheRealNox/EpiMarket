<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page import="java.util.Date"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>EpiMarket</title>
</head>
<body>
	<f:view>
		<fieldset>
		<legend align=top>EpiMarket</legend>
			<p>
			<h:form>
				Bienvenue sur EpiMarket <h:outputText value="#{loginBean.login}"/>. Il est actuellement
				<%=new Date().toString().substring(11, 19) %>.
			</h:form>
			</p>
		</fieldset>
	</f:view>
</body>
</html>