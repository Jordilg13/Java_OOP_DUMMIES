package OOP.framework.Tools;

import javax.swing.JOptionPane;

import OOP.framework.Classes.Settings;
import OOP.framework.Tools.languages.SingletonLang;

public class functions_settings {

	public static String language() {
		String languageS="";
		String [] menu_language = { "English", "Espanyol", "Valencia" };
		int menu = 0;
		
		menu = Submenu.buttonsbox(SingletonLang.dicc.get("lang"), SingletonLang.dicc.get("lang"), menu_language);
		
		switch (menu) {
			case 0:
				languageS = Settings.ENGLISH;
				break;
			case 1:
				languageS = Settings.SPANISH;
				break;
			case 2:
				languageS = Settings.VALENCIA;
				break;
		}
		return languageS;
	}
	
	public static String date() {
		String date="";
		String [] menu_date = { "dd/mm/yyyy", "dd-mm-yyyy", "yyyy/mm/dd", "yyyy-mm-dd" };
		int menu = 0;
		
		menu = Submenu.buttonsbox( "", "",menu_date);
		
		switch (menu) {
			case 0:
				date = "dd/mm/yyyy";
				break;
			case 1:
				date = "dd-mm-yyyy";
				break;
			case 2:
				date = "yyyy/mm/dd";
				break;
			case 3:
				date = "yyyy-mm-dd";
				break;
		}
		return date;
	}
	
	public static char currency() {
		char currency=' ';
		String [] menu_currency = { "�", "$", "�" };
		int menu = 0;
		
		menu = Submenu.buttonsbox("","",menu_currency);
		
		switch (menu) {
			case 0:
				currency = '�';
				break;
			case 1:
				currency = '$';
				break;
			case 2:
				currency = '�';
				break;
		}
		return currency;
	}
	
	public static int decimal() {
		int decimal=0, menu = 0;
		String [] menu_decimal = { "1", "2", "3" };
		
		menu = Submenu.buttonsbox(SingletonLang.dicc.get("decimalnum"),"",menu_decimal);
		
		switch (menu) {
			case 0:
				decimal = 1;
				break;
			case 1:
				decimal = 2;
				break;
			case 2:
				decimal = 3;
				break;
		}
		return decimal;
	}

	public static boolean dummies() {
		boolean dummies = false;
		if (JOptionPane.showConfirmDialog(null, "Activate dummies?", "Dummies", 0, 1 ) == JOptionPane.YES_OPTION) {
			dummies = true;
		}
		return dummies;
	}
	
}
