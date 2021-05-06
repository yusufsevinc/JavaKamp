package homeWorkDay5_1.dataAcces.abstracts;

import java.util.List;

import homeWorkDay5_1.Entities.concretes.User;


public interface UserDao {
	void add(User user);
	void delete(User user);
	List<User> getAll();
	
	

}
