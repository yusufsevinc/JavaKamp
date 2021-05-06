package homeWorkDay5_1.business.concretes;

import java.util.List;
import java.util.Scanner;
import homeWorkDay5_1.Entities.concretes.User;
import homeWorkDay5_1.business.abstracts.UserService;
import homeWorkDay5_1.core.concretes.UserCheckManager;
import homeWorkDay5_1.dataAcces.abstracts.UserDao;

public class UserManager implements UserService{
	
	UserDao userDao;
	UserCheckManager userCheckManager;
	

	public UserManager(UserDao userDao , UserCheckManager userCheckManager) {
		super();
		this.userDao = userDao;
		this.userCheckManager = userCheckManager;
	}

	@Override
	public void add(User user) {
		
		if (userCheckManager.checkMail(user) && userCheckManager.checkName(user)
				&& userCheckManager.checkPassword(user) && userCheckManager.checkMailData(user, userDao)
				&& (userCheckManager.check())) {
			userDao.add(user);
			
			
		}else {
			System.out.println("Uyarýyý dikkate alýp tekrar deneyiniz...");
		}
	
		
		
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	@Override
	public boolean login(User user) {
		for (User mail : getAll()) {
			if((mail.getMail() == user.getMail())
					 &&
			  (mail.getPassword() == user.getPassword())) {
				System.out.println("Sayýn " + user.getFirstName() + " " + user.getLastName() + " hoþgeldiniz.");
				return true;
			}
		}
		System.out.println("Geçersiz Kullanýcý Adý veya Þifre !");
		return false;
		
	}

}
