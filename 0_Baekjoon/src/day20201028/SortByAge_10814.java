package day20201028;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SortByAge_10814
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Person[] arr = new Person[N]; 
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<Person>() {
			public int compare(Person o1, Person o2)
			{
				return Integer.compare(o1.age, o2.age);
			}
			
		});
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

class Person {
	int age;
	String name;
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return age + " " + name;
	}
}