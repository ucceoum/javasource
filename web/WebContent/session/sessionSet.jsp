<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
	//세션값 저장
	session.setAttribute("name", "session Test!");

	//페이지 이동
	response.sendRedirect("session1.jsp");

%>