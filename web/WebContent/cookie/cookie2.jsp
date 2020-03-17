<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//쿠키 설정
	Cookie cookie = new Cookie("language",request.getParameter("language"));
	cookie.setMaxAge(60*60*24);	//쿠키 유효시간
	response.addCookie(cookie);	//response 헤더에 값 붙여서 전송
	
	response.sendRedirect("cookie1.jsp");


%>