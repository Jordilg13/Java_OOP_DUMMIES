package OOP.framework.Modules.Users.Classes.Order;

import java.util.Comparator;

import OOP.framework.Modules.Users.Classes.User;


public class ob_Age  implements Comparator <User>{

	public int compare (User arg0, User arg1) {
		int ret = 0;
		if(arg0.getAge()>arg1.getAge())
			ret = 1;
		if(arg0.getAge()<arg1.getAge())
			ret = -1;
		return ret;
	}
}
