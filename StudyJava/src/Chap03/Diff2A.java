package Chap03;

//���� �� �������� ���� ǥ��(���1��if��)
import java.util.Scanner;

class Diff2A {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� a��");
		int a = stdIn.nextInt();
		System.out.print("���� b��");
		int b = stdIn.nextInt();
		int diff;
		if (a >= b)
			diff = a - b;
		else
			diff = b - a;
		System.out.println("�� ���� ���� " + diff + "�Դϴ�.");
	}
}
