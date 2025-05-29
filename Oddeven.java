import java.util.Scanner;
public class Oddeven{
	
	public static void main(String []args){
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter your number :" );
		int number =input.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.println("This is a Even Number");
		}
		else
		{
			System.out.println("This is a odd Number");
		}
	}
}