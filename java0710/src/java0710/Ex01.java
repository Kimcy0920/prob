package java0710;

public class Ex01 {

	public static void main(String[] args) {
//		���� p94
		
//		byte b1 = 65;
//		char c1 = b1; // ������ ����
//		System.out.println(c1);
		
//		byte b1 = -65;
//		char c1 = (char)b1; // ���� Ÿ�� ��ȯ
//		System.out.println(c1);
//		char�� 2byte�̸� ���� ����X ��� (char) ���� Ÿ�� ��ȯ�� ���� ����

//		int x = 200;
//		byte y = (byte) x; // byte -138~137, 200�� ���� ��
//		System.out.println(y);
		
		double d1 = 3.14;
		int z = (int) d1; // �Ǽ����� ���������� ����.
		System.out.println(z);
		
		byte a1 = 10;
		byte b2 = 20; // byte c3 = a1 + b2; ���� �� intŸ������ �ϱ⶧���� ������ ����
		
		int z1 = a1 + b2;
		System.out.println(z1);
		
		float result = (float)(1.5 + 2.3); // float�� f�� �ٿ����� Ȥ�� ���� �ڵ�ó�� �ۼ�
		double res2 = 1.5 + 2.3;
		System.out.println(result);
		System.out.println(res2);
		
		
		
		int x1 = 1;
		int x2 = 3;
		int x3 = x1 / x2;
		System.out.println(x3); // double res3 = x1 / x2; 0.0���
		double res3 = x1 / x2; //
		System.out.println(res3);
		
		String s1 = "������" + 3; // ���ڿ��� ���� ���ϱ�
		System.out.println(s1); 
		
		String s2 = 3 + "������"; // ���ڿ� ���ڿ� ���ϱ�
		System.out.println(s2);
		
		int v1 = Integer.parseInt("100") + 3;
		System.out.println(v1);
		
		double v2 = Double.parseDouble("100.345") + 3;
		System.out.println(v2);
		
		String str1 = 10 + ""; // ���ڿ� 10���� ����
		System.out.println(str1);
		String str2 = String.valueOf(10); // ���ڿ� 10���� ����
		System.out.println(str2);
		
		// p.107 �⺻���� Ǯ��
	}

}