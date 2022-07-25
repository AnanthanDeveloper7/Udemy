import java.util.Scanner;
public class Practise1 {
	public static void main (String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in thw range of 1  to 100: ");
		marks = sc.nextInt();
		
		if(marks>=35) {
			System.out.println("you passed");
		}else {
			System.out.println("you failed");
		}
		}

}
