package Chap04;

//피라미드 표시
import java.util.Scanner;

class Pyramid {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("피라미드를 표시합니다.");
		System.out.print("단수는?：");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(' ');
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
