package Chap03;

//���� �� �������� ���� ǥ��(���2������ ������)
import java.util.Scanner;

class Diff2B {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� a��");
		int a = stdIn.nextInt();
		System.out.print("���� b��");
		int b = stdIn.nextInt();
		int diff = a >= b ? a - b : b - a;
		System.out.println("�� ���� ���� " + diff + "�Դϴ�.");
	}
}
