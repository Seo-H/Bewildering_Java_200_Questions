package Chap04;

//�Ƕ�̵� ǥ��
import java.util.Scanner;

class Pyramid {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�Ƕ�̵带 ǥ���մϴ�.");
		System.out.print("�ܼ���?��");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(' ');
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
