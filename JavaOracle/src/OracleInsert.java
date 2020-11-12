import java.sql.*;

public class OracleInsert
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

			//=========================================
			String sqlSetNo = "select deptno from ("
					+ "select deptno from dept order by deptno desc"
					+ ") where rownum <= 1";
			ResultSet rs0 = stmt.executeQuery(sqlSetNo);
			String lastDeptNo =	null;
			if(rs0.next()) {
				lastDeptNo = String.format("%d", 
						(Integer.parseInt(rs0.getString("deptno")) + 10));
			}
			//=========================================			
			
			String ideptno = lastDeptNo, sdname = "IT", sloc = "SEOUL";
			String sql = "insert into dept values ('" + ideptno + "','" + sdname
					+ "','" + sloc + "')";
			boolean b = stmt.execute(sql);
			
			if(!b)
				System.out.println("Insert Success.\n");
			else
				System.out.println("Insert Fail.\n");

			String sql2 = "select deptno, dname, loc From dept";
			ResultSet rs1 = stmt.executeQuery(sql2);
			ResultSetMetaData rsmd = rs1.getMetaData();
			
			while(rs1.next())
			{
				for(int i = 1; i <= rsmd.getColumnCount(); i++) {
					String format = "%" + rsmd.getPrecision(i) + "s ";
					
					System.out.printf(format, rs1.getString(rsmd.getColumnLabel(i)));
				}
				System.out.println();
			}
		}
		catch (ClassNotFoundException e) {
			System.out.println("jdbc driver loading fail.");
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("oracle connection fail.");
			e.printStackTrace();
		}
	}
}
