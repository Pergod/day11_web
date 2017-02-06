<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itcast.bean.Person"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jstl标签</title>
</head>
<body>
	<br/>---------------------c:out-------------------<br/>
	<%
		request.setAttribute("data", "data");
	%>
	<c:out value="${data}" default="xxx"/>
	<c:out value="<a href='www.baidu.com'>click</a>" default=" " escapeXml="true"/>
	<br/>---------------------c:set-------------------<br/>
	<c:set var="data" value="xxx" scope="page"/>
	${data}
	
	<%
		Map map=new HashMap();
		request.setAttribute("map",map);
	%>
	<c:set property="A" value="aaaa" target="${map}"/>
	${map.A}
	
	<%
		Person p=new Person();
		request.setAttribute("p", p);
	%>
	<c:set property="name" value="Jack" target="${p}"/>
	${p.name}
	
	<br/>---------------------c:remove-------------------<br/>
	<c:remove var="data"/>
	
	<br/>---------------------c:catch-------------------<br/>
	<c:catch var="myex">
		<%
			int x=10;
			x/=0;
		%>
	</c:catch>
	${myex.message }
	
	<br/>---------------------c:foreach-------------------<br/>
	<%
		List list=new ArrayList();
		list.add("111");
		list.add("222");
		list.add("333");
		request.setAttribute("list", list);
	%>
	<c:forEach var="str" items="${list }">
		${str}
	</c:forEach>
	<br/>
	<c:forEach var="num" begin="1" end="9" step="1">
		${num }
	</c:forEach>
	
	<%
		list=new ArrayList();
		list.add("111");
		list.add("222");
		list.add("333");
		request.setAttribute("list", list);
	%>
	<style>
		.odd{
			background-color:orange;
		}
		.even{
			background-color:blue;
		}
		tr:hover{
			background-color:pink;
		}
	</style>
	<table border="1" width="20%">
		<c:forEach var="str" items="${list}" varStatus="status">
			<tr class="${status.count%2==0?'even':'odd'}">
				<td>${str}</td>
			</tr>
		</c:forEach>
	</table>
	
	<br/>---------------------c:url-------------------<br/>
	<c:url var="url" value="/jstl/1.jsp">
		<c:param name="data" value="中国"></c:param>
	</c:url>
	<c:url value="/day11/jstl/1.jsp"/>
	<a href="${url }">购买</a>
	<a href="/day11/jstl/1.jsp?name='中国'">购买</a>
	
	<br/>---------------------c:forTokens-------------------<br/>
	<%
		request.setAttribute("data1", "aa,bb,cc,dd");
	%>
	<c:forTokens var="ss" items="${data1 }" delims=",">
		${ss }
	</c:forTokens>
</body>
</html>