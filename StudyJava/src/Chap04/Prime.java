package Chap04;

//�Ҽ� ����
import java.util.Scanner;

class Prime {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("2�̻��� ��������");
			n = stdIn.nextInt();
		} while (n < 2);
		int i;
		for (i = 2; i < n; i++)
			if (n % i == 0) // ������ ��������(�Ҽ��� �ƴϴ�)
				break;
		if (i == n)
			System.out.println("�Ҽ��Դϴ�.");
		else
			System.out.println("�Ҽ��� �ƴմϴ�.");
	}
}