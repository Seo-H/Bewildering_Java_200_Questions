package Chap07;

//�� �迭�� ��ü ��ڰ��� ��ȯ
import java.util.Scanner;

class aryExchng {
//---�迭a�� b�� ��ü ��ڰ��� ��ȯ ---//
	static void aryExchng(int[] a, int[] b) {
		int n = a.length < b.length ? a.length : b.length;
		for (int i = 0; i < n; i++) {
			int t = a[i];
			a[i] = b[i];
			b[i] = t;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�迭 a�� ��� ����");
		int na = stdIn.nextInt(); // �迭 a�� ��� ��
		int[] a = new int[na]; // ��� ���� na�� �迭
		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "]��");
			a[i] = stdIn.nextInt();
		}
		System.out.print("�迭 b�� ��� ����");
		int nb = stdIn.nextInt(); // �迭 b�� ��� ��
		int[] b = new int[nb]; // ��� ���� nb�� �迭
		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "]��");
			b[i] = stdIn.nextInt();
		}
		aryExchng(a, b);
		System.out.println("�迭 a�� b�� ��ü ��Ҹ� ��ȯ�߽��ϴ�.");
		for (int i = 0; i < na; i++) // �迭 a�� ǥ��
			System.out.println("a[" + i + "] = " + a[i]);
		for (int i = 0; i < nb; i++) // �迭 b�� ǥ��
			System.out.println("b[" + i + "] = " + b[i]);
	}
}