package sec01.exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			System.out.println("�ν��Ͻ� ��� Ŭ���� B");
			field1 = 10;
			method1();
			
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
//			field1 = 10;
//			method1();
			System.out.println("���� ��� Ŭ���� B");
			field2 = 10;
			method2();
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.method();
		
		
		A.C c = new A.C();
		c.method();
	}
}

/* Ŭ���� A�� �ν��Ͻ� ����� ���� ����� ����
 * �ν��Ͻ� ��� Ŭ������ ��øŬ���� B�� �޼ҵ带 ����
 * Ŭ���� A�� �ν��Ͻ� ����� ���� ����� ȣ�� - ��밡��
 * 
 * ���� ��� Ŭ������ ��øŬ���� C�� �޼ҵ带 ����
 * Ŭ���� A�� �ν��Ͻ� ����� ���� ����� ȣ�� - ��������� ��밡��
*/