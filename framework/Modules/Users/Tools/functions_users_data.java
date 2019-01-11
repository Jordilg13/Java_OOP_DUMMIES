package OOP.framework.Modules.Users.Tools;

import javax.swing.JOptionPane;

import OOP.framework.Tools.Inputs;
import OOP.framework.Tools.Submenu;
import OOP.framework.Tools.Validata;

public class functions_users_data {

	public static String type() {
		String[] options = {"Admin","Registred"};
		return options[Submenu.buttonsbox("Type of user", "User", options)];
	}
	public static String type(int a) {
		String[] options = {"Admin","Registred"};
		return options[a];
	}
	public static String passwd() {
		String pass = "";
		boolean end = false;
		
		do {
			pass = Inputs.validastring("Password", "Pass");
			end = Validata.passwd(pass);
			if (!end) {
				JOptionPane.showMessageDialog(null, "Invalid password.Must contain at least one number, one upper case, one lower case and one symbol.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} while (!end);
		
		return pass;
	}
}
