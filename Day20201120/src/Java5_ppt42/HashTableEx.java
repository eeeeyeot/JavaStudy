package Java5_ppt42;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fail", "1234");
		map.put("winter", "12345");
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String pw = sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}
				else
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			else
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
		}
		
		sc.close();
	}
}
