package java0711;

public class Array01 {

	public static void main(String[] args) {
		int score1[] = new int[] {83, 90, 87}; // s1, s2 �� �� ����
		int score2[] = {83, 90, 87};
		double sum = 0.0;
		double avg = 0;
		
//		System.out.println(score1[score1.length-1]);
//		
//		for (int i = 0; i < score1.length; i++) {	
//			sum += score1[i];
//			// score1�� ������ ����ϼ���.
//		}
//		System.out.println("����: " + sum);
//		
//		avg = sum / score1.length;
//		// score1�� ����� ����ϼ���.
//		System.out.println("���: " + avg);
		
		int myArr1[] = new int[5]; // �迭�� ����(�ʱ�ȭ) /�⺻/
		// new ��ɾ�� ���� �ʱ�ȭ��
		for (int i = 0; i < 5; i++) {
			System.out.println(myArr1[i]);
			// �ʱ�ȭ�Ǿ� 0�� ���
		}
		
		double myArr2[] = new double[5];

		for (int i = 0; i < 5; i++) {
			System.out.println(myArr2[i]);
		}
		
		boolean myArr3[] = new boolean[5];

		for (int i = 0; i < 5; i++) {
			System.out.println(myArr3[i]);
		}
	}

}