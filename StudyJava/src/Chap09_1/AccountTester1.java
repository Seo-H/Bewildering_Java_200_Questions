package Chap09_1;

//���� ���� Ŭ����(Ver.2) ��� ��(���1)
class AccountTester1 {
	public static void main(String[] args) {
		Day d = new Day(2010, 10, 15);
		Account gildong = new Account("�浿", "125768", 100, d);
		Day p = gildong.getOpenDay();
		System.out.println("���� �����ϣ�" + p);
		p.set(1999, 12, 31); // �������� �����Ѵ�? 2
		Day q = gildong.getOpenDay();
		System.out.println("���� �����ϣ�" + q);
	}
}
