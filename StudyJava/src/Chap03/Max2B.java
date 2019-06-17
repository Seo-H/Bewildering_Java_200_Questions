package Chap03;

//2개의 실수값을 읽어서 큰 쪽을 표시(방법2：조건 연산자)
import java.util.Scanner;

class Max2B {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("실수 a：");
		double a = stdIn.nextDouble();
		System.out.print("실수 b：");
		double b = stdIn.nextDouble();
		double max = a > b ? a : b;
		System.out.println("큰 쪽의 값은 " + max + "입니다.");
	}
}
