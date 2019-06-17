package Chap02;

//3개의 변수 x, y, z의 합과 평균을 표시(방법3)
class SumAve3C {
	public static void main(String[] args) {
		int x = 63; // x에 63을 대입
		int y = 18; // y에 18을 대입
		int z = 52; // z에 52을 대입
		int sum = x + y + z; // x, y, z 합계
		System.out.println("x값은 " + x + "입니다."); // x값 표시
		System.out.println("y값은 " + y + "입니다."); // y값 표시
		System.out.println("z값은 " + z + "입니다."); // z값 표시
		System.out.println("합계는 " + sum + "입니다."); // 합계 표시
		System.out.println("평균은 " + sum / 3 + "입니다."); // 평균 표시
	}
}
