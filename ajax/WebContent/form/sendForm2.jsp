<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post">
		<div>
			<label for="username">이름</label>
			<input type="text" id="username" name="username" />
		</div>
		<div>
			<button type="button">전송</button>
		</div>
	</form>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$("button").click(function(){
	//form 안의 데이터 전송
	
	//form 데이터 가져오기
	let username = $("#username").val();
	
	$.ajax({
		url : "sendFormAjax2.jsp",
		type : "post",
		data : {
			username : username
		},
		success : function(data){
			console.log(data);
			if($.trim(data)==="true"){
				alert("이름을 찾았습니다.");
			}else{
				alert("이름을 찾지 못했습니다.");
			}
		}
		
	})
	
	
	
	
})

</script>



</body>
</html>