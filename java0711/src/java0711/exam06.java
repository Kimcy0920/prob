package java0711;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n �Է�: ");
		int n = scan.nextInt();
		System.out.print("w �Է�: ");
		int w = scan.nextInt();

		if (n > w) {
			for(int i=0; i<n; i++) {
				if(i % w == 0) {
					System.out.println();
				}
				System.out.print("*");
			}
		} else {
			System.out.println("n�� w���� �۽��ϴ�.");
		}
		
	}

}
//����6. *�� n���� ����ϵ� w�� ���� ���� �ٲ㼭 ����ϴ� ���α׷��� �ۼ��ϼ���.
//n = 14, w = 5 (n > w, w > 0)
//*****
//*****
//****