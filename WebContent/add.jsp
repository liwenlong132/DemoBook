<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><b>请输入要添加图书的信息:</b></p>
<form action="add" method="post">
图书编号:<input name="bian"/><br/>
书名:<input name="name"size="12px" /><br/>
作者:<input name="title"size="12px" /><br/>
价钱:<input name="jiaqian"size="5px" />元<br/>
出版社:<input name="chu" /><br/>
<input type="submit" value="添加" />
</form>
</body>
</html>