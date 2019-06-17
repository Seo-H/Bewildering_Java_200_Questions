package Chap07;

//���� Ű�� ���� ����� ����� ���� ���� ����� ü���� ���Ѵ�
import java.util.Scanner;

class minOfHeightWeight {
//--- �迭 a�� �ּڰ��� ���ؼ� ��ȯ ---//
	static int minOf(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] < min)
				min = a[i];
		return min;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ���£�");
		int num = stdIn.nextInt(); // ��� ���� �д´�
		int[] height = new int[num]; // ����� �迭 ����
		int[] weight = new int[num]; // ü�߿� �迭 ����
		System.out.println(num + "���� ����� ü���� �Է�����.");
		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "���� ���壺");
			height[i] = stdIn.nextInt();
			System.out.print((i + 1) + "���� ü�ߣ�");
			weight[i] = stdIn.nextInt();
		}
		System.out.println("���� Ű�� ���� ����� ���壺" + minOf(height) + "cm");
		System.out.println("���� ���� ����� ü�ߣ�" + minOf(weight) + "kg");
	}
}
