package homeWorkDay5_1.core.concretes;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;



import homeWorkDay5_1.Entities.concretes.User;
import homeWorkDay5_1.core.abstracts.UserCheckService;
import homeWorkDay5_1.dataAcces.abstracts.UserDao;

public class UserCheckManager implements UserCheckService {
	
	private  final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	@Override
	public boolean checkName(User user) {
		if((user.getFirstName().length() >= 2 ) &&
				(user.getLastName().length() >=2)){
			return true;
		}else {
			System.out.println("Geçersiz AD veya SOYAD (en az iki karakter olmalý)");
			return false;
		}
		
	}

	@Override
	public boolean checkMail(User user) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
		
		if(pattern.matcher(user.getMail()).find() ) {
			return true;
			
		}else {
			System.out.println("Geçersiz Email adresi.. ");
			return false;
		}
		
		
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length() > 5) {
			return true;
		}else {
			System.out.println("Geçersiz Paralo (En az 6 karakter olmalý)");
			return false;
		}
		
	}

	@Override
	public boolean checkMailData(User user, UserDao userDao) {
		List<User> data = userDao.getAll();
		for (User user2 : data) {
			if (user2.getMail() == user.getMail()) {
				System.out.println("Mail adresi sisteme daha önce kayýtlý. " +user2.getMail().toString() );
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean check() {
		//onaylamak için gerekli iþlemler farklý olabilir basit bir simulasyon oluþturdum.
		Scanner input = new Scanner(System.in);
		System.out.println("Kaydýnýzý tamamlamak için 'EVET' yazýnýz!" );
		String onay = input.nextLine();
		if(onay.equals("EVET")) {
			return true;
		}else {
			System.out.println("Kayýt onaylanmadý !");
			return false;
		}
		
	}

	

}
