package Chap04;

//�������� ���� ǥ��(���2)
import java.util.Scanner;

class Square2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��������");
		int n = stdIn.nextInt();
		for (int i = 1, j = 1; i <= n; i++, j = i * i)
			System.out.println(i + "�� ������ " + j + "�Դϴ�.");
	}
}