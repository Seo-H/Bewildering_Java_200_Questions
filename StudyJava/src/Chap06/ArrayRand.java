package Chap06;

//�迭�� ��� ��ҿ� 1~10�� ���� ä���
import java.util.Random;
import java.util.Scanner;

class ArrayRand {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int n = stdIn.nextInt(); // ��� �� �б�
		int[] a = new int[n]; // �迭 ����
		for (int i = 0; i < n; i++)
			a[i] = 1 + rand.nextInt(10); // 1~10 ����
		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
