package Chap06;

//���� Ž��(���2: ���� ���� �ִ� ��Ҹ� Ž��)
import java.util.Scanner;

class LinearSearchBottom {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ��:");
		int n = stdIn.nextInt(); // ��� �� �Է�
		int[] a = new int[n]; // �迭 ����
		for (int j = 0; j < n; j++) {
			System.out.print("a[" + j + "] = ");
			a[j] = stdIn.nextInt();
		}
		System.out.print("ã�� ����:");
		int key = stdIn.nextInt();
		int i;
		for (i = n - 1; i >= 0; i--)
			if (a[i] == key)
				break;
		if (i >= 0) // Ž�� ����
			System.out.println("�� ���� a[" + i + "]�� �ֽ��ϴ�.");
		else // Ž�� ����
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
	}
}
