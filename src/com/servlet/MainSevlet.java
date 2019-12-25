package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MainSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String contextPath = "";
    public MainSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/login.html");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contextPath = request.getContextPath();		
		String ename = request.getParameter("username");
		
		String password = request.getParameter("Password");
		
		boolean f = com.dataobjects.UserDAO.checkUser(ename,password);
		
		if(f){
			contextPath = request.getContextPath();
			response.sendRedirect(contextPath + "/content.html");	
		}
		
		else {
			contextPath = request.getContextPath();
			response.sendRedirect(contextPath + "/login.html");	
		}
	}

}
