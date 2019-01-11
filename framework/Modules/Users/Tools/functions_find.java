package OOP.framework.Modules.Users.Tools;

import OOP.framework.Modules.Users.Classes.*;


public class functions_find {

	public static int findAdmin(Admin u1) {	
		int pos = -1;
		
		for (int i = 0; i<=(Singleton.AdminArray.size()-1); i++){
			if((Singleton.AdminArray.get(i).getID()).equals(u1.getID()))
				pos = i;
		}		
		
		return pos;
	}
	public static int findRegistred(Registred reg) {
		int pos = -1;
		//System.out.println(Singleton.RegistredArray.get(0));
		for (int i = 0; i<=(Singleton.RegistredArray.size()-1); i++){
			if((Singleton.RegistredArray.get(i).getID()).equals(reg.getID()))
				pos = i;
		}		
		return pos;
	}

}
