package java0710;

public class Ex06 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		
//		// ������ ������ ������ �ϱ�
//		for(i=2; i<10; i++) {
//			for(j=1; j<10; j++) {
//				System.out.printf("%d * %d = %d\t", i, j, i*j);
//				if (j == 9) {
//					System.out.println();
//				}
//			}
//		}
//		// ������ �� ���� ������ ������ �ϱ�
//		System.out.println();
//		for(j=1; j<10; j++) {
//			for(i=2; i<10; i++) {
//				System.out.printf("%d * %d = %d\t", i, j, i*j);
//			}
//			System.out.println();
//		}
		
//		for (i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//				continue;
//				// i�� 2�� �������� �� �������� 0�� �ƴ� ���
//				}
//			System.out.println(i); // i�� �����
//			}
//		System.out.println(sum); // 1~100 ¦������ ����
		
//		for (i = 0; i <= 10; i++) {
//			if (i == 3) {
//				sum2 += i;
//				break;
//				// i�� 3�̸� ����
//				}
//			System.out.println(i); // 0 1 2���� ���
//			}
//		System.out.println(sum2);
		
		while (i <= 100) {
			sum3 += i;
			i++;
			}
		System.out.println(sum3);
	
		for (float a = 0.1f; a <= 1.0f; a += 0.1f) {
			System.out.println(a);
			// float�� �ݺ����� ���� ���� �̻��ϰ� ����
			}
	}
}
