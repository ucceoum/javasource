<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//application : 웹 어플리케이션의 실행환경을 제공하는 서버측 정보
	//				서버 측 자원에 대한 정보
	//				해당 어플리케이션의 이벤트 로그를 다루는 메소드 제공
	
	
	String appPath = application.getContextPath();
	String filePath = application.getRealPath("application.jsp");
	
	out.print("<h3>"+appPath+"</h3>");
	out.print("<h3>"+filePath+"</h3>");


%>    
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>