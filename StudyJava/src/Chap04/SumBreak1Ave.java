package Chap04;

//���� ���������� �ջ�(0�� �ԷµǸ� ����)
import java.util.Scanner;

class SumBreak1Ave {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ ���մϴ�.");
		System.out.print("�� ���� ���ұ��?��");
		int n = stdIn.nextInt(); // ������ ����
		int sum = 0; // �հ�
		int i;
		for (i = 0; i < n; i++) {
			System.out.print("����(0���� ����)��");
			int t = stdIn.nextInt();
			if (t == 0)
				break; // for���� ��������
			sum += t;
		}
		System.out.println("�հ�� " + sum + "�Դϴ�.");
		if (i != 0)
			System.out.println("����� " + sum / i + "�Դϴ�.");
	}
}
