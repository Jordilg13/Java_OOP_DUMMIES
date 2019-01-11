package OOP.framework.Modules.Cinema.Classes;

import OOP.framework.Tools.languages.SingletonLang;

public class FootballMatch extends Showing {

	private String issuance_days; //no es un Date perque em vaig donar conter al final que esta filla no gastava date, pero igualment no es gastaria per a res
	private String hour;
	private String matchType;
	private float price;
	
	
	
	public FootballMatch(String showing_ID, int room_number, String name, String issuance_days, String hour, String matchType) {
		super(showing_ID, room_number, name);
		this.issuance_days = issuance_days;
		this.hour = hour;
		this.matchType = matchType;
		this.calculatePrice();
	}
	//primary key const
	public FootballMatch(String showing_ID) {
		super(showing_ID);
	}
	//empty const
	public FootballMatch() {super();};

	
	
	public String getIssuance_days() {
		return issuance_days;
	}

	public void setIssuance_days(String issuance_days) {
		this.issuance_days = issuance_days;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}
	

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void calculatePrice() {
		float[] prices = {5f,8f}; //league, champions
		
		//consts
		final int LEAGUE = 0;
		final int CHAMPIONS = 1;
				
		if (this.matchType == "League") 
			this.price = prices[LEAGUE];
		else
			this.price = prices[CHAMPIONS];			
	
		
		
	}
	
	@Override
	public String toString() {
		return "FootballMatch ["+SingletonLang.dicc.get("issdays")+"=" + issuance_days + ", "
				+ ""+SingletonLang.dicc.get("hour")+"=" + hour + ", "
				+ ""+SingletonLang.dicc.get("mtype")+"=" + matchType
				+ ", "+SingletonLang.dicc.get("price")+"=" + price + 
				"]";
	}
	
	
	
	
	
	
}
