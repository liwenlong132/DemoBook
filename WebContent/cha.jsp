<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><b>输入要查询图书的编号:</b></p>
<form action="LookServlet?a=cha" method="post">
图书编号:<input name="op" />
<input type="submit" value="查找" />
</form>
</body>
</html>