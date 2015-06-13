package com.codepreplabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(displayName="HelloServlet", urlPatterns="/hello")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 2312121514902862753L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<h3> Hello World Servlet using @WebServlet Annotation <h3>");
		
	}
}
