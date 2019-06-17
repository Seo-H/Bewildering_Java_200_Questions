package Chap06;

//4�� 3���� ��İ� 3�� 4���� ��� ���ϱ�
import java.util.Scanner;

class MatrixProduct {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] a = new int[4][3]; // 4�� 3���� ���
		int[][] b = new int[3][4]; // 3�� 4���� ���
		int[][] c = new int[4][4]; // a�� b�� ���� �����ϴ� ���
		System.out.println("��� a�� ��Ҹ� �Է��ϼ���.");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("a[%d][%d] : ", i, j);
				a[i][j] = stdIn.nextInt();
			}
		}
		System.out.println("��� b�� ��Ҹ� �Է��ϼ���.");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("b[%d][%d] : ", i, j);
				b[i][j] = stdIn.nextInt();
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("��� a�� b�� ��");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				System.out.printf("%5d", c[i][j]);
			System.out.println();
		}
	}
}
