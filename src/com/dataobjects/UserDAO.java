package com.dataobjects;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UserDAO {
	
		private static Connection connection = null;
		private static Statement statement = null;
		private static ResultSet resultSet = null;
		private static UserDAO userDAO=null;
		private UserDAO()
		{
			
		}
		public static UserDAO getInstance()
		{
			if(userDAO == null)
			{
				userDAO= new UserDAO();
			}
			return userDAO;
		}
		
		public static boolean checkUser(String userid,String pass)
		{
			boolean flag=false;
			try
			{
				DAO dao=DAO.getInstance();
				connection=dao.connector();
				statement = connection.createStatement();
				
				/*String sql="select *from m_nuser where user_id='"+userid+"'";*/
				
				//System.out.println(sql);
				resultSet=statement.executeQuery("select * from JDBCEMP where eid =? and password= ?");
				
				while(resultSet.next())
				{
					flag=true;
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Exception in UserDAO-->checkUser(String userid,String pass): "+ e);
			}
			finally
			{
				try {
					resultSet.close();
					statement.close();
					connection.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			return flag;
		}


}
