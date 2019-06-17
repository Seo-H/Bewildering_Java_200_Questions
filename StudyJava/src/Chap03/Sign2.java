package Chap03;

//읽은 정숫값의 부호(양수/음수/0)를 판정해서 표시
import java.util.Scanner;

class Sign2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정숫값：");
		int n = stdIn.nextInt();
		if (n == 1)
			System.out.println("이것은 1입니다.");
		else if (n == 2)
			System.out.println("이것은 2입니다.");
		else if (n == 3)
			System.out.println("이것은 3입니다.");
	}
}
