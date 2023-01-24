package com.xworkz.tetra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 3,urlPatterns = "/whatsapp")

public class WhapsAppServlet extends HttpServlet {
 
	public WhapsAppServlet() {
		System.out.println("Creating WhatsAppServlet.....");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running WhatsAppServlet...");
		super.doGet(req, resp);
	}
}
