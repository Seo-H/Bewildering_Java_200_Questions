package Chap07;

//���� �������� �о �ڿ������� �о ǥ��
import java.util.Scanner;

class InverseNumber {
	static Scanner stdIn = new Scanner(System.in);

	// --- ���� �������� �о ��ȯ---//
	static int readPlusInt() {
		int x;
		do {
			System.out.print("���� ��������");
			x = stdIn.nextInt();
		} while (x <= 0);
		return x;
	}

	public static void main(String[] args) {
		int x;
		do {
			int n = readPlusInt();
			System.out.print("�ݴ�� ������ ");
			while (n > 0) {
				System.out.print(n % 10); // n�� ������ �ڸ����� ǥ��
				n /= 10; // n�� 10���� ����
			}
			System.out.println("�Դϴ�.");
			do {
				System.out.print("�ٽ� �� ��?<Yes��1��No��0>��");
				x = stdIn.nextInt();
			} while (x != 0 && x != 1);
		} while (x == 1);
	}
}
