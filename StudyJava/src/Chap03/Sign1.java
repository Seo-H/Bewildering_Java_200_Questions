package Chap03;

//���� �������� ��ȣ(���/����/0)�� �����ؼ� ǥ��
import java.util.Scanner;

class Sign1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��������");
		int n = stdIn.nextInt();
		if (n > 0)
			System.out.println("���� ����Դϴ�.");
		else if (n < 0)
			System.out.println("���� �����Դϴ�.");
		else if (n == 0)
			System.out.println("���� 0�Դϴ�.");
	}
}
