package Chap03;

//�� ������ �� ���� ���� ū ���� ���ؼ� ǥ��
import java.util.Scanner;

class MinMaxEq {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� a��");
		int a = stdIn.nextInt();
		System.out.print("���� b��");
		int b = stdIn.nextInt();
		if (a == b)
			System.out.println("�� ���� �����ϴ�.");
		else {
			int min, max;
			if (a < b) {
				min = a;
				max = b;
			} else {
				min = b;
				max = a;
			}
			System.out.println("���� ���� " + min + "�Դϴ�.");
			System.out.println("ū ���� " + max + "�Դϴ�.");
		}
	}
}
