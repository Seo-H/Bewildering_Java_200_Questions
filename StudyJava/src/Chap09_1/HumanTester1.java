package Chap09_1;

//��� Ŭ���� (Ver.3) ��� ��
class HumanTester1 {
	public static void main(String[] args) {

		Human gildong = new Human("�浿", 170, 60, new Day(1975, 3, 12));
		Human chulsu = new Human("ö��", 166, 72, new Day(1987, 10, 7));
		System.out.println("gildong = " + gildong);
		System.out.println("chulsu = " + chulsu);
	}
}