package Chap02;

//�Է��� ���� �̸��� �λ�
import java.util.Scanner;

class Greeting {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����");
		String lastName = stdIn.next(); // ��
		System.out.print("�̸���");
		String firstName = stdIn.next(); // �̸�
		System.out.println("�ȳ��ϼ���. " + lastName + firstName + " ��.");
	}
}
