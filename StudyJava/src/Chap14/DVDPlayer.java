package Chap14;

//DVD �÷��̾� Ŭ���� DVDPlayer
public class DVDPlayer implements ExPlayer {
	public void play() { // ���
		System.out.println("��DVD ��� ����!");
	}

	public void stop() { // ����
		System.out.println("��DVD ��� ����!");
	}

	public void slow() { // �ܴ��� ���
		System.out.println("��DVD ���� ��� ����!");
	}
}
