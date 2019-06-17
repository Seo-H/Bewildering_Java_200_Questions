package Chap15;

//Ŀ�ǵ���� �μ��� ������ ���� �޷��� ǥ��
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

class Calendar {
	// --- �� ���� �ϼ� ---//
	static int[] mday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// --- year��month��day���� ������ ���ϱ� ---//
	static int dayOfWeek(int year, int month, int day) {
		if (month == 1 || month == 2) {
			year--;
			month += 12;
		}
		return (year + year / 4 - year / 100 + year / 400 + (13 * month + 8) / 5 + day) % 7;
	}

	// --- year���� ����?����0����⣯1�����⣩---//
	static boolean isLeap(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	// --- year��month���� �ϼ���28~31�� ---//
	static int monthDays(int year, int month) {
		if (month-- != 2) // month�������� �ƴϸ�
			return mday[month];
		return mday[month] + (isLeap(year) ? 1 : 0); // month�� 2���̸�
	}

	// --- year��month���� �޷� ǥ�� ---//
	static void putCalendar(int year, int month) {
		int wd = dayOfWeek(year, month, 1); // year�� month��1���� ����
		int mdays = monthDays(year, month); // year�� month���� �ϼ�
		System.out.println("  ��   ��   ȭ   ��   ��   ��   �� ");
		System.out.println("----------------------");
		for (int i = 0; i < wd; i++)
			System.out.print("   "); // 1�Ϻ��� ���� �����̽��� ǥ��
		for (int i = 1; i <= mdays; i++) {
			System.out.printf("%3d", i);
			if (++wd % 7 == 0) // ������� ǥ���� ��
				System.out.println(); // �� �ٲ�
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int year = 1, month = 1;
		if (args.length == 0) {
			GregorianCalendar today = new GregorianCalendar(); // ���� ��¥
			year = today.get(YEAR); // ��
			month = today.get(MONTH) + 1; // ��
		} else {
			if (args.length >= 1) { // args[0] �ؼ�
				year = Integer.parseInt(args[0]);
				if (year < 0) {
					System.out.println("�� ������ �߸��ƽ��ϴ�.");
					return;
				}
			}
			if (args.length >= 2) { // args[1] �ؼ�
				month = Integer.parseInt(args[1]);
				if (month < 1 || month > 12) {
					System.out.println("�� ������ �߸��ƽ��ϴ�.");
					return;
				}
			}
		}
		if (args.length == 0 || args.length >= 2) {
			System.out.printf("%d�� %d�� �޷�\n", year, month);
			putCalendar(year, month); // year��month�� �޷� ǥ��
		} else {
			System.out.printf("%d���� �޷�\n", year);
			for (month = 1; month <= 12; month++) {
				System.out.printf("%d��\n", month);
				putCalendar(year, month); // year��month�� �޷� ǥ��
				System.out.println();
			}
		}
	}
}