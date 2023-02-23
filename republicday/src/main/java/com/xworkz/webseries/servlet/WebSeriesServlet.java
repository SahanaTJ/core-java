package com.xworkz.webseries.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/republic")
public class WebSeriesServlet extends HttpServlet {

	public WebSeriesServlet() {
		System.out.println("Created" +this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init config...");
		super.init();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running doGet in WebSeriesServlet......");
     String name = req.getParameter("wsName");
	String language = req.getParameter("wsLanguage");
	String episodes = req.getParameter("Episodes");
	String ott = req.getParameter("ott");
	String budget = req.getParameter("Budget");
	
	System.out.println(name+" -" +language+" - "+ott+" - "+budget);

	PrintWriter writer = resp.getWriter();
	writer.print("Running WebSeries Succesfully" +name+ " "+language+ " "+episodes+" "+ott+" "+budget);
	}
}
