package test.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		
		hesapla();
	}
	
	public static void hesapla() {
		
		int number1 = 1;
		int number2 = 1;
		
		int number3 ;
		
		System.out.println(number1);
		System.out.println(number2);
		
		for (int i = 0; i < 10; i++) {
			
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			System.out.println(number3);
		}
		
		
	}
}
