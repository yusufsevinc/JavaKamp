package homeWorkDay5_1;

import homeWorkDay5_1.Entities.concretes.User;
import homeWorkDay5_1.business.abstracts.UserService;
import homeWorkDay5_1.business.concretes.UserManager;
import homeWorkDay5_1.core.concretes.UserCheckManager;
import homeWorkDay5_1.dataAcces.concretes.GoogleUserDao;
import homeWorkDay5_1.dataAcces.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		
		UserService userServiceGoogle = new UserManager(new GoogleUserDao(), new UserCheckManager());

		UserService userServiceHibernate = new UserManager(new HibernateUserDao(), new UserCheckManager());
		
		//kullanýcý bilgileri googledan nasýl çekilir bir fikrim o yüzden elle oluþturuldu.
		
		
		User gecersizAdSoyad = new User(2,"y","sevinç","123456","1yusufsevinc@gmail.com");
		userServiceGoogle.add(gecersizAdSoyad);
		System.out.println("\n");
		
		User yusuf_hibernate = new User(1,"yusuf","sevinç","123456","1yusufsevincHibernate@gmail.com");
		userServiceHibernate.add(yusuf_hibernate);
		System.out.println("\n");
		
		User gecersizSifre = new User(2,"yusuf","sevinç","12345","1yusufsevinc@gmail.com");
		userServiceGoogle.add(gecersizSifre);
		System.out.println("\n");
		
		User gecersizMail = new User(2,"yusuf","sevinç","123456","1yusufsevincgmail.com");
		userServiceGoogle.add(gecersizMail);
		System.out.println("\n");
		
		User yusuf_google = new User(1,"yusuf","sevinç","123456","1yusufsevinc@gmail.com");
		userServiceGoogle.add(yusuf_google);
		System.out.println("\n");
		
		User varOlanMail = new User(2,"yusuf","sevinç","123456","1yusufsevinc@gmail.com");
		userServiceGoogle.add(varOlanMail);
		
		System.out.println("\n");
		System.out.println("\n");
		
		//Giriþ
		userServiceGoogle.login(yusuf_google);
		
		userServiceHibernate.login(yusuf_hibernate);
		

	}

}
