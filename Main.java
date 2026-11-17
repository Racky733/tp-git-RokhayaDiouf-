public class Main {
	static int addition(int a, int b) {
		return a + b;
	}
	static int soustraction(int a,int b){
		return a - b;
	}
	static int multiplication(int a,int b){
		return a * b;
	}
	static int division(int a,int b){
		return a / b;
	}
	public static void main(String[] args) {
		System.out.println("2 + 3 = " + addition(2, 3));
		System.out.println("18 - 5 =" + soustraction(18, 5));
		System.out.println("4 x 5 =" + multiplication(4, 5));
		System.out.println("9 / 3 =" + division(9, 3));
	}
}

