package OOP;

import java.util.ArrayList;

import OOP.framework.Classes.Date;
import OOP.framework.Classes.Settings;
import OOP.framework.Modules.Cinema.Classes.Film;
import OOP.framework.Modules.Cinema.Tools.CRUD.functions_order;
import OOP.framework.Modules.Login.login;
import OOP.framework.Modules.Login.recover_password;
import OOP.framework.Modules.Login.register;
import OOP.framework.Modules.Users.Classes.Admin;
import OOP.framework.Modules.Users.Classes.Registred;
import OOP.framework.Modules.Users.Classes.Singleton;
import OOP.framework.Modules.Users.Classes.User;
import OOP.framework.Tools.Submenu;
import OOP.framework.Tools.Utils;
import OOP.framework.Tools.functions_settings;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.SingletonLang;
import OOP.framework.Tools.languages.menus;

public class main_menu {
	

	//public static Showing obj = null;
	public static Settings settings = new Settings();
	public static User logged_user = null;
	public static int chosen = 0;
	
	static String[] first_menu = {"Register","Login","Work without account.","Exit"};
	static String[] menu_admin = {"Showings", "Users", "Settings", "Logout"};
	public static String[] menu = {"Showings", "Users", "Settings", "Logout"};
	static String[] menu_guest = {"Showings","Back"};
	public static String[] menu2 = null;
	public static boolean isregistring = false;
	
	
	

