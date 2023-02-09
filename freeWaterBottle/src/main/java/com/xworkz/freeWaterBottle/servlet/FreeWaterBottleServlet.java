package com.xworkz.freeWaterBottle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebFault;
@WebServlet(loadOnStartup = 1,urlPatterns = "/water")
public class FreeWaterBottleServlet extends HttpServlet {

	public FreeWaterBottleServlet() {
		System.out.println("Created" +this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init config...");
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running doGet method on FreeWaterBottleServlet...");
	String name = req.getParameter("Name");
	String email = req.getParameter("email");
	String password = req.getParameter("password");
	String confirmPassword = req.getParameter("confirmPassword");
	

	PrintWriter writer = resp.getWriter();
	writer.print("Running FreeWaterBottleServlet Succesfully" +name+ " "+email+ " "+password+" "+confirmPassword);
	}
}
