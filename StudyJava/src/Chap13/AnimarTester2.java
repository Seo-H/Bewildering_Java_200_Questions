package Chap13;

//���� Ŭ���� (Ver.1) �׽�Ʈ ���α׷�
class AnimalTester2 {
	public static void main(String[] args) {
		// ���� ������ ���� : �߻� Ŭ������ �ν��Ͻ�ȭ�� �� ����
		// Animal x = new Animal();
		Animal[] a = new Animal[2];
		a[0] = new Dog("��ġ", "ġ�Ϳ�"); // ��
		a[1] = new Cat("����Ŭ", 7); // �����
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i].getName() + " ");
			a[i].bark(); // ¢��
			System.out.println();
		}
	}
}
