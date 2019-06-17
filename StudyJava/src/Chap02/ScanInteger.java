package Chap02;

//키보드에서 입력한 정숫값 표시
//프로그램의 시작 부분(클래스 선언 이전)에 작성한다.
import java.util.Scanner;

class ScanInteger {
	public static void main(String[] args) {
        // main 메서드의 시작 부분(값을 입력받는 ⓒ 이전에)에 작성한다
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정숫값：");
        // 키보드를 통해 입력한 정숫값을 받는다
		int x = stdIn.nextInt(); // 입력받은 정숫값을 x에 저장한다
		System.out.println(x + "를 입력했습니다.");
	}
}
