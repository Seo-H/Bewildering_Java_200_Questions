package Chap02;

//�� ���� ���� x, y, z�� �հ� ����� ǥ��(���2)
class SumAve3B {
	public static void main(String[] args) {
		int x, y, z; // int�� ����
		int sum; // int�� ����(�հ�)
		x = 63; // ���� x�� 63�� ����
		y = 18; // ���� y�� 18�� ����
		z = 52; // ���� z�� 52�� ����
		sum = x + y + z; // x, y, z �հ�
		System.out.println("x���� " + x + "�Դϴ�."); // x�� ǥ��
		System.out.println("y���� " + y + "�Դϴ�."); // y�� ǥ��
		System.out.println("z���� " + z + "�Դϴ�."); // z�� ǥ��
		System.out.println("�հ�� " + sum + "�Դϴ�."); // �հ� ǥ��
		System.out.println("����� " + sum / 3 + "�Դϴ�."); // ��� ǥ��
	}
}
