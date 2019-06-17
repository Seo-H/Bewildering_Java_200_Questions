package Chap06;

//���� ���� �ܾ� �н� ���α׷�(���� ǥ�� ��� �߰�)
import java.util.Random;
import java.util.Scanner;

class DayCAI2 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayKorean = { "��", "��", "ȭ", "��", "��", "��", "��" };
		String[] dayEnglish = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		System.out.println("���ϸ��� ���� �ҹ��ڷ� �Է��Ͻÿ�.");
		int retry; // �ٽ� �ѹ�
		int last = -1; // ���� ����
		do {
			int day; // ǥ���� ���ϣ�0 ~ 6�� ����
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last = day;
			int action;
			do {
				System.out.print(dayKorean[day] + "���ϣ�");
				String s = stdIn.next();
				if (s.equals(dayEnglish[day])) { // ����
					System.out.println("�����Դϴ�.");
					break;
				}
				System.out.println("Ʋ�Ƚ��ϴ�.");
				do {
					System.out.print("��� �ұ��? 1..���Է� / 0..���� ���⣺");
					action = stdIn.nextInt();
				} while (action != 0 && action != 1);
				if (action == 0)
					System.out.println(dayKorean[day] + "������\"" + // ���� ǥ��
							dayEnglish[day] + "\"�Դϴ�.");
			} while (action == 1);
			System.out.print("�ٽ� �ѹ�? 1...Yes/0...No��");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}