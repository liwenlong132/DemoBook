<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><b>请输入删除图书的编号:</b></p>
<form action="LookServlet?a=dele" method="post">
 图书编号:<input type="text" name="op"/>
 <input type="submit" value="删除">
</form>
</body>
</html>