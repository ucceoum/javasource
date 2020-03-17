<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form action="../index.jsp" id="myform" method="post">
	<input type="hidden" name="tab" value="" id="tab"/>


</form>
    
    
    
<%
	String msg = request.getParameter("msg");
	
	out.print("<script>");

	if(msg.equals("search")){
		out.print("alert('검색결과 없음');");
		
		//out.print("location.href='../index.jsp?tab=search'");
	}else if(msg.equals("insert")){
		out.print("alert('입력 실패');");
	}else if(msg.equals("modify")){
		out.print("alert('수정 실패');");
	}else if(msg.equals("delete")){
		out.print("alert('삭제 실패');");
	}
	
	
	out.print("document.querySelector('#tab').value='"+msg+"';");
	out.print("document.querySelector('#myform').submit();");
	
	out.print("</script>");


%>