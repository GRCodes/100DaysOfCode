import java.util.Scanner;

public class Calculator extends Welcome {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int num1=0, num2=0;
		@SuppressWarnings("unused")
		char operator;
		@SuppressWarnings("unused")
		double answer=0.0;
		
		Scanner scanObject = new Scanner(System.in);
		System.out.println("Please Enter the First Value");
		num1 = scanObject.nextInt();
		System.out.println("Please Enter the Second Value");
		num2 = scanObject.nextInt();
		System.out.println("What Operation?");
		operator = scanObject.next().charAt(0);
		
		switch(operator) {
		case '+': answer = num1 + num2;
		break;
		case '-': answer = num1 - num2;
		break;
		case '*': answer = num1 * num2;
		break;
		case '/': answer = num1/num2;
		break;
		}
		System.out.println(num1+" "+operator+" "+num2+" "+"="+answer);
	}

}
