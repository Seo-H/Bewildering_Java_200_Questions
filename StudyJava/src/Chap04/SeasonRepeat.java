package Chap04;

//�Է��� ���� ���� ǥ��
import java.util.Scanner;

class SeasonRepeat {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		System.out.println("������ ã���ϴ�.");
		do {
			int month; // �� ����
			do {
				System.out.print("�� ���Դϱ�?��");
				month = stdIn.nextInt();
			} while (month < 1 || month > 12);
			if (month >= 3 && month <= 5) // 3��, 4��, 5��
				System.out.println("���Դϴ�.");
			else if (month >= 6 && month <= 8) // 6��, 7��, 8��
				System.out.println("�����Դϴ�.");
			else if (month >= 9 && month <= 11) // 9��, 10��, 11��
				System.out.println("�����Դϴ�.");
			else if (month == 12 || month == 1 || month == 2) // 12��, 1��, 2��
				System.out.println("�����Դϴ�.");
			System.out.print("�ٽ� �ϰڽ��ϱ�? 1��Yes��0��No��");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
