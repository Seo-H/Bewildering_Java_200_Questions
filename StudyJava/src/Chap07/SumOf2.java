package Chap07;

//�迭�� ������ ��� ����� �� ���ϱ�(�⺻ for��)
import java.util.Scanner;

class SumOf2 {
	static int sumOf(int[] a) {
		int sum = 0;
		// Ȯ�� for��
		for (int i : a)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // num���� ��Ҹ� ������ �迭
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}
		System.out.println("��� ����� ���� " + sumOf(x) + "�Դϴ�.");
	}
}