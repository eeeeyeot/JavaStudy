package day20201112_userinput;

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
    
    public ArrayList<MemberVo> list(String name) {
        ArrayList<MemberVo> list = new ArrayList<MemberVo>();
 
        try {
            connDB();
            
            String query = "Select * from emp";
            if(name != null) {
            	query += " where ename = '" + name.toUpperCase() + "'";
            }
            System.out.println("SQL : " + query);
            
            rs = stmt.executeQuery(query);
            rs.last();
            System.out.println("rs.getRow() : " + rs.getRow());
            
            if(rs.getRow() == 0)
            	System.out.println("0 row selected");
            else {
            	System.out.println(rs.getRow() + " rows selected");
            	rs.previous();
            	while(rs.next()) {
            		String empno = rs.getString("empno");
            		String ename = rs.getString("ename");
            		int sal = rs.getInt("sal");
            		
            		MemberVo data = new MemberVo(empno, ename, sal);
            		list.add(data);
            	}
            }
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return list;
    }
    
    public void connDB() {
        try {
            Class.forName(driver);
            String str = "jdbc driver loading success.";
            System.out.println(str);
            
            con = DriverManager.getConnection(url, user, password);
            str = "oracle connection success.";
            System.out.println(str);
            
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            str = "statement create success.";
            System.out.println(str);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
