package Chap06;

//�迭�� ��� ��Ҹ� 1~10�� ������ ä�� ��(��� ��Ұ� �ߺ��ż��� �� �ȴ�)
import java.util.Random;
import java.util.Scanner;

class ArrayRandY {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int n; // ��� ��
		do {
			System.out.print("��� ����");
			n = stdIn.nextInt(); // ��� �� �б�
		} while (n > 10);
		int[] a = new int[n]; // �迭 ����
		for (int i = 0; i < n; i++) {
			int j;
			do {
				j = 0;
				a[i] = 1 + rand.nextInt(10);
				for (; j < i; j++)
					if (a[j] == a[i])
						break;
			} while (j < i);
		}
		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
