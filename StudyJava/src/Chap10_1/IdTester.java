package Chap10_1;

public class IdTester {
	public static void main(String[] args) {
		Id a = new Id(); // �ĺ� ��ȣ 1��
		Id b = new Id(); // �ĺ� ��ȣ 2��
		System.out.println("a�� �ĺ� ��ȣ��" + a.getId());
		System.out.println("b�� �ĺ� ��ȣ��" + b.getId());
		System.out.println("���������� �ο��� �ĺ� ��ȣ = " + Id.getMaxId());
		System.out.println("���������� �ο��� �ĺ� ��ȣ = " + a.getMaxId());
		System.out.println("���������� �ο��� �ĺ� ��ȣ = " + b.getMaxId());
	}
}
