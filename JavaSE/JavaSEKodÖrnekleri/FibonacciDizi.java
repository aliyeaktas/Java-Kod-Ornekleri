package test.fibonacci;

public class FibonacciDizi {

	public static void main(String[] args) {
		
		int fib[] = new int[10];
		fib[0] = 1;
		fib[1] = 1;
		
		for (int i = 0; i < 8; i++) {
			
			fib[i+2] = fib[i+1] + fib[i];
		}
		
//		for (int i = 2; i < 10; i++) {
//			fib[i] = fib[i - 1] + fib[i - 2];
//		}
		
		for (int i = 0; i < fib.length; i++) {
			System.out.println(fib[i]);
		}
	}
}
