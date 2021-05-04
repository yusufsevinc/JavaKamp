package homeWorkDay4_3;

import homeWorkDay4_3.campaign.Campaign;
import homeWorkDay4_3.campaign.CampaignManager;
import homeWorkDay4_3.customer.Customer;
import homeWorkDay4_3.customer.CustomerManager;
import homeWorkDay4_3.game.Game;
import homeWorkDay4_3.sales.Cart;
import homeWorkDay4_3.sales.CartManager;
import homeWorkDay4_3.campaign.Campaign;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Customer yusuf = new Customer(1,"yusuf","sevinç" , 200);
		Customer ali = new Customer(49,"ali","ata" , 300);
		Customer veli = new Customer(50,"veli","bak" ,5000);
		
		CustomerManager cm = new CustomerManager();
		cm.add(yusuf);
		cm.add(veli);
		cm.add(ali);
		
		
		Campaign myGame = new Campaign(2, "MyGame", 10);
		Campaign yourGame = new Campaign(3, "YourGame", 30);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(yourGame);
		campaignManager.add(myGame);
		
		
		Game gta = new Game(6, "GTA", 100, yourGame);
		Game pes = new Game(3, "Pes 2021", 100, myGame);
		Game fifa = new Game(3, "FIFA 2008", 100,null);
		
		
		
		CartManager cartManager = new CartManager();
		
		Cart cart = new Cart(1 , yusuf);
		
		cartManager.add(fifa);
		cartManager.add(pes);
		cartManager.add(gta);
		
		//satýþ
		//cartManager bölümüne eklenebilir ama nedense burda kalmasýný istiyorum :)
		double sumCart = cartManager.cartSum(cart);
		if(sumCart < cart.getCustomer().getBalance()) {
			System.out.println("The purchase was made successfully.");
		}else {
			System.out.println("insufficient balance ");
		}
		
		
		
		
		
		
		
		
		
		

		
		
		

	}

}
