<%@page import="domain.UserVO"%>
<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	

	//no에 해당하는 정보를  DB에서 가지고 오기
	UserDAO dao = new UserDAO();
	
	dao.getRow(no);
	UserVO vo = dao.getRow(no);
	
	if(vo == null){ // 내용이 없는 것
		
	}else{
		request.setAttribute("vo", vo);
		//페이지 이동 = sendRedirect, forward
		pageContext.forward("userMod.jsp");
	}






%>