package Chap03;

//3���� ���� �� �߾Ӱ� ���ϱ�
import java.util.Scanner;

public class Med3_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� a��");
		int a = stdIn.nextInt();
		System.out.print("���� b��");
		int b = stdIn.nextInt();
		System.out.print("���� c��");
		int c = stdIn.nextInt();
		int med;
		if ((b >= a && c <= a) || (b <= a && c >= a))
			med = a;
		else if ((a > b && c < b) || (a < b && c > b))
			med = b;
		else
			med = c;
		System.out.println("�߾Ӱ��� " + med + "�Դϴ�.");
	}
}
