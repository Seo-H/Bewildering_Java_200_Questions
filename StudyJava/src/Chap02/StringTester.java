package Chap02;

//���ڿ� �ʱ�ȭ�� ����
class StringTester {
	public static void main(String[] args) {
		String s1 = "ABC"; // �ʱ�ȭ
		String s2 = "XYZ"; // �ʱ�ȭ
		System.out.println("���ڿ� s1�� " + s1 + "�Դϴ�."); // ǥ��
		System.out.println("���ڿ� s2�� " + s2 + "�Դϴ�."); // ǥ��
		s1 = "FBI"; // ����(���� �����Ѵ٣�
		System.out.println("���ڿ� s1�� " + s1 + "�Դϴ�."); // ǥ��
		System.out.println("���ڿ� s2�� " + s2 + "�Դϴ�."); // ǥ��
	}
}
