package Chap16;

//�迭�� ��ҿ� ���� �о �ݴ�� ����(���� ������reverse���� ���� �ٽ� ����)
import java.util.Scanner;

class ReverseArray2 {
//--- �迭�� ��� a[idx1]�� a[idx2]�� ��ȯ ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

//--- �迭a�� ��Ҹ� �ݴ�� ����(����) ---//
	static void reverse(int[] a) {
		try {
			for (int i = 0; i < a.length / 2; i++)
				swap(a, i, a.length - i);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new RuntimeException("reverse�� ����?", e);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int num = stdIn.nextInt(); // ��� ��
		int[] x = new int[num]; // ��� �� num�� �迭
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}
		try {
			reverse(x); // �迭x�� ��Ҹ� �ݴ�� ������ ����
			System.out.println("��Ҹ� �ݴ�� �����߽��ϴ�.");
			for (int i = 0; i < num; i++)
				System.out.println("x[" + i + "] = " + x[i]);
		} catch (RuntimeException e) {
			System.out.println("���� ��" + e);
			System.out.println("������ ���Σ�" + e.getCause());
		}
	}
}
