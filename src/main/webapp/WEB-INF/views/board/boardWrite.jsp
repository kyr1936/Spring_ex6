<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${board }Write Form</h1>
	<form action="./${board }Write" method="POST">
		writer:<input type="text" name = "writer">
		title : <input type="text" name="title">
		Contents : <input type="text" name="contents">
		<button>write</button>
	</form>
</body>
</html>