package javaLab;
import java.sql.*;
public class qn43 {
	public static void main(String[] args){
		   try{
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    String url = "jdbc:mysql://localhost:3306/bca_third?serverTimezone=UTC";
		    String un = "root";
		    String pw = "";
		    Connection cn = DriverManager.getConnection(url,un,pw);
		    System.out.println("Connected!");
		   }catch(Exception e){
		    System.out.println(e);ads
		    }
		  }
}
