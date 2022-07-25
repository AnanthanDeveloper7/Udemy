import java.util.Scanner;
public class Practise5 {
	public static void main(String[] args) {
		int ticket_price[] = {100,150,500,20};
		int discounted_price[] = new int [ticket_price.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a discount: ");
		int discount = sc.nextInt();
		
		for(int i=0; i<ticket_price.length; i++) {
			discounted_price[i] = (ticket_price[i] - (ticket_price[i] * discount)/100);
		}
		
		for (int j=0; j<discounted_price.length; j++) {
			System.out.println(discounted_price[j]);
			
		}
	}

}
