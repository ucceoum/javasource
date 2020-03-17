<%@page import="domain.MemberVO"%>
<%@page import="persistence.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	//joinForm.jsp에서 사용자 입력값 가져오기
	String userId = request.getParameter("userid");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	MemberVO vo = new MemberVO(userId, password, name, gender, email);
	//DB작업
	MemberDAO dao = new MemberDAO();
	
	int result = dao.joinMember(vo);
	//입력성공시 로그인페이지로 이동
	//입력실패시 회원가입 페이지로 이동
	if(result > 0){
		response.sendRedirect("loginForm.jsp");
	}else{
		response.sendRedirect("joinForm.jsp");
	}







%>