package Chap06;

//���� Ž��(���1: ���� �տ� �ִ� ��Ҹ� Ž��)
import java.util.Scanner;

class LinearSearchTop {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int n = stdIn.nextInt(); // ��� �� �Է�
		int[] a = new int[n]; // �迭 ����
		for (int j = 0; j < n; j++) {
			System.out.print("a[" + j + "] = ");
			a[j] = stdIn.nextInt();
		}
		System.out.print("ã�� ����:");
		int key = stdIn.nextInt();
		int i;
		for (i = 0; i < n; i++)
			if (a[i] == key)
				break;
		if (i < n)
			System.out.println("�� ���� a[" + i + "]�� �ֽ��ϴ�.");
		else
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
	}
}
