package java0709;

import java.util.Scanner;

public class Ex02 {

	public static int getCount(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int apple = getCount("��� ����: ", scan);
//		System.out.print("��� ����: ");
//		String input = scan.nextLine();
//		int apple = Integer.parseInt(input);
		
		int people = getCount("ģ�� ��: ", scan);
//		System.out.print("ģ�� ��: ");
//		input = scan.nextLine();
//		int people = Integer.parseInt(input);
		
		int remainder = apple % (people + 1);
		System.out.printf("���� ��� ����: %d", remainder);
	}

}
// ����2. ����� 10���� �ֽ��ϴ�. 2���� ģ���� �ֽ��ϴ�. (������ �����ϸ� �� 3��)
// ����� �Ȱ��� ���� ������ �� ���� ����� �������?
// (Scanner �̿�, �ݺ���[�������� ��], 1�δ� ����� ���� ����, ����üũ, �޼���)