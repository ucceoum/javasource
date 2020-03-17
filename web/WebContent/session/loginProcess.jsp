<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//login.jsp에서 사용자가 입력한 정보 가져오기
	String userid = request.getParameter("userid");
	String userpwd = request.getParameter("userpwd");
	
	//가져온 정보(아이디만) 를 세션에 담기
	session.setAttribute("userid", userid);
	
	//login 페이지로 이동
	response.sendRedirect("login.jsp");






%>