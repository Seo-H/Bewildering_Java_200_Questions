package Chap15;

//Ŀ�ǵ���� �μ��� �ο��� ���� ���������� �ϴ� ���� �ѷ��� ����
class Circle {
	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		System.out.printf("������ %.2f�� ���� �ѷ��� %.2f�̰� ���̴� %.2f�Դϴ�.\n", r, 2 * Math.PI * r, Math.PI * r * r);
	}
}
