package java0711;

import java.util.Scanner;

public class exam03 {
	
	public static int sumOf(int a, int b) {
		int max = 0;
		int min = 0;
		
		if (a > b) {
			max = a;
			min = b;
		} else {
			min = a;
			max = b;
		}
		int sum = 0;
		for(int i = min; i<=max; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int sum = 0;
		
		System.out.print("a �Է�: ");
		int a = scan.nextInt();
		System.out.print("b �Է�: ");
		int b = scan.nextInt();
		
		System.out.println(sumOf(a, b));
		
//		for(int i = a; i<=b; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
	}

}
//����3. ���� a, b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �޼��帣 �ۼ��ϼ���.
//sumOf(2, 4) / sumOf(4, 2)