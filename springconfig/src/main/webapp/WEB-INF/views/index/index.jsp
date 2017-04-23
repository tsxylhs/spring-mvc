<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${command}
<c:forEach items="${booklist}" var ="node">
<c:out value="${node}"></c:out>
</c:forEach>
  <c:forEach items="${MAP}" var="node">  
        姓名：<c:out value="${node.key}"></c:out>  
        住址：<c:out value="${node.value}"></c:out>  
        <br/>  
   </c:forEach> 
</body>
</html>