package Chap02;

//Ű���带 ���� �Է¹��� ���� ��5 ������ �ִ� ���� ����
import java.util.Random;
import java.util.Scanner;

class RandomPlusMinus5 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��������");
		int x = stdIn.nextInt(); // x�� �������� ����
		System.out.println("�Է� ���� ��5 ������ ������ �����߽��ϴ�.");
		System.out.println("���� " + (x - 5 + rand.nextInt(11)) + "�Դϴ�.");
	}
}
