package Chap04;

//���� �������� ��ȣ�� �����ؼ� ǥ��(���ϴ� ��ŭ �ݺ�)
import java.util.Scanner;

class SignRepeat1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry; // �ٽ� �ѹ�?
		// do���� ���� �ݺ��Ǵ� ���� �ٵ�
		do {
			System.out.print("��������");
			int n = stdIn.nextInt();
			if (n > 0)
				System.out.println("�� ���� ����Դϴ�.");
			else if (n < 0)
				System.out.println("�� ���� �����Դϴ�.");
			else
				System.out.println("�� ���� 0�Դϴ�.");
			do {
				System.out.print("�ٽ� �ѹ�? 1-Yes / 0-No:");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
	}
}
