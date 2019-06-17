package Chap11;
//�ĺ� ��ȣ Ŭ����(���� ��ȣ�� ���� ��¥�� ����)
//package id;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class DateId {
	private static int counter; // �� ������ �ĺ� ��ȣ�� �ο��ߴ°�
	private int id; // �ĺ� ��ȣ
	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR); // ��
		int m = today.get(MONTH) + 1; // ��
		int d = today.get(DATE); // ��
		System.out.printf("������ %04d�� %02d�� %02d���Դϴ�.\n", y, m, d);
		counter = y * 1000000 + m * 10000 + d * 100;
	}

//--- ������ ---//
	public DateId() {
		id = ++counter; // �ĺ� ��ȣ
	}

//--- �ĺ� ��ȣ �������� ---//
	public int getId() {
		return id;
	}
}
