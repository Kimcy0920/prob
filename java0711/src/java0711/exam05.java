package java0711;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n�� �Է�: ");
		int n = scan.nextInt();
		
//		for (int i=0; i<n/2; i++) {
//			System.out.print("+-");
//		}
//		if(n % 2 != 0) {
//			System.out.println("+");
//		}
		
		for (int i=0; i<n; i++) {
			if(i%2==0) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
	}

}
//����5. +, - ��ȣ�� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
//ex) n = 12, +-+-+-+-+-+-