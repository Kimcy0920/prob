package java0711;

import java.util.Scanner;

public class exam06_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("*�� n�� ����ϵ� w������ ���� �ٲ㼭 ����մϴ�.");
		
		do {
			System.out.print("n��: ");
			a = scan.nextInt();
		} while (a <= 0);
		
		do {
			System.out.print("w��: ");
			b = scan.nextInt();
		} while (a < b || b <= 0); // a�� b���� �۴�, b�� 0���� �۰ų� ����

		for (int i = 0; i < a / b; i++) {
			System.out.print("*".repeat(b));	
			}
		if (a % b != 0) {
			System.out.println();
		}
		System.out.println("�Ϸ�!!");

	}

}
