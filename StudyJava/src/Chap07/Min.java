package Chap07;

//�� ���� �ּڰ�, �� ���� �ּڰ�, �迭 ����� �ּڰ��� ���ϴ� �޼���(���� ����)
import java.util.Scanner;

class Min {
	// --- a, b�� �ּڰ��� ��ȯ ---//
	static int min(int a, int b) {
		return a < b ? a : b;
	}

	// --- a, b, c�� �ּڰ��� ��ȯ ---//
	static int min(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		return min;
	}

	// --- �迭 a�� �ּڰ��� ��ȯ ---//
	static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] < min)
				min = a[i];
		return min;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("x����");
		int x = stdIn.nextInt();
		System.out.print("y����");
		int y = stdIn.nextInt();
		System.out.print("z����");
		int z = stdIn.nextInt();
		System.out.print("�迭 a�� ��� ����");
		int num = stdIn.nextInt();
		int[] a = new int[num]; // ��� ���� num�� �迭
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]��");
			a[i] = stdIn.nextInt();
		}
		// �� ���� �ּڰ�
		System.out.println("x, y�� �ּڰ��� " + min(x, y) + "�Դϴ�.");
		// �� ���� �ּڰ�
		System.out.println("x, y, z�� �ּڰ��� " + min(x, y, z) + "�Դϴ�.");
		// �迭�� �ּڰ�
		System.out.println("�迭 a�� �ּڰ��� " + min(a) + "�Դϴ�.");
	}
}