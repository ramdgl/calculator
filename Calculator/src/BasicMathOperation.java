import java.util.Scanner;

public class BasicMathOperation {

	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the operation you want ADD OR SUB OR MUL OR DIV OR MOD");
		String operation = scan.nextLine();

		switch (operation) {
		case "ADD": 
			System.out.println("Enter the first number....");
			int a = scan.nextInt();
			System.out.println("Enter second number.......");
			int b = scan.nextInt();
			int c = add(a,b); 
			System.out.println("Result is ...."+c);
			break;
		case "SUB":
			System.out.println("Enter the first number....");
			int d = scan.nextInt();
			System.out.println("Enter second number.......");
			int e = scan.nextInt();
			int f = sub(d,e); 
			System.out.println("Result is ...."+f);
			break;
		case "MUL":
			System.out.println("Enter the first number....");
			int g = scan.nextInt();
			System.out.println("Enter second number.......");
			int h = scan.nextInt();
			int i = mul(g,h); 
			System.out.println("Result is ...."+i);
			break;
		case "DIV":
			System.out.println("Enter the first number....");
			int j = scan.nextInt();
			System.out.println("Enter second number.......");
			int k = scan.nextInt();
			int l = div(j,k); 
			System.out.println("Result is ...."+l);
			break;
		case "MOD":
			System.out.println("Enter the first number....");
			int m = scan.nextInt();
			System.out.println("Enter second number.......");
			int n = scan.nextInt();
			int o = mod(m,n); 
			System.out.println("Result is ...."+o);
			break;	
		default:
			System.out.println("Default Values are");
			System.out.println("--------ADD-------");
			System.out.println("--------SUB-------");
			System.out.println("--------MUL-------");
			System.out.println("--------DIV-------");
			System.out.println("--------MOD-------");
			break;
		}

	}

	public static int add(int a ,int b)
	{
		int result = a+b;
		return result;
	}
	public static int sub(int a ,int b)
	{
		int result = a-b;
		return result;
	}
	public static int mul(int a ,int b)
	{
		int result = a*b;
		return result;
	}
	public static int div(int a ,int b)
	{
		int result = a/b;
		return result;
	}
	public static int mod(int a ,int b)
	{
		int result = a%b;
		return result;
	}

}
