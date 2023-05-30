package com.mdbmvcTopic;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/MVCTopic")
public class MVCTopic extends HttpServlet {
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			List<Food> foodItems =FoodCartDbUtil.getFoodDetails();
			request.setAttribute("foodItems", foodItems);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	RequestDispatcher dispatcher	= request.getRequestDispatcher("show-food.jsp");
	dispatcher.forward(request, response);
	
	
				
	
	
	
	}

}
