<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册页面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/login.action" method="post">
		userName:<input type="text" name="name"><br>
		pass:<input type="text" name="password"><br>
		<input type="submit" value="登录">
	</form>
</body>
</html>