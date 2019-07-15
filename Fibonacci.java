import java.util.Scanner;

class Fibonacci{
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.print("Enter the length of Fibonacci series : ");
		count = sc.nextInt();
		int fib1 = 0;
		int fib2 = 1;
			System.out.print(fib1+" " +fib2+" ");
		for (int i=0;i <count-2 ;i++ ) {

			int fib3 = fib1 + fib2;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
	
		}
	}
}