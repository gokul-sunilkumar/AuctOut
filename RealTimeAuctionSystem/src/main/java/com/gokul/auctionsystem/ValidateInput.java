package com.gokul.auctionsystem;

/**
 *
 * @author gokul
 */
import java.sql.*;
import java.util.Date;

public class ValidateInput {
	
	static String url = "jdbc:mysql://localhost:3306/";  
	static String dbName = "form";  
        static String driver = "com.mysql.jdbc.Driver";  
	static String userName = "root";  
	static String password = "mysql@123"; 
    
	public static boolean validatePassword(String password, String repassword){
		if(password.equals(repassword))
				return true;
		else
				return false;
		
	}
	
	public static boolean validateZip(String zipcode){
		if (zipcode.matches("[0-9]+") && zipcode.length() == 5) 
			return true;
	else
			return false;
	}
	
	public static boolean validateAccountnumber(String accountnum){
		if (accountnum.matches("[0-9]+")) 
			return true;
	else
			return false;
	}
	
	public static boolean validateRoutingnumber(String routingnum){
		if (routingnum.matches("[0-9]+")) 
			return true;
	else
			return false;
	}
	
	
	
	public static boolean validatePhone(String phone){
		if (phone.matches("[0-9]+") && phone.length() == 10) 
				return true;
		else
				return false;
		
	}
	
	public static boolean validateUsername(String user) throws SQLException{
		   Connection conn = DriverManager  
                    .getConnection(url + dbName, userName, password);   
           PreparedStatement pst = conn  
                    .prepareStatement("select * from user where username=? ");  
            pst.setString(1, user); 
            ResultSet rs= pst.executeQuery();
            Boolean status = rs.next();
            conn.close();
            return status;
	}
	
	public static boolean validateEmail(String email) throws SQLException,ClassNotFoundException{  
            
            Connection conn = DriverManager.getConnection(url + dbName, userName, password); 
            
           
            PreparedStatement pst = conn  
                    .prepareStatement("select * from accountdetails where email=? ");  
            pst.setString(1, email); 
            ResultSet rs= pst.executeQuery();
            Boolean status = rs.next();
            conn.close();
            return status;
	}
	
	public static boolean validateStartDateOfAuction(Timestamp startDate){
		//Date d1= new Date() ;
                long now = System.currentTimeMillis();
                Timestamp d1 = new Timestamp(now);
                System.out.println(d1.toString());
		if(startDate.after(d1))
			return true;
		else
		return false;					
	}
	
	public static boolean validateEndDateOfAuction(Timestamp startDate, Date endDate){	
		if (endDate.after(startDate))
			return true;
		else
		return false;
	}
}
