package OOP.framework.Modules.Users.Tools.CRUD;

import javax.swing.JOptionPane;

import OOP.main_menu;
import OOP.framework.Modules.Users.Classes.*;
import OOP.framework.Modules.Users.Tools.functions_find;
import OOP.framework.Modules.Users.Tools.functions_users;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.SingletonLang;

public class fUpdate {

	public static void update(int chosen) {
		switch (chosen) {
		case menu_constants.ADMIN:
			updateAdmin();
			break;
		case menu_constants.REGISTRED:
			updateRegistred();
			break;
		default:
			break;
		}
	}
	
	public static void updateAdmin () {
		int location1 = -1;
		Admin a1 = new Admin();
		
		if(Singleton.AdminArray.isEmpty())
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"), "Error", JOptionPane.ERROR_MESSAGE);
		else{
			a1 = functions_users.askAdminID();
			location1 = functions_find.findAdmin(a1);
			if (location1 != -1) {
				a1 = Singleton.AdminArray.get(location1);
				functions_users.setChange(a1);
				Singleton.AdminArray.set(location1, a1);
			} else {
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void updateMe() {
		functions_users.setChange(main_menu.logged_user);
	}
	public static void updateRegistred () {
		int location1 = -1;
		Registred a1 = new Registred();
		
		if(Singleton.RegistredArray.isEmpty())
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"), "Error", JOptionPane.ERROR_MESSAGE);
		else{
			a1 = functions_users.askRegistredID();
			location1 = functions_find.findRegistred(a1);
			if (location1 != -1) {
				a1 = Singleton.RegistredArray.get(location1);
				functions_users.setChange(a1);
				Singleton.RegistredArray.set(location1, a1);
			} else {
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"), "", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		
	}//end update registred
}
