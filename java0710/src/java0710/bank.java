package java0710;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int money = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("����> ");
			int num = Integer.parseInt(scan.nextLine());
			
			if (num == 1) {
				System.out.print("���ݾ�> ");
				money = Integer.parseInt(scan.nextLine());
				balance += money;
				System.out.println(balance + "��");
			}
			if (num == 2) {
				System.out.print("��ݾ�> ");
				money = Integer.parseInt(scan.nextLine());
				balance -= money;
			}
			if (num == 3) {
				System.out.print("�ܰ�> " + balance);
				System.out.println();
			}
			if (num == 4) {
				run = false;
				break;
			}
		}
		System.out.println("����");
	}

}