<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//세션 유효시간 설정 10초
	session.setMaxInactiveInterval(10);

%>
<h3>세션 테스트</h3>
<h4>isNew(): <%=session.isNew() %></h4>
<h4>생성시간: <%=session.getCreationTime() %></h4>
<h4>최종접속시간: <%=session.getLastAccessedTime()%></h4>
<h4>sessionID(): <%=session.getId()%></h4> 	0`