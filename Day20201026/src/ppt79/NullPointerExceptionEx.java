package ppt79;

public class NullPointerExceptionEx
{
	@SuppressWarnings("null")
	public static void main(String[] args)
	{
		String data = null;
		try {
			System.out.println(data.toString());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException 발생");
		}
	}
}
