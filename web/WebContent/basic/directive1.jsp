<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	//멤버변수, 멤버메소드 선언
	private String str;
	private String getStr(){
	return "테스트";
}

%>
<h1><%=getStr()%></h1>
