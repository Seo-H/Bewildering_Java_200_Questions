package Chap04;

//���� �������� 0���� ī��Ʈ�ٿ� (for��)
import java.util.Scanner;

class CountDownFor {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("ī��Ʈ�ٿ� �մϴ�.");
		int x;
		do {
			System.out.print("���� ��������");
			x = stdIn.nextInt();
		} while (x <= 0);
		for (; x >= 0; x--)
			System.out.println(x); // x���� ǥ��
	}
}
