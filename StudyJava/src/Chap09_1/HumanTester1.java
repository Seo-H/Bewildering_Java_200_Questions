package Chap09_1;

//사람 클래스 (Ver.3) 사용 예
class HumanTester1 {
	public static void main(String[] args) {

		Human gildong = new Human("길동", 170, 60, new Day(1975, 3, 12));
		Human chulsu = new Human("철수", 166, 72, new Day(1987, 10, 7));
		System.out.println("gildong = " + gildong);
		System.out.println("chulsu = " + chulsu);
	}
}