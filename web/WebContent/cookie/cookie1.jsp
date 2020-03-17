<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String language = "korea";
	//쿠키 여부 확인
	String cookie = request.getHeader("Cookie");
	
	if(cookie!=null){
		Cookie cookies[] = request.getCookies();
		
		for(int i = 0; i < cookies.length; i++){
			if(cookies[i].getName().equals("language")){
				language = cookies[i].getValue();
			}
		}
	}

%>    
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(language.equals("korea")){
		out.print("<h3>안녕하세요 이것은 쿠키 예제입니다.</h3>");
	}else{
		out.print("<h3>Hello. This is Cookie example.</h3>");
		
	}

%>
	<form action="cookie2.jsp" method="post">
		<input type="radio" name="language" value="korea"
		<% if(language.equals("korea")){ %>
			checked
		<%} %>/>
		<label for="">한국어 페이지 보기</label>
		<input type="radio" name="language" value="english"
		<% if(language.equals("english")){ %>
			checked
		<%} %>/>
		<label for="">영어 페이지 보기</label>
		<button type="submit">보내기</button>
	</form>
</body>
</html>