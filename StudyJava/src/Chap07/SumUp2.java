package Chap07;

//1���� n������ �� ���ϱ�
import java.util.Scanner;

class SumUp2 {
	static int sumUp(int n) {
		int sum = 0; // �հ�
		while (n > 0)
			sum += n--; // sum�� n�� ���� �� n���� 1�� ����.
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1���� x������ ���� ������.");
		int x;
		do {
			System.out.print("x�� ����");
			x = stdIn.nextInt();
		} while (x <= 0);
		System.out.print("1���� " + x + "������ ���� " + sumUp(x) + "�Դϴ�.");
	}
}
