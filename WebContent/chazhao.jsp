<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	    <%@page import="com.oracle.user.User"%>
<%@ taglib prefix="user" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>图书编号</th>
				<th>书名</th>
				<th>作者</th>
				<th>价钱/元</th>
				<th>出版社</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<tr>
		        <%
		         User user = (User)request.getAttribute("user");
		        %>
					<td><%=user.getBian() %></td>
					<td><%=user.getName() %></td>
					<td><%=user.getTitle() %></td>
					<td><%=user.getJiaqian()%></td>
					<td><%=user.getChu() %></td>
					<td>
					<a href="LookServlet?a=gai&op=<%=user.getBian() %>">修改</a>
					<a href="LookServlet?a=dele&op=<%=user.getBian() %>">删除</a>
					</td>
				</tr>
		</tbody>
	</table>
</body>
</html>