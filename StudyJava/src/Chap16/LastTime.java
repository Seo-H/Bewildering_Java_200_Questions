package Chap16;

//���� ���α׷��� ����, ���� ��¥ �� �ð�
import java.io.*;
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

class LastTime {
//--- ���� ��¥, �ð��� �д´� ---//
	static void init() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("LastTime.txt"));
			String time = br.readLine();
			System.out.println("���� �ð��� " + time + "�����ϴ�.");
		} catch (IOException e) {
			System.out.println("�� ���α׷��� �����ϴ� ���� ó���Դϴ�.");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("���� �ݱ� ����.");
				}
			}
		}
	}

//--- ���� ��¥, �ð� �б� ---//
	static void term() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("LastTime.txt");
			GregorianCalendar c = new GregorianCalendar(); // ���� ��¥, �ð�
			fw.write((String.format("%04d�� %02d�� %02d�� %02d�� %02d�� %02d��", c.get(YEAR), c.get(MONTH) + 1, c.get(DATE),
					c.get(HOUR_OF_DAY), c.get(MINUTE), c.get(SECOND))));
		} catch (IOException e) {
			System.out.println("���� �߻�!!");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					System.out.println("���� �ݱ� ����.");
				}
			}
		}
	}

	public static void main(String[] args) {
		init(); // ���� ��¥, �ð� �б�
		term(); // ���� ��¥, �ð� ���
	}
}
