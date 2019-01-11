package OOP.framework.Modules.Cinema.Classes.order;

import java.util.Comparator;

import OOP.framework.Modules.Cinema.Classes.Showing;

public class obName implements Comparator <Showing> {
	
	public int compare (Showing arg0, Showing arg1) {
		int ret = 0;
		
		if(arg0.getName().compareTo(arg1.getName()) > 0)
			ret = 1;
		if(arg0.getName().compareTo(arg1.getName()) < 0)
			ret = -1;
		
		return ret;
	}
	
}
