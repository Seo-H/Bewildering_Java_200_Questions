package Chap07;

//양의 정숫값을 읽어서 뒤에서부터 읽어서 표시
import java.util.Scanner;

class InverseNumber {
	static Scanner stdIn = new Scanner(System.in);

	// --- 양의 정숫값을 읽어서 반환---//
	static int readPlusInt() {
		int x;
		do {
			System.out.print("양의 정숫값：");
			x = stdIn.nextInt();
		} while (x <= 0);
		return x;
	}

	public static void main(String[] args) {
		int x;
		do {
			int n = readPlusInt();
			System.out.print("반대로 읽으면 ");
			while (n > 0) {
				System.out.print(n % 10); // n의 마지막 자릿수를 표시
				n /= 10; // n을 10으로 나눔
			}
			System.out.println("입니다.");
			do {
				System.out.print("다시 한 번?<Yes…1／No…0>：");
				x = stdIn.nextInt();
			} while (x != 0 && x != 1);
		} while (x == 1);
	}
}
