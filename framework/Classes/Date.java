package OOP.framework.Classes;

import java.util.GregorianCalendar;
import OOP.main_menu;
import OOP.framework.Tools.languages.SingletonLang;

public class Date {
	private int day;
    private int month;
    private int year;
    
    
    
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(String date) {
		String [] datearray = new String [3];
		switch (main_menu.settings.getDate()) {
			case "dd/mm/yyyy":
				datearray = date.split("/");
				this.day=Integer.parseInt(datearray [0]);
				this.month=Integer.parseInt(datearray [1]);
				this.year=Integer.parseInt(datearray [2]);
				break;
			
			case "dd-mm-yyyy":
				datearray = date.split("-");
				this.day=Integer.parseInt(datearray [0]);
				this.month=Integer.parseInt(datearray [1]);
				this.year=Integer.parseInt(datearray [2]);
				break;
			
			case "yyyy/mm/dd":
				datearray = date.split("/");
				this.day=Integer.parseInt(datearray [2]);
				this.month=Integer.parseInt(datearray [1]);
				this.year=Integer.parseInt(datearray [0]);
				break;
				
			case "yyyy-mm-dd":
				datearray = date.split("-");
				this.day=Integer.parseInt(datearray [2]);
				this.month=Integer.parseInt(datearray [1]);
				this.year=Integer.parseInt(datearray [0]);
				break;
		}	
	}

	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int diffDate(Date i_date) {
		GregorianCalendar i_date_calendar = new GregorianCalendar(i_date.getYear(),i_date.getMonth(),i_date.getDay());
		GregorianCalendar this_calendar = new GregorianCalendar(this.getYear(),this.getMonth(),this.getDay());

		return (int) (i_date_calendar.getTimeInMillis() / (1000*60*60*24) - this_calendar.getTimeInMillis() / (1000*60*60*24));
	}
	public boolean checkDay() {
		GregorianCalendar calen = new GregorianCalendar();
		int days[]	=	{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//bisiesto
		if (calen.isLeapYear(this.year)){
			days[2]	= 29;
		}
		
		if((this.day >= 1) && (this.day <= days[this.month])){
			return true;
		}else{
			return false;
		}
		
	}	
	public boolean checkMonth() {
		if((this.month >= 1) && (this.month <= 12)){
			return true;
		}else{
			return false;
		}
		
	}	
	public boolean chechYear(){
		if((this.year >= 1900) && (this.year <= 2100)){
			return true;
		}else{
			return false;
		}
	}	
	public boolean checkDate(){       
        boolean right = true;
        
        if(!this.checkDay()){
            right = false;
        }
        if(!this.checkMonth()){
            right = false;
        }
        if(!this.chechYear()){
            right = false;
        }
        
        return right;
    }

 	public boolean greaterThan(Date date1) {
 		boolean result = false;
 		
 		if (this.year > date1.year) {
			result = true;
		} else if (this.year == date1.year && this.month > date1.month) {
			result = true;
		} else if (this.year == date1.year && this.month == date1.month && this.day > date1.day) {
			result = true;
		}
 		
 		return result;
 	} 
	
	@Override

	public String toString() {
		return "Date ["+SingletonLang.dicc.get("day")+"=" + day + ", "+
				SingletonLang.dicc.get("month")+"=" + month + ", "+
				SingletonLang.dicc.get("year")+"=" + year + "]";
	}
	
	
}
    
    
