package java0711;

import java.util.Scanner;

public class exam01 {
	
	public static int med(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a)) {
			// b�� a���� ũ�ų� ����, c�� a���� �۰ų� ���� or b�� a���� �۰ų� ����, c�� a���� ũ�ų� ����
			return a;
		} else if ((a > b && c < b) || (a < b && c > b)) {
			// a�� b���� ũ��, c�� b���� �۴� or a�� b���� �۰� c�� b���� ũ��
			return b;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mid = 0;
		
		System.out.print("a ��: ");
		int a = scan.nextInt();
		System.out.print("b ��: ");
		int b = scan.nextInt();
		System.out.print("c ��: ");
		int c = scan.nextInt();
		
		System.out.println("�߾Ӱ��� " + med(a, b, c) + "�Դϴ�.");
	}
}
//����. 3���� �������� �Է¹޾� �߾Ӱ��� ���ϰ� ����ϼ���.
// �ٽ� ������ �ʹ� ��û�ϴ� ��¥