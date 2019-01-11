package OOP.framework.Modules.Login;

import javax.swing.JOptionPane;

import OOP.main_menu;
import OOP.framework.Modules.Users.Classes.*;
import OOP.framework.Modules.Users.Tools.functions_find;
import OOP.framework.Modules.Users.Tools.functions_users;

public class login {

	public static boolean auth() {
		Admin a1 = null;
		Registred r1 = null;
		int pos = -1;
		boolean auth = false;
		
		while (!auth) {
			//check if admin
			a1 = functions_users.askAdminID();
			pos = functions_find.findAdmin(a1);
			
			if (pos != -1) 
				if (Singleton.AdminArray.get(pos).ask4pass().equals(Singleton.AdminArray.get(pos).getPass()) ) {
					auth = true;
					main_menu.logged_user = Singleton.AdminArray.get(pos);
				}
				else
					JOptionPane.showMessageDialog(null, "Invalid credentials.");
			else {
				r1 = new Registred(Singleton.user_ID); //no es fa el ask perque el proces ja s'ha fet dalt en el a1 i es el mateix procediment per lo tant el ID es valid
				pos = functions_find.findRegistred(r1);
				
				if (pos != -1) 
					if (Singleton.RegistredArray.get(pos).ask4pass().equals(Singleton.RegistredArray.get(pos).getPass())) {
						auth = true;
						main_menu.logged_user = Singleton.RegistredArray.get(pos);
					}
					else
						JOptionPane.showMessageDialog(null, "Invalid credentials.");			
			}//else
		}//while
		
	
	
	return auth;
	}
}
