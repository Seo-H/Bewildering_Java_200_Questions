package Chap14;

//���� Ŭ������ ��� ��
class ShapeTester {
	public static void main(String[] args) {
		Plane2D[] a = { new Rectangle(2, 5), // �簢��
				new Parallelogram(2, 5), // ���� �纯��
		};
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "]�� ����=" + a[i].getArea());
	}
}
