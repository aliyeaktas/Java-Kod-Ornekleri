package test.fibonacci;

public class Recursive {

	public static int f(int x) {
		if (x == 10)
			return 10;
		return x + f(x+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1 den 10 a kadar sayýlarýn toplamý");
		System.out.println("f: " + f(0));
	}

}
