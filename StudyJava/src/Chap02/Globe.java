package Chap02;

//구의 부피와 겉넓이 구하기(원주율 3.1416은 final 변수를 사용)
import java.util.Scanner;

class Globe {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final double PI = 3.1416;
		System.out.println("구의 겉넓이와 부피를 구합니다.");
		System.out.print("반지름："); // 반지름 입력 메시지
		double r = stdIn.nextDouble(); // r에 실숫값을 입력 받음
		System.out.println("겉넓이는 " + (4 * PI * r * r) + "입니다.");
		System.out.println("부피는 " + (4 / 3.0 * PI * r * r * r) + "입니다.");
	}
}
