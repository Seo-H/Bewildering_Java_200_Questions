package Chap03;

//3���� ���� �� �ּڰ� ���ϱ�
import java.util.Scanner;

public class Min3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� a��");
		int a = stdIn.nextInt();
		System.out.print("���� b��");
		int b = stdIn.nextInt();
		System.out.print("���� b��");
		int c = stdIn.nextInt();
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		System.out.println("�ּڰ��� " + min + "�Դϴ�.");
	}
}
