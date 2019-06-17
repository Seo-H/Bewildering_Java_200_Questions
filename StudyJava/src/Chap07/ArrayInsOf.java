package Chap07;

//�迭�� ��Ҹ� �����ؼ� ��ȯ
import java.util.Scanner;

class ArrayInsOf {
//--- �迭 a�� a[idx]�� x�� ������ �迭�� ��ȯ ---//
	static int[] arrayInsOf(int[] a, int idx, int x) {
		if (idx < 0 || idx > a.length)
			return a.clone();
		else {
			int[] c = new int[a.length + 1];
			int i = 0;
			for (; i < idx; i++)
				c[i] = a[i];
			for (; i < a.length; i++)
				c[i + 1] = a[i];
			c[idx] = x;
			return c;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // ��� ���� n�� �迭
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}
		System.out.print("������ �ε�����");
		int idx = stdIn.nextInt();
		System.out.print("������ ����");
		int n = stdIn.nextInt(); // �迭 x�� x[idx]�� n�� ������ �迭 ����
		int[] y = arrayInsOf(x, idx, n);
		for (int i = 0; i < y.length; i++) // �迭 y ǥ��
			System.out.println("y[" + i + "] = " + y[i]);
	}
}
