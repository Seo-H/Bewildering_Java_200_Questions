package Chap04;

//3�ڸ��� ���� ������ �б�
import java.util.Scanner;

class ThreeDigits {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x; // �д� ��
		do {
			System.out.print("�� �ڸ��� ��������");
			x = stdIn.nextInt();
		} while (x < 100 || x > 999);
		System.out.print("�Է��� ���� " + x + "�Դϴ�.");
	}
}
