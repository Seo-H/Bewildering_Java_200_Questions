package Chap04;

//1���� n������ �� ���ϱ�
import java.util.Scanner;

class SumUpFor {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("1���� n������ ���� ���մϴ�.");
		int n;
		do {
			System.out.print("n�� ����");
			n = stdIn.nextInt();
		} while (n <= 0);
		int sum = 0;
		for (int i = 0; i <= n; i++)
			sum += i; // sum�� i�� ���Ѵ�
		System.out.print("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
}