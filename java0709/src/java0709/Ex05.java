package java0709;

import java.util.Scanner;

public class Ex05 {

	public static int getCount(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		loop: for (;;) {
			int score = getCount("���� �Է�: ", scan);
			String str = "";
			if (0 <= score && score <= 100) {
				switch(score/10) {
				case 10:
				case 9:
					str = "A";
					break;
				case 8:
					str = "B";
					break;
				case 7:
					str = "C";
					break;
				case 6:
					str = "D";
				default:
					str = "F";
				}
				System.out.println("���: " + str);
				break loop;
			} else {
				System.out.println("0~100�� ���̷� �Է��ϼ���.");
			}
		}
	}

}
// ����6. 100���� ������ ������ �Է� �޾Ƽ� 90�� �̻��̸� A, 80�� �̻��̸� B, 70�� �̻��̸� C, 60�� �̻��̸� D, 60�� �̸��̸� F�� ���ϴ� ���α׷��� �ۼ��ϼ���.
// (�Է¹��� ������ 0������ 100�� ������ ���� �־����)