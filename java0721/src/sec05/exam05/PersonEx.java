package sec05.exam05;

public class PersonEx {
	public static void main(String[] args) {
		Person p = new Person("12345-1234567",  "ȫ�浿");
		
		System.out.println(p.nation);
		System.out.println(p.ssn);
		System.out.println(p.name);
		
//		p.nation = "usa"; // final �ʵ�� ����Ǿ����� �����ڸ� ���� �ʱ�ȭ�� �� ���Ŀ� ������ x.
//		p.ssn = "654321-7654321"; // final �ʵ�� ����Ǿ �ʵ尪�� ���� �� �� ����.
		
		p.name = "ȫ���"; // �Ϲ� �ʵ尪�̶� ���� ����
		System.out.println(p.name);
	}
	
	
}
