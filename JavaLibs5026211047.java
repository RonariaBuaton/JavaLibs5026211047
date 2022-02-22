import java.util.Scanner;

public class JavaLibs5026211047{
	
	public static void main (String[] args){
		String name, singer1, singer2, place, snack;
		name="Ronaria";
		singer1="Jeanne";
		singer2="Rara";
		place="SCC";
		snack="bread";
		double jarak;
		jarak= 0.35;
		int harga1,harga2,harga3;
		harga1=10000;
		harga2=13000;
		harga3=15000;

		
		
		System.out.println("Helloo, my name is " +name);
		System.out.println("I am a member of ITS choir with my bestie" +singer1);
		System.out.println("Today, we went to "+place+ " together to do the choir practice routine for a first time.");
		System.out.println("Unexpectedly, we meet "+singer1+"'s friend, she is" +singer2);
		System.out.println("after practicing a few songs, we were hungry and came to the canteen to buy some " +snack);
		System.out.println("the distance from "+place+" to canteen is approximately "+jarak+" kilometers");
		System.out.println("the price of my " +snack+ " is " +harga1+ " ,that's so cheap");
		System.out.println("the price of "+singer1+" " +snack+ " is " +harga2);
		System.out.println("then, the price of "+singer2+" " +snack+ " is " +harga3);


		Scanner belanja = new Scanner(System.in);
		int a;
		Scanner jauh = new Scanner(System.in);
		double b;
		System.out.println("how much did they spend in total?");
		a = belanja.nextInt();
		System.out.print(" they spend " + a + " ribu. The result is obtained from " +harga1+ "+" +harga2+ "+" +harga3+ "=" +a+ ". ");
		System.out.println("how far did they walk from " +place+ " to the canteen?");
		b = jauh.nextDouble(); 
		System.out.print(" the total is " + b + " kilometers.");
	}
}
