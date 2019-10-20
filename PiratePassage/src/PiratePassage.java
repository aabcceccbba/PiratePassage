import java.util.Scanner;

public class PiratePassage {
	
	public Location inputLocation(Scanner scan, int i) {
		int x = scan.nextInt();
		int y = scan.nextInt();
		String dir = scan.next();
		Location loc = new Location(x, y, dir);
		return loc;
	}
	
	public void input() {
		// receive input
		System.out.println("Please enter the number of the pirates: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Ship[] pirates = new Ship[n];
		
		// pirates original locations
		for(int i = 0; i < n; i++) {
			System.out.println("Please input the color of the Pirate: ");
			String color = scan.next();
			System.out.println("Left Bottom is (0,0), dir can be either up, down, left, right");
			System.out.println("Please input the start location(x, y, dir) of priate " + i + ": ");
			int x = scan.nextInt();
			int y = scan.nextInt();
			String dir = scan.next();
			Location start = new Location(x, y, dir);
			System.out.println("Please input the diagonal location(x, y, dir) of pirate" + i + ": ");
			int dx = scan.nextInt();
			int dy = scan.nextInt();
			String ddir = scan.next();
			Location diagonal = new Location(dx, dy, ddir);
			
			pirates[i] = new Ship(color, start, diagonal); 		
		}
		
		// ship original location
		System.out.println("Please input the start location(x, y, dir) of your ship: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		String dir = scan.next();
		Location start = new Location(x, y, dir);
		System.out.println("Please input the diagonal location(x, y, dir) of your ship: ");
		int dx = scan.nextInt();
		int dy = scan.nextInt();
		String ddir = scan.next();
		Location diagonal = new Location(dx, dy, ddir);
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
