<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2><%=request.getParameter("num") %></h2>
	<%
		request.setAttribute("num", request.getParameter("num"));
		pageContext.forward("requestScope3.jsp");
	%>
	<!-- <a href="requestScope3.jsp">이동</a>-->
	
</body>
</html>