package Chap07;

//입력한 정수의 부호를 판정
import java.util.Scanner;

class SignOf2 {
	static int signOf(int n) {
		if (n > 0)
			return 1;
		else if (n < 0)
			return -1;
		return 0;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 x：");
		int x = stdIn.nextInt();
		int s = signOf(x);
		System.out.println("singOf(x)는 " + s + "입니다.");
	}
}