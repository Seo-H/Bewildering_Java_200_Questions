package Chap10;

public class IdTester {
	public static void main(String[] args) {
		Id a = new Id(); // �ĺ� ��ȣ 1��
		Id b = new Id(); // �ĺ� ��ȣ 2��
		System.out.println("a�� �ĺ� ��ȣ��" + a.getId());
		System.out.println("b�� �ĺ� ��ȣ��" + b.getId());
		System.out.println("Id.counter = " + Id.counter);
		System.out.println("a.counter = " + a.counter);
		System.out.println("b.counter = " + b.counter);
	}
}
