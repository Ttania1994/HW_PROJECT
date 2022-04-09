package HW;

import java.util.Scanner;


public class Scanner_home_work {
	
	
	public static void main (String args[]) {
		

		
		Scanner objnm =new Scanner(System.in);
		System.out.println("************APNA BAZAR*************");
		System.out.println(       "Jackson heights ny"          );
		System.out.println(          "718-672-8038"              );
		
		
		
		System.out.println("Apple unit price");
		int apprice=objnm.nextInt();
		System.out.println("apple Quantity");
		int apquant=objnm.nextInt();
		System.out.println("Total apple price :"+apprice*apquant);
		
		
		System.out.println("Orange unit price");
		int orprice=objnm.nextInt();
		System.out.println("Orange Quantity");
		int orquant=objnm.nextInt();
		System.out.println("Total orange price :"+orprice*orquant);
		
		
		
		System.out.println("Banana unit price");
		int baprice=objnm.nextInt();
		System.out.println("banana Quantity");
		int baquant=objnm.nextInt();
		System.out.println("Total banana price :"+baprice*baquant);
		
		
		double taxrate=0.4;
		System.out.println("taxrate : "+taxrate);
		System.out.println("Total product price : \t" +(apprice*apquant+orprice*orquant+baprice*baquant));
		
		
		double totalpriceaftertax=(apprice*apquant+orprice*orquant+baprice*baquant)+(apprice*apquant+orprice*orquant+baprice*baquant)*.2;
		System.out.println("Total price after text :"+totalpriceaftertax);
		
		
		
		
		
		
		
	}
}
