package ex9_10;

public class ClassEx1
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception
	{
		Card c = new Card("HEART", 3);
		Card c2 = Card.class.newInstance();
		
		@SuppressWarnings("rawtypes")
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}
}
