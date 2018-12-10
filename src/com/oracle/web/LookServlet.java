package com.oracle.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.ser.ServletSer;
import com.oracle.user.User;

//@WebServlet("/look")
public class LookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LookServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
				String a=request.getParameter("a");
				System.out.println("~~~~~~~~~~");
				if("look".equals(a)) {
					ServletSer ss= new ServletSer();
					List<User>list=ss.look();
					request.setAttribute("list", list);
					request.getRequestDispatcher("look.jsp").forward(request, response);
				}
				if("gai".equals(a)) {
					String op = request.getParameter("op");
					User u = new User();
					u.setBian(Integer.valueOf(op));
					ServletSer ss= new ServletSer();
					User user = ss.All(u);
					request.setAttribute("user", user);
					request.getRequestDispatcher("gai.jsp").forward(request, response);
				}
				if("xiu".equals(a)) {
					User user = new User();
					user.setBian(Integer.valueOf(request.getParameter("bian")));
					user.setName(request.getParameter("name"));
					user.setTitle(request.getParameter("title"));
					user.setJiaqian(Double.valueOf(request.getParameter("jiaqian")));
					user.setChu(request.getParameter("chu"));
					ServletSer ss = new ServletSer();
				     boolean b = ss.gai(user);
                       if(b) {
                    	   response.sendRedirect("LookServlet?a=look");
                       }
				}
				if("dele".equals(a)) {
					User user = new User();
					String op = request.getParameter("op");
					user.setBian(Integer.valueOf(op));
					ServletSer ss = new ServletSer();
					boolean b = ss.shan(user);
					if(b) {
						request.setAttribute("dele", "É¾³ý³É¹¦");
						  response.sendRedirect("LookServlet?a=look");
					}
					
				}
				if("cha".equals(a)) {
					User user = new User();
					String op = request.getParameter("op");
					user.setBian(Integer.valueOf(op));
					ServletSer ss = new ServletSer();
					User u = ss.All(user);
					request.setAttribute("user", u);
					request.getRequestDispatcher("chazhao.jsp").forward(request, response);
				}
	}


}
