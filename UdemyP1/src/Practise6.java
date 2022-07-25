import java.util.Scanner;
public class Practise6 {
	public static void main(String[] args) {
		System.out.println("Enter the of values you want to enter: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int values[] = new int[n];
		System.out.println("Start entering the value");
		for(int i=0; i<n; i++) {
			values[i]=sc.nextInt();
		}
		System.out.println(" ur values: ");
		for(int j=0; j<n; j++) {
			
		System.out.println(values[j]);
	}
					
	}

}
