package Chap08;

//�ڵ��� Ŭ����(Ver.1)�� �̿� ��(1)
class CarTester1 {
	public static void main(String[] args) {
		Car k3 = new Car("k3", "����999-99", 1660, 1500, 3640, 40.0, 35.0, 12.0);
		Car k5 = new Car("k5", "����999-98", 1660, 1525, 3695, 41.0, 35.0, 12.0);
		k3.putSpec(); // k3�� ��� ǥ��
		System.out.println();
		k5.putSpec(); // k5�� ���� ǥ��
	}
}
