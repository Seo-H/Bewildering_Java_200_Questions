package Chap15;

//���ڿ� ��
import java.util.Scanner;

class CompareString {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���ڿ� s1��");
		String s1 = stdIn.next();
		System.out.print("���ڿ� s2��");
		String s2 = stdIn.next();
		if (s1 == s2)
			System.out.println("s1 == s2�Դϴ�.");
		else
			System.out.println("s1 != s2�Դϴ�.");
		if (s1.equals(s2))
			System.out.println("s1�� s2�� ������ �����ϴ�.");
		else
			System.out.println("s1�� s2�� ������ �ٸ��ϴ�.");
	}
}
