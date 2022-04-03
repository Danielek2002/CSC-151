/*
 * creates two Purse objects, sophie and sally
has a loop whose body executes two times.  For each execution of the loop, it
asks the user for the pounds, shillings and pence sophie and sally (each) should add to their purses
displays the amount of money in each purse
asks the user for the pounds, shillings and pence sophie and sally (each) should spend
displays the amount of money in each purse
 */
import java.util.*;
public class PurseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Purse sophie = new Purse();
		Purse sally = new Purse();
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			
			Purse temp = new Purse();
			if(i == 0) {
				System.out.println("For Sophie: ");
			}
			else if(i == 1) {
				System.out.println("For Sally: ");
			}
			System.out.println("Enter amount of pounds: ");
			int pounds = input.nextInt();
			System.out.println("Enter amount of shillings: ");
			int shillings = input.nextInt();
			System.out.println("Enter amount of pence: ");
			int pence = input.nextInt();
			
			temp.addPounds(pounds);
			temp.addShillings(shillings);
			temp.addPence(pence);
			
			if(i == 0) {
				sophie = temp;
			}
			else if(i == 1) {
				sally = temp;
			}
			
		}
		
		System.out.println(sophie);
		System.out.println(sally);
	}

}
