package Chap14;

//�ֿϰ� Ŭ����
public class Pet {
	private String name; // �ֿϰ� �̸�
	private String masterName; // ���� �̸�

	// ������
	public Pet(String name, String masterName) {
		this.name = name; // �ֿϰ� �̸�
		this.masterName = masterName; // ���� �̸�
	}

	// �ֿϰ� �̸� Ȯ��
	public String getName() {
		return name;
	}

	// ���� �̸� Ȯ��
	public String getMasterName() {
		return masterName;
	}

	// �ڱ� �Ұ�
	public void introduce() {
		System.out.println("�ᳪ�� �̸��� " + name + "�Դϴ�.");
		System.out.println("�����δ��� �̸��� " + masterName + "�Դϴ�.");
	}
}