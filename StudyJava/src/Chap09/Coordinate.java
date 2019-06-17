package Chap09;

//2Â÷¿ø ÁÂÇ¥ Å¬·¡½º (Ver.1)
class Coordinate {
	private double x; // XÁÂÇ¥
	private double y; // YÁÂÇ¥

	// --- »ý¼ºÀÚ ---//
	Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double getX() {
		return x;
	} // XÁÂÇ¥ °¡Á®¿À±â

	double getY() {
		return y;
	} // YÁÂÇ¥ °¡Á®¿À±â

	void setX(double x) {
		this.x = x;
	} // XÁÂÇ¥ ¼³Á¤

	void setY(double y) {
		this.y = y;
	} // YÁÂÇ¥ ¼³Á¤

	void set(double x, double y) {
		this.x = x;
		this.y = y;
	} // ÁÂÇ¥ ¼³Á¤
}
