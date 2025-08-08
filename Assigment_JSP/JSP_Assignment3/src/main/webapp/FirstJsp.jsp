<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name, password;
		name = request.getParameter("name");
		password = request.getParameter("password");
	%>
		Welcome <%= name%>
	<%
		session.setAttribute("userName", name);
		session.setAttribute("userPassword", password);
	%>
	<p><a href="SecondJsp.jsp">Get Credentials</a></p>
</body>
</html>