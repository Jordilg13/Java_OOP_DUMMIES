package OOP.framework.Modules.Users.Tools.CRUD;

import javax.swing.JOptionPane;

import Examen_1.Submenu;
import OOP.main_menu;
import OOP.framework.Modules.Users.Classes.Admin;
import OOP.framework.Modules.Users.Classes.Registred;
import OOP.framework.Modules.Users.Classes.Singleton;
import OOP.framework.Modules.Users.Tools.functions_find;
import OOP.framework.Modules.Users.Tools.functions_users;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.SingletonLang;

public class fRead {
	
	static String[] options = {SingletonLang.dicc.get("all"),SingletonLang.dicc.get("one")};
	final static int ALL = 0;
	final static int ONE = 1;

	public static void read(int chosen) {
		switch (chosen) {
		case menu_constants.ADMIN:
			readAdmin();
			break;

		case menu_constants.REGISTRED:
			readRegistred();
			break;

		default:
			break;
		}
	}
	
	public static void readMe() {
		JOptionPane.showMessageDialog(null, main_menu.logged_user.toString());
	 }
	public static void readAdmin() {
		int op = 0,pos = -1;
		String str = "";
		Admin a1 = null;
		
		if (Singleton.AdminArray.isEmpty())
			JOptionPane.showMessageDialog(null, "Empty Array", "Error", 0);
		else {
			op = Submenu.buttonsbox(SingletonLang.dicc.get("choseone"), SingletonLang.dicc.get("read"), options);
			switch (op) {
			case ALL:
				for (int i = 0; i <Singleton.AdminArray.size();i++){
					
					str = str + (Singleton.AdminArray.get(i).toString()) + "\n";
				}
				JOptionPane.showMessageDialog(null, str);
				break;
			case ONE:
				a1 = functions_users.askAdminID();
				pos = functions_find.findAdmin(a1);
				if (pos != -1) {
					a1 = Singleton.AdminArray.get(pos);
					JOptionPane.showMessageDialog(null, a1.toString());
				}else {
					JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("Falreadye"));
				}
				break;

			default:
				break;
			}
		}
	}
	
	
	
	
	public static void readRegistred() {
		int op = 0;
		int pos = -1;
		String str = "";
		Registred a1 = null;
		
		if (Singleton.RegistredArray.isEmpty())
			JOptionPane.showMessageDialog(null, "Empty Array", "Error", 0);
		else {
			op = Submenu.buttonsbox(SingletonLang.dicc.get("choseone"), SingletonLang.dicc.get("read"), options);
			switch (op) {
			case ALL:
				for (int i = 0; i <Singleton.RegistredArray.size();i++){
					
					str = str + (Singleton.RegistredArray.get(i).toString()) + "\n";
				}
				JOptionPane.showMessageDialog(null, str);
				break;
			case ONE:
				a1 = functions_users.askRegistredID();
				pos = functions_find.findRegistred(a1);
				if (pos != -1) {
					a1 = Singleton.RegistredArray.get(pos);
					JOptionPane.showMessageDialog(null, a1.toString());
				}else {
					JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("Falreadye"));
				}
				break;

			default:
				break;
			}
		}
		//JOptionPane.showMessageDialog(null, main_menu.logged_user.toString());

		}
	}		

