package Chap03;

//���� �� ���� ���� 11�̻������� ǥ��(���2������ ���깮)
import java.util.Scanner;

public class Diff2Digits2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� a��");
		int a = stdIn.nextInt();
		System.out.print("���� b��");
		int b = stdIn.nextInt();
		int diff = a >= b ? a - b : b - a;
		System.out.println("�� ���� ���� " + (diff <= 10 ? "10����" : "11�̻�") + "�Դϴ�.");
	}
}