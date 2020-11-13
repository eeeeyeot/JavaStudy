package day20201112;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO
{
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	String user = "green";
	String password = "green1234";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;
	
	public ArrayList<MemberVo> list()
	{
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		
		try {
			connDB();
			
			String query = "Select empno, ename, sal, NVL(comm, 0) as comm"
					+ ", sal + NVL(comm, 0) as total, mgr"
					+ " from emp";
			rs = stmt.executeQuery(query);
			rsmd = rs.getMetaData();
			while(rs.next()) {
				String[] arr = new String[rsmd.getColumnCount()];
				for(int i = 0; i < rsmd.getColumnCount(); i++) {
					arr[i] = String.format("%6s", rs.getString(i + 1));
				}
				
				MemberVo data = new MemberVo(arr);
				list.add(data);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			stmt = con.createStatement();
			System.out.println("statement create success.");
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}
