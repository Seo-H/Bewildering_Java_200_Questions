package Chap04;

//���� ���߱� ����(0~99)
//���� ���߱� ����(10~99�� ���߱�)
import java.util.Random;
import java.util.Scanner;

class FindNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		final int MAX_NO = 6; // �ִ� �Է� Ƚ��
		int leftNo = MAX_NO; // ���� Ƚ��
		int no = rand.nextInt(100); // ����� �ϴ� ����: 0~99�� ���� ����
		System.out.println("���� ���߱� ���� ����!");
		System.out.println("0���� 99������ ���ڸ� ���߼���.");
		int x; // �÷��̾ �Է��� ��
		do {
			System.out.print("���� Ƚ�� " + (leftNo--) + "ȸ, � �����ϱ�?��");
			x = stdIn.nextInt();
			if (x > no)
				System.out.println("�� ���� �����Դϴ�.");
			else if (x < no)
				System.out.println("�� ū �����Դϴ�.");
		} while (x != no && leftNo > 0);
		if (x == no)
			System.out.print((MAX_NO - leftNo) + "ȸ���� ���߾����ϴ�.");
		else
			System.out.print("�ƽ��׿�. ������ " + no + "�Դϴ�.");
	}

}
