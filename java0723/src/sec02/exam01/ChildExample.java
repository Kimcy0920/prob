package sec02.exam01;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1(); // �θ� �޼���
		parent.method2(); // �ڽ� �޼���(�������̵�)
		child.method3(); // �ڽĿ��� ���� ���� �޼���

	}

}
