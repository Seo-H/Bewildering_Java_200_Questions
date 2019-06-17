package Chap10;

//절댓값, 제곱근을 구해 원의 면적을 구하기
import java.util.Scanner;

class MathMethods {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("실수값：");
		double x = stdIn.nextDouble();
		System.out.println("절댓값：" + Math.abs(x));
		System.out.println("제곱근：" + Math.sqrt(x));
		System.out.println("면  적：" + Math.PI * x * x);
	}
}
