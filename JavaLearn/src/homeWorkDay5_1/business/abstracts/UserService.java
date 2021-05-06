package homeWorkDay5_1.business.abstracts;

import java.util.List;

import homeWorkDay5_1.Entities.concretes.User;
import homeWorkDay5_1.dataAcces.abstracts.UserDao;

public interface UserService {
	void add(User user);
	void delete(User user);
	List<User> getAll();
	boolean login(User user);

}
