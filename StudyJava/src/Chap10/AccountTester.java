package Chap10;

//���� ���� Ŭ����(Ver.3) ��� ��
import java.util.Scanner;

class AccountTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� ���� ����");
		int n = stdIn.nextInt();
		Account[] a = new Account[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("[0]������ [1]���󼼣�");
			int type = stdIn.nextInt();
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.print("�� �ǣ�");
			String name = stdIn.next();
			System.out.print("�� ȣ��");
			String no = stdIn.next();
			if (type == 0)
				a[i] = new Account(name, no);
			else {
				System.out.print("�� ��");
				int balance = stdIn.nextInt();
				System.out.print("���� ������");
				int y = stdIn.nextInt();
				System.out.print("���� ����");
				int m = stdIn.nextInt();
				System.out.print("���� �ϣ�");
				int d = stdIn.nextInt();
				a[i] = new Account(name, no, balance, new Day(y, m, d));
			}
			System.out.println("���� �⺻ ������" + a[i]);
			System.out.println("�ĺ� ��ȣ��" + a[i].getId());
			System.out.println("���� �ϣ�" + a[i].getOpenDay().toString());
		}
	}
}