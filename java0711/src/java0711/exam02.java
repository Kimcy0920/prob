package java0711;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int sum = 0;
		
		System.out.print("���� �Է�: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum += i;
			
		}
		System.out.println(sum);
	}

}
//����2. for���� �̿��Ͽ� 1���� n������ ���� ���ϼ���. (n�� �Է¹��� ����)