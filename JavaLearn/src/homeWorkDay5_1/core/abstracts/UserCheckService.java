package homeWorkDay5_1.core.abstracts;

import homeWorkDay5_1.Entities.concretes.User;
import homeWorkDay5_1.dataAcces.abstracts.UserDao;

public interface UserCheckService {
	boolean checkName(User user);
	boolean checkMail(User user );
	boolean checkMailData(User user ,UserDao userDao);
	boolean checkPassword(User user);
	boolean check();
	
	

}
