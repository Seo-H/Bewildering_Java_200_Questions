package Chap06;

// ���� ���� �ܾ� �н� ���α׷�
import java.util.Random;
import java.util.Scanner;

class DayCAI1 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayKorean = { "��", "��", "ȭ", "��", "��", "��", "��" };
		String[] dayEnglish = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		System.out.println("���ϸ��� ���� �ҹ��ڷ� �Է��Ͻÿ�.");
		int retry; // �ٽ� �ѹ�
		int last = -1; // ���� ����
		do {
			int day; // ǥ���� ���ϣ�0~6�� ����
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last = day;
			while (true) {
				System.out.print(dayKorean[day] + "���ϣ�");
				String s = stdIn.next();
				if (s.equals(dayEnglish[day]))
					break; // ����
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			System.out.print("�����Դϴ�. �ٽ� �ѹ�? 1...Yes/0...No��");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
