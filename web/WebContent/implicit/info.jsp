<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//info.html에서 사용자가 입력한 값 가져오기
	request.setCharacterEncoding("utf-8");
	String username = request.getParameter("username");
	String useraddr = request.getParameter("useraddr");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>사용자가 입력한 정보</h3>
	<h4>이름 : <%=username %></h4>
	<h4>주소 : <%=useraddr %></h4>
	
</body>
</html>