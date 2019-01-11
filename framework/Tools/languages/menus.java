package OOP.framework.Tools.languages;

public class menus {
	public static String[] options() {
		String[] options = { SingletonLang.dicc.get("film"), 
				SingletonLang.dicc.get("dfilm"), 
				SingletonLang.dicc.get("fmatch"),
				SingletonLang.dicc.get("back")};
		return options;
	}
	public static String[] options_users() {
		String[] options = {"Admin","Registred","Back"};
		return options;
	}
	
	public static String[] options_crud() {
		String[] options_crud = { SingletonLang.dicc.get("create"), 
				SingletonLang.dicc.get("read"), 
				SingletonLang.dicc.get("update"),
				SingletonLang.dicc.get("delete"),
				SingletonLang.dicc.get("order"),
				SingletonLang.dicc.get("back")};
		return options_crud;
	}
	public static String[] options_crud_reg() {
		String[] options_crud = {  
				SingletonLang.dicc.get("read"), 
				SingletonLang.dicc.get("update"),
				SingletonLang.dicc.get("back")};
		return options_crud;
	}
	public static String[] options_crud_guest() {
		String[] options_crud = {  
				SingletonLang.dicc.get("read"), 
				SingletonLang.dicc.get("back")};
		return options_crud;
	}
	
	public static String[] options_settings() {
		String[] options_settings = {SingletonLang.dicc.get("lang"), 
				SingletonLang.dicc.get("date"),
				SingletonLang.dicc.get("currency"),
				SingletonLang.dicc.get("dec"),
				"Dummies",
				SingletonLang.dicc.get("back")};
		return options_settings;
	}
	
	public static String[] options_order() {
		String[] options = {SingletonLang.dicc.get("prem"),
				SingletonLang.dicc.get("name"),
				SingletonLang.dicc.get("roomnum")};
		return options;
	}
	
		
}
