<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//현재 페이지에서 가지고 있는 모든 세션 삭제
	session.invalidate();
	response.sendRedirect("session1.jsp");

%>