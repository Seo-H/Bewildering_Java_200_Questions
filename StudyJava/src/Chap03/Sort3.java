package Chap03;

//3���� �������� ������������ ����
import java.util.Scanner;

public class Sort3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� a��");
		int a = stdIn.nextInt();
		System.out.print("���� b��");
		int b = stdIn.nextInt();
		System.out.print("���� c��");
		int c = stdIn.nextInt();
		if (a > b) { // a�� b���� ũ�� a�� b�� ��ȯ
			int t = a;
			a = b;
			b = t;
		}
		if (b > c) { // b�� c���� ũ�� b�� c�� ��ȯ
			int t = b;
			b = c;
			c = t;
		}
		if (a > b) { // a�� b���� ũ�� a�� b�� ��ȯ
			int t = a;
			a = b;
			b = t;
		}
		System.out.println("a �� b �� c�� �ǵ��� �����߽��ϴ�.");
		System.out.println("���� a�� " + a + "�Դϴ�.");
		System.out.println("���� b�� " + b + "�Դϴ�.");
		System.out.println("���� c�� " + c + "�Դϴ�.");
	}
}
