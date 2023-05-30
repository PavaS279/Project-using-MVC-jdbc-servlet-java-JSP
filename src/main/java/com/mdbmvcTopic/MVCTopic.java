package com.mdbmvcTopic;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MVCTopic")
public class MVCTopic extends HttpServlet {
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String [] foodItems= {"Chicken Biriyaani", "Kabab", "Mudde Sambar", "Chilli Chicken","Mutton Biriyaani" };
		request.setAttribute("foodItems", foodItems);
		
		
		
		
	RequestDispatcher dispatcher	= request.getRequestDispatcher("show-food.jsp");
	dispatcher.forward(request, response);
	
	
				
	
	
	
	}

}
