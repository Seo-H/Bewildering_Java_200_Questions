package Chap03;

//2���� �Ǽ����� �о ū ���� ǥ��(���2������ ������)
import java.util.Scanner;

class Max2B {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�Ǽ� a��");
		double a = stdIn.nextDouble();
		System.out.print("�Ǽ� b��");
		double b = stdIn.nextDouble();
		double max = a > b ? a : b;
		System.out.println("ū ���� ���� " + max + "�Դϴ�.");
	}
}
