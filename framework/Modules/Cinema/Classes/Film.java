package OOP.framework.Modules.Cinema.Classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import OOP.main_menu;
import OOP.framework.Classes.*;
import OOP.framework.Modules.Cinema.Tools.functions_club_data;
import OOP.framework.Tools.languages.SingletonLang;

public class Film extends Showing {

	private String issuance_days;
	private ArrayList<String> schedule;
	private Date premiere;
	private Date lastEmision;
	private float price;
	
	
	
	public Film(String showing_ID, int room_number, String name, String issuance_days, ArrayList<String> schedule, Date premiere,
			Date lastEmision) {
		super(showing_ID, room_number,name);
		this.issuance_days = issuance_days;
		this.schedule = schedule;
		this.premiere = premiere;
		this.lastEmision = lastEmision;
		this.calculatePrice();
	}
	//primary key const
	public Film(String showing_ID) {
		super(showing_ID);
	}
	//empty const
	public Film() {}


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
		//int day,year,month = 0;
		Date christmas = new Date(25,12,2018);
		float[] prices = {3.50f, 5.0f, 6.5f};
		String saleDate = functions_club_data.date(SingletonLang.dicc.get("askactualdate")); //esta es la data que deuria de supostament detectar en quin dia es ven la entrada per a saber el dia i asignar el preu
		Date saleDate2 = new Date(saleDate);
		boolean leave = false;
		//consts
		final int SPECTATOR_DAY = 0;
		final int NORMAL_DAY = 1;
		final int CHRISTMAS = 2;
		
		
		/////////////convert/to/day/of/week///////////////////////////////////////////////////////
		SimpleDateFormat format1=new SimpleDateFormat(main_menu.settings.getDate());
		java.util.Date dt1 = null; //no es recomana gastar el Date, pero no he trobat mes formes de obtindre el numero de dia de una data concreta
		try {
			dt1 = format1.parse(saleDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		DateFormat format2=new SimpleDateFormat("u"); //(1 = Monday, ..., 7 = Sunday) 
		String finalDay=format2.format(dt1);
		/////////////////////////////////////////////////////////////////////////	
		  
		  
		
		//loop until saleData is a valid date
		do {
			//cheks if today is between the premiere and the last emission
			if (this.premiere.diffDate(saleDate2) >= 0 && this.lastEmision.diffDate(saleDate2) <= 0) {
				leave = true;
				if (christmas.getYear() == saleDate2.getYear() && christmas.getMonth() == saleDate2.getMonth() && christmas.getDay() == saleDate2.getDay()) 
					this.price = prices[CHRISTMAS];
				else if (Integer.parseInt(finalDay) == 1) //monday
					this.price = prices[SPECTATOR_DAY];
				else
					this.price = prices[NORMAL_DAY];			
			} else {
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("notemitoday"), "Error", 3);
				saleDate = functions_club_data.date(SingletonLang.dicc.get("askactualdate")); //esta es la data que deuria de supostament detectar en quin dia es ven la entrada per a saber el dia i asignar el preu
				saleDate2 = new Date(saleDate);
			}
		} while (!leave);
		
	}

	@Override
	public String toString() {
		return "Film ["+SingletonLang.dicc.get("issdays")+"=" + issuance_days + ", "+
						SingletonLang.dicc.get("sche")+"=" + schedule+ ", "+ 
						SingletonLang.dicc.get("prem")+"=" + premiere + ", "+
						SingletonLang.dicc.get("lemi")+"=" + lastEmision + ", "+
						SingletonLang.dicc.get("price")+"=" + price +
						"]";
	}


	
	
	

	
	
	
	
	
}
