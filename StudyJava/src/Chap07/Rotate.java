package Chap07;

//������ �¿�� ȸ���� ��Ʈ�� ǥ��
import java.util.Scanner;

class Rotate {
//--- int�� ��Ʈ ���� ---//
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

//--- x�� ���������� n��Ʈ ȸ���� �� ��ȯ ---//
	static int rRotate(int x, int n) {
		if (n < 0)
			return lRotate(x, -n);
		n %= 32;
		return (n == 0 ? x : (x >>> n) | (x << (32 - n)));
	}

//--- x�� �������� n��Ʈ ȸ���� �� ��ȯ --//
	static int lRotate(int x, int n) {
		if (n < 0)
			return rRotate(x, -n);
		n %= 32;
		return (n == 0 ? x : (x << n) | (x >>> (32 - n)));
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����x�� n��Ʈ ȸ���մϴ�.");
		System.out.print("x��");
		int x = stdIn.nextInt();
		System.out.print("n��");
		int n = stdIn.nextInt();
		System.out.print("ȸ�� �� = ");
		printBits(x);
		System.out.print("\n������ ȸ�� = ");
		printBits(rRotate(x, n));
		System.out.print("\n���� ȸ�� = ");
		printBits(lRotate(x, n));
		System.out.println();
	}
}
