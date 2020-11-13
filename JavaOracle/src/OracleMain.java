import java.sql.*;

public class OracleMain
{
	public static void main(String[] args)
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "green";
		String password = "green1234";
		
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			
			Statement stmt = conn.createStatement();
			
			String sql = "select * from dept";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			
			
			while(rs.next())
			{
				for(int i = 1; i <= rsmd.getColumnCount(); i++) {
					String format = "%" + rsmd.getPrecision(i) + "s ";
					
					System.out.printf(format, rs.getString(rsmd.getColumnLabel(i)));
				}
				System.out.println();
			}
		}
		catch (ClassNotFoundException e) {
			System.out.println("jdbc driver loading fail.");
		}
		catch(SQLException e) {
			System.out.println("oracle connection fail.");
		}
	}
}
