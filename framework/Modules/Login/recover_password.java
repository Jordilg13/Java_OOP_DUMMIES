package OOP.framework.Modules.Login;

import javax.swing.JOptionPane;

import OOP.framework.Modules.Users.Classes.*;
import OOP.framework.Modules.Users.Tools.functions_find;
import OOP.framework.Modules.Users.Tools.functions_users;

public class recover_password {

	public static void RecoverPass() {
		Admin a1 = null;
		Registred r1 = null;
		int pos = -1;
		String pass = "";
		
		a1 = functions_users.askAdminID();
		pos = functions_find.findAdmin(a1);
		
		if (pos != -1) {
			if (JOptionPane.showConfirmDialog(null, "Your password will be changed. Ok?") == JOptionPane.YES_OPTION) {
				pass = "AAaa.."+ (Math.random() * ((99 - 00) + 1)) + 00;
				Singleton.AdminArray.get(pos).setPass(pass);
				JOptionPane.showMessageDialog(null, "Your new password is:\n"+pass);
			}
		} else {
			r1 = new Registred(Singleton.user_ID); //no es fa el ask perque el proces ja s'ha fet dalt en el a1 i es el mateix procediment per lo tant el ID es valid
			pos = functions_find.findRegistred(r1);
			
			if (pos != -1) {
				if (JOptionPane.showConfirmDialog(null, "Your password will be changed. Ok?") == JOptionPane.YES_OPTION) {
					Singleton.RegistredArray.get(pos).setPass(pass);
					JOptionPane.showMessageDialog(null, "Your new password is:\n"+pass);
				}
			} else 
				JOptionPane.showMessageDialog(null, "This user don't exists.");
		}
	}
}
