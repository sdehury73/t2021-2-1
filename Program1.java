package test;
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number(a)");
		double a=s.nextDouble();
		System.out.println("Enter the second number(b)");
		double b=s.nextDouble();
		System.out.println("Enter the type of operation");
		String operation=s.next();
		switch(operation)
		{
		case "Addition":System.out.println("Answer is "+(a+b));
		break;
		case "Subtraction":System.out.println("Answer is "+(a-b));
		break;
		case "Multiplication":System.out.println("Answer is "+(a*b));
		break;
		case "Division":System.out.println("Answer is "+(a/b));
		}
	}
}
