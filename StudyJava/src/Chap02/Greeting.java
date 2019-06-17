package Chap02;

//입력한 성과 이름을 인사
import java.util.Scanner;

class Greeting {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("성：");
		String lastName = stdIn.next(); // 성
		System.out.print("이름：");
		String firstName = stdIn.next(); // 이름
		System.out.println("안녕하세요. " + lastName + firstName + " 씨.");
	}
}
