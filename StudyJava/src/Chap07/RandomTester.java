package Chap07;

//������ ������ ������ �����ϴ� �޼���
import java.util.Random;
import java.util.Scanner;

class RandomTester {
//--- a�̻� b������ ���� ���� ---//
	static int random(int a, int b) {
		if (b <= a)
			return a;
		else {
			Random rand = new Random();
			return a + rand.nextInt(b - a + 1);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ �����մϴ�.");
		System.out.print("���Ѱ���");
		int min = stdIn.nextInt();
		System.out.print("���Ѱ���");
		int max = stdIn.nextInt();
		System.out.println("������ ������ " + random(min, max) + "�Դϴ�.");
	}
}
