package java0709;

import java.util.Scanner;

public class Ex03 {
	
	public static int getCount(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = getCount("ù ��° ���� �Է�: ", scan);
		int n2 = getCount("�� ��° ���� �Է�: ", scan);
		int n3 = 0;
		
		if (n1 > n2) {
			n3 = n1;
		} else if (n2 > n1) {
			n3 = n2;
		} else {
			n3 = 0;
		}
		System.out.println(n3);
	}

}
// ����3. �� ���� ���� �޾Ƽ� ū ���� ����ϼ���. (��, ������ 0���� ���)