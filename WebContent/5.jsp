<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
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
	
	<%
		Map map=new HashMap();
		map.put("1", "hahaha");
		map.put("2", "xixixi");
		request.setAttribute("map", map);
	%>
	
	<%
		int[] num={1,2,3};
		request.setAttribute("num", num);
	%>
	
	<e:foreach var="str" item="${list}">
		${str }
	</e:foreach>
	
	<e:foreach var="entry" item="${map}">
		${entry.value}
		${entry.key} 
	</e:foreach>
	
	<e:foreach var="i" item="${num}">
		${i }
	</e:foreach>
	
</body>
</html>