import java.util.Scanner;
public class computeEnglishMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the pounds that Jack has: ");
		int pounds = scan.nextInt();
		
		System.out.println("Enter the shillings that Jack has: ");
		int shillings = scan.nextInt();
		
		System.out.println("Enter the pence that Jack has: ");
		int pence = scan.nextInt();
		
		
		int totalPence = (pounds * 12 * 20) + (shillings * 12) + pence;
						
		System.out.println("Jack's change is " + changePounds + "pounds " + changeShillings + "shillings " + changePence + "pence");
		
	}

}
