package Chap03;

//3개의 정수 중 중앙값 구하기
import java.util.Scanner;

public class Med3_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 a：");
		int a = stdIn.nextInt();
		System.out.print("정수 b：");
		int b = stdIn.nextInt();
		System.out.print("정수 c：");
		int c = stdIn.nextInt();
		int med;
		if ((b >= a && c <= a) || (b <= a && c >= a))
			med = a;
		else if ((a > b && c < b) || (a < b && c > b))
			med = b;
		else
			med = c;
		System.out.println("중앙값은 " + med + "입니다.");
	}
}
