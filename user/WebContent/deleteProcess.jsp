<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	//userDel.jsp에서 넘긴 값 가져오기
 	request.setCharacterEncoding("utf-8");
 	int no = Integer.parseInt(request.getParameter("no"));
 	String userName = request.getParameter("userName");
 	
 	//DB작업
 	UserDAO dao = new UserDAO();
 	int result = dao.deleteUser(no, userName);
 	
 	//result==1 => index.jsp
 	//result==0 => userDel.jsp
 	if(result>0){
 		response.sendRedirect("index.jsp");
 	}else{
 		response.sendRedirect("userDel.jsp");
 	}
 
 
 
 
 
 %>