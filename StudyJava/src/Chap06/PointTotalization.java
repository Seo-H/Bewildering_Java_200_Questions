package Chap06;

//6���� �� ����(����, ����) �����κ��� ����/�л��� ���
import java.util.Scanner;

class PointTotalization {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int number = 6; // ��� ��
		int[][] point = new int[number][2]; // ����
		int[] sumStudent = new int[number]; // �л��� ���� �հ�
		int[] sumSubject = new int[2]; // �� ������ ���� �հ�
		System.out.printf("%d���� ����, ���� ������ �Է��ϼ���.\n", number);
		for (int i = 0; i < number; i++) {
			System.out.printf("%2d�� ���", i + 1);
			point[i][0] = stdIn.nextInt();
			System.out.print(" ���У�");
			point[i][1] = stdIn.nextInt();
			sumStudent[i] = point[i][0] + point[i][1]; // �л��� �հ�
			sumSubject[0] += point[i][0]; // ���� �հ�
			sumSubject[1] += point[i][1]; // ���� �հ�
		}
		System.out.println("No.   ����      ����    ���");
		for (int i = 0; i < number; i++)
			System.out.printf("%2d%6d%6d%6.1f\n", i + 1, point[i][0], point[i][1], (double) sumStudent[i] / 2);
		System.out.printf("���%6.1f%6.1f\n", (double) sumSubject[0] / number, (double) sumSubject[1] / number);
	}
}
