package Chap07;

//�Է��� ������ ��ȣ�� ����
import java.util.Scanner;

class SignOf2 {
	static int signOf(int n) {
		if (n > 0)
			return 1;
		else if (n < 0)
			return -1;
		return 0;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� x��");
		int x = stdIn.nextInt();
		int s = signOf(x);
		System.out.println("singOf(x)�� " + s + "�Դϴ�.");
	}
}