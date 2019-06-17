package Chap07;

//���� Ž��
import java.util.Scanner;

class LinearSearch {
//--- �迭 a�� ��ҷκ��� key�� ��ġ�ϴ� ���� �տ� �ִ� ��Ҹ� ���� Ž�� ---//
	static int linearSearch(int[] a, int key) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == key)
				return i; // Ž�� ����(�ε��� ��ȯ)
		return -1; // Ž�� ����(-1 ��ȯ)
	}

//---�迭 a�� ��ҷκ��� key�� ��ġ�ϴ� ���� �ڿ� �ִ� ��Ҹ� ���� Ž�� ---//
	static int linearSearchR(int[] a, int key) {
		for (int i = a.length - 1; i >= 0; i--)
			if (a[i] == key)
				return i; // Ž�� ����(�ε��� ��ȯ)
		return -1; // Ž�� ����(-1 ��ȯ)
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ����");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // ��� �� num�� �迭
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}
		System.out.print("ã�� ����"); // Ű �� �б�
		int ky = stdIn.nextInt();
		int idxTop = linearSearch(x, ky); // �迭x���� ky�� Ž��
		int idxBtm = linearSearchR(x, ky); // �迭x���� ky�� Ž��
		if (idxTop == -1)
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
		else if (idxTop == idxBtm)
			System.out.println("�ش� ���� x[" + idxTop + "]�� �ֽ��ϴ�.");
		else {
			System.out.println("�ش� ���� ��Ұ� ���� �� �����մϴ�.");
			System.out.println("���� �տ� ��ġ�� ���� x[" + idxTop + "]�� �ֽ��ϴ�.");
			System.out.println("���� �ڿ� ��ġ�� ���� x[" + idxBtm + "]�� �ֽ��ϴ�.");
		}
	}
}
