import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectSql {

	public static void main(String[] args) {


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels","root","swain@88");
		    Statement stmt=con.createStatement();  
		    ResultSet rs=stmt.executeQuery("select max(creditLimit) from customers");  
		    while(rs.next())  
		    System.out.println(rs.getInt(1));  
		    //int x= rs.getInt(1);
		    con.close();  
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
