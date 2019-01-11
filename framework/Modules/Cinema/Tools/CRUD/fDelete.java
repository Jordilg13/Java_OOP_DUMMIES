package OOP.framework.Modules.Cinema.Tools.CRUD;

import javax.swing.JOptionPane;

import OOP.framework.Modules.Cinema.Classes.*;
import OOP.framework.Modules.Cinema.Tools.*;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.SingletonLang;

public class fDelete {

	public static void delete(int chosen) {
		switch (chosen) {
		case menu_constants.FILM:
			deleteFilm();
			break;

		case menu_constants.DOCUMENTARY_FILM:
			deleteDFilm();
			break;

		case menu_constants.FOOTBALL_MATCH:
			deleteFMatch();
			break;

		default:
			break;
		}
		
	}
	
	public static void deleteFilm() {
		
		int location = -1;
		Film a1 = new Film();
		
		if(Singleton.FilmArray.isEmpty())
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"));
		else{
			location = -1;
			a1 = functions_showings.askFilmID();
			location = functions_find.findFilm(a1);
			if (location != -1) {
				if (JOptionPane.showConfirmDialog(null, "DO you really want to delete it?") == JOptionPane.YES_OPTION) {
					Singleton.FilmArray.remove(location);
				}
			}
			else 
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"));		
		}
	}
	
	public static void deleteDFilm() {
		
		int location = -1;
		DocumentaryFilm a1 = new DocumentaryFilm();
		
		if(Singleton.DFilmArray.isEmpty())
			JOptionPane.showMessageDialog(null, "Empty array");
		else{
			location = -1;
			a1 = functions_showings.askDFilmID();
			location = functions_find.findDFilm(a1);
			if (location != -1) 
				if (JOptionPane.showConfirmDialog(null, "DO you really want to delete it?") == JOptionPane.YES_OPTION) {
					Singleton.DFilmArray.remove(location);
				}
			else 
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"));		
		}
	}

	public static void deleteFMatch() {
	
		int location = -1;
		FootballMatch a1 = new FootballMatch();
		
		if(Singleton.FMatchArray.isEmpty())
			JOptionPane.showMessageDialog(null, "Empty array");
		else{
			location = -1;
			a1 = functions_showings.askFMatchID();
			location = functions_find.findFMatch(a1);
			if (location != -1) 
				Singleton.FMatchArray.remove(location);
			else 
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"));		
		}
	}

	
}