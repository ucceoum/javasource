<%@page import="java.sql.Connection"%>
<%@page import="dbcp1.DBCPTest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%




	Connection con = DBCPTest.getConnection();

	if(con != null){
		out.print("<h3>연결되었습니다.</h3>");
		
	}else{
		out.print("<h3>커넥션 확인 필요.</h3>");
	}




%>