package Chap10;

//��� Ŭ���� (Ver.4) ��� ��
class HumanTester {
	public static void main(String[] args) {
		Human gildong = new Human("ȫ�浿", 170, 60);
		Human chulsu = new Human("��ö��", 166, 72);
		gildong.putData(); // gildong�� ������ ǥ��
		System.out.println("��ȣ��" + gildong.getId());
		System.out.println();
		chulsu.putData(); // chulsu�� ������ ǥ��
		System.out.println("��ȣ��" + chulsu.getId());
	}
}