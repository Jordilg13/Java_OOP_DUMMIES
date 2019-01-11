package OOP.framework.Modules.Login;

import OOP.main_menu;

public class register {

	public static void Register() {	
		//flag per a saber que estas registrante i no fent un create Registred normal, i faja login al acavar
		
		main_menu.isregistring = true;
		OOP.framework.Modules.Users.Tools.CRUD.fCreate.createRegistred();
		main_menu.isregistring = false;
	}
}
