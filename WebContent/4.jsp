<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/example" prefix="e" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>xxx</title>
</head>
<body>
	<%
		session.setAttribute("user", "admin");
	%>
	<e:choose>
		<e:when test="${user!=null}">true</e:when>
		<e:otherwise>false</e:otherwise>
	</e:choose>
</body>
</html>