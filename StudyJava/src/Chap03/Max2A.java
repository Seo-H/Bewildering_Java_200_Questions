package Chap03;

//���� 2���� �Ǽ��� �߿��� ū ���� ǥ��(���1��if��)
import java.util.Scanner;

class Max2A {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�Ǽ� a��");
		double a = stdIn.nextDouble();
		System.out.print("�Ǽ� b��");
		double b = stdIn.nextDouble();
		double max; // ū ���� ����
		if (a > b)
			max = a;
		else
			max = b;
		System.out.println("ū ���� ���� " + max + "�Դϴ�.");
	}
}
