package OOP.framework.Modules.Cinema.dummies;

import OOP.framework.Modules.Cinema.Classes.*;

public class functions_find_dummies {

	public static int findFilm(Film film) {	
		int pos = -1;
		for (int i = 0; i<=(Singleton.FilmArray.size()-1); i++){
			if((Singleton.FilmArray.get(i)).equals(film))
				pos = i;
		}		
		return pos;
	}
	public static int findDFilm(DocumentaryFilm dfilm) {
		int pos = -1;
		for (int i = 0; i<=(Singleton.DFilmArray.size()-1); i++){
			if((Singleton.DFilmArray.get(i)).equals(dfilm))
				pos = i;
		}		
		return pos;
	}
	public static int findFMatch(FootballMatch fmatch) {
		int pos = -1;
		for (int i = 0; i<=(Singleton.FMatchArray.size()-1); i++){
			if((Singleton.FMatchArray.get(i)).equals(fmatch))
				pos = i;
		}		
		return pos;
	}
}
