package OOP.framework.Modules.Users.Tools.CRUD;

import javax.swing.JOptionPane;

import OOP.framework.Modules.Users.Classes.*;
import OOP.framework.Modules.Users.Tools.functions_find;
import OOP.framework.Modules.Users.Classes.Singleton;
import OOP.framework.Modules.Users.Tools.functions_users;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.SingletonLang;

public class fDelete {

	public static void delete(int chosen) {
		switch (chosen) {
		case menu_constants.ADMIN:
			deleteAdmin();
			break;

		case menu_constants.REGISTRED:
			deleteRegistred();
			break;

		default:
			break;
		}
		
	}
	
	public static void deleteAdmin() {
		
		int location = -1;
		Admin a1 = new Admin();
		
		if(Singleton.AdminArray.isEmpty())
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"));
		else{
			location = -1;
			a1 = functions_users.askAdminID();
			location = functions_find.findAdmin(a1);
			if (location != -1) 
				if (JOptionPane.showConfirmDialog(null, "DO you really want to delete it?") == JOptionPane.YES_OPTION) {
					Singleton.AdminArray.remove(location);
				}	
			else 
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"));		
		}
	}


	public static void deleteRegistred() {
	
	int location = -1;
	Registred a1 = new Registred();
	
	if(Singleton.RegistredArray.isEmpty())
		JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"));
	else{
		location = -1;
		a1 = functions_users.askRegistredID();
		location = functions_find.findRegistred(a1);
		if (location != -1) 
			if (JOptionPane.showConfirmDialog(null, "DO you really want to delete it?") == JOptionPane.YES_OPTION) {
				Singleton.RegistredArray.remove(location);
			}	
		else 
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"));		
	}
}
}
