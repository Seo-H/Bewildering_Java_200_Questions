package Chap06;

//������ �Է� �޾Ƽ� �հ�, ���, �ְ���, �������� ǥ��
import java.util.Scanner;

class PointSumAve {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int n = stdIn.nextInt(); // ��� ���� �Է� ����
		int[] points = new int[n]; // ����
		System.out.println("������ �Է��ϼ���.");
		int sum = 0; // �հ�
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "���� ������");
			points[i] = stdIn.nextInt(); // points[i]�� �д´�
			sum += points[i]; // sum�� points[i]�� ����
		}
		int max = points[0]; // �ְ���
		int min = points[0]; // ������
		for (int i = 1; i < n; i++) {
			if (points[i] > max)
				max = points[i];
			if (points[i] < min)
				min = points[i];
		}
		System.out.println("�հ�� " + sum + "���Դϴ�.");
		System.out.println("����� " + (double) sum / n + "���Դϴ�.");
		System.out.println("�ְ����� " + max + "���Դϴ�.");
		System.out.println("�������� " + min + "���Դϴ�.");
	}
}
