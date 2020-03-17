
<%@page import="domain.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
%>


<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%if (session.getAttribute("loginVO")==null){%>
	<form action="../LoginServlet" method="post">
		<div>
			<label for="userid">아이디</label>
			<input type="text" name="userid" id="userid"/>
		</div> 
		<div>
			<label for="userpwd">비밀번호</label>
			<input type="password" name="userpwd" id="userpwd"/>
		</div>	
		<div>
			<button type="submit">로그인</button>
		</div>	
	</form>
	<%}else{
		
		
		LoginVO vo = (LoginVO)session.getAttribute("loginVO");
		
		out.print(vo);
		out.print("<h3>"+vo.getUserid()+"님 반갑습니다.</h3>");
	}
	
	
	%>
</body>
</html>