package Chap03;

//������ �������� ���� ����(���2������ ������ ||�� �̿�)
import java.util.Scanner;

class Grade2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������");
		int point = stdIn.nextInt();
		if (point < 0 || point > 100)
			System.out.println("�߸��� �����Դϴ�.");
		else if (point <= 49)
			System.out.println("��");
		else if (point <= 59)
			System.out.println("��");
		else if (point <= 69)
			System.out.println("��");
		else if (point <= 79)
			System.out.println("��");
		else
			System.out.println("��");
	}
}
