package java0709;

import java.util.Scanner;

public class Ex04 {

	public static int getCount(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			int n1 = getCount("���� �Է�: ", scan);
			int n2 = getCount("���� �Է�: ", scan);
			int n3 = getCount("���� �Է�: ", scan);
			int num = 0;
			
			if (n1 > n2 && n1 > n3) {
				num = n1;
			} else if (n2 > n1 && n2 > n3) {
				num = n2;
			} else {
				num = n3;
			}
			
			System.out.println("�ִ밪: " + num);
	}

}
// ����4. 3���� ���� ���� �޾Ƽ� �ִ밪�� ���Ͽ� ����Ͻÿ�.