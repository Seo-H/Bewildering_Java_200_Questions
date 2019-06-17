package Chap09;

//2차원 좌표 클래스 Coodinate(Ver.1) 사용 예(방법1)
import java.util.Scanner;

class CoordinateTester1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표：");
		double x = stdIn.nextDouble();
		System.out.print("Y좌표：");
		double y = stdIn.nextDouble();
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
		Coordinate q = p;
		q.set(9.9, 9.9);
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
		System.out.println("q = (" + q.getX() + ", " + q.getY() + ")");
	}
}
