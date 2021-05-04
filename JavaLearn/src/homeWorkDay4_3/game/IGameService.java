package homeWorkDay4_3.game;

import java.util.List;

public interface IGameService {
	void add(Game game);
	void delete(Game game);
	List<Game> getAll();

}
