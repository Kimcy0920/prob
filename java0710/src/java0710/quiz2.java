package java0710;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, j;
		int sum = 0;
		int sum2 = 0;
		
		// ����1. 1���� 10���� ����ϼ���.
		for(i=0; i<10; i++) {
			System.out.print(i + " ");
		}
		
		// ����2. 1���� 100������ ���� ���ϼ���.
		System.out.println();
		for(i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// ����3. 1���� 10���� ¦���� ����ϼ���.
		for(i=0; i<10; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		// ����4. 1���� 100���� ¦���� �հ踦 ���ϼ���.
		System.out.println();
		for(i=0; i<=100; i++) {
			if(i%2 == 0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
		
		// ����5. ������ ����ϱ� (��ü)
		System.out.println();
		for(i=2; i<10; i++) {
			for(j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		// ����6. ������ ����ϱ� (�� �Է� �޾Ƽ�)
		System.out.print("�� �Է�: ");
		System.out.println();
		int num = Integer.parseInt(scan.nextLine());
		for(i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}

	}
}