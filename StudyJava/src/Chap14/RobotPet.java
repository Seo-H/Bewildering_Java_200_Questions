package Chap14;

//�κ� �ֿϰ� Ŭ����
public class RobotPet extends Pet {
	// ������
	public RobotPet(String name, String masterName) {
		super(name, masterName); // ���� Ŭ������ ������
	}

	// �ڱ� �Ұ�
	public void introduce() {
		System.out.println("�޳��� �κ�! �̸��� " + getName() + ".");
		System.out.println("�����δ��� �̸��� " + getMasterName() + "��");
	}

	// ������ �ϱ�
	public void work(int sw) {
		switch (sw) {
		case 0:
			System.out.println("û�Ҹ� �մϴ�.");
			break;
		case 1:
			System.out.println("��Ź�� �մϴ�.");
			break;
		case 2:
			System.out.println("���� �մϴ�.");
			break;
		}
	}
}