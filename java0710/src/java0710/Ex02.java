package java0710;

public class Ex02 {

	public static void main(String[] args) {
		int x = 0;
		int y = ++x;
//		int y = x++;
		++x;
		x++;
		x = x + 1;
		System.out.println(x);
		System.out.println(y);
		
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println(result4);
		
//		String str1 = "������"; // ���ͷ��̶� ����
//		String str2 = "������";
		String str1 = new String("������"); // �ּҰ��̱⿡ ���� �ٸ�
		String str2 = new String("������");
		boolean result5 = str1 == str2;
		System.out.println(result5);
	}

}