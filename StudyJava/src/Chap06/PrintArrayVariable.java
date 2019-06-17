package Chap06;

//배열 변수의 값 표시
class PrintArrayVariable {
	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println("a = " + a);
		a = null;
		System.out.println("a = " + a);
	}
}
