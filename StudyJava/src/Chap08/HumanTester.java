package Chap08;

//��� Ŭ����(ver.1) ��뿹
class HumanTester {
	public static void main(String[] args) {
		Human gildong = new Human();
		Human chulsu = new Human();
		gildong.name = "�浿";
		gildong.height = 170;
		gildong.weight = 60;
		chulsu.name = "ö��";
		chulsu.height = 166;
		chulsu.weight = 72;
		System.out.println("�̸���" + gildong.name); // gildong�� �����͸� ǥ��
		System.out.println("���壺" + gildong.height + "cm");
		System.out.println("ü�ߣ�" + gildong.weight + "kg");
		System.out.println();
		System.out.println("�̸���" + chulsu.name); // chulsu�� ������ ǥ��
		System.out.println("���壺" + chulsu.height + "cm");
		System.out.println("ü�ߣ�" + chulsu.weight + "kg");
	}
}