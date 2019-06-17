package Chap09;

//��¥ Ŭ���� Day(Ver.1)
public class Day {
	private int year = 1; // ��
	private int month = 1; // ��
	private int date = 1; // ��

	// --- ������ ---//
	public Day() {
	}

	public Day(int year) {
		this.year = year;
	}

	public Day(int year, int month) {
		this(year);
		this.month = month;
	}

	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}

	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	// --- ��, ��, �� �ҷ����� ---//
	public int getYear() {
		return year;
	} // �� �ҷ�����

	public int getMonth() {
		return month;
	} // �� �ҷ�����

	public int getDate() {
		return date;
	} // �� �ҷ�����

	// --- ��, ��, �� ���� ---//
	public void setYear(int year) {
		this.year = year;
	} // �� ����

	public void setMonth(int month) {
		this.month = month;
	} // �� ����

	public void setDate(int date) {
		this.date = date;
	} // �� ����

	public void set(int year, int month, int date) { // ��,��,�� ����
		this.year = year; // ��
		this.month = month; // ��
		this.date = date; // ��
	}

	// --- ���� ã�� ---//
	public int dayOfWeek() {
		int y = year; // 0... �Ͽ���
		int m = month; // 1... ������
		if (m == 1 || m == 2) { // :
			y--; // 5... �ݿ���
			m += 12; // 6... �����
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	// --- ��¥ d�� ������? ---//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	// --- ���ڿ� ǥ�� ��ȯ ---//
	public String toString() {
		String[] wd = { "��", "��", "ȭ", "��", "��", "��", "��" };
		return String.format("%04d�� %02d�� %02d��(%s)", year, month, date, wd[dayOfWeek()]);
	}
}