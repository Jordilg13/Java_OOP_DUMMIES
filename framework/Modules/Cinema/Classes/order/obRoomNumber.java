package OOP.framework.Modules.Cinema.Classes.order;

import java.util.Comparator;
import OOP.framework.Modules.Cinema.Classes.*;

public class obRoomNumber implements Comparator <Showing> {

	public int compare (Showing arg0, Showing arg1) {
		int ret = 0;
		if(arg0.getRoom_number()>arg1.getRoom_number())
			ret = 1;
		if(arg0.getRoom_number()<arg1.getRoom_number())
			ret = -1;
		return ret;
	}

}
