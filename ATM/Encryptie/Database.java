import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Database{
	/* Fields */
	private String host = "jdbc:mysql://145.24.222.64:8888/ATM"+
			"?verifyServerCertificate=false"+
			"&useSSL=false"+
			"&requireSSL=false";
	private String usName = "foo";
	private String usPass = "k7GMTdLt!";
	
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet resultSet = null;
	private ResultSetMetaData rsmd = null;
	
	/* Constructors */
	
	
	/* Methods */
	public void connect(){
		try{
			con = DriverManager.getConnection(host, usName, usPass);
		}catch(SQLException err){
			System.out.println(err.getMessage());
		}
	}
	
	public String getData(String sql){
		String columnValue = null;
		try{
			stmt = con.createStatement();			

			ResultSet resultSet = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while(resultSet.next()){
				for(int i = 1; i <= columnsNumber; i++){
					if(i > 1) System.out.print(",  ");
					columnValue = resultSet.getString(i);
					return columnValue;
				}
				System.out.println("");
			}
		}catch(SQLException err){
			System.out.println(err.getMessage());
			return columnValue;
		}finally{
			if(stmt != null){
				try{
					stmt.close();
				}catch(SQLException err){}
				
				stmt = null;
			}
			return columnValue;
		}
	}		
	
	public void closeConnection(){
		if(con != null){
			try{
				con.close();
			}catch(Exception e){}
		}
	}
}