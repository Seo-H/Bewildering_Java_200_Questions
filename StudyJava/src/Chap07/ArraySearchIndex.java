package Chap07;

//�迭�� ���纻 �ۼ�
import java.util.Scanner;

class ArraySearchIndex {
//--- �迭 a���� x�� ��ġ�ϴ� ��� ����� �ε����� ������ �迭 ��ȯ ---//
	static int[] arraySrchIdx(int[] a, int x) {
		int count = 0; // x�� ��ġ�ϴ� ����� ����
		for (int i = 0; i < a.length; i++)
			if (a[i] == x)
				count++;
		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i--)
			if (a[i] == x)
				c[count--] = i;
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
		System.out.print("Ž���� ����");
		int n = stdIn.nextInt();
		int[] b = arraySrchIdx(x, n);
		if (b.length == 0)
			System.out.println("��ġ�ϴ� ��Ұ� �����ϴ�.");
		else {
			System.out.println("��ġ�ϴ� ����� �ε���");
			for (int i = 0; i < b.length; i++) // �迭 y ǥ��
				System.out.println(b[i]);
		}
	}
}
