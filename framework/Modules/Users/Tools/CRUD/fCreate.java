package OOP.framework.Modules.Users.Tools.CRUD;

import javax.swing.JOptionPane;

import OOP.main_menu;
import OOP.framework.Modules.Users.Classes.*;
import OOP.framework.Modules.Users.Tools.functions_find;
import OOP.framework.Modules.Users.Tools.functions_users;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.menus;

public class fCreate {
	public static void create(int chosen) {
		switch (chosen) {
		case menu_constants.ADMIN:
			createAdmin();
			break;
		case menu_constants.REGISTRED:
			createRegistred();
			break;

		default:
			break;
		}
	}
	
	public static void createAdmin() {
		Admin a1 = new Admin();
		int pos = 0;
		
		a1 = functions_users.askAdminID();
		pos = functions_find.findAdmin(a1);
		if (pos == -1) {
			a1 = functions_users.askAdmin(a1);
			Singleton.AdminArray.add(a1);
		} else {
			JOptionPane.showMessageDialog(null, "Already exists", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public static void createRegistred() {
		Registred f1 = new Registred();
		int pos = 0;
		
		f1 = functions_users.askRegistredID();
		pos = functions_find.findRegistred(f1);
		if (pos == -1) {
			f1 = functions_users.askRegistred(f1);
			Singleton.RegistredArray.add(f1);
			
			if (main_menu.isregistring) {
				//login after register
				main_menu.logged_user = f1;
				main_menu.menu2 = menus.options_crud_reg();
			}
			
			
		} else {
			JOptionPane.showMessageDialog(null, "Already exists", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
