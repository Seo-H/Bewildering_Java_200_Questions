package Chap04;

//지정한 개수만큼 * 표시
import java.util.Scanner;

class PutAsterisk2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?：");
		int n = stdIn.nextInt();
		if (n > 0) {
			int i = 1;
			while (i <= n) {
				System.out.print('*');
				i++;
			}
			System.out.println();
		}
	}
}
