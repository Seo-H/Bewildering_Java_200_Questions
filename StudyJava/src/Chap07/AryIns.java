package Chap07;

//�迭�� ��� �����ϱ�
import java.util.Scanner;

class AryIns {
//--- �迭a�� a[idx]�� x�� ����(�ڿ� �ִ� ��Ҹ� �ϳ��� ���������� �̵���Ŵ�� ---//
	static void aryIns(int[] a, int idx, int x) {
		if (idx >= 0 && idx < a.length) {
			for (int i = a.length - 1; i > idx; i--)
				a[i] = a[i - 1];
			a[idx] = x;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int num = stdIn.nextInt();
		int[] a = new int[num]; // num ũ���� �迭 ����
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]��");
			a[i] = stdIn.nextInt();
		}
		System.out.print("������ ����� �ε�����");
		int idx = stdIn.nextInt();
		System.out.print("������ ����");
		int n = stdIn.nextInt();
		aryIns(a, idx, n); // �迭 a���� a[idx]�� x�� ����
		for (int i = 0; i < num; i++) // �迭 a ǥ��
			System.out.println("a[" + i + "] = " + a[i]);
	}
}