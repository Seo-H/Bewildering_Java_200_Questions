package Chap07;

//�迭�� ���纻 �ۼ�
import java.util.Scanner;

class arrayClone {
//--- �迭 a�� ���纻�� �����ؼ� ��ȯ ---//
	static int[] arrayClone(int[] a) {
		int[] c = new int[a.length]; // ��� ���� a�� ����
		for (int i = 0; i < c.length; i++) // ��ü ��� ����
			c[i] = a[i];
		return c;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // num ũ���� �迭 ����
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}
		int[] y = arrayClone(x); // �迭 x ����
		System.out.println("�迭 x�� �����ؼ� �迭 y�� �����߽��ϴ�.");
		for (int i = 0; i < num; i++) // �迭 y ǥ��
			System.out.println("y[" + i + "] = " + y[i]);
	}
}
