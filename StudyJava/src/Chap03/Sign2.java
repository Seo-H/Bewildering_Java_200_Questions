package Chap03;

//���� �������� ��ȣ(���/����/0)�� �����ؼ� ǥ��
import java.util.Scanner;

class Sign2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��������");
		int n = stdIn.nextInt();
		if (n == 1)
			System.out.println("�̰��� 1�Դϴ�.");
		else if (n == 2)
			System.out.println("�̰��� 2�Դϴ�.");
		else if (n == 3)
			System.out.println("�̰��� 3�Դϴ�.");
	}
}
