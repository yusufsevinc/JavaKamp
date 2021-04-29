package oopIntro;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Product game = new Product(1, "Dell Game Series", 3000, "for game" ,10 );
		Product note = new Product(2, "Dell Note Series", 4000, "for note",20);
		Product workStation = new Product(1, "Dell Work Series", 5000, "for work station" , 10);
		

		ArrayList<Product> products = new ArrayList<Product>();

		products.add(game);
		products.add(note);
		products.add(workStation);
		
		for (Product product : products) {
			
			System.out.println("Products name: " + product.getName());
			
			System.out.println("Product new unit price: " + product.getUnitPriceAfterDiscount()  + "\n");
		}

	}

}
