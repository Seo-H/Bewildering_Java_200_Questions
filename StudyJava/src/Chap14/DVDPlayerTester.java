package Chap14;

//DVD �÷��̾� Ŭ���� ��� ��
class DVDPlayerTester {
	public static void main(String[] args) {
		DVDPlayer a = new DVDPlayer();
		Players b = new DVDPlayer();
		ExPlayer c = new DVDPlayer();
		System.out.println("DVDPlayer�� ����a");
		a.play(); // ���
		a.stop(); // ����
		a.slow(); // ���� ���
		System.out.println("Player�� ����b");
		b.play(); // ���
		b.stop(); // ����
		System.out.println("ExPlayer�� ����c");
		c.play(); // ���
		c.stop(); // ����
		c.slow(); // ���� ���
	}
}