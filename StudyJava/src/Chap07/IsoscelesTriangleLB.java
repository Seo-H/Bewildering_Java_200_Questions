package Chap07;

//���� �Ʒ��� ������ �̵ �ﰢ���� ǥ��
import java.util.Scanner;

class IsoscelesTriangleLB {
//--- ����c�� n�� ���� ǥ�� ---//
	static void putChars(char c, int n) {
		while (n-- > 0)
			System.out.print(c);
	}

//--- ���� '*'�� n�� ���� ǥ�� ---//
	static void putStars(int n) {
		putChars('*', n);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�ܼ��£�");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}
}
