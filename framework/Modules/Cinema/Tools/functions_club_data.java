package OOP.framework.Modules.Cinema.Tools;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import OOP.framework.Tools.*;
import OOP.framework.Tools.languages.SingletonLang;

public class functions_club_data {
	
	public static String name() {
		String aaa = "";
		boolean end = false;
		do {
			aaa = Inputs.validastring(SingletonLang.dicc.get("inputname"), SingletonLang.dicc.get("name"));
			end = Validata.name(aaa);
			
		} while (!end);
		
		return aaa;
	}
	
	public static String date(String text) {
		String aaa = "";
		boolean end = false;
		do {
			aaa = Inputs.validastring(text, SingletonLang.dicc.get("date"));
			end = Validata.date(aaa);
			
		} while (!end);
		
		return aaa;
	}
	public static String hourMin() {
		String hourmin = "";
		boolean end = false;
		
		do {
			hourmin = Inputs.validastring(SingletonLang.dicc.get("inputhour"), SingletonLang.dicc.get("hour"));
			end = Validata.hourMin(hourmin);
			if (!end) {
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("invalidhour"), "Error", JOptionPane.ERROR_MESSAGE);
			}
		} while (!end);
		
		return hourmin;
	}
	public static ArrayList<String> scheduleHours(String text) {
		ArrayList<String> schedule = new ArrayList<String>();
		String hour = "";
		
		do {
			hour = functions_club_data.hourMin();
			schedule.add(hour);

		} while (Utils.keep(text));
		
		return schedule;
	}
	
	public static String IDcode() {
		String id = "";
		boolean end = false;
		
		do {
			id = Inputs.validastring(SingletonLang.dicc.get("inputID"), "ID");
			end = Validata.idcode(id);
			if (!end) {
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("invalidID"), "Error", JOptionPane.ERROR_MESSAGE);
			}
		} while (!end);
		
		return id;
	}
	
	
	public static String MatchType() {
		int chosen = 0;
		String[] opMatch = {"Champions",SingletonLang.dicc.get("league")};
		
		
		chosen =Submenu.buttonsbox(SingletonLang.dicc.get("selecttypematch"), SingletonLang.dicc.get("matchtype"), opMatch);
		
		return opMatch[chosen];
	}
}
