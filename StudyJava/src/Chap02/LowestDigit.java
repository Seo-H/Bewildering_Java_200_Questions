package Chap02;

//Ű���忡�� �Է��� �������� ������ �ڸ����� ������ ���� ������ �ڸ����� ǥ��
import java.util.Scanner;

class LowestDigit {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��������");
		int x = stdIn.nextInt(); // �Է¹��� �������� x�� �����Ѵ�
		System.out.println("������ �ڸ����� ������ ���� " + (x / 10) + "�Դϴ�.");
		System.out.println("������ �ڸ����� " + (x % 10) + "�Դϴ�.");
	}
}
