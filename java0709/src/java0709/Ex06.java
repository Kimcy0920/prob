package java0709;

import java.util.Scanner;

public class Ex06 {

	public static int getCount(String msg, Scanner scan) {
		System.out.print(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = getCount("���� �Է�: ", scan);
		int n = 0;
		
		if (num > 0) {
			n = num;
		} else {
//			n = num * -1;
//			n = -num;
			n -= num;
		}
		System.out.println(n);
	}

}
// ����6. ������ ���� �Է¹ް� �Է¹��� ���� ���� �����̸� �׳� ����ϰ�, ���� �����̸� ���� ������ ��ȯ�Ͽ� ����ϼ���.