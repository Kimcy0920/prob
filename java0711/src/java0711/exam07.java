package java0711;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		two: for(;;) {
			System.out.print("���� �Է�: ");
			int n = scan.nextInt();
			if(9 < n && n < 100) {
				System.out.println(n);
				break two;
			}
		}

	}

}
//����7. 2�ڸ� ����� �Է¹޴� ���α׷��� �ۼ��ϼ���.
//a = 5, a = 105, a = 57 --> a = 57