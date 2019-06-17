package Chap07;

//두 행렬의 합을 구한다.
import java.util.Scanner;

class AddMatrixY {
//--- 행렬x와 y의 합을 저장한 배열 반환입 ---//
	static int[][] addMatrix(int[][] x, int[][] y) {
		int[][] z = new int[x.length][];
		for (int i = 0; i < x.length; i++) {
			z[i] = new int[x[i].length];
			for (int j = 0; j < x[i].length; j++)
				z[i][j] = x[i][j] + y[i][j];
		}
		return z;
	}

//--- 행렬 m의 모든 요소를 표시 ---//
	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("행렬의 행 수：");
		int height = stdIn.nextInt();
		System.out.print("행렬의 열 수：");
		int width = stdIn.nextInt();
		int[][] a = new int[height][width];
		int[][] b = new int[height][width];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("a[%d][%d]：", i, j);
				a[i][j] = stdIn.nextInt();
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("b[%d][%d]：", i, j);
				b[i][j] = stdIn.nextInt();
			}
		}
		int[][] c = addMatrix(a, b); // a와 b의 합을 c에 대입
		System.out.println("행렬a");
		printMatrix(a);
		System.out.println("\n행렬b");
		printMatrix(b);
		System.out.println("\n행렬c");
		printMatrix(c);
	}
}
