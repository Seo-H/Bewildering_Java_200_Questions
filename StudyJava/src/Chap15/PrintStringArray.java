package Chap15;

//���ڿ� �迭�� ǥ���ϴ� �޼���
import java.util.Scanner;

class PrintStringArray {
//���ڿ� �迭 ǥ��
	static void printStringArray(String[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length(); j++)
				System.out.print(a[i].charAt(j));
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���ڿ��� ������");
		int n = stdIn.nextInt();
		String[] sx = new String[n];
		for (int i = 0; i < sx.length; i++) {
			System.out.print("sx[" + i + "] = ");
			sx[i] = stdIn.next();
		}
		printStringArray(sx);
	}
}
