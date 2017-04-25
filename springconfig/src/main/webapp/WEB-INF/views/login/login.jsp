<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/js/login.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="regist" method="get" id="regist">
<input type="text" name="username">
<input type="password" name="userpassword">
<input type="submit" value="注册">
</form>
<form action="login" method="get"  id="login">
姓名:<input type="text" name=username></Br>
密码:<input type="password" name="userpassword"><br>
<input type="submit" onclick="login()" value="提交">

</form>
<button id="regist" onclick="regist()">注册</button>



</body>
</html>