package Chap05;

//10������ �о 8����, 16������ ǥ��(���2)
import java.util.Scanner;

class OctHex1Line {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����:");
		int x = stdIn.nextInt();
		System.out.printf("8������ %o�̰� 16������ %x�Դϴ�.\n", x, x);
	}
}
