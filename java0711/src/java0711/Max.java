package java0711;

public class Max {

	public static void main(String[] args) {
		int a[] = {1, 3, 10, 2, 8};
		int max = a[0]; // max = 0�� �ƴ� a[0]->1�� ����.
		
			for (int i = 1; i < a.length; i++) { // max�� a[0]������ i = 1�� ����
				if(max <= a[i]) {
					max = a[i];
				}
		}
		//�ִ밪 ���ϱ�
		System.out.println("�ִ밪: " + max);
	}

}