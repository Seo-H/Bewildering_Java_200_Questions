package Chap04;

//���� ������ŭ * ǥ��(5�� ������ �� �ٲ�)(���2)
import java.util.Scanner;

class PutAsterisk5B {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�� ���� *�� ǥ���ұ��?:");
		int n = stdIn.nextInt();
		if (n > 0) {
			for (int i = 0; i < n / 5; i++)
				System.out.println("*****");
			int rest = n % 5;
			if (rest > 0) {
				for (int i = 0; i < rest; i++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
}
