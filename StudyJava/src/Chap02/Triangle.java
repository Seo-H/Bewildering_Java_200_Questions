package Chap02;

//�ﰢ���� ���̸� ���ؼ� ǥ��
import java.util.Scanner;

class Triangle {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� ���մϴ�.");
		System.out.print("�غ���"); // �غ��� ���� �Է� �޽���
		double width = stdIn.nextDouble(); // width�� �Ǽ����� �Է� ����
		System.out.print("���̣�"); // ���� �� �Է� �޽���
		double height = stdIn.nextDouble(); // height�� �Ǽ����� �Է� ���� 
        
		//���̸� ���ؼ� ǥ��
		System.out.println("���̴� " + (width * height / 2) + "�Դϴ�.");
	}
}
