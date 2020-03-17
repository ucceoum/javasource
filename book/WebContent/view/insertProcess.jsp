<%@page import="persistence.BookDAO"%>
<%@page import="domain.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
	//book_insert.jsp에서 넘긴 값 가져오기
	String code = request.getParameter("code");
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	int price = Integer.parseInt(request.getParameter("price"));
	
	BookVO vo = new BookVO();
	
	vo.setCode(code);
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setPrice(price);
	
	BookDAO dao = new BookDAO();
	
	int result = dao.book_insert(vo);
	
	if(result > 0){//전체리스트 보여주기
		response.sendRedirect("../book_selectAll.jsp");
	}else{		//도서 입력 실패
		out.print("<script>");
		out.print("alert('입력값을 확인해 주세요');");
		out.print("history.back();");
		out.print("</script>");
	}


	
%>