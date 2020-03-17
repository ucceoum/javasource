<%@page import="persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	

	//book_delete.jsp에서 넘긴 값 가져오기
	String code = request.getParameter("code");

	//DB에서 삭제작업
	BookDAO dao = new BookDAO();
	int result = dao.book_delete(code);
	//삭제후 리스트 보여주기
	
	if(result > 0){
		response.sendRedirect("../book_selectAll.jsp");
	}else{
		out.print("<script>");
		out.print("alert('코드를 확인해 주세요');");
		out.print("location.href='../index.jsp?tab=delete';");
		
		//out.print("history.back();");
		out.print("</script>");
		
		
	}
	




%>