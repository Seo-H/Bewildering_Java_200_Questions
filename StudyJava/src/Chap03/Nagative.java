package Chap03;

//���� �������� ���� ���ΰ�?
import java.util.Scanner;

class Nagative {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��������");
		int n = stdIn.nextInt();
		// if-then����if (���ǽ�) ���๮
		if (n < 0)
			// n < 0�� true(��)�� �� �����Ѵ�.
			System.out.println("�� ���� ���� ���Դϴ�.");
	}
}
