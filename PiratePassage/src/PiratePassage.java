import java.util.Scanner;

public class PiratePassage {
	public void input() {
		// receive input
		System.out.println("Please enter the number of the pirates: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Location[] ploc = new Location[n];
		// pirates original locations
		for(int i = 0; i < n; i++) {
			System.out.println("Please input the location(x, y, dir) of priate " + i + ": ");
		}
		// ship original location
		// destination location
		// unavailable locations
	}
	
	public void precal() {
		// pre-calculate the mode steps for unavailable locations
	}
	
	public void path() {
		// each step -> possible next steps
	}
	
	public static void main(String[] args) {
		PiratePassage pp = new PiratePassage();
		pp.input();
		pp.precal();
		pp.path();
	}
}
