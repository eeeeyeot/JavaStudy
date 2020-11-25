package Java5_ppt59;

public class Person implements Comparable<Person>
{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Person p) {
		if(age < p.age)
			return -1;
		else if(age == p.age)
			return 0;
		else
			return 1;
	}
	
	public String toString() {
		return name + " : " + age;
	}
}
