package week3.day1;

public class CalculatorOverloading {
	
	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a , int b , int c)
	{
		System.out.println(a+b+c);
	}
	public void multiply(int a , int b)
	{
		System.out.println(a*b);
	}
	public void multiply(int a , double b)
	{
		System.out.println(a*b);
	}
	public void subtract(int a , int b)
	{
		System.out.println(a-b);
	}
	public void subtract(double a , double b)
	{
		System.out.println(a-b);
	}
	public void divide(int a , int b)
	{
		System.out.println(a/b);
	}
	public void divide(double a , double b)
	{
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		CalculatorOverloading calc = new CalculatorOverloading();
		calc.add(5, 5);
		calc.add(3, 3, 3);
		calc.multiply(5, 8);
		calc.multiply(5, 8);
		calc.subtract(10, 0);
		calc.subtract(100, 80);
		calc.divide(100, 2);
		calc.divide(5,5);
		
	
}
}

