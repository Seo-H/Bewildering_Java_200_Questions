package Chap09;

//2���� ��ǥ Ŭ���� (Ver.1)
class Coordinate {
	private double x; // X��ǥ
	private double y; // Y��ǥ

	// --- ������ ---//
	Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double getX() {
		return x;
	} // X��ǥ ��������

	double getY() {
		return y;
	} // Y��ǥ ��������

	void setX(double x) {
		this.x = x;
	} // X��ǥ ����

	void setY(double y) {
		this.y = y;
	} // Y��ǥ ����

	void set(double x, double y) {
		this.x = x;
		this.y = y;
	} // ��ǥ ����
}
