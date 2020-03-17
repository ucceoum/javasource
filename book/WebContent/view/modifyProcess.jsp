<%@page import="persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//book_modify.jsp에서 넘긴 값 가져오기
	String code = request.getParameter("code");
	int price = Integer.parseInt(request.getParameter("price"));
	
	//DB 수정작업
	BookDAO dao = new BookDAO();
	int result = dao.book_update(code, price);
	//수정성공 후 리스트 보여주기
	
	if(result > 0){
		response.sendRedirect("../book_selectAll.jsp");
	}else{
		out.print("<script>");
		out.print("alert('코드 값을 확인해 주세요');");
		out.print("location.href='../index.jsp?tab=modify';");
		out.print("</script>");
		
	}

%>