<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.oracle.user.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
User user = (User)request.getAttribute("user");
request.setCharacterEncoding("utf-8");
if(user!=null){
	%>
<form action="LookServlet?a=xiu" method="post">
图书编号:<input name="bian" value="<%=user.getBian() %>"/><br/>
书名:<input name="name"size="12px" value="<%=user.getName() %>"/><br/>
作者:<input name="title"size="12px" value="<%=user.getTitle() %>"/><br/>
价钱:<input name="jiaqian"size="5px" value="<%=user.getJiaqian() %>"/>元<br/>
出版社:<input name="chu" value="<%=user.getChu() %>"/><br/>
<input type="submit" value="修改" />
</form>
	<%
}else{
	%>
	<form action="LookServlet" method="post">
图书编号:<input name="bian"/><br/>
书名:<input name="name"size="12px" /><br/>
作者:<input name="title"size="12px" /><br/>
价钱:<input name="jiaqian"size="5px" />元<br/>
出版社:<input name="chu" /><br/>
<input type="submit" value="修改" />
</form>
	<%
}
%>
</body>
</html>