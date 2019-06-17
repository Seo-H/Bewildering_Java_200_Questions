package Chap10;

//��¥ Ŭ���� Day(Ver.2)�� ��� ��
import java.util.Scanner;

class DayTester {
	static Scanner stdIn = new Scanner(System.in);

	// --- ��¥ ���� ���� ǥ�� ---//
	static void display(Day day) {
		System.out.println(day + "�� ���� ����");
		System.out.println("����" + (day.isLeap() ? "�Դϴ�." : "�� �ƴմϴ�."));
		System.out.println("���� �� ��� �ϼ���" + day.dayOfYear());
		System.out.println("���� �� �ܿ� �ϼ���" + day.leftDayOfYear());
	}

	// --- ��¥ ���� ---//
	static void change(Day day) {
		System.out.println("[1]�������� ���� [2]���� ����");
		System.out.println("[3]���� ���� [4]���� ����");
		System.out.println("[5]1�� �� [6]1�� ��");
		System.out.print("[7]n�� �� [8]n�� �գ�");
		int change = stdIn.nextInt();
		int y = 0, m = 0, d = 0, n = 0;
		if (change == 1 || change == 2) {
			System.out.print("����");
			y = stdIn.nextInt();
		}
		if (change == 1 || change == 3) {
			System.out.print("����");
			m = stdIn.nextInt();
		}
		if (change == 1 || change == 4) {
			System.out.print("�ϣ�");
			d = stdIn.nextInt();
		}
		if (change == 7 || change == 8) {
			System.out.print("��ĥ��");
			n = stdIn.nextInt();
		}
		switch (change) {
		case 1:
			day.set(y, m, d);
			break; // y��m��d�Ϸ� ����
		case 2:
			day.setYear(y);
			break; // y������ ����
		case 3:
			day.setMonth(m);
			break; // m���� ����
		case 4:
			day.setDate(d);
			break; // d�Ϸ� ����
		case 5:
			day.succeed();
			break; // �Ϸ� ��
		case 6:
			day.precede();
			break; // �Ϸ� ��
		case 7:
			day.succeedDays(n);
			break; // n�� ��
		case 8:
			day.precedeDays(n);
			break; // n�� ��
		}
		System.out.println(day + "�� ����ƽ��ϴ�.");
	}

	// �ٸ� ��¥�� ��---//
	static void compare(Day day) {
		System.out.println("�� ��� ��¥�� �Է�����.");
		System.out.print("����");
		int y = stdIn.nextInt();
		System.out.print("����");
		int m = stdIn.nextInt();
		System.out.print("�ϣ�");
		int d = stdIn.nextInt();
		Day d2 = new Day(y, m, d); // �� ��� ��¥
		int comp = day.compareTo(d2); // int comp = compare(day, d2);�� ����
		System.out.print(day);
		switch (comp) {
		case -1:
			System.out.println("�� ��");
			break;
		case 1:
			System.out.println("�� ��");
			break;
		case 0:
			System.out.println("�� ����.");
			break;
		}
	}

	// --- ���� ��¥ ---//
	static void beforeAfter(Day day) {
		System.out.print("[1]���� [2]���� [3]n�� �� [4]n�� ����");
		int type = stdIn.nextInt();
		int n = 0;
		if (type == 3 || type == 4) {
			System.out.print("��ĥ��");
			n = stdIn.nextInt();
		}
		System.out.print("�� ����");
		switch (type) {
		case 1:
			System.out.print(day.succeedingDay());
			break; // �Ϸ� ��
		case 2:
			System.out.print(day.precedingDay());
			break; // �Ϸ� ��
		case 3:
			System.out.print(day.after(n));
			break; // n�� ��
		case 4:
			System.out.print(day.before(n));
			break; // n�� ��
		}
		System.out.println("�Դϴ�.");
	}

	public static void main(String[] args) {
		System.out.println("��¥�� �Է��ϼ���.");
		System.out.print("����");
		int y = stdIn.nextInt();
		System.out.print("����");
		int m = stdIn.nextInt();
		System.out.print("�ϣ�");
		int d = stdIn.nextInt();
		Day day = new Day(y, m, d); // ���� ��¥
		while (true) {
			System.out.print("[1]��¥ ���� ���� ǥ�� [2]��¥ ���� [3]�ٸ� ��¥�� ��\n" + "[4]���� ��¥ [5]���᣺");
			int menu = stdIn.nextInt();
			if (menu == 5)
				break;
			switch (menu) {
			case 1:
				display(day);
				break; // ��¥ ���� ���� ǥ��
			case 2:
				change(day);
				break; // ��¥ ����
			case 3:
				compare(day);
				break; // �ٸ� ��¥�� ��
			case 4:
				beforeAfter(day);
				break; // ���� ��¥ ���ϱ�
			}
		}
	}
}
