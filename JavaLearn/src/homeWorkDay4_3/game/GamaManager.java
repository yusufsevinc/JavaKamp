package homeWorkDay4_3.game;

import java.util.ArrayList;
import java.util.List;

public class GamaManager implements IGameService{
	private List<Game> games =new ArrayList<Game>(); 
	@Override
	public void add(Game game) {
		games.add(game);
		System.out.println(game.getName() + " added.");
		
	}

	@Override
	public void delete(Game game) {
		games.remove(game);
		System.out.println(game.getName() + " deleted.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Game> getAll() {
		// TODO Auto-generated method stub
		return this.games;
	}


	

}
