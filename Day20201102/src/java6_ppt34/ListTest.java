package java6_ppt34;

import java.awt.Frame;
import java.awt.List;

public class ListTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("List - Select");
		String[] arr = {"Student", "Teacher", "Driver", "Computer Programmer", "Sales Man",
				"Musician", "Director"};
		
		f.setSize(300, 200);
		f.setLayout(null);
		
		List selectOne = new List(6);
		selectOne.setLocation(20, 40);
		selectOne.setSize(100, 120);
		
		for(int i = 0; i < arr.length; i++) {
			selectOne.add(arr[i]);
		}
		
		List selectMany = new List(6, true);
		selectMany.setLocation(150, 40);
		selectMany.setSize(100, 120);
		
		for(int i = 0; i < arr.length; i++) {
			selectMany.add(arr[i]);
		}
		
		f.add(selectOne);
		f.add(selectMany);
		f.setVisible(true);
	}
}
