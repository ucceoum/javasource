<%@page import="domain.BookVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	//book_search.jsp에서 넘긴 값 가져오기
	String keyword = request.getParameter("keyword");
	String criteria = request.getParameter("criteria");


	
	
	
	//db작업
	BookDAO dao = new BookDAO();
	ArrayList<BookVO> list = dao.searchAll(criteria, keyword);
	
	
	//리턴받은 검색결과를 request 속성에 담고
	//페이지 이동 => book_searchAll.jsp
	
	request.setAttribute("bookList", list);
	pageContext.forward("../book_searchAll.jsp");
	

%>