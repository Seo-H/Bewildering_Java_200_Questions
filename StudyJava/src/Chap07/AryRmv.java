package Chap07;

//�迭�� ��� ����
import java.util.Scanner;

class AryRmv {
//--- �迭 a���� a[idx]�� ����(�ڿ� �ִ� ��ҵ��� �ϳ��� ������ �̵� ---//
	static void aryRmv(int[] a, int idx) {
		if (idx >= 0 && idx < a.length) {
			for (int i = idx; i < a.length - 1; i++)
				a[i] = a[i + 1];
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int num = stdIn.nextInt();
		int[] a = new int[num]; // ��� ���� num�� �迭
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]��");
			a[i] = stdIn.nextInt();
		}
		System.out.print("������ ����� �ε�����");
		int idx = stdIn.nextInt();
		aryRmv(a, idx); // �迭 a���� a[idx]�� ����
		for (int i = 0; i < num; i++) // �迭 aǥ��
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
