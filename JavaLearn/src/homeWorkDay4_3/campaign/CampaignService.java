package homeWorkDay4_3.campaign;

import java.util.List;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign , double discount);
	List<Campaign> getAll();

}
