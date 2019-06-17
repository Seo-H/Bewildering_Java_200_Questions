package Chap11;

//Àý´ñ°ª, Á¦°ö±Ù, ¿øÀÇ ³ÐÀÌ ±¸ÇÏ±â
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;

class MathMethods {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(in);
		out.print("½Ç ¼ö£º");
		double x = stdIn.nextDouble();
		out.println("Àý´ñ°ª£º" + abs(x));
		out.println("Á¦°ö±Ù£º" + sqrt(x));
		out.println("³Ð  ÀÌ£º" + PI * x * x);
	}
}
