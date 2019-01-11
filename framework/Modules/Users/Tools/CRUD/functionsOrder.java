package OOP.framework.Modules.Users.Tools.CRUD;

import java.util.Collections;

import javax.swing.JOptionPane;

import Examen_1.Submenu;
import OOP.main_menu;
import OOP.framework.Modules.Users.Classes.Singleton;
import OOP.framework.Modules.Users.Classes.Order.*;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.SingletonLang;

public class functionsOrder {
	private static int menu = 0;
	static String[] op = {"Hiring Date","Age"};
	final static int ID = 0;
	final static int HIRINGDATE = 1;
	

	public static void changeOrder() {
		switch (main_menu.chosen) {
		case menu_constants.ADMIN:
			changeOrderAdmin();
			break;
		case menu_constants.REGISTRED:
			changeOrderRegistred();
			break;
		default:
			break;
		}
	}
	
	public static void changeOrderAdmin() {
			if (Singleton.AdminArray.isEmpty()) 
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"));
			else {
				menu = Submenu.buttonsbox(SingletonLang.dicc.get("ob"), SingletonLang.dicc.get("order"), op);
				switch (menu) {
				case HIRINGDATE:
					Collections.sort(Singleton.AdminArray,new ob_HiringDate());
					break;
				case ID:
					Collections.sort(Singleton.AdminArray,new ob_Age());
					break;
				default:
					Collections.sort(Singleton.AdminArray);
					break;
				}
			}
			
		}
	
	public static void changeOrderRegistred() {
		
		if (Singleton.RegistredArray.isEmpty()) 
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"));
		else {
			menu = Submenu.buttonsbox(SingletonLang.dicc.get("ob"), SingletonLang.dicc.get("order"), op);
			switch (menu) {
			case HIRINGDATE:
				Collections.sort(Singleton.RegistredArray,new ob_HiringDate());
				break;
			case ID:
				Collections.sort(Singleton.RegistredArray,new ob_Age());
				break;
			default:
				Collections.sort(Singleton.RegistredArray);
				break;
			}
		}
		
	}


}
