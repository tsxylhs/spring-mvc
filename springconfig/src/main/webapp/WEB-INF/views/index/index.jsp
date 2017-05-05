<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="/css/index.css"/>
</head>
<body>
<h1>hahah</h1>
${command}<br>
<c:forEach items="${booklist}" var ="node">
<c:out value="${node}"></c:out><br>
</c:forEach>
  <c:forEach items="${MAP}" var="node">  
      <c:out value="${node.key}"></c:out>  <br>
       <c:out value="${node.value}"></c:out>  <br>
        <br/>  
   </c:forEach> 
     <c:forEach items="${map}" var="node">  
       <c:out value="${node.key}"></c:out><br>  
       <c:out value="${node.value}"></c:out>  
        <br/>  
   </c:forEach> 
    <c:forEach  var="user" items="${list1}" >  
      ${user.username}<br>
      ${user.userpassword}<br>
      你好
         
   </c:forEach> 
</body>
</html>