package Chap15;

//���ڿ��� �� ���ھ� �������� ǥ��
import java.util.Scanner;

class ScanStringRev {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���ڿ���");
		String s = stdIn.next();
		System.out.print("�ݴ�� ������ ");
		for (int i = s.length() - 1; i >= 0; i--)
			System.out.print(s.charAt(i));
		System.out.println("�Դϴ�.");
	}
}
