<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ssm搭建完成！！！</h1>
	id-------------用户昵称
	<hr>
	<c:forEach items="${users}" var="user">
	${user.id }-------------${user.nickname }
		<hr>
	</c:forEach>
</body>
</html>