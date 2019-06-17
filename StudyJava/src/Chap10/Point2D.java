package Chap10;

//��÷ ����� ���� 2���� ��ǥ Ŭ���� Point2D
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Point2D {
	private static int counter = 0; // �� ������ �ĺ� ��ȣ�� �ο��ߴ°�
	private static int day; // ���� ��¥
	private int x = 0; // ����ǥ
	private int y = 0; // ����ǥ
	// --- Ŭ���� �ʱ�ȭ ��� ---//
	static {
		GregorianCalendar today = new GregorianCalendar(); // ���� ��¥
		day = today.get(DATE); // today�� ��
	}
	// --- �ν��Ͻ� �ʱ�ȭ ��� ---//
	{
		if (++counter == day) {
			System.out.print("��÷!!");
			System.out.printf("���� %d���� ��ǥ�� �����ƽ��ϴ�.\n", counter);
		}
	}

	// --- ������ ---//
	public Point2D() {
	}

	public Point2D(int x) {
		this.x = x;
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	} // ����ǥ�� ����

	public int getY() {
		return y;
	} // ����ǥ�� ����
		// �������� �ο��� �ĺ� ��ȣ

	public static int getCounter() {
		return counter;
	}

	// --- ���ڿ� ǥ�� "(x, y)"�� ��ȯ ---//
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}