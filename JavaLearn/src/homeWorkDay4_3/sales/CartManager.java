package homeWorkDay4_3.sales;

import java.util.ArrayList;
import java.util.List;

import homeWorkDay4_3.game.Game;

public class CartManager implements ICartService {
   private List<Game> carts = new ArrayList<Game>();
   
	
	@Override
	public void add(Game game) {
		carts.add(game);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		carts.clear();
		System.out.println("cart empty .");
	}

	@Override
	public List<Game> carts() {
		// TODO Auto-generated method stub
		return this.carts;
	}

	@Override
	public double cartSum(Cart cart) {
		double sum  = 0;
		for (Game game : carts) {
		  sum += game.getPrice();
		  cart.setCartSum(sum);
		}
		return cart.getCartSum();
	}
	

}
