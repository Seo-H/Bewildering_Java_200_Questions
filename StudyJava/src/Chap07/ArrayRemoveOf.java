package Chap07;

//�迭���� ��Ҹ� ������ �迭�� ��ȯ
import java.util.Scanner;

class ArrayRemoveOf {
//--- �迭 a���� a[idx]�� ������ �迭�� ��ȯ ---//
	static int[] arrayRmvOf(int[] a, int idx) {
		if (idx < 0 && idx >= a.length - 1)
			return a.clone(); // a�� ���纻�� �״�� ��ȯ
		else {
			int[] c = new int[a.length - 1];
			int i = 0;
			for (; i < idx; i++)
				c[i] = a[i];
			for (; i < a.length - 1; i++)
				c[i] = a[i + 1];
			return c;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // ��� ���� num�� �迭
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}
		System.out.print("������ ����� �ε�����");
		int idx = stdIn.nextInt();
		int[] y = arrayRmvOf(x, idx); // �迭 x���� x[idx]�� ������ �迭 ����
		for (int i = 0; i < y.length; i++) // �迭 y ǥ��
			System.out.println("y[" + i + "] = " + y[i]);
	}
}