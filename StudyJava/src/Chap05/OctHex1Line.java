package Chap05;

//10진수를 읽어서 8진수, 16진수로 표시(방법2)
import java.util.Scanner;

class OctHex1Line {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수:");
		int x = stdIn.nextInt();
		System.out.printf("8진수는 %o이고 16진수는 %x입니다.\n", x, x);
	}
}
