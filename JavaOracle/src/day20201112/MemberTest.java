package day20201112;

import java.util.ArrayList;

public class MemberTest
{
	public static void main(String[] args)
	{
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVo> list = dao.list();
		String[] arr = new String[list.get(0).getSize()];
		
		for(int i = 0; i < list.size(); i++) {
			MemberVo data = (MemberVo) list.get(i);
			
			for(int j = 0; j < arr.length; j++) {
				arr[j] = data.get(j);
			}
			
			String d = " | ";
			for(int j = 0; j < arr.length; j++) {
				String tmp = "%" + arr[j].length() + "s" + d;
				System.out.printf(tmp, arr[j]);
			}
			
			System.out.println();
		}
	}
}
