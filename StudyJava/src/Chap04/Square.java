package Chap04;

//�������� ǥ��
import java.util.Scanner;

class Square {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�������� ǥ���մϴ�.");
		System.out.print("�ܼ��£�");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
