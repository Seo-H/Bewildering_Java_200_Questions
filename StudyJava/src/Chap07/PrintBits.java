package Chap07;

//�������� ���� ��Ʈ�� ǥ���ϴ� �޼���(���� ����)
import java.util.Scanner;

class PrintBits {
	// --- byte���� ��Ʈ ���� ǥ��---//
	static void printBits(byte x) {
		for (int i = 7; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	// --- short���� ��Ʈ ���� ǥ��---//
	static void printBits(short x) {
		for (int i = 15; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	// --- int���� ��Ʈ ���� ǥ��---//
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	// --- long���� ��Ʈ ���� ǥ��---//
	static void printBits(long x) {
		for (int i = 63; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("byte �� ���� a�� ����");
		byte a = stdIn.nextByte();
		System.out.print("short�� ���� b�� ����");
		short b = stdIn.nextShort();
		System.out.print("int  �� ���� c�� ����");
		int c = stdIn.nextInt();
		System.out.print("long �� ���� d�� ����");
		long d = stdIn.nextLong();
		System.out.print("a�� ��Ʈ��");
		printBits(a);
		System.out.print("\nb�� ��Ʈ��");
		printBits(b);
		System.out.print("\nc�� ��Ʈ��");
		printBits(c);
		System.out.print("\nd�� ��Ʈ��");
		printBits(d);
		System.out.println();
	}
}