package OOP.framework.Tools;

import OOP.main_menu;

public class Validata {
	
	private static final String p_name="^[a-zA-Z\\s]*$";
//	private static final String p_date="^([0-2][0-9]|(3)[0-1])(\\/)(([0-9])|((1)[0-2]))(\\/)\\d{4}$";	
	private static final String pattern_date1 = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)\\d{2}$";
	private static final String pattern_date2 = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-(19|20)\\d{2}$";
	private static final String pattern_date3 = "^(19|20)\\d{2}/(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])$";
	private static final String pattern_date4 = "^(19|20)\\d{2}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
	private static final String p_hour="^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$";
	private static final String p_password = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20})";
//	private static final String p_namewithnubers="^[A-Za-z0-9-\\s]*$";//Nombre mixto con espacios y digitos(para escribir nombres de pc's, componentes y mas)
	private static final String p_id="^([A-Z]{1})([0-9]{4})$";//1 letra en mayuscula y 4 digitos
//	private static final String p_CP="^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$";
//	private static final String p_tlf="^[0-9]{2,3}-? ?[0-9]{6,7}$";
//	private static final String p_dni="([0-9]{8})([A-Z])";
//	private static final String p_email=("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
//	private static final String p_age="^[0-9]{1,2}$";
	
	public static boolean name(String name){
		return name.matches(p_name);
	}
	public static boolean passwd(String pass) {
		return pass.matches(p_password);
	}
	public static boolean date (String date) {
		String s="";
		switch (main_menu.settings.getDate()) {
			case "dd/mm/yyyy":
				s = pattern_date1;
				break;
			case "dd-mm-yyyy":
				s = pattern_date2;
				break;
			case "yyyy/mm/dd":
				s = pattern_date3;
				break;
			case "yyyy-mm-dd":
				s = pattern_date4;
				break;
		}	
		return date.matches(s);
	}
	public static boolean hourMin(String hour) {
		return hour.matches(p_hour);
	}
	public static boolean idcode(String id) {
		return id.matches(p_id);
	}
	
}
