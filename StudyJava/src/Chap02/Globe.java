package Chap02;

//���� ���ǿ� �ѳ��� ���ϱ�(������ 3.1416�� final ������ ���)
import java.util.Scanner;

class Globe {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final double PI = 3.1416;
		System.out.println("���� �ѳ��̿� ���Ǹ� ���մϴ�.");
		System.out.print("��������"); // ������ �Է� �޽���
		double r = stdIn.nextDouble(); // r�� �Ǽ����� �Է� ����
		System.out.println("�ѳ��̴� " + (4 * PI * r * r) + "�Դϴ�.");
		System.out.println("���Ǵ� " + (4 / 3.0 * PI * r * r * r) + "�Դϴ�.");
	}
}
