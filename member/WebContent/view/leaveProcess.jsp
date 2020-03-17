<%@page import="domain.MemberVO"%>
<%@page import="persistence.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	

	//leaveForm에서 넘긴 값 가져오기 - userid, current_password
	String userid = request.getParameter("userid");
	String password = request.getParameter("current_password");
	
	
	
	//DB확인 - 아이디와 비밀번호 맞는지 확인
	MemberDAO dao = new MemberDAO();
	MemberVO vo = dao.isLogin(userid, password);
	
	if(vo != null){
	//맞다면 회원삭제
	//회원삭제 성공 후 세션삭제
		int result = dao.leave(userid, password);
		if(result > 0){
		session.removeAttribute("vo");
		response.sendRedirect("../index.jsp");
		}
	}else{
	//비밀번호가 맞지 않다면 
	//leaveForm.jsp로 돌려보내기
		response.sendRedirect("leaveForm.jsp");
	}
	
%>