package Chap02;

//두 변수 x와 y의 합과 평균을 출력
class SumAveError {
	public static void main(String[] args) {
		int x; // x는 int형 변수
		int y; // y는 int형 변수
		x = 63.4; // x에 63.4를 대입
		y = 18.3; // y에 18.3을 대입
		
		System.out.println("x값은 " + x + "입니다."); // x값 표시
		System.out.println("y값은 " + y + "입니다."); // y값 표시
		System.out.println("합계는 " + (x + y) + "입니다."); // 합계 표시
		System.out.println("평균은 " + (x + y) / 2 + "입니다."); // 평균 표시
	}
}
