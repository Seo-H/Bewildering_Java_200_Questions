package Chap06;

//�迭�� ��� ��Ҹ� �������� �����ؼ� ǥ��
import java.util.Scanner;

class CopyArrayReverse {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int n = stdIn.nextInt(); // ��� �� �б�
		int[] a = new int[n]; // �迭 a����
		int[] b = new int[n]; // �迭 b����
		for (int i = 0; i < n; i++) { // �迭 a�� �� �б�
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		// �迭 a�� ��� ��Ҹ� �������� �迭 b�� ����
		for (int i = 0; i < n; i++) {
			b[i] = a[n - i - 1];
		}
		System.out.println("a�� ��� ��Ҹ� �������� �����߽��ϴ�.");
		for (int i = 0; i < n; i++) // �迭 b�� ǥ��
			System.out.println("b[" + i + "] = " + b[i]);
	}
}
