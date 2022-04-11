package calc;

public class Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int minus(int a, int b) {
		int big = (a > b) ? a : b;
		int small = (a < b) ? a : b;
		
		return big - small;
	}
	
}
