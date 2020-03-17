<%@page import="domain.UserVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.UserDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//userTBL 내용을 조회한 후 화면에 보여주기
	UserDAO dao = new UserDAO();
	ArrayList<UserVO> list = dao.getList();
	

%>
<jsp:include page="layout/header.jsp"></jsp:include>
<div class="content"> 
	<div class="container">
		<h3>USER 전체 조회</h3> 
	  <table class="table">
		  <thead class="thead-dark">
		    <tr>
		      <th scope="col">번호</th>
		      <th scope="col">이름</th>
		      <th scope="col">핸드폰</th>      
		    </tr>
		  </thead>
		  <tbody><!-- user 내용 뿌려줄 부분 -->
			<% for(UserVO user : list){ %>	  
		  		<tr>
		  			<td><%=user.getNo() %></td>
		  			<td><a href="modProcess.jsp?no=<%=user.getNo()%>"><%=user.getUserName() %></a></td>
		  			<td><%=user.getMobile() %></td>
		  		</tr>
		  	<%} %>
		  </tbody>
	</table>
</div>
</div>
<jsp:include page="layout/footer.jsp"></jsp:include>
