package Chap03;

//���� �� ���� ���� 10���������� ǥ��(���1��if��)
import java.util.Scanner;

public class Diff2Digits1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� a��");
		int a = stdIn.nextInt();
		System.out.print("���� b��");
		int b = stdIn.nextInt();
		int diff = a >= b ? a - b : b - a;
		if (diff <= 10)
			System.out.println("�� ���� ���� 10�����Դϴ�.");
		else
			System.out.println("�� ���� ���� 11�̻��Դϴ�.");
	}
}
