package ppt94;

public class ThrowsEx
{
	static void exceptionMethod() throws Exception {
		throw new Exception();
	}
	
	public static void main(String[] args)
	{
		try {
			exceptionMethod();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
