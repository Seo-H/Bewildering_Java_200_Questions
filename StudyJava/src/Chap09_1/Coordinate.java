package Chap09_1;

//2Â÷¿ø ÁÂÇ¥ Å¬·¡½º Coordinate(Ver.2)
class Coordinate {
	private double x = 0.0; // XÁÂÇ¥ 1
	private double y = 0.0; // YÁÂÇ¥

	//--- »ý¼ºÀÚ ---//
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
	} // XÁÂÇ¥ °¡Á®¿À±â

	public double getY() {
		return y;
	} // YÁÂÇ¥ °¡Á®¿À±â

	public void setX(double x) {
		this.x = x;
	} // XÁÂÇ¥ ¼³Á¤

	public void setY(double y) {
		this.y = y;
	} // YÁÂÇ¥ ¼³Á¤

	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	} // ÁÂÇ¥ ¼³Á¤

	public boolean equalTo(Coordinate c) {
		return x == c.x && y == c.y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
