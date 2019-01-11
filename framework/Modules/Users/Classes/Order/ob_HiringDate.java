package OOP.framework.Modules.Users.Classes.Order;

import java.util.Comparator;

import OOP.framework.Modules.Users.Classes.User;

public class ob_HiringDate implements Comparator <User>{

	public int compare (User arg0, User arg1) {
		int ret = 0;

		if(arg0.getDatebirthday().diffDate(arg1.getDatebirthday()) > 0)
			ret = 1;
		if(arg0.getDatebirthday().diffDate(arg1.getDatebirthday()) < 0)
			ret = -1;
		
		return ret;	
	}
}
