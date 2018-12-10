package com.oracle.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.ser.ServletSer;
import com.oracle.user.User;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		User user = new User();
		user.setBian(Integer.valueOf(request.getParameter("bian")));
		user.setName(request.getParameter("name"));
		user.setTitle(request.getParameter("title"));
		user.setJiaqian(Double.valueOf(request.getParameter("jiaqian")));
		user.setChu(request.getParameter("chu"));
		ServletSer ss = new ServletSer();
		boolean b = ss.add(user);
		if(b) {
			response.sendRedirect("LookServlet?a=look");
		}else {
			request.setAttribute("a", "可能已存在改图书");
			request.getRequestDispatcher("add.jsp").forward(request, response);
		}
		
	}

}
