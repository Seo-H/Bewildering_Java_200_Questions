package Chap07;

//1���� n������ �� ���ϱ�
import java.util.Scanner;

class SumUp1 {
//--- 1���� n������ �� ---//
	static int sumUp(int n) {
		int sum = 0; // �հ�
		for (int i = 1; i <= n; i++)
			sum += i; // sum�� i�� ���Ѵ�
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
