<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="uploadResult1.jsp" enctype="multipart/form-data" method="post">
		<div>
			<label for="title">제목</label>
			<input type="text" name="title" id="title" />
		</div>
		<div>
			<label for="content">내용</label>
			<textarea name="content" id="content" cols="30" rows="10"></textarea>
		</div>
		<div>
			<label for="file1">첨부파일1</label>
			<input type="file" name="file1" id="file1" />
		</div>
		<div>
			<label for="file2">첨부파일2</label>
			<input type="file" name="file2" id="file2" />
		</div>
		<div>
			<button type="submit">전송</button>
		</div>
	</form>
</body>
</html>