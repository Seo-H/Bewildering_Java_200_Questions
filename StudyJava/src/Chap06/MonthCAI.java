package Chap06;

//�� ���� �ش��ϴ� ���� �ܾ� �н� ���α׷�
import java.util.Random;
import java.util.Scanner;

class MonthCAI {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = { "January", "February", "March", "April", "May", " June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println("�ش� ���� ���� �ܾ �Է��Ͻÿ�.");
		System.out.println("ù ���ڴ� �빮��, �������� �ҹ��ڷ� �Է��ϼ���.");
		int retry; // �ٽ� �ѹ�
		int last = -1; // ���� ��
		do {
			int month; // ǥ���� ����0~11�� ����
			do {
				month = rand.nextInt(12);
			} while (month == last);
			last = month;
			while (true) {
				System.out.print((month + 1) + "����");
				String s = stdIn.next();
				if (s.equals(monthString[month]))
					break; // ����
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			System.out.print("�����Դϴ�. �ٽ� �ѹ�? 1...Yes/0...No��");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}