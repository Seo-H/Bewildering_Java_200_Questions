package Chap02;

//세 개의 변수 x, y, z의 합과 평균을 표시(방법2)
class SumAve3B {
	public static void main(String[] args) {
		int x, y, z; // int형 변수
		int sum; // int형 변수(합계)
		x = 63; // 변수 x에 63을 대입
		y = 18; // 변수 y에 18을 대입
		z = 52; // 변수 z에 52을 대입
		sum = x + y + z; // x, y, z 합계
		System.out.println("x값은 " + x + "입니다."); // x값 표시
		System.out.println("y값은 " + y + "입니다."); // y값 표시
		System.out.println("z값은 " + z + "입니다."); // z값 표시
		System.out.println("합계는 " + sum + "입니다."); // 합계 표시
		System.out.println("평균은 " + sum / 3 + "입니다."); // 평균 표시
	}
}
