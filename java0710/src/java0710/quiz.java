package java0710;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int sum = 0;
		
		
		// ����1. 1���� 10���� ����ϼ���.
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// ����2. 1���� 100������ ���� ���ϼ���.
		for (i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1~100������ ���� " + sum);
		
		// ����3. 1���� 10���� ¦���� ����ϼ���.
		for (i = 1; i <= 10; i++) {
			if (i % 2 != 1) {
				System.out.println(i);
			}
		}
		
		// ����4. 1���� 100���� ¦���� �հ踦 ���ϼ���.
		for (i = 1; i <= 100; i++) {
			if (i % 2 != 1) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		// ����5. ������ ����ϱ� (��ü)
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
		
		// ����6. ������ ����ϱ� (�� �Է� �޾Ƽ�)
		
		
		System.out.print("�� �Է�(2~9): ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
			
		for (i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			}
		}
}