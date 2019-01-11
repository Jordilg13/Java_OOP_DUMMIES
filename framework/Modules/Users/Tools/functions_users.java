package OOP.framework.Modules.Users.Tools;

import javax.swing.JOptionPane;

import OOP.main_menu;
import OOP.framework.Classes.Date;
import OOP.framework.Modules.Cinema.Tools.functions_club_data;
import OOP.framework.Modules.Users.Classes.*;
import OOP.framework.Tools.Submenu;
import OOP.framework.Tools.languages.SingletonLang;

public class functions_users {

	public static String[] userValues(User a1) {
		String[] userval = new String[4];
		
		userval[0] = a1.getID();
		if (main_menu.isregistring) 
			userval[1] = "Registred";
		else {
			userval[1] = functions_users_data.type(main_menu.chosen);			
		}
			
		userval[2] = functions_users_data.passwd();
		
		return userval;
	}

	public static Admin askAdmin(User a1) {
		String name = "";
		String[] userval = null;
		Date hiringDate,birth = null;
		
		
		userval = userValues(a1);
		birth = functions_users_date.askUserDate("Input the birthday.", "Birthday");
		
		name = functions_club_data.name();
		hiringDate = functions_users_date.askUserDate("Input the date of the hire.","Hire Date");
		
		
		return new Admin(userval[0],userval[1],birth,userval[2],name,hiringDate);
	}
	
	public static Admin askAdminID() {
		Singleton.user_ID = functions_club_data.IDcode();
		return new Admin(Singleton.user_ID);
	}
	
	public static void setAdminID (User s1){
		int pos = -1;
		Admin f1 = new Admin();
		
		f1 = askAdminID();
		pos = functions_find.findAdmin(f1);
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("Falreadye"));
		}else {
			s1.setID(Singleton.user_ID);
		}
	}
	
	
	
	
	public static Registred askRegistred(User a1) {
		String name = "";
		String[] userval = null;
		Date RegisterDate,birth = null;
		
		
		userval = userValues(a1);
		birth = functions_users_date.askUserDate("Input the birthday.", "Birthday");
		
		name = functions_club_data.name();
		RegisterDate = functions_users_date.askUserDate("Input the registrer date.","Register Date");
		
		
		return new Registred(userval[0],userval[1],birth,userval[2],name,RegisterDate);
	}
	
	public static Registred askRegistredID() {
		Singleton.user_ID = functions_club_data.IDcode();
		return new Registred(Singleton.user_ID);
	}
	
	public static void setRegistredID (User s1){
		int pos = -1;
		Registred f1 = new Registred();
		
		f1 = askRegistredID();
		pos = functions_find.findRegistred(f1);
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("Falreadye"));
		}else {
			s1.setID(Singleton.user_ID);
		}
	}
	
	
	public static void setChange(User showing1) {
		//options
				String[] Admin_att = {"ID","Type","Birthday","Password","Name","Hiring Date"};
				//String[] Registred_att = {"ID","Type","Birthday","Name","Register Date"};
				//constants
				final int ID = 0;
				final int TYPE = 1;
				final int BIRTH = 2;
				final int PASS = 3;
				final int NAME = 4;
				final int DATE = 5;
				
				switch (Submenu.buttonsbox("Admin atributes", SingletonLang.dicc.get("att"), Admin_att)) {
				case ID:
					showing1.setID(functions_club_data.IDcode());
					break;
				case TYPE:
					showing1.setType(functions_users_data.type());
					break;
				case BIRTH:
					showing1.setDatebirthday(functions_users_date.askUserDate("Input the birthday.", "Birthday"));
					break;
				case PASS:
					showing1.setPass(functions_users_data.passwd());
					break;
				case NAME:
					if (showing1 instanceof Admin)
						((Admin)showing1).setName(functions_club_data.name());
					else if (showing1 instanceof Registred) 
						((Registred)showing1).setName(functions_club_data.name());
					break;
				case DATE:
					if (showing1 instanceof Admin)
						((Admin)showing1).setHiringDate(functions_users_date.askUserDate("Input the hiring date.","Hiring Date"));
					else if (showing1 instanceof Registred) 
						((Registred)showing1).setRegisterDate(functions_users_date.askUserDate("Input the registrer date.","Register Date"));
					break;
				default:
					break;
				}
	

			}		
	
}
