<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String acc =request.getParameter("acc");
String pwd =request.getParameter("pwd");
if(acc.equals("Tom")&&pwd.equals("123")){
		request.setAttribute("acc", acc);
		request.getRequestDispatcher("Demo3.jsp").forward(request, response);
}else{
	request.setAttribute("log", "账号或密码错误重新登录");
	request.getRequestDispatcher("Demo1.jsp").forward(request, response);
}
%>
</body>
</html>