package Chap09_1;

//2���� ��ǥ Ŭ���� Coordinate(Ver.2) ��� ��
import java.util.Scanner;

class CoordinateTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("��ǥ p�� �Է��ϼ���.");
		System.out.print("X��ǥ��");
		double x = stdIn.nextDouble();
		System.out.print("Y��ǥ��");
		double y = stdIn.nextDouble();
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = " + p);
		Coordinate q = new Coordinate(p); // p�� ���� ��ǥ
		System.out.println("q�� p�� ���� ��ǥ�� ��������ϴ�.");
		System.out.println("q = " + q);
		if (p.equalTo(q))
			System.out.println("p�� q�� �����ϴ�.");
		else
			System.out.println("p�� q�� �ٸ��ϴ�.");
		Coordinate c1 = new Coordinate(); // (0.0,0.0)
		Coordinate c2 = new Coordinate(1.1, 2.2); // (1.1, 2.2)
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		Coordinate[] a = new Coordinate[3]; // ��� ���� 3�� Coordinate�� �迭 3
		for (int i = 0; i < a.length; i++)
			a[i] = new Coordinate(); // ��� ��Ҹ� (0.0, 0.0)�� ����
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
