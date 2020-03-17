<%@page import="persistence.MemberDAO"%>
<%@page import="domain.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//modifyForm.jsp에서 넘긴 값 가져오기
	String current_password = request.getParameter("current_password");
	String new_password = request.getParameter("new_password");
	String confirm_password = request.getParameter("confirm_password");
	MemberVO vo = (MemberVO)session.getAttribute("vo");
	
	
	//새비밀번호와 새비밀번호 확인이 같은 값인지 확인
	if(new_password.equals(confirm_password)){
		
		//현재 비밀번호가 맞는지 확인하기 => islogin
		MemberDAO dao = new MemberDAO();
		
		MemberVO vo1 = dao.isLogin(vo.getUserid(), current_password);
		if(vo != null){
			//맞다면 비밀번호 변경
			//세션 해제
			//로그인폼 보여주기
			int result = dao.memberUpdate(vo.getUserid(), new_password);
			if(result > 0){
				session.removeAttribute("vo");
				response.sendRedirect("loginForm.jsp");
			}else{
				response.sendRedirect("modifyForm.jsp");
			}
			
		}else{
			//현재 비밀번호가 맞지 않다면 modifyForm.jsp 보여주기
			response.sendRedirect("modifyForm.jsp");
		}

		
	}else{
	
		response.sendRedirect("modifyForm.jsp");
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


%>