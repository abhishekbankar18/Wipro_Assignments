<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Credentials!</h1>
	<%
		String name = (String)session.getAttribute("userName");
		String password = (String)session.getAttribute("userPassword");
	%>
<b>Name :<%= name %></b>
<b>Password :<%= password %></b>
</body>
</html>