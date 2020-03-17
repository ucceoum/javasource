<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int total = 0;
	for(int i = 1; i <= 10; i++){
		total += i;
	}
	out.print("<h2>"+total+"</h2>"); 	//
%>
<%--    out.print(total)  =  <%=total%>          --%>

<h2><%=total%></h2>