package Chap09_1;

//2���� ��ǥ Ŭ���� Coordinate(Ver.2)
class Coordinate {
	private double x = 0.0; // X��ǥ 1
	private double y = 0.0; // Y��ǥ

	//--- ������ ---//
	public Coordinate() {
	}

	public Coordinate(double x, double y) {
		set(x, y);
	}

	public Coordinate(Coordinate c) {
		this(c.x, c.y);
	}

	public double getX() {
		return x;
	} // X��ǥ ��������

	public double getY() {
		return y;
	} // Y��ǥ ��������

	public void setX(double x) {
		this.x = x;
	} // X��ǥ ����

	public void setY(double y) {
		this.y = y;
	} // Y��ǥ ����

	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	} // ��ǥ ����

	public boolean equalTo(Coordinate c) {
		return x == c.x && y == c.y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
