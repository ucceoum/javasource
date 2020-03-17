<%@page import="domain.MemberVO"%>
<%@page import="persistence.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//loginFrom.jsp 에서 넘긴 값 가져오기
	String userid = request.getParameter("userid");
	String password = request.getParameter("current_password");

	//DB작업
	MemberDAO dao = new MemberDAO();
	MemberVO vo = dao.isLogin(userid, password);
	
	//받은 vo를 세션에 담기
	//loginForm 페이지로 이동
	if(vo != null){
		session.setAttribute("vo", vo);
	
	}
	response.sendRedirect("loginForm.jsp");
%>