package Chap03;

//���� �������� ����̸� 10�� ������� �����ؼ� ǥ��
import java.util.Scanner;

class MultipleOf10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��������");
		int n = stdIn.nextInt();
		if (n > 0)
			if (n % 10 == 0)
				System.out.println("�� ���� 10�� ����Դϴ�.");
			else
				System.out.println("�� ���� 10�� ����� �ƴմϴ�.");
		else
			System.out.println("���� �������� �Է��߽��ϴ�.");
	}
}
