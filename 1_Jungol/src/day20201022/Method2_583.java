package day20201022;

import java.util.ArrayList;
import java.util.Scanner;

public class Method2_583
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Double> num = new ArrayList<Double>();
		
		for(int i = 0; i < 3; i++) {
			num.add(sc.nextDouble());
		}
		
		System.out.println(getBig(num) + " " + getSmall(num) +
				" " + getOther(num));
		
		
		sc.close();
	}
	
	static int getBig(ArrayList<Double> num) 
	{
		double tmp = num.get(0);
		
		for(int i = 1; i < num.size(); i++) {
			if(num.get(i) > tmp)
				tmp = num.get(i);
		}
		
		num.remove(tmp);
		
		if(tmp > (int)tmp)
			tmp = ((int)tmp) + 1;
		
		return (int)tmp;
	}
	
	static int getSmall(ArrayList<Double> num) {
		double tmp = num.get(0);
		
		for(int i = 1; i < num.size(); i++) {
			if(num.get(i) < tmp)
				tmp = num.get(i);
		}
		
		num.remove(tmp);
		
		if(tmp < (int)tmp)
			tmp = ((int)tmp) - 1;
		
		return (int)tmp;		
	}
	
	static int getOther(ArrayList<Double> num)
	{
		double tmp = num.get(0);
		
		tmp = Math.round(tmp);
		
		return (int)tmp;
	}
}
