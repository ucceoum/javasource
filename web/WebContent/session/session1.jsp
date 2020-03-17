<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String name;
	if(session.getAttribute("name")!= null){
		name=(String)session.getAttribute("name");
	}else{
		name = "세션 값 없음";
	}
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>세션 테스트</h3>
	<button type="button" onclick="location.href='sessionSet.jsp'">세션 값 저장</button>
	<button type="button" onclick="location.href='sessionRemove.jsp'">세션 값 삭제</button>
	<button type="button" onclick="location.href='sessionInvalidate.jsp'">세션 값 초기화</button>
	
	<%=name %>	
	
</body>
</html>