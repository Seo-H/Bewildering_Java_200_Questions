package Chap15;

//���ڿ� Ž��
import java.util.Scanner;

class SearchString {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���ڿ� s1��");
		String s1 = stdIn.next();
		System.out.print("���ڿ� s2��");
		String s2 = stdIn.next();
		// s1�� s2�� ���ԵǾ� �ִ°�?
		int idx = s1.indexOf(s2);
		if (idx == -1)
			System.out.println("s1 �ȿ� s2�� ���Ե� ���� �ʽ��ϴ�.");
		else {
			System.out.println(s1);
			for (int i = 0; i < idx; i++)
				System.out.print(' ');
			System.out.println(s2);
		}
	}
}
