package Chap10;

public class ExIdTester {
	public static void main(String[] args) {
		ExId a = new ExId(); // �ĺ� ��ȣ 1��
		ExId b = new ExId(); // �ĺ� ��ȣ 2��
		ExId c = new ExId(); // �ĺ� ��ȣ 3��
		ExId.setStep(4);
		ExId d = new ExId(); // �ĺ� ��ȣ 7��
		ExId e = new ExId(); // �ĺ� ��ȣ 11��
		ExId f = new ExId(); // �ĺ� ��ȣ 15��
		System.out.println("a�� �ĺ� ��ȣ��" + a.getId());
		System.out.println("b�� �ĺ� ��ȣ��" + b.getId());
		System.out.println("c�� �ĺ� ��ȣ��" + c.getId());
		System.out.println("d�� �ĺ� ��ȣ��" + d.getId());
		System.out.println("e�� �ĺ� ��ȣ��" + e.getId());
		System.out.println("f�� �ĺ� ��ȣ��" + f.getId());
		int max = ExId.getMaxId();
		System.out.println("�������� �ο��� �ĺ� ��ȣ = " + max);
		System.out.println("������ �ο��� �ĺ� ��ȣ = " + (max + ExId.getStep()));
	}
}
