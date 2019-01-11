package OOP.framework.Modules.Cinema.Classes.order;

import java.util.Comparator;
import OOP.framework.Modules.Cinema.Classes.Film;

public class obFilmPremiere implements Comparator <Film> {
	
	public int compare (Film arg0, Film arg1) {
		int ret = 0;

		if(arg0.getPremiere().diffDate(arg1.getPremiere()) > 0)
			ret = 1;
		if(arg0.getPremiere().diffDate(arg1.getPremiere()) < 0)
			ret = -1;
		
		return ret;	
	}

}
