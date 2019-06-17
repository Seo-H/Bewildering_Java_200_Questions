package Chap14;

//��Ų ���� ������ �κ� �ֿϰ��� ũ���� SkinnableRobotPet ��� ��
public class SkinnableRobotPetTester {
//p�� �����ϴ� �ν��Ͻ��� �ڱ� �Ұ��� ��Ų��
	static void intro(Pet p) {
		p.introduce();
	}

	public static void main(String[] args) {
		Pet[] a = { new Pet("Kurt", "����"), new RobotPet("R2D2", "��ũ"),
					new SkinnableRobotPet("OSX5", "Apple", Skinnable.YELLOW), new Pet("����Ŭ", "����"), };
		for (Pet p : a) {
			intro(p); // p�� �����ϴ� �ν��Ͻ��� �ڱ� �Ұ��� ��Ų��
// p�� ���� ����� SkinnableRobotPet�̸顦
			if (p instanceof SkinnableRobotPet) {
				System.out.print("��Ų�� ");
				((SkinnableRobotPet) p).printSkin();
				System.out.println("�Դϴ�.");
			}
			System.out.println();
		}
	}
}