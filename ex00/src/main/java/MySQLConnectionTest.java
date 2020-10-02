import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";	
	private static final String URL = "jdbc:mysql://127.0.01:3306/book_ex?useSSL=false";
	
	private static final String USER = "root";
	private static final String PW = "dhdlfdl123";
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER,PW)){
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
