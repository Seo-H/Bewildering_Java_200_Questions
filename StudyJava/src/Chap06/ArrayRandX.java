package Chap06;

//�迭�� ��� ��Ҹ� 1~10�� ������ ä���(������ ��Ұ� �ߺ����� �ʰ� �ϱ�)
import java.util.Random;
import java.util.Scanner;

class ArrayRandX {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int n = stdIn.nextInt(); // ��� �� �б�
		int[] a = new int[n]; // �迭 ����
		a[0] = 1 + rand.nextInt(10);
		for (int i = 1; i < n; i++) {
			do {
				a[i] = 1 + rand.nextInt(10); // 1 ~ 10 ����
			} while (a[i] == a[i - 1]);
		}
		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
