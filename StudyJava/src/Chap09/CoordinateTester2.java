package Chap09;

//2���� ��ǥ Ŭ���� Coodinate(Ver.1) ��� ��(���2�����ϼ� ����)
import java.util.Scanner;

class CoordinateTester2 {
	static boolean compCoordinate(Coordinate c1, Coordinate c2) {
		return c1.getX() == c2.getX() && c1.getY() == c2.getY();
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double x, y;
		System.out.println("��ǥ p�� �Է��ϼ���.");
		System.out.print("X��ǥ��");
		x = stdIn.nextDouble();
		System.out.print("Y��ǥ��");
		y = stdIn.nextDouble();
		Coordinate p = new Coordinate(x, y);
		System.out.println("��ǥ q�� �Է��ϼ���.");
		System.out.print("X��ǥ��");
		x = stdIn.nextDouble();
		System.out.print("Y��ǥ��");
		y = stdIn.nextDouble();
		Coordinate q = new Coordinate(x, y);
		System.out.println((p == q) ? "p == q�Դϴ�." : "p != q�Դϴ�.");
		System.out.println(p.getX() == q.getX() && p.getY() == q.getY() ? "p�� q�� �����ϴ�." : "p�� q�� �ٸ��ϴ�.");
		System.out.println(compCoordinate(p, q) ? "p�� q�� �����ϴ�." : "p�� q�� �ٸ��ϴ�.");
	}
}
