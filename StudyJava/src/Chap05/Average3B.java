package Chap05;

//�� ������ ��հ� ���ϱ�(ĳ��Ʈ ������ �̿�)
import java.util.Scanner;

class Average3B {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ x, y, z�� ����� ���մϴ�.");
		System.out.print("x����");
		int x = stdIn.nextInt();
		System.out.print("y����");
		int y = stdIn.nextInt();
		System.out.print("z����");
		int z = stdIn.nextInt();
		double ave = (double) (x + y + z) / 3; // ��հ�
		System.out.printf("x, y, z�� ����� %.3f�Դϴ�.\n", ave); // ǥ��
	}
}
