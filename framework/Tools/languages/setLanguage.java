package OOP.framework.Tools.languages;

import OOP.main_menu;
import OOP.framework.Classes.Settings;

public class setLanguage {

	public static void setLang() {
		
		switch (main_menu.settings.getLanguage()) {
		case Settings.ENGLISH:
			SingletonLang.dicc = english.set();
			break;
		case Settings.SPANISH:
			SingletonLang.dicc = spanish.set();
			break;
		case Settings.VALENCIA:
			SingletonLang.dicc = valencia.set();
			break;
		default:
			break;
		}
		
	}
}
