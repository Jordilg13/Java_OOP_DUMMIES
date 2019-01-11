package OOP.framework.Modules.Cinema.Classes;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import OOP.framework.Classes.*;
import OOP.framework.Tools.languages.SingletonLang;

public class DocumentaryFilm extends Showing {

	private String issuance_days;
	private ArrayList<String> schedule;
	private Date premiere;
	private Date lastEmision;
	private float price;

	
	public DocumentaryFilm(String showing_ID, int room_number, String name, String issuance_days, ArrayList<String> schedule,
			Date premiere, Date lastEmision) {
		super(showing_ID, room_number, name);
		this.issuance_days = issuance_days;
		this.schedule = schedule;
		this.premiere = premiere;
		this.lastEmision = lastEmision;
		this.calculatePrice();
	}
	//primary key const
	public DocumentaryFilm(String showing_ID) {
		super(showing_ID);
	}
	//empty const
	public DocumentaryFilm() {super();}

	public String getIssuance_days() {
		return issuance_days;
	}

	public void setIssuance_days(String issuance_days) {
		this.issuance_days = issuance_days;
	}

	public ArrayList<String> getSchedule() {
		return schedule;
	}

	public void setSchedule(ArrayList<String> schedule) {
		this.schedule = schedule;
	}

	public Date getPremiere() {
		return premiere;
	}

	public void setPremiere(Date premiere) {
		this.premiere = premiere;
	}

	public Date getLastEmision() {
		return lastEmision;
	}

	public void setLastEmision(Date lastEmision) {
		this.lastEmision = lastEmision;
	}
	

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public void calculatePrice() {
		int day,year,month = 0;
		Date christmas = new Date("25/12/2018");
		float[] prices = {3.50f, 5f, 6.5f};
		Date today_date = null;
		//consts
		final int SPECTATOR_DAY = 0;
		final int NORMAL_DAY = 1;
		final int CHRISTMAS = 2;
		
		GregorianCalendar today = new GregorianCalendar();
		
		day = Integer.valueOf(today.get(GregorianCalendar.DAY_OF_MONTH));
		year = Integer.valueOf(today.get(GregorianCalendar.YEAR));
		month = Integer.valueOf(today.get(GregorianCalendar.MONTH));
		
		today_date = new Date(day,month+1,year);	
		
		//cheks if today is between the premiere and the last emission
		if (this.premiere.diffDate(today_date) >= 0 && this.lastEmision.diffDate(today_date) <= 0) {
			if (christmas.getYear() == today_date.getYear() && christmas.getMonth() == today_date.getMonth()) 
				this.price = prices[CHRISTMAS];
			else if (Integer.valueOf(today.get(GregorianCalendar.DAY_OF_WEEK)) == 2) //monday
				this.price = prices[SPECTATOR_DAY];
			else
				this.price = prices[NORMAL_DAY];			
		} else
			JOptionPane.showMessageDialog(null, "This film is not emitted today", "Error", 3);
		
		
	}

	@Override
	public String toString() {
		return "DocumentaryFilm ["+SingletonLang.dicc.get("issdays")+"=" + issuance_days + ", "+
				SingletonLang.dicc.get("sche")+"=" + schedule+ ", "+
				SingletonLang.dicc.get("prem")+"=" + premiere + ", "+
				SingletonLang.dicc.get("lemi")+"=" + lastEmision + ", "+
				SingletonLang.dicc.get("price")+"=" + price +
				"]";
	}	
	
	
	
	
}
