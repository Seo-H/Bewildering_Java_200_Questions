package Chap09;

public class Period {
	private Day from; // ������
	private Day to; // ������

	// --- ������ ---//
	public Period(Day from, Day to) {
		this.from = new Day(from);
		this.to = new Day(to);
	}

	public Day getFrom() {
		return new Day(from);
	} // ������ �ҷ�����

	public Day getTo() {
		return new Day(to);
	} // ������ �ҷ�����

	public String toString() {
		return "{" + from + " ~ " + to + "}";
	}
}