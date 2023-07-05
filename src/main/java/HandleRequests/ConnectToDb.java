package HandleRequests;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//in this class we have to made a connection with the db

public class ConnectToDb {
	static private Connection conn = null;
	
	//db - credentials we can use env. variables  to setup them
	private String db_user_name = "root";
	private String db_pass = "ConnectToDb2015";
	private int db_port = 3035;
	private String db_name = "StudentManager";
	
	private String db_url= "jdbc:mysql://localhost:"+ db_port + "/" + db_name;
	
	//this willgive us the db connection -> 
	public Connection getConnection() {
		
		//to avoid creating multiple connections...
		if(conn != null)
			return conn;
		
		// else create a new connection and return it...
		try {
			conn = DriverManager.getConnection(db_url , db_user_name , db_pass);
		} catch( SQLException err) {
			System.err.println("Connot Create Connection with db : returning a null connetcion! ");
			err.printStackTrace();
		}
		
		return conn;
	}
	
	public void closeConnection() {
		if(conn == null)
			return;
		
		try {
			conn.close();
			System.out.println("Connection Closed Success");
		} catch(SQLException err) {
			System.err.println("Failed to close the connection");
			err.printStackTrace();
		}
	}
	
	//this will give us the statementby pasing our query orprepapred statement
	public PreparedStatement getStatement(String your_query) {
		PreparedStatement st = null;
		if(conn == null){
			System.out.println("NO connection establish try calling {.getConnection()} to create a conn first and then get a statement");
			System.out.println("returning a null statement :(");
			return st;
		}
		
		try {
			st = conn.prepareStatement(your_query);
			System.out.println("statement creation success");
		} catch (SQLException err) {
			System.err.println("Cannot Get the Statement :( returning null statement");	
		}
		
		return st;
	}
	
	public void closeStatement(PreparedStatement st) {
		if(st == null) return;
		
		try {
			st.close();
		} catch(SQLException err) {
			System.err.println("Cannot close statement :( ");
			err.printStackTrace();
		}
		return;
	}
	
}
