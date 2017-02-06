<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/example" prefix="e" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		List list=new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		request.setAttribute("list", list);
	%>
	<e:foreach var="str" item="${list}">
		${str }
	</e:foreach>
</body>
</html>