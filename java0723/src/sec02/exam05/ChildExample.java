package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();

		parent.field1 = "data1";
		System.out.println(parent.field1);
		parent.method1();
		parent.method2();
		
//		parent.method3(); // �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�ؼ� �Ұ���
		
		Child child = (Child) parent;
		
		child.field2 = "yyy";
		System.out.println(child.field2);
		child.method3();
	}

}
