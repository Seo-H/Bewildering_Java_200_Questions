package Chap14;

public class SkinnableSoftwareTester {
	public static void main(String[] args) {
		SkinnableSoftware x = new SkinnableSoftware(); // ����
		SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN); // �ʷ�
		x.changeSkin(Skinnable.YELLOW); // x�� ��Ų�� ������� ����
		System.out.println("x�� ��Ų�� " + x.getSkinString() + "�Դϴ�.");
		System.out.println("y�� ��Ų�� " + y.getSkinString() + "�Դϴ�.");
	}
}
