package maven.second;

import java.util.Scanner;

import maven.second.MySimpleCalci;

public class App {
	public static void main( String[] args )
    {
		MySimpleCalci c = new MySimpleCalci();
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=10;
		b=5;
		System.out.println(a + " + " + b  + " = " + c.addition(a, b));	
		System.out.println(a + " - " + b  + " = " + c.subtraction(a, b));	
		System.out.println(a + " * " + b  + " = " + c.multiplication(a, b));	
		System.out.println(a + " / " + b  + " = " + c.division(a, b));	
		System.out.println(a + " % " + b  + " = " + c.remainder(a, b));	

    }
}

