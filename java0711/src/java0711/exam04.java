package java0711;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է�: ");
		int n = scan.nextInt();
		
		int sum = 0;
		
//		for(int i=1; i<=n; i++) {
//			sum += i;
//			if (i<n) {
//				System.out.print(i + " + ");
//			} else {
//				System.out.print(i + " = ");
//			}
//		}
//		System.out.println(sum);
		
		
		for (int i = 1; i < n; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print(n + " = ");
		sum += n;
		System.out.println(sum);
	}

}
//����4. 1���� n������ �հ� �� ���� ���ϴ� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
//n = 5�� ���, 1 + 2 + 3 + 4 + 5 = 15