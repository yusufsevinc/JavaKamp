package homeWorkDay4_3.campaign;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager implements CampaignService {

	private List<Campaign> campaigns = new ArrayList<Campaign>();
	
	@Override
	public void add(Campaign campaign) {
		campaigns.add(campaign);
		System.out.println(campaign.getName() + " added.");
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaigns.remove(campaign);
		System.out.println(campaign.getName() + " deleted.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return this.campaigns;
	}

	@Override
	public void update(Campaign campaign, double discount) {
		// TODO Auto-generated method stub
		campaign.setDiscount(discount);
		
	}

}
