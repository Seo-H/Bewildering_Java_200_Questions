package Chap02;

//�Է��� 2���� �Ǽ����� �հ� ����� ǥ��
import java.util.Scanner;

class SumAveDouble {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("x����"); // x�� �Է� �޽���
		double x = stdIn.nextDouble(); // �Է��� �Ǽ����� x�� �����Ѵ�
		System.out.print("y����"); // y�� �Է� �޽���
		double y = stdIn.nextDouble(); // �Է��� �Ǽ����� y�� �����Ѵ�
		System.out.println("�հ�� " + (x + y) + "�Դϴ�."); // �հ谪 ���ϱ�
		System.out.println("����� " + (x + y) / 2 + "�Դϴ�."); // ��հ� ���ϱ�
	}
}
