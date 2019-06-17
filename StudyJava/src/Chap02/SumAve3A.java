package Chap02;

//3개의 변수 x, y, z의 합과 평균을 표시(방법1)
class SumAve3A {
	public static void main(String[] args) {
		int x, y, z; // int형 x, y, z 변수 선언
		x = 63; // x에 63을 대입
		y = 18; // y에 18을 대입
		z = 52; // z에 52을 대입
		System.out.println("x값은 " + x + "입니다."); // x값 표시
		System.out.println("y값은 " + y + "입니다."); // y값 표시
		System.out.println("z값은 " + z + "입니다."); // z값 표시
		System.out.println("합계는 " + (x + y + z) + "입니다."); // 합계 표시
		System.out.println("평균은 " + (x + y + z) / 3 + "입니다."); // 평균 표시
	}
}
