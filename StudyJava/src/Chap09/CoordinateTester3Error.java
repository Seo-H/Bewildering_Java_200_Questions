package Chap09;

//2���� ��ǥ Ŭ���� Coodinate(Ver.1) ��� ��(���3���迭/����)
import java.util.Scanner;

class CoordinateTester3Error {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ǥ�� �� ����");
		int n = stdIn.nextInt();
		Coordinate[] a = new Coordinate[n]; // ��� �� n�� Coordinate�� �迭
		for (int i = 0; i < a.length; i++)
			a[i].set(5.5, 7.7); // ��� ��Ҹ� (5.5, 7.7)�� ����
		for (int i = 0; i < a.length; i++)
			System.out.printf("a[%d] = (%.1f, %.1f)\n", i, a[i].getX(), a[i].getY());
	}
}
