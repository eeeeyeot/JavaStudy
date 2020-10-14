package kr.co.green;

public class Test
{

	public static void main(String[] args)
	{
		
		String name1 = "신민철";
		String name2 = "신민철";
		//String name3 = new String("신민철");
		
		boolean result = (name1.equals(name2));
		System.out.println(result);
		
		/*
		 * StringBuffer stringBuffer = new StringBuffer();
		 * stringBuffer.append("AA");
		 * StringBuffer str1 = stringBuffer;
		 * StringBuffer str2 = str1;
		 * System.out.println(str1);
		 * System.out.println(str2);
		 * stringBuffer.append("BB");
		 * System.out.println(str1);
		 * System.out.println(str2);
		 */
		
		
		
		/*
		 * String name1 = new String("그린학원");
		 * String name2 = new String("그린학원");
		 * System.out.println(name1 == name2);
		 */
		/*
		 * String name1 = "그린학원";
		 * String name2 = "그린학원";
		 * System.out.println(name1 == name2);
		 */
		
		/*
		 * String name = "Green";
		 * String hobby = "Java";
		 */
		
		/*
		 * int[] intArray = null;
		 * String str = null;
		 * try{
		 * //intArray[0] = 10;
		 * System.out.println("총 문자수 : " + str.length());
		 * }catch(NullPointerException e) {
		 * System.out.println("할당되지 않은 공간입니다.");
		 * }
		 */
		
		/*
		 * char v1 = 'A';
		 * if(v1 == 'A') {
		 * int v2 = 100;
		 * double v3 = 3.14;
		 * }
		 * boolean v4 = true;
		 */
		
		/*
		 * int[] scores = {10, 20, 30};
		 * System.out.println(System.identityHashCode(scores[0]));
		 */
		
		/*
		 * int[] refVar1 = { 10, 20, 30 };
		 * int[] refVar2 = { 40, 50, 60 };
		 * int[] refVar3 = refVar2;
		 * for(int i = 0; i <refVar1.length; i++) {
		 * System.out.println(refVar1[i]);
		 * System.out.println(System.identityHashCode(refVar1[i]));
		 * }
		 * for(int i = 0; i <refVar2.length; i++) {
		 * System.out.println(refVar2[i]);
		 * System.out.println(System.identityHashCode(refVar2[i]));
		 * }
		 * for(int i = 0; i <refVar3.length; i++) {
		 * System.out.println(refVar3[i]);
		 * System.out.println(System.identityHashCode(refVar3[i]));
		 * }
		 * System.out.println(refVar1 == refVar2);
		 * System.out.println(refVar1 != refVar2);
		 * System.out.println();
		 * System.out.println(refVar2 == refVar3);
		 * System.out.println(refVar2 != refVar3);
		 */
		/*
		 * int[] refVar1 = {10, 20, 30};
		 * System.out.println(refVar1 == null);
		 * System.out.println(refVar1 != null);
		 * String refVar2 = null;
		 * System.out.println(refVar2 == null);
		 * System.out.println(refVar2 != null);
		 */
		
	}

}
