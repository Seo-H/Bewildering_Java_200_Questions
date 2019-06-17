package Chap02;

//문자열 초기화와 대입
class StringTester {
	public static void main(String[] args) {
		String s1 = "ABC"; // 초기화
		String s2 = "XYZ"; // 초기화
		System.out.println("문자열 s1은 " + s1 + "입니다."); // 표시
		System.out.println("문자열 s2는 " + s2 + "입니다."); // 표시
		s1 = "FBI"; // 대입(값을 변경한다）
		System.out.println("문자열 s1은 " + s1 + "입니다."); // 표시
		System.out.println("문자열 s2는 " + s2 + "입니다."); // 표시
	}
}
