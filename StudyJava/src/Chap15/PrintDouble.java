package Chap15;

//�ε��Ҽ������� ������ �ڸ����� ǥ��
import java.util.Scanner;

class PrintDouble {
//�ε��Ҽ����� x�� �Ҽ��� ���� 9�ڸ�, ��ü�� ��� w�ڸ��� ǥ��
	static void printDouble(double x, int p, int w) {
		System.out.printf(String.format("%%%d.%df", w, p), x);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�Ǽ�����");
		double x = stdIn.nextDouble();
		System.out.print("��ü �ڸ�����");
		int w = stdIn.nextInt();
		System.out.print("�Ҽ��� ���� �ڸ�����");
		int p = stdIn.nextInt();
		printDouble(x, p, w);
		System.out.println();
	}
}