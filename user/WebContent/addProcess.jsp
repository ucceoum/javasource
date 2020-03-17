<%@page import="domain.UserVO"%>
<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	//userAdd.jsp에서 넘긴 값 가져오기
	String userName = request.getParameter("userName");
	int birthYear = Integer.parseInt(request.getParameter("birthYear"));
	String addr = request.getParameter("addr");
	String mobile = request.getParameter("mobile");
	
	UserVO vo = new UserVO(userName, birthYear, addr, mobile);
	
	//DB작업 후 페이지 이동
	UserDAO dao = new UserDAO();
	
	int result = dao.insertUser(vo);
	
	
	if(result>0){
		response.sendRedirect("index.jsp");
		
	}else{
		response.sendRedirect("userAdd.jsp");
	}
	











%>