package Chap16;

import java.util.Scanner;

public class RangeErrorTester {
	/*--- n�� 1�ڸ�(0~9)�ΰ�? ---*/
	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}

	/*--- ���ڸ�(0~9) ����a�� b�� �� ���ϱ� ---*/
	static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
		if (!isValid(a))
			throw new ParameterRangeError(a);
		if (!isValid(b))
			throw new ParameterRangeError(b);
		int result = a + b;
		if (!isValid(result))
			throw new ResultRangeError(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� a��");
		int a = stdIn.nextInt();
		System.out.print("���� b��");
		int b = stdIn.nextInt();
		try {
			System.out.println("���� " + add(a, b) + "�Դϴ�.");

		} catch (RangeError e) {
			System.out.println("���� �� ���ܰ� �߻��߽��ϴ�.\n" + e.getMessage());
		}
	}
}
