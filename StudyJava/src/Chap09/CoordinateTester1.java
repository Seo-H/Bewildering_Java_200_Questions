package Chap09;

//2���� ��ǥ Ŭ���� Coodinate(Ver.1) ��� ��(���1)
import java.util.Scanner;

class CoordinateTester1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("��ǥ p�� �Է��ϼ���.");
		System.out.print("X��ǥ��");
		double x = stdIn.nextDouble();
		System.out.print("Y��ǥ��");
		double y = stdIn.nextDouble();
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
		Coordinate q = p;
		q.set(9.9, 9.9);
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
		System.out.println("q = (" + q.getX() + ", " + q.getY() + ")");
	}
}
