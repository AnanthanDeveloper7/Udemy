import java.util.Scanner;
public class Practise2 {
	public static void main(String[]args) {
		int age;
		int x;
		double height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		x = 16 - age;
		System.out.println("enter the height (in cm)");
		height = sc.nextDouble();
		
	
	if(age>16) {
		if(height>167) {
			System.out.println("You are qualified to play");
		}else {
			System.out.println("You are not qualified to play");
		}
	}else {
		System.out.println("you are not qualified as of now,come back after " + x +  "years");
	}
	
	
	
	}

}
