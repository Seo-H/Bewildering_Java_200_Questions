package Chap03;

//���� �������� ��� ���踦 ǥ��(Ʋ�� ����)
import java.util.Scanner;

class BalanceWrong {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� a��");
		int a = stdIn.nextInt();
		System.out.print("���� b��");
		int b = stdIn.nextInt();
		int diff = a - b;
		if (diff > 0)
			System.out.println("a�� ũ��.");
		else if (diff < 0)
			System.out.println("b�� ũ��.");
		else
			System.out.println("a�� b�� ����.");
	}
}
