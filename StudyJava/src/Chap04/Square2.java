package Chap04;

//정숫값의 제곱 표시(방법2)
import java.util.Scanner;

class Square2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정숫값：");
		int n = stdIn.nextInt();
		for (int i = 1, j = 1; i <= n; i++, j = i * i)
			System.out.println(i + "의 제곱은 " + j + "입니다.");
	}
}