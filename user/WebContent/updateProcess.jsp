<%@page import="dao.UserDAO"%>
<%@page import="domain.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	//userMod.jsp 에서 넘긴값 가져오기
	//no, addr, mobile
	int no = Integer.parseInt(request.getParameter("no"));
	String addr = request.getParameter("addr");
	String mobile = request.getParameter("mobile");
	
	UserVO vo = new UserVO();
	vo.setNo(no);
	vo.setAddr(addr);
	vo.setMobile(mobile);
	
	
	//수정작업 후 index 페이지로 이동
	UserDAO dao = new UserDAO();
	int result = dao.updateUser(vo);
	
	if(result > 0){
		response.sendRedirect("index.jsp");
	} 

%>