	public static void main(String[] args) {
		
		/////////////temporal/users//////////////////////
		
		Singleton.AdminArray.add(new Admin("A1234","Admin",new Date("19/5/2000"),"AAaa11..","Jose",new Date("04/12/2018")));
		Singleton.RegistredArray.add(new Registred("B1234","Registred",new Date("19/5/1997"),"AAaa11..","Paco",new Date("04/10/2018")));
		
		
		@SuppressWarnings("serial")
		ArrayList<String> sche = new ArrayList<String>() {{
			add("16:00");
			add("18:00");
		}};
		
		OOP.framework.Modules.Cinema.Classes.Singleton.FilmArray.add(new Film("M1111",13,"Room9","monday,wednesday",sche,new Date("02/12/2018"),new Date("22/12/2018")));
		OOP.framework.Modules.Cinema.Classes.Singleton.FilmArray.add(new Film("C1111",15,"Room7","monday,wednesday",sche,new Date("03/12/2018"),new Date("22/12/2018")));
		OOP.framework.Modules.Cinema.Classes.Singleton.FilmArray.add(new Film("M2222",14,"Room4","monday,wednesday",sche,new Date("04/12/2018"),new Date("22/12/2018")));
		
		///////////////////////////////////
		int chosen = 0;
		boolean back = false,end = false;
		
		do {
			
			
			if (logged_user != null) {
				switch (menu[Submenu.buttonsbox("Module", "", menu)]) {//"Showings","Users","Back"
				case menu_constants.SHOWINGS:
								chosen = Submenu.buttonsbox(SingletonLang.dicc.get("childclass"), "", menus.options());//film, dfilm, fmatch 
								switch (chosen) {				
								case menu_constants.FILM: case menu_constants.DOCUMENTARY_FILM: case menu_constants.FOOTBALL_MATCH: //"multiple" case
									switch (menu2[Submenu.buttonsbox(SingletonLang.dicc.get("choseone"), SingletonLang.dicc.get("choseone"), menu2)]) {
									case menu_constants.CREATE:
										if (settings.getDummies()) 
											OOP.framework.Modules.Cinema.dummies.CRUD.fCreate.create(chosen);
										else
											OOP.framework.Modules.Cinema.Tools.CRUD.fCreate.create(chosen);
										break;
									case menu_constants.READ:
										OOP.framework.Modules.Cinema.Tools.CRUD.fRead.read(chosen);
										break;
									case menu_constants.UPDATE:
										do {
											if (settings.getDummies()) 
												OOP.framework.Modules.Cinema.dummies.CRUD.fUpdate.update(chosen);
											else
												OOP.framework.Modules.Cinema.Tools.CRUD.fUpdate.update(chosen);
										} while (Utils.keep(SingletonLang.dicc.get("stillupd")));
										break;
									case menu_constants.DELETE:
										OOP.framework.Modules.Cinema.Tools.CRUD.fDelete.delete(chosen);
										break;
									case menu_constants.ORDER:
										functions_order.changeOrder();
										break;
									default:
										break;
									}
								break;
								default:
									
									break;
								}
								break;
				case menu_constants.USERS: //users
					
							if (logged_user.getType() == "Admin")
								chosen = Submenu.buttonsbox(SingletonLang.dicc.get("childclass"), "", menus.options_users());//admin, registred
							else
								chosen = 1;
							
							if (chosen != 2) {
								switch (menu2[Submenu.buttonsbox(SingletonLang.dicc.get("choseone"), SingletonLang.dicc.get("choseone"), menu2)]) {
								case menu_constants.CREATE:
									OOP.framework.Modules.Users.Tools.CRUD.fCreate.create(chosen);
									break;
								case menu_constants.READ:
									if (logged_user.getType() == "Admin") 
										OOP.framework.Modules.Users.Tools.CRUD.fRead.read(chosen);
									else
										OOP.framework.Modules.Users.Tools.CRUD.fRead.readMe();	
									break;
								case menu_constants.UPDATE:
									do {
										if (logged_user.getType() == "Admin") 
											OOP.framework.Modules.Users.Tools.CRUD.fUpdate.update(chosen);
										else
											OOP.framework.Modules.Users.Tools.CRUD.fUpdate.updateMe();
										
									} while (Utils.keep(SingletonLang.dicc.get("stillupd")));
									break;
								case menu_constants.DELETE:
									OOP.framework.Modules.Users.Tools.CRUD.fDelete.delete(chosen);
									break;
								case menu_constants.ORDER:
									functions_order.changeOrder();
									break;
								default:
									break;
								}
							}
							
					break;
					
					
					
				case menu_constants.SETTINGS://settings
									do {
										//switch (Submenu.buttonsbox(SingletonLang.dicc.get("choseone"), SingletonLang.dicc.get("choseone"), menus.options_settings())) {
										switch (Submenu.buttonsbox(settings.toString(), SingletonLang.dicc.get("choseone"), menus.options_settings())) {
											case menu_constants.LANGUAGE:
												main_menu.settings.setLanguage(functions_settings.language());
												break;
											case menu_constants.DATE:
												main_menu.settings.setDate(functions_settings.date());
												break;
											case menu_constants.CURRENCY:
												main_menu.settings.setCurrency(functions_settings.currency());
												break;
											case menu_constants.DECIMALS:
												main_menu.settings.setDecimal(functions_settings.decimal());
												break;
											case menu_constants.DUMMIES:
												main_menu.settings.setDummies(functions_settings.dummies());
												System.out.println(settings.getDummies());
												break;
											default:
												back = true;
												break;
										}
									} while (!back);
					break;
				default:
					logged_user = null;
				break;
				}
			} else {
				switch (Submenu.buttonsbox("", "Action", first_menu)) {
				case menu_constants.REGISTER:
					register.Register();
					break;
				case menu_constants.LOGIN:
					login.auth();
					//System.out.println(logged_user.getType());
					if (logged_user.getType().equals("Admin")) {
						menu2 = menus.options_crud();
						menu = menu_admin;
					} else if (logged_user.getType().equals("Registred")) {
						menu2 = menus.options_crud_reg();
						menu = menu_admin;
					}
					break;
				case menu_constants.GUEST:
					menu2 = menus.options_crud_guest();
					menu = menu_guest;
					logged_user = new User(); //empty user, per a que no detecte que no hi ha ningu logejat i es repetixca el bucle
					break;
				case menu_constants.RECOVER_PASS:
					recover_password.RecoverPass();
					break;
				default:
					end = true;
					break;
				}
			}
			
			
		} while (!end);

	}

}
