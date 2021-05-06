package homeWorkDay5_1.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import homeWorkDay5_1.Entities.concretes.User;
import homeWorkDay5_1.dataAcces.abstracts.UserDao;

public class GoogleUserDao implements UserDao{

	private List<User> users = new ArrayList<User>();
	
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Google ile üye oldu.");
		users.add(user);
	}

	@Override
	public void delete(User user) {
		System.out.println(" silindi...");
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
