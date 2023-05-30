package com.mdbmvcTopic;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil {
	
	public static List<Food> getFoodDetails() throws SQLException {
		ArrayList<Food> food= new ArrayList<>();
		
		try{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","tiger"); 
			//here sonoo is database name, root is usrame and pawrd 
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from foodcart"); 
			while(rs.next()) {
				int id =rs.getInt(1);
				String item = rs.getString(2);
				float price=rs.getFloat(3); 
				Food f=new Food (id,item,price);
				food.add(f);
				
				con.close();
			}
			} catch(Exception e){ 
				System.out.println(e);
			} 
			
		
		
		
		
		
		
		
		return food;
	}

}
