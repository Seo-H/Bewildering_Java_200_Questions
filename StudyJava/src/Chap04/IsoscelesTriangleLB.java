package Chap04;

//���� �Ʒ��� ������ �̵ �ﰢ��
import java.util.Scanner;

class IsoscelesTriangleLB {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�ܼ���? ��");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}