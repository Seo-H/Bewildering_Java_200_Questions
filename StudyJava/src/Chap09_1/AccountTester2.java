package Chap09_1;

// ���� ���� Ŭ����(Ver.2) ��� ��(���2)
import java.util.Scanner;

class AccountTester2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		System.out.print("�� �ǣ�");
		String name = stdIn.next();
		System.out.print("�� ȣ��");
		String no = stdIn.next();
		System.out.print("�� ��");
		long balance = stdIn.nextLong();
		System.out.print("���� ������");
		int y = stdIn.nextInt();
		System.out.print("���� ����");
		int m = stdIn.nextInt();
		System.out.print("���� �ϣ�");
		int d = stdIn.nextInt();
		Account a = new Account(name, no, balance, new Day(y, m, d));
		System.out.println("���� �⺻ ������" + a);
		System.out.println("�����ϣ�" + a.getOpenDay().toString());
	}
}
