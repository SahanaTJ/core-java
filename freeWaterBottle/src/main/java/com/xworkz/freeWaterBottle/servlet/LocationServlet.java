package com.xworkz.freeWaterBottle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 15,urlPatterns = "/location")
public class LocationServlet extends HttpServlet {

	
    public LocationServlet() {
		System.out.println("Created" +this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
	System.out.println("init config..");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running LocationServlet on using doGet method");
		String name = req.getParameter("LocationName");
		String email = req.getParameter("LocationEmail");
		String startpoint = req.getParameter("startPoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		
		if (name.length() > 3 && email.length()>5 && startpoint.length()>3 && destination.length()>3) {
			writer.print("Contact details saved : successful");
		}else if(name.length()<4){
			writer.print("Failed!! Name is invalid");
		}else if (startpoint.length()<4) {
			writer.print("Failed!! startpoint  is invalid");
		}else if (destination.length()<4) {
			writer.print("Failed!! destination  is invalid");
		}
		writer.print("</h1>");
		writer.print("</body>");
        writer.print("</head>");
        writer.print("</html>");
	}

	@Override
	public void destroy() {
		System.out.println("destroy LocationServlet");
	}
}