package Chap06;

//��� ����� �հ� ����� ���ؼ� ǥ��(Ȯ�� for��)
import java.util.Scanner;

class ArraySumAve {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int n = stdIn.nextInt(); // ��� �� �Է�
		double[] a = new double[n]; // �迭 ����
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextDouble();
		}
		double sum = 0; // �հ�
		for (double i : a) // Ȯ�� for��
			sum += i;
		System.out.println("��� ����� ���� " + sum + "�Դϴ�.");
		System.out.println("��� ����� ����� " + sum / n + "�Դϴ�.");
	}
}
