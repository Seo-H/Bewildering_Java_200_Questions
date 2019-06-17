package Chap07;

//2�� �ŵ� ������ ����Ʈ ������ ��ġ�� Ȯ��
import java.util.Scanner;

class ShiftValue {
//--- 2�� �ŵ� ���� ��ȯ ---//
	static int pow2(int no) {
		int pw = 1;
		while (no-- > 0)
			pw *= 2;
		return pw;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����x�� n��Ʈ ����Ʈ�մϴ�.");
		System.out.print("x��");
		int x = stdIn.nextInt();
		System.out.print("n��");
		int n = stdIn.nextInt();
		int mPower = x * pow2(n); // ���� n���� ���� ��
		int dPower = x / pow2(n); // ���� n������ ���� ��
		int lShift = x << n; // n��Ʈ �������� ����Ʈ�� ��
		int rShift = x >> n; // n��Ʈ ���������� ����Ʈ�� ��
		System.out.printf("[a] x �� (2�� %d��) = %d\n", n, mPower);
		System.out.printf("[b] x �� (2�� %d��) = %d\n", n, dPower);
		System.out.printf("[c] x << %d = %d\n", n, lShift);
		System.out.printf("[d] x >> %d = %d\n", n, rShift);
		System.out.println("[a]�� [c]�� ���� ��ġ" + ((mPower == lShift) ? "�մϴ�." : "���� �ʽ��ϴ�."));
		System.out.println("[b]�� [d]�� ���� ��ġ" + ((dPower == rShift) ? "�մϴ�." : "���� �ʽ��ϴ�."));
	}
}
