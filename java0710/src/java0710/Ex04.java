package java0710;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println("���>>");
			String input = scan.nextLine();
			if (input.equalsIgnoreCase("q")) { // equals�� ��ҹ��ڵ� ����, �����ڵ�� ��ҹ��� ����x
				break;
			}
		}
		System.out.println("����");
	}

}