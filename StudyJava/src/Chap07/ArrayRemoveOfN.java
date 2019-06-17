package Chap07;

//�迭���� ���ӵǴ� n���� ��Ҹ� ������ �迭 ��ȯ
import java.util.Scanner;

class ArrayRemoveOfN {
//--- �迭 a�� a[idx]���� n���� ��Ҹ� ������ �迭�� ��ȯ---//
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		if (n < 0 || idx < 0 || idx > a.length)
			return a.clone();
		else {
			if (idx + n > a.length)
				n = a.length - idx;
			int[] c = new int[a.length - n];
			int i = 0;
			for (; i < idx; i++)
				c[i] = a[i];
			for (; i < a.length - n; i++)
				c[i] = a[i + n];
			return c;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}
		System.out.print("������ ������ �ε�����");
		int idx = stdIn.nextInt();
		System.out.print("������ ����� ������");
		int n = stdIn.nextInt();
		// �迭x�� x[idx]���� n���� ��Ҹ� ������ �迭 ����
		int[] y = arrayRmvOfN(x, idx, n);
		for (int i = 0; i < y.length; i++) // �迭 y ǥ��
			System.out.println("y[" + i + "] = " + y[i]);
	}
}
