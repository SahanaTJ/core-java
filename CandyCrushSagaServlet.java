package com.xworkz.tetra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 9,urlPatterns = "/game")

public class CandyCrushSagaServlet extends HttpServlet {
 
	public CandyCrushSagaServlet() {
		System.out.println("Creting Candycrush....game...");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running CandyCrushSagaServlet....on web page........");
	}
}
