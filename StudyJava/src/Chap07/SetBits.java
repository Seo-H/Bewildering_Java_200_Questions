package Chap07;

//������ ���ӵǴ� ��Ʈ�� ����
import java.util.Scanner;

class SetBits {
//--- int�� ��Ʈ ���� ---//
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

//--- x�� pos ��ġ�� �ִ� ��Ʈ���� n�� ��Ʈ�� 1�� ������ ���� ��ȯ ---//
	static int setN(int x, int pos, int n) {
		return x | (~(~0 << n) << pos);
	}

//--- x�� pos ��ġ�� �ִ� ��Ʈ���� n�� ��Ʈ�� 0�� ������ ���� ��ȯ ----//
	static int resetN(int x, int pos, int n) {
		return x & ~(~(~0 << n) << pos);
	}

//--- x�� pos ��ġ�� �ִ� ��Ʈ���� n���� ��Ʈ�� ������Ų ���� ��ȯ ---//
	static int inverseN(int x, int pos, int n) {
		return x ^ (~(~0 << n) << pos);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����x�� pos��° ��Ʈ���� n�� ��Ʈ�� �����մϴ�.");
		System.out.print("x ��");
		int x = stdIn.nextInt();
		System.out.print("pos��");
		int pos = stdIn.nextInt();
		System.out.print("n ��");
		int n = stdIn.nextInt();
		System.out.print("x                  = ");
		printBits(x);
		System.out.print("\nsetN(x, pos, n)    = ");
		printBits(setN(x, pos, n));
		System.out.print("\nresetN(x, pos, n)  = ");
		printBits(resetN(x, pos, n));
		System.out.print("\ninverse(x, pos, n) = ");
		printBits(inverseN(x, pos, n));
		System.out.println();
	}
}
