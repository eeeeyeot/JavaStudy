package day20201112_userinput;

import java.util.ArrayList;

public class MemberTest
{
	static String inp;
	static AWT awt;
	
	public static void main(String[] args)
	{
		awt = new AWT();
	}
	
	public static void execute() {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVo> list = dao.list(inp);
		
		for(int i = 0; i < list.size(); i++) {
			MemberVo data = (MemberVo)list.get(i);
			String empno = data.getEmpno();
			String ename = data.getEname();
			int sal = data.getSal();
			
			String str = empno + " : " + ename + " : " + sal;
			System.out.println(str);
			awt.setTextArea(empno, ename, sal);
		}
	}
	
	public static void setInput(String str) {
		 inp = str;
	}
}
