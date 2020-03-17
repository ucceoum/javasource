<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%-- info2.html에서 보낸 값 가져오기 --%>
<%
	//한글처리
	request.setCharacterEncoding("utf-8");
	
	String username = request.getParameter("username");
	String useraddr = request.getParameter("useraddr");
	String hobby = request.getParameter("hobby");
	String[] fruits = request.getParameterValues("fruits");
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>이름 : <%=username %></h3>
	<h3>주소 : <%=useraddr %></h3>
	<h3>취미 : <%=hobby %></h3>
	<h3>과일 : <%=Arrays.toString(fruits) %></h3>
	
	
	
</body>
</html>