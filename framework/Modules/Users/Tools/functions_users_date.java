package OOP.framework.Modules.Users.Tools;

import OOP.framework.Classes.Date;
import OOP.framework.Tools.Inputs;
import OOP.framework.Tools.Validata;

public class functions_users_date {

	public static Date askUserDate(String text,String title) {
		Date hdate = null;
		boolean right = false;
		String idate = "";
		
		do {
			idate = Inputs.validastring(text, title);
			right = Validata.date(idate);
			if (right) {
				hdate = new Date(idate);
				right = hdate.checkDate();
			}
		} while (!right);		
		
		return hdate;
	}
	
	
}
