package homeWorkDay4_3.sales;

import java.util.List;

import homeWorkDay4_3.game.Game;

public interface ICartService {
	void add(Game game);
	void delete();
	 List<Game> carts();
	 double cartSum(Cart cart);
	

}